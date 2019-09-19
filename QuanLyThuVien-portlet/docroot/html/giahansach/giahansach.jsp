<%@page import="danhmuc.service.SachLocalServiceUtil"%>
<%@page import="danhmuc.model.Sach"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="danhmuc.model.phieumuon"%>
<%@page import="danhmuc.model.theloai"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
phieumuon PhieuMuon = (phieumuon)request.getAttribute("PhieuMuon"); 
SimpleDateFormat dateFomat = new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat dateFomat1 = new SimpleDateFormat("yyyy-MM-dd"); 

%>
<h3>Phiếu gia hạnh sách:<%=SachLocalServiceUtil.getSach(PhieuMuon.getSachId()).getName()%></h3>
<h4>Ngày trả sách:<%=dateFomat.format(PhieuMuon.getNgaytra()) %></h4>
<liferay-portlet:actionURL var="giahansach2URL" name="giahansach2"></liferay-portlet:actionURL>
<aui:form name="frm" method="post" action="<%=giahansach2URL %>">
	<aui:input type="hidden" name="id" value="<%=PhieuMuon.getId() %>"></aui:input>
	<table>
		<tr>
			<td>
				<aui:input type="Date" label="Ngày gia hạn" name="giahan" value="<%=dateFomat1.format(PhieuMuon.getNgaytra()) %>"></aui:input>
			</td>
		</tr>
		<td>
			<aui:button type="submit" icon="icon-save" value="Gia hạn"></aui:button>
			<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
			<aui:button  value="quay lại" icon="icon-undo" href="<%=danhSachURL %>"></aui:button>
		</td>
	</table>
</aui:form>