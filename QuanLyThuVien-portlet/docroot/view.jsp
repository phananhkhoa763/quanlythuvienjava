<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ taglib uri="/WEB-INF/tld/liferay-theme.tld" prefix="liferay-theme"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects />
<%
long plidSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlysach_WAR_QuanLyThuVienportlet");
long plidTheLoai = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlytheloai_WAR_QuanLyThuVienportlet");
long plidSeachSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"timkiemvamuonsach_WAR_QuanLyThuVienportlet");
long plidPhieuMuon = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"quanlyphieumuon_WAR_QuanLyThuVienportlet");
long plidGiaHanSach = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(),"giahansach_WAR_QuanLyThuVienportlet");
%>
<portlet:defineObjects />
<liferay-portlet:actionURL var="SachURL" name="danhSach" portletName="quanlysach_WAR_QuanLyThuVienportlet" plid="<%=plidSach %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="TheLoaiURL" name="danhSach" portletName="quanlytheloai_WAR_QuanLyThuVienportlet" plid="<%=plidTheLoai %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="SeachSachURL" name="danhSach" portletName="timkiemvamuonsach_WAR_QuanLyThuVienportlet" plid="<%=plidSeachSach %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="PhieuMuonURL" name="danhSach" portletName="quanlyphieumuon_WAR_QuanLyThuVienportlet" plid="<%=plidPhieuMuon %>"></liferay-portlet:actionURL>
<liferay-portlet:actionURL var="GiaHanSachURL" name="danhSach" portletName="giahansach_WAR_QuanLyThuVienportlet" plid="<%=plidGiaHanSach %>"></liferay-portlet:actionURL>
<li><a href="<%=SachURL%>">Quản lý sách</a></li>
<li><a href="<%=TheLoaiURL%>">Quản lý Thể loại</a></li>
<li><a href="<%=SeachSachURL%>">Tìm Kiếm Sách</a></li>
<li><a href="<%=PhieuMuonURL%>">Quản Lý Phiếu Mượn</a></li>
<li><a href="<%=GiaHanSachURL%>">Quản lý sách đã mượn</a></li>


