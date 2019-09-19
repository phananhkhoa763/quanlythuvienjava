<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="danhmuc.model.phieumuon"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
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
<%Sach Sach = (Sach)request.getAttribute("Sach");
phieumuon PhieuMuon = (phieumuon)request.getAttribute("PhieuMuon");
SimpleDateFormat dateFomat = new SimpleDateFormat("yyyy-MM-dd"); 
Date date = new Date();
ThemeDisplay td  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
User UserId = td.getUser();
%>
<h2>Phiếu mượn sách <%=Sach.getName()%></h2>
<liferay-portlet:actionURL var="createURL" name="create"></liferay-portlet:actionURL>
<aui:form name="frm" method="post" action="<%=createURL %>">
	<table>
	<aui:input type="hidden" name="Sach" value="<%=Sach.getId() %>"></aui:input>
	<aui:input type="hidden" name="UserId" value="<%=UserId.getUserId() %>"></aui:input>
	<aui:input type="hidden" name="trangthai" value="<%=1%>"></aui:input>
	<aui:input type="hidden" name="xacnhan" value="<%=1%>"></aui:input>
	<aui:input type="hidden" name="giahan" value="<%=0%>"></aui:input>
	
		<tr>
			<td>
				<aui:input type="Date" name="ngaymuon" value="<%=dateFomat.format(date) %>"></aui:input>
				
			</td>
			<td>
				<aui:input type="Date" name="ngaytra" value="<%=dateFomat.format(date) %>"></aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:select name="soluong">
					<%for(int i=1;i<=Sach.getSoluong();i++){ %>
						<aui:option value="<%=i %>"><%=i %></aui:option>
					<%} %>
				</aui:select>
			</td>
		</tr>
		<td><aui:button type="submit" icon="icon-cloud-download" value="đặt mượn"></aui:button></td>
	</table>
</aui:form>