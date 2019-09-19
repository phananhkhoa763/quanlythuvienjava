package danhmuc;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;






import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import danhmuc.model.theloai;
import danhmuc.model.impl.theloaiImpl;
import danhmuc.service.theloaiLocalServiceUtil;
import danhmuc.service.persistence.theloaiUtil;


public class QuanLyTheLoaiPortlet extends MVCPortlet {
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = theloaiLocalServiceUtil.gettheloaisCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(theloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		String ten = ParamUtil.get(req, "ten", "");
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("name").like("%"+ten+"%"));
		}
		
		List<theloai> data = theloaiLocalServiceUtil.dynamicQuery(q);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		res.setRenderParameter("jspPage", "/html/quanlytheloai/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req,"id");
		if(id!=0){
			theloai TheLoai = theloaiLocalServiceUtil.gettheloai(id);
			req.setAttribute("TheLoai", TheLoai);
		}else{
			theloai TheLoai = new theloaiImpl();
			req.setAttribute("TheLoai", TheLoai);
		}
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/quanlytheloai/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		if(id!=0){
			theloai TheLoai = theloaiLocalServiceUtil.gettheloai(id);
			TheLoai.setName(ParamUtil.getString(req,"Name"));
			theloaiLocalServiceUtil.updatetheloai(TheLoai);
		}else{
			theloai TheLoai = new theloaiImpl();
			TheLoai.setId(CounterLocalServiceUtil.increment("theloai"));
			TheLoai.setName(ParamUtil.getString(req,"Name"));
			theloaiLocalServiceUtil.addtheloai(TheLoai);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		theloai TheLoai = theloaiLocalServiceUtil.deletetheloai(id);
		theloaiLocalServiceUtil.deletetheloai(TheLoai);
		res.setRenderParameter("jspPage", "");
	}
}
