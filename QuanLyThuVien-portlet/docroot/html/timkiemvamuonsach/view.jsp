<%@page import="danhmuc.service.theloaiLocalServiceUtil"%>
<%@page import="danhmuc.model.Sach"%>
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
	List<Sach> data = (List<Sach>)request.getAttribute("data");
	List<theloai> TheLoai = (List<theloai>)request.getAttribute("TheLoai");
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
%>
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<aui:form name="frm" method="POST" action="<%=danhSachURL%>">
	<table>
		<tr>
			<td>
				<aui:input type="text" value="" name="sach"></aui:input>
			</td>
			<td>
				<aui:input type="text" value="" name="TacGia"></aui:input>
			</td>
			<td>
				<aui:select name="TheLoai">
					<aui:option value="">Tên Thể Loại</aui:option>
					<%for(int i=0;i<TheLoai.size();i++){ %>
						<aui:option value="<%=TheLoai.get(i).getId()%>"><%=TheLoai.get(i).getName()%></aui:option>
					<% } %>
				</aui:select>
			</td>
			<td><aui:button type="submit"  style="width: 103px;margin-bottom: 12px;" icon="icon-search" value="Tìm Kiếm"></aui:button></td>
		</tr>
	</table>
</aui:form>
<liferay-ui:search-container iteratorURL="<%=interatorURL%>" 
											delta="2" 
											emptyResultsMessage="khong tim thay" 
											deltaConfigurable="true" var="searchContainer">
	<liferay-ui:search-container-results results="<%=data%>" total="<%=data.size()%>"/>
	<liferay-ui:search-container-row className="danhmuc.model.Sach"
		modelVar="item" indexVar="itemIdex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIdex +1)%>
			</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên">
			<%=item.getName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tác Giả">
			<%=item.getTacgia()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Thể loại">
			<%=theloaiLocalServiceUtil.gettheloai(item.getTheloaiID()).getName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Nội Dung">
			<%=item.getNoidung()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Chức Năng">
			<liferay-portlet:actionURL var="chitietURL" name="chitiet">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Thông tin" icon="icon-zoom-in" href="<%=chitietURL %>"></aui:button>
			<liferay-portlet:actionURL var="phieumuonURL" name="phieumuon">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Mượn Sách" icon="icon-linux" style="background: red" href="<%=phieumuonURL %>" ></aui:button>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
	</liferay-ui:search-container>