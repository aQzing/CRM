/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-21 12:00:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class graph_005fmetrics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from www.zi-han.net/theme/hplus/table_basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:01 GMT -->\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>H+ 后台主题UI框架 - 基础表格</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/css/bootstrap.min14ed.css?v=3.3.6\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/css/font-awesome.min93e3.css?v=4.4.0\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/css/plugins/iCheck/custom.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/css/animate.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/css/style.min862f.css?v=4.1.0\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("\r\n");
      out.write("\t<button class=\"btn btn-primary btn-lg\" data-toggle=\"modal\"\r\n");
      out.write("\t\tdata-target=\"#myModal\">添加</button>\r\n");
      out.write("\t<!-- 模态框（Modal） -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">添加</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"addlinkman.controller\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">cusId：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cusId\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">linkName：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"linkName\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">sex：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"sex\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">职位：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"zhiwei\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">办公电话：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"officePhone\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">私人电话：</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"添加\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t<form action=\"golinkman.controller\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">名字</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"linkName\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">职位</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"zhiwei\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">办公电话</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"officePhone\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"请输入文本\"> <span class=\"help-block m-b-none\">说明文字</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"查询\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"ibox-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table\r\n");
      out.write("\t\t\t\t\tclass=\"table table-striped table-bordered table-hover dataTables-example\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<th>id</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>cusId</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>姓名</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>性别</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>职位</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>办公电话</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>私人电话</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/plugins/jeditable/jquery.jeditable.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/plugins/dataTables/jquery.dataTables.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/plugins/dataTables/dataTables.bootstrap.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/content.min.js?v=1.0.0\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/js/shade_util.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document)\r\n");
      out.write("\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\".dataTables-example\").dataTable();\r\n");
      out.write("\t\t\t\t\t\t\tvar oTable = $(\"#editable\").dataTable();\r\n");
      out.write("\t\t\t\t\t\t\toTable\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.$(\"td\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.editable(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"http://www.zi-han.net/theme/example_ajax.php\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"callback\" : function(sValue, y) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar aPos = oTable\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.fnGetPosition(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\toTable.fnUpdate(sValue,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\taPos[0], aPos[1])\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"submitdata\" : function(value,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsettings) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\treturn {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"row_id\" : this.parentNode\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.getAttribute(\"id\"),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"column\" : oTable\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.fnGetPosition(this)[2]\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"width\" : \"90%\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"height\" : \"100%\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\tfunction fnClickAddRow() {\r\n");
      out.write("\t\t\t$(\"#editable\").dataTable()\r\n");
      out.write("\t\t\t\t\t.fnAddData(\r\n");
      out.write("\t\t\t\t\t\t\t[ \"Custom row\", \"New row\", \"New row\", \"New row\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"New row\" ])\r\n");
      out.write("\t\t};\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"http://tajs.qq.com/stats?sId=9051096\" charset=\"UTF-8\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/admin/graph_metrics.jsp(178,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/admin/graph_metrics.jsp(178,6) '${entity}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${entity}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/admin/graph_metrics.jsp(178,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("e");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.cusId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.linkName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.sex }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.zhiwei }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.officePhone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\thref=\"../linkman/deletelinkman.controller?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">删除</a>|<a\r\n");
          out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-lg\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\thref=\"../linkman/goupdatelinkman.controller?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#update\">更新</a> <!-- 模态框（Modal） -->\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"update\" tabindex=\"-1\" role=\"dialog\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\taria-hidden=\"true\">&times;</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">添加</h4>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"../linkman/updatelinkman.controller\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">cusId：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cusId\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.cusId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"> <span\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">linkName：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"linkName\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.linkName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"> <span\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">sex：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"sex\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.sex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"> <span\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">职位：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"zhiwei\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.zhiwei}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"> <span\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">办公电话：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"officePhone\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.officePhone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">私人电话：</label>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"> <span\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"help-block m-b-none\">说明文字</span>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" class=\"form-control\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkman.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">关闭</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"更新\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div></td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
