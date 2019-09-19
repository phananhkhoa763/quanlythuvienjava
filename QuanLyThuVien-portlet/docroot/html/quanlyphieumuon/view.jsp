<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="danhmuc.service.SachLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="danhmuc.model.phieumuon"%>
<%@page import="danhmuc.service.theloaiLocalServiceUtil"%>
<%@page import="danhmuc.model.Sach"%>
<%@page import="danhmuc.model.theloai"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
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
	List<phieumuon> data = (List<phieumuon>)request.getAttribute("data");
	List<Sach> Sach = (List<Sach>)request.getAttribute("Sach");
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
%>
<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
<aui:form name="frm" method="POST" action="<%=danhSachURL%>">
	<table>
		<tr>
			<td>
				<aui:select name="TrangThai">
					<aui:option value="">Trạng Thái</aui:option>
					<aui:option value="1">Chư xử lý</aui:option>
					<aui:option value="2">Đã Xử lý</aui:option>
				</aui:select>
			</td>
			<td>
				<aui:select name="TenSach">
					<aui:option value="">Tên Sách</aui:option>
					<%for(int i=0;i<Sach.size();i++){ %>
						<aui:option value="<%=Sach.get(i).getId()%>"><%=Sach.get(i).getName()%></aui:option>
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
	<liferay-ui:search-container-row className="danhmuc.model.phieumuon"
		modelVar="item" indexVar="itemIdex" escapedModel="<%=true%>"
		rowVar="itemRow">
		<liferay-ui:search-container-column-text name="STT">
			<%=String.valueOf(itemIdex +1)%>
			</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Người Mượn">
			<%=UserLocalServiceUtil.getUser(item.getUserId()).getScreenName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Sách">
			<%=SachLocalServiceUtil.getSach(item.getSachId()).getName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="ngày mượn">
			<%=dateFormat.format(item.getNgaymuon())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Trạng Thái">
			<%if(item.getTrangthai()==1){%>
				Chưa Xử Lý
			<%}else{ %>
				Đã Xử Lý
			<%} %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Chức Năng">
			<liferay-portlet:actionURL var="chitietURL" name="chitiet">
				<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
			</liferay-portlet:actionURL>
			<aui:button type="submit" value="Thông tin" icon="icon-zoom-in" href="<%=chitietURL %>"></aui:button>
			<%if(item.getTrangthai()==1 && SachLocalServiceUtil.getSach(item.getSachId()).getSoluong()>item.getSoluong()){ %>
				<liferay-portlet:actionURL var="muonsach1URL" name="muonsach1">
					<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
					<liferay-portlet:param name="id1" value="<%=String.valueOf(SachLocalServiceUtil.getSach(item.getSachId()).getId())%>"/>
					<liferay-portlet:param name="soluong" value="<%=String.valueOf(SachLocalServiceUtil.getSach(item.getSachId()).getSoluong()-item.getSoluong())%>"/>
				</liferay-portlet:actionURL>
				<aui:button type="submit"  value="Duyệt" style="background: red" href="<%=muonsach1URL %>"></aui:button>
				<liferay-portlet:actionURL var="muonsach3URL" name="muonsach3">
					<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
				</liferay-portlet:actionURL>
				<aui:button type="submit"  value="từ chối" href="<%=muonsach3URL %>"></aui:button>
			<%}%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
	</liferay-ui:search-container>

	