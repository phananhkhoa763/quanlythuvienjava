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
<%Sach Sach = (Sach)request.getAttribute("Sach"); %>
<%List<theloai> TheLoai = (List<theloai>)request.getAttribute("data");%>
<h2>Updata Thông tin chi tiết về sách</h2>
<liferay-portlet:actionURL var="saveURL" name="save"></liferay-portlet:actionURL>
<aui:form name="frm" method="post" action="<%=saveURL %>">
	<aui:input type="hidden" name="id" value="<%=Sach.getId() %>"></aui:input>
	<table>
		<tr>
			<td>
				<aui:input type="text" name="Name" value="<%=Sach.getName()%>"></aui:input>
			</td>
			<td>
				<aui:select name="TheloaiID">
					<%for(int i=0;i<TheLoai.size();i++){ %>
						<aui:option value="<%=TheLoai.get(i).getId() %>"><%=TheLoai.get(i).getName() %></aui:option>
					<% } %>
				</aui:select>
			</td>
			<td>
				<aui:input type="text" name="Soluong" value="<%=Sach.getSoluong()%>"></aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:input type="text" name="Nxb" value="<%=Sach.getNxb()%>"></aui:input>
			</td>
			<td>
				<aui:input type="text" name="Tacgia" value="<%=Sach.getTacgia()%>"></aui:input>
			</td>
			<td>
				<aui:input type="text" name="Masach" value="<%=Sach.getMasach()%>"></aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:input type="text" name="Ke" value="<%=Sach.getKe()%>"></aui:input>
			</td>
			<td>
				<aui:input type="text" name="Tang" value="<%=Sach.getTang()%>"></aui:input>
			</td>
			<td>
				<aui:input type="text" name="NoiDung" value="<%=Sach.getNoidung()%>"></aui:input>
			</td>
		</tr>
		<td>
			<aui:button type="submit" icon="icon-save" value="Lưu"></aui:button>
			<liferay-portlet:actionURL var="danhSachURL" name="danhSach"></liferay-portlet:actionURL>
			<aui:button  value="quay lại" icon="icon-undo" href="<%=danhSachURL %>"></aui:button>
		</td>
	</table>
</aui:form>