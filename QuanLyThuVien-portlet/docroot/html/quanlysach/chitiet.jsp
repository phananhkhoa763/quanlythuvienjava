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
<%Sach Sach = (Sach)request.getAttribute("Sach");%>
<h2>Thông tin chi tiết về sách</h2>
<table>
		<tr>
			<td style="width:140px;height:30px">
				Tên Sách:<%=Sach.getName()%>
			</td>
			<td style="width:140px">
				Thể Loại:<%=theloaiLocalServiceUtil.gettheloai(Sach.getTheloaiID()).getName()%>
			</td>
			<td>
				Số Lượng:<%=Sach.getSoluong()%>
			</td>
		</tr>
		<tr>
			<td style="height: 30px">
				Nhà Xuất Bản:<%=Sach.getSoluong()%>
			</td>
			<td>
				Tác Giả:<%=Sach.getTacgia()%>
			</td>
			<td>
				Mã Sách:<%=Sach.getMasach()%>
			</td>
		</tr>
		<tr style="width:140px">
			<td>
				Kệ:<%=Sach.getKe()%>
			</td>
			<td>
				Tầng:<%=Sach.getTang()%>
			</td>
			<td>
				Nội dung:<%=Sach.getNoidung()%>
			</td>
		</tr>
		<tr>
			<td>
				<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
				<aui:button style="margin-top: 20px;" icon="icon-undo" value="quay lại" href="<%=danhSachURL %>"></aui:button>
			</td>
		</tr>
	</table>