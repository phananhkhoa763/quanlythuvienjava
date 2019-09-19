<%@page import="java.text.SimpleDateFormat"%>
<%@page import="danhmuc.service.SachLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="danhmuc.model.phieumuon"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="danhmuc.service.theloaiLocalServiceUtil"%>
<%@page import="danhmuc.model.Sach"%>
<%@page import="danhmuc.model.theloai"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%phieumuon PhieuMuon = (phieumuon)request.getAttribute("PhieuMuon");
SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); %>
<h2>Thông tin chi tiết phiếu mượn</h2>
<table>
		<tr>
			<td style="width:140px;height:30px">
				name:<%=UserLocalServiceUtil.getUser(PhieuMuon.getUserId()).getScreenName()%>
			</td>
			<td style="width:140px">
				Tên Sách:<%=SachLocalServiceUtil.getSach(PhieuMuon.getSachId()).getName()%>
			</td>
			<td>
				Ngày Mượn:<%=dateFormat.format(PhieuMuon.getNgaymuon())%>
			</td>
		</tr>
		<tr>
			<td style="height: 30px">
				Ngày Trả:<%=dateFormat.format(PhieuMuon.getNgaytra())%>
			</td>
			<td>
				Xác Nhận:<%if(PhieuMuon.getXacnhan()<1){%>
					Đã từ chối
				<%}else{ %>
					Đã chấp nhận
				<%} %>
			</td>
			<td>
				trạng Thái:<%if(PhieuMuon.getTrangthai()<1){%>
					Đang Xử Lý
				<%}else{ %>
					Hoàn Thành
				<%} %>
			</td>
		</tr>
		<tr style="width:140px">
			<td>
				Số Lượng Sách:<%=PhieuMuon.getSoluong()%>
				<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
				<aui:button type="submit" style="margin-top: 20px;" value="quay lại" href="<%=danhSachURL %>"></aui:button>
			</td>
		</tr>
		
	</table>