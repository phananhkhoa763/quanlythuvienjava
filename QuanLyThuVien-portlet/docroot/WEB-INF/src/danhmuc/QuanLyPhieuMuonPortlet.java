package danhmuc;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import danhmuc.model.Sach;
import danhmuc.model.phieumuon;
import danhmuc.model.impl.SachImpl;
import danhmuc.model.impl.phieumuonImpl;
import danhmuc.service.SachLocalServiceUtil;
import danhmuc.service.phieumuonLocalServiceUtil;

public class QuanLyPhieuMuonPortlet extends MVCPortlet {
	public void danhSach(ActionRequest req, ActionResponse res ) throws SystemException{
		int Start=0;
		int ketThuc=0;
		Start = (ParamUtil.getInteger(req, "cur",1)-1)*ParamUtil.getInteger(req, "delta", 5);
		ketThuc = Start+ParamUtil.getInteger(req, "delta", 5);
		int cur = ParamUtil.getInteger(req, "cur",1);
		int tong = SachLocalServiceUtil.getSachsCount();
		int delta = ParamUtil.getInteger(req, "delta", 5);
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(phieumuonImpl.class, PortalClassLoaderUtil.getClassLoader());
		q.setLimit(Start, ketThuc);
		long TrangThai = ParamUtil.getLong(req,"TrangThai");
		long TenSach = ParamUtil.getLong(req,"TenSach");
		if(TrangThai!=0){
			q.add(PropertyFactoryUtil.forName("trangthai").eq(TrangThai));
		}
		if(TenSach!=0){
			q.add(PropertyFactoryUtil.forName("sachId").eq(TenSach));
		}
		List<phieumuon> data = phieumuonLocalServiceUtil.dynamicQuery(q);
		DynamicQuery k = DynamicQueryFactoryUtil.forClass(SachImpl.class,PortalClassLoaderUtil.getClassLoader());
		List<Sach> Sach = SachLocalServiceUtil.dynamicQuery(k);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		req.setAttribute("Sach", Sach);
		res.setRenderParameter("jspPage", "/html/quanlyphieumuon/view.jsp");
	}
	public void chitiet(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		req.setAttribute("PhieuMuon", PhieuMuon);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/quanlyphieumuon/chitiet.jsp");
	}
	public void muonsach1(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		long id1 = ParamUtil.getLong(req,"id1");
		long soluong = ParamUtil.getLong(req,"soluong");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		PhieuMuon.setTrangthai(2);
		PhieuMuon.setXacnhan(2);
		phieumuonLocalServiceUtil.updatephieumuon(PhieuMuon);
		Sach Sach = SachLocalServiceUtil.getSach(id1);
		Sach.setSoluong(soluong);
		SachLocalServiceUtil.updateSach(Sach);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "");
	}
	public void muonsach2(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		PhieuMuon.setTrangthai(2);
		PhieuMuon.setXacnhan(1);
		PhieuMuon.setLydo(ParamUtil.getString(req,"lydo"));
		phieumuonLocalServiceUtil.updatephieumuon(PhieuMuon);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "");
	}
	public void muonsach3(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		req.setAttribute("PhieuMuon", PhieuMuon);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/quanlyphieumuon/tuchoi.jsp");
	}
}
