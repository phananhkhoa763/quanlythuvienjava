<%@page import="com.liferay.portal.model.Portlet"%>
<%@page import="danhmuc.service.phieugiahanLocalServiceUtil"%>
<%@page import="danhmuc.model.phieugiahan"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="javax.xml.crypto.Data"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.liferay.portal.model.User"%>
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
	PortletURL interatorURL = renderResponse.createActionURL();
	interatorURL.setParameter(ActionRequest.ACTION_NAME, "danhSach");
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	ThemeDisplay td  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	User userIdUser = td.getUser();
	Date date = new Date();
	date.setHours(0);
	date.setMinutes(0);
	date.setSeconds(0);
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
		<liferay-ui:search-container-column-text name="STT" cssClass="keycolumn">
			
			 <%=String.valueOf(itemIdex +1) %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Tên Sách">
			 <%=SachLocalServiceUtil.getSach(item.getSachId()).getName()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="ngày mượn">
			 <%=dateFormat.format(item.getNgaymuon())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Ngày Trả">
			 <%=dateFormat.format(item.getNgaytra())%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="trang thái">
				<%if(item.getNgaytra().compareTo(date)>0){%>
			 		chưa hết hạn trả sách
				<% }else if(item.getNgaytra().compareTo(date)<0) {%>
				 	quá hạn trả sách
				<%}else if(item.getNgaytra().compareTo(date)==0) {%>
					Đến ngày trả sách
				<%} %>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="Chức Năng">
			<%if(item.getNgaytra().compareTo(date)>0){%>
				<%if(item.getGiahan()==0 ){ %>
					<liferay-portlet:actionURL var="giahansach1URL" name="giahansach1">
						<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
					</liferay-portlet:actionURL>
					<aui:button type="submit" value="Gia hạn" icon="icon-zoom-in" href="<%=giahansach1URL %>"></aui:button>
				<%}else{ %>
					<aui:button type="submit" value="hết lượt gia hạn" icon="icon-zoom-in"></aui:button>
				<%} %>
			<%}%>
			<%if(userIdUser.getUserId()==item.getUserId() && item.getTrangthai()!=1){ %>
				<liferay-portlet:actionURL var="chitietURL" name="chitiet">
					<liferay-portlet:param name="id" value="<%=String.valueOf(item.getId())%>"/>
				</liferay-portlet:actionURL>
				<aui:button type="submit" value="Trả sách" icon="icon-zoom-in" style="background: red" href="<%=chitietURL %>"></aui:button>
			<%} %>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="true"/>
	</liferay-ui:search-container>

	