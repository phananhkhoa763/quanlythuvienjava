package danhmuc;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.sound.midi.MidiDevice.Info;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.PhoneLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import danhmuc.model.Sach;
import danhmuc.model.theloai;
import danhmuc.model.impl.SachImpl;
import danhmuc.model.impl.phieumuonImpl;
import danhmuc.model.impl.theloaiImpl;
import danhmuc.service.SachLocalServiceUtil;
import danhmuc.service.phieumuonLocalServiceUtil;
import danhmuc.service.theloaiLocalServiceUtil;

/**
 * Portlet implementation class TimKiemVaMuonSachPortlet
 */
public class TimKiemVaMuonSachPortlet extends MVCPortlet {
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
		String ten = ParamUtil.get(req, "ten", "");
		String TacGia = ParamUtil.get(req, "TacGia", "");
		long theloaiid = ParamUtil.getLong(req,"TheLoai");
		if(!ten.equals("")){
			q.add(PropertyFactoryUtil.forName("name").like("%"+ten+"%"));
		}
		if(!TacGia.equals("")){
			q.add(PropertyFactoryUtil.forName("tacgia").like("%"+TacGia+"%"));
		}
		if(theloaiid!=0){
			q.add(PropertyFactoryUtil.forName("theloaiID").eq(theloaiid));
		}
		List<Sach> data = SachLocalServiceUtil.dynamicQuery(q);
		DynamicQuery k = DynamicQueryFactoryUtil.forClass(theloaiImpl.class, PortalClassLoaderUtil.getClassLoader());
		List<theloai> TheLoai = theloaiLocalServiceUtil.dynamicQuery(k);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		req.setAttribute("TheLoai", TheLoai);
		res.setRenderParameter("jspPage", "/html/timkiemvamuonsach/view.jsp");
	}
	public void chitiet(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		Sach Sach = SachLocalServiceUtil.getSach(id);
		req.setAttribute("Sach", Sach);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/timkiemvamuonsach/chitiet.jsp");
	}
	public void phieumuon(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		Sach Sach = SachLocalServiceUtil.getSach(id);
		danhmuc.model.phieumuon PhieuMuon = new phieumuonImpl();
		req.setAttribute("PhieuMuon", PhieuMuon);
		req.setAttribute("Sach", Sach);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/timkiemvamuonsach/phieumuon.jsp");
	}
	public void create(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		danhmuc.model.phieumuon PhieuMuon = new phieumuonImpl();
		PhieuMuon.setId(CounterLocalServiceUtil.increment("phieumuon"));
		PhieuMuon.setSachId(ParamUtil.getLong(req,"Sach"));
		PhieuMuon.setUserId(ParamUtil.getLong(req,"UserId"));
		SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd");
		PhieuMuon.setNgaymuon(ParamUtil.getDate(req, "ngaymuon", k));
		PhieuMuon.setNgaytra(ParamUtil.getDate(req, "ngaytra", k));
		PhieuMuon.setSoluong(ParamUtil.getLong(req,"soluong"));
		PhieuMuon.setXacnhan(ParamUtil.getLong(req,"trangthai"));
		PhieuMuon.setTrangthai(ParamUtil.getLong(req,"xacnhan"));
		PhieuMuon.setGiahan(ParamUtil.getLong(req,"giahan"));
		phieumuonLocalServiceUtil.addphieumuon(PhieuMuon);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "");
	}
	
	

}
