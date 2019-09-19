package danhmuc;

import java.text.SimpleDateFormat;
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
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.util.dao.orm.CustomSQL;

import danhmuc.model.Sach;
import danhmuc.model.phieugiahan;
import danhmuc.model.phieumuon;
import danhmuc.model.impl.SachImpl;
import danhmuc.model.impl.phieugiahanImpl;
import danhmuc.model.impl.phieumuonImpl;
import danhmuc.service.SachLocalServiceUtil;
import danhmuc.service.phieugiahanLocalServiceUtil;
import danhmuc.service.phieumuonLocalServiceUtil;

public class GiaHanSachPortlet extends MVCPortlet {
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
		long XacnNan = 2;
		if(TrangThai!=0){
			q.add(PropertyFactoryUtil.forName("trangthai").eq(TrangThai));
		}
		if(TenSach!=0){
			q.add(PropertyFactoryUtil.forName("sachId").eq(TenSach));
		}
		ThemeDisplay td  =(ThemeDisplay)req.getAttribute(WebKeys.THEME_DISPLAY);
		User UserId = td.getUser();
		q.add(PropertyFactoryUtil.forName("userId").eq(UserId.getUserId()));
		q.add(PropertyFactoryUtil.forName("xacnhan").eq(XacnNan));
		List<phieumuon> data = phieumuonLocalServiceUtil.dynamicQuery(q);
		DynamicQuery k = DynamicQueryFactoryUtil.forClass(phieugiahanImpl.class,PortalClassLoaderUtil.getClassLoader());
		List<phieugiahan> PhieuGiaHan = phieugiahanLocalServiceUtil.dynamicQuery(k);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		req.setAttribute("data", data);
		req.setAttribute("PhieuGiaHan", PhieuGiaHan);
		res.setRenderParameter("jspPage", "/html/giahansach/view.jsp");
	}
	public void giahansach1(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		req.setAttribute("PhieuMuon", PhieuMuon);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "/html/giahansach/giahansach.jsp");
	}
	public void giahansach2(ActionRequest req, ActionResponse res)throws SystemException, PortalException{
		long id = ParamUtil.getLong(req,"id");
		phieumuon PhieuMuon = phieumuonLocalServiceUtil.getphieumuon(id);
		PhieuMuon.setGiahan(1);
		phieumuonLocalServiceUtil.updatephieumuon(PhieuMuon);
		phieugiahan PhieuGiaHan = new phieugiahanImpl();
		PhieuGiaHan.setId(CounterLocalServiceUtil.increment("phieugiahan"));
		PhieuGiaHan.setPhieumuonId(ParamUtil.getLong(req,"id"));
		SimpleDateFormat k = new SimpleDateFormat("yyyy-MM-dd");
		PhieuGiaHan.setNgaygiahan(ParamUtil.getDate(req,"giahan", k));
		PhieuGiaHan.setXacnhan(0);
		phieugiahanLocalServiceUtil.addphieugiahan(PhieuGiaHan);
		SessionMessages.add(req, PortalUtil.getPortletId(req) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		res.setRenderParameter("jspPage", "");
	}
}
