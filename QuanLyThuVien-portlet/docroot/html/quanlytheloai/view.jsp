<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="danhmuc.model.theloai"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
	List<theloai> data = (List<theloai>)request.getAttribute("data");
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
%>
<liferay-portlet:actionURL var="inputURL" name="input"></liferay-portlet:actionURL>
<aui:button  type="submit" icon="icon-plus" style="float: right;background: red;margin-right: 9px;" value="Thêm mới"  href="<%=inputURL %>"></aui:button>
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<aui:form name="frm" method="POST" action="<%=danhSachURL%>">
	<table>
		<tr>
			<td>
				<aui:input type="text" value="" name="ten"></aui:input>
			</td>
			<td><aui:button type="submit" icon="icon-search" style="width: 103px;margin-bottom: 12px;" value="Tìm Kiếm"></aui:button></td>
		</tr>
	</table>
</aui:form>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>"
											rowChecker="<%=new RowChecker(renderResponse)  %>"
											delta="2" 
											emptyResultsMessage="khong tim thay" 
											deltaConfigurable="true" var="searchContainer">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=data.size()%>"/>
	<liferay-ui:search-container-row className="danhmuc.model.theloai"
		modelVar="item" indexVar="itemIdex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIdex +1)%>
			</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên">
			<%=item.getName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="đừng nhấn vào">
			<liferay-portlet:actionURL var="deleteURL" name="delete">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Xóa" icon="icon-remove" style="background: red" href="<%=deleteURL %>"></aui:button>
			<liferay-portlet:actionURL var="updateURL" name="input">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Cập Nhật" icon="icon-edit" href="<%=updateURL %>"></aui:button>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
	</liferay-ui:search-container>