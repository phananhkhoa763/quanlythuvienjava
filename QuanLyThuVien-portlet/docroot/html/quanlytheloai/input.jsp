<%@page import="danhmuc.model.theloai"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%theloai TheLoai = (theloai)request.getAttribute("TheLoai"); %>
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>

<aui:form name="frm" method="post" action="<%=saveURL %>">
	<aui:input type="hidden" name="id" value="<%=TheLoai.getId() %>"></aui:input>
	<table>
		<tr>
			<td>
				<aui:input type="text" name="Name" value="<%=TheLoai.getName()%>"></aui:input>
			</td>
		</tr>
		<td>
			<aui:button type="submit" icon="icon-save" value="lưu"></aui:button>
			<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
			<aui:button  value="quay lại" icon="icon-undo" href="<%=danhSachURL %>"></aui:button>
		</td>
	</table>
</aui:form>