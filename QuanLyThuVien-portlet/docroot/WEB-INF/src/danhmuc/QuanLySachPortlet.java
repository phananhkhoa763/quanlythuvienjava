package danhmuc;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.junit.runner.Request;

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

import danhmuc.model.Sach;
import danhmuc.model.theloai;
import danhmuc.model.impl.SachImpl;
import danhmuc.model.impl.theloaiImpl;
import danhmuc.service.SachLocalServiceUtil;
import danhmuc.service.theloaiLocalServiceUtil;

public class QuanLySachPortlet extends MVCPortlet {
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = SachLocalServiceUtil.getSachsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(SachImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		String ten = ParamUtil.get(req, "sach", "");
		String MaSach = ParamUtil.get(req, "MaSach", "");
		long theloaiid = ParamUtil.getLong(req,"TheLoai");
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("name").like("%"+ten+"%"));
		}
		if(theloaiid!=0){
			q.add(PropertyFactoryUtil.forName("theloaiID").eq(theloaiid));
		}
		if(!MaSach.equals("")){
			
			q.add(PropertyFactoryUtil.forName("masach").like("%"+MaSach+"%"));
		}
		List<Sach> data = SachLocalServiceUtil.dynamicQuery(q);
		DynamicQuery k = DynamicQueryFactoryUtil.forClass(theloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<theloai> TheLoai = theloaiLocalServiceUtil.dynamicQuery(k);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		req.setAttribute("TheLoai", TheLoai);
		res.setRenderParameter("jspPage", "/html/quanlysach/view.jsp");
	}
	public void input(ActionRequest req, ActionResponse res) throws PortalException, SystemException{
		long id = ParamUtil.getLong(req,"id");
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(theloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<theloai> data = theloaiLocalServiceUtil.dynamicQuery(q);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		if(id!=0){
			Sach Sach = SachLocalServiceUtil.getSach(id);
			req.setAttribute("Sach", Sach);
			req.setAttribute("data", data);
		}else{
			Sach Sach = new SachImpl();
			req.setAttribute("Sach", Sach);
			req.setAttribute("data", data);
		}
		res.setRenderParameter("jspPage", "/html/quanlysach/input.jsp");
	}
	public void save(ActionRequest req, ActionResponse res ) throws SystemException, PortalException{
		
		long id = ParamUtil.getLong(req,"id");
		if(id!=0){
			Sach Sach = SachLocalServiceUtil.getSach(id);
			Sach.setName(ParamUtil.getString(req,"Name"));
			Sach.setTheloaiID(ParamUtil.getLong(req,"TheloaiID"));
			Sach.setSoluong(ParamUtil.getLong(req,"Soluong"));
			Sach.setNxb(ParamUtil.getString(req,"Nxb"));
			Sach.setTacgia(ParamUtil.getString(req,"Tacgia"));
			Sach.setMasach(ParamUtil.getString(req,"Masach"));
			Sach.setKe(ParamUtil.getLong(req,"Ke"));
			Sach.setTang(ParamUtil.getLong(req,"Tang"));
			Sach.setNoidung(ParamUtil.getString(req,"NoiDung"));
			SachLocalServiceUtil.updateSach(Sach);
		}else{
			Sach Sach = new SachImpl();
			Sach.setId(CounterLocalServiceUtil.increment("sach"));
			Sach.setName(ParamUtil.getString(req,"Name"));
			Sach.setTheloaiID(ParamUtil.getLong(req,"TheloaiID"));
			Sach.setSoluong(ParamUtil.getLong(req,"Soluong"));
			Sach.setNxb(ParamUtil.getString(req,"Nxb"));
			Sach.setTacgia(ParamUtil.getString(req,"Tacgia"));
			Sach.setMasach(ParamUtil.getString(req,"Masach"));
			Sach.setKe(ParamUtil.getLong(req,"Ke"));
			Sach.setTang(ParamUtil.getLong(req,"Tang"));
			Sach.setNoidung(ParamUtil.getString(req,"NoiDung"));
			SachLocalServiceUtil.addSach(Sach);
		}
		res.setRenderParameter("jspPage", "");
	}
	public void delete(ActionRequest req, ActionResponse res) throws PortalException, SystemException {

		long deleteStudentIds[] = ParamUtil.getLongValues(req,"deleteStudentIds");
		for(int i=0;i<=deleteStudentIds.length;i++){
			
		}
		res.setRenderParameter("jspPage", "");
	}
	public void chitiet(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		Sach Sach = SachLocalServiceUtil.getSach(id);
		req.setAttribute("Sach", Sach);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/quanlysach/chitiet.jsp");
	}
}
