/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-12 03:00:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.experiencer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>用户审核-Java互助学习VIP群业务运行系统</title>\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/H-ui_v3.0/css/H-ui.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/page.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/layer-v2.4/layer.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/jslib/currency.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar page=1;\n");
      out.write("\tvar status =0;\n");
      out.write("\tvar aId=0;\n");
      out.write("\tvar qq=\"\";\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$.ajaxSetup({async : false});\n");
      out.write("\t\t\n");
      out.write("\t\t/* 页面一加载获取的全部信息*/\n");
      out.write("\t\tgetData(status,qq,aId,page);\n");
      out.write("\t\t\n");
      out.write("\t\t/*获取不同状态体验者*/\n");
      out.write("\t\t$(\".butname\").click(function(){\n");
      out.write("\t\t\tvar buttons =$(\".butname\");\n");
      out.write("\t\t\tbuttons.removeClass(\"active\");\n");
      out.write("\t\t    $(this).addClass(\"active\");\n");
      out.write("\t\t\tstatus=this.lang;\n");
      out.write("\t\t\t$(\"#estatus\").val(status);\n");
      out.write("\t\t\taId=$(\"[name='assistant']\").val();\n");
      out.write("\t\t\tqq=$(\"#qq\").val();\n");
      out.write("\t\t\tgetData(status,qq,aId,page);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t/*选择小助手查询*/\n");
      out.write("\t\t$(\"[name='assistant']\").change(function() {\n");
      out.write("\t\t\taId=$(\"[name='assistant']\").val();\n");
      out.write("\t\t\tstatus=$(\"#estatus\").val();\n");
      out.write("\t\t\tqq=$(\"#qq\").val();\n");
      out.write("\t\t\tgetData(status,qq,aId,page);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t/*qq号查询*/\n");
      out.write("\t\t$(\"#qqsearch\").click(function(){\n");
      out.write("\t\t\tvar buttons =$(\".butname\");\n");
      out.write("\t\t\tbuttons.removeClass(\"active\");\n");
      out.write("\t\t\t$(\"[name='assistant']\").val(0);\n");
      out.write("\t\t\tqq=$(\"#qq\").val();\n");
      out.write("\t\t\tgetData(0,qq,0,page);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t/*用于显示的数据*/\n");
      out.write("\t\tfunction getData(status,qq,aId,page){\n");
      out.write("\t\t\t$.ajaxSetup({async:false});\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/getExperienceList.action\",{status:status,qq:qq,aId:aId,page:page},function(data){\n");
      out.write("\t\t\t\tif (isDataStatus(data)) {\t\n");
      out.write("\t\t\t\t\tdrawTable(data.data);\n");
      out.write("\t\t\t\t\t$(\"#paging\").html(showpage(data.page, data.count));\n");
      out.write("\t\t\t\t\tbtnPage();\n");
      out.write("\t\t\t\t\tlookCommunicationclick();\n");
      out.write("\t\t\t\t\taddCommunicationclick();\n");
      out.write("\t\t\t\t\tjoinclick();\n");
      out.write("\t\t\t\t\tprevipclick();\n");
      out.write("\t\t\t\t\tleftclick();\n");
      out.write("\t\t\t\t\tresetclick();\n");
      out.write("\t\t\t\t\tdeleteclick()\n");
      out.write("\t\t\t\t\taddclick();\n");
      out.write("\t\t\t\t\teinfoOn();\n");
      out.write("\t\t\t\t\tclickRows();\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/* 生成表格  */\n");
      out.write("\t\t$(\"#download\").click(function() {\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/download.action\", function(data) {\n");
      out.write("\t\t\t\tif (isDataStatus(data)) {\n");
      out.write("\t\t\t\t\t$(\"#dl\").attr(\"href\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\" + data.data);\n");
      out.write("\t\t\t\t\tlayer.tips('下载表格已准备好!', $(\"#download\"), {\n");
      out.write("\t\t\t\t\t\ttips : [1, '#3595CC' ],\n");
      out.write("\t\t\t\t\t\ttime : 4000\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t/* 下载表格  */\n");
      out.write("\t\t$(\"#dl\").click(function() {\n");
      out.write("\t\t\talert($(\"#dl\").attr(\"href\"));\n");
      out.write("\t\t\tif (isBlank($(\"#dl\").attr('href')) == \"\") {\n");
      out.write("\t\t\t\tlayer.tips('请先生成下载表格!', $(\"#download\"), {\n");
      out.write("\t\t\t\t\ttips : [ 1, '#3595CC' ],\n");
      out.write("\t\t\t\t\ttime : 4000\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t/* 翻页*/\n");
      out.write("\t\tfunction btnPage() {\n");
      out.write("\t\t\t$(\".nav-btn\").click(function() {\n");
      out.write("\t\t\t\tgetData(status,qq,aId,this.lang);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//添加点击事件\n");
      out.write("\t\tfunction addclick(){\n");
      out.write("\t\t\t$(\"#add\").unbind(\"click\").click(function(){\n");
      out.write("\t\t\t\t$(this).unbind();\n");
      out.write("\t\t\t\tlayer.open({\n");
      out.write("\t\t\t\t\t  type: 2,\n");
      out.write("\t\t\t\t\t  title: '添加体验者',\n");
      out.write("\t\t\t\t\t  area: ['380px', '500px'],\n");
      out.write("\t\t\t\t\t  shift: 1,\n");
      out.write("\t\t\t\t\t  shade: 0.5, //开启遮罩关闭\n");
      out.write("\t\t\t\t\t  content: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/add.jsp',\n");
      out.write("\t\t\t\t\t  end: function(){\n");
      out.write("\t\t\t\t\t\t  getData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t  }\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//备注鼠标悬停事件\n");
      out.write("\t\tfunction memoOn(){\n");
      out.write("\t\t\t$(\".memo\").mouseover(function(){\n");
      out.write("\t\t\t\tvar id=\"#\"+this.id;\t\t\t\n");
      out.write("\t\t\t\tlayer.tips('只想提示地精准些', id,{time: 1000});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\t//查看沟通信息点击事件\n");
      out.write("\t\tfunction lookCommunicationclick(){\n");
      out.write("\t\t\t$(\".lookCommunication\").click(function(){\n");
      out.write("\t\t\t\tvar data=this.lang.split(\",\");\n");
      out.write("\t\t\t\tvar id=data[0];\n");
      out.write("\t\t\t\tvar name=data[1];\n");
      out.write("\t\t\t\tlayer.open({\n");
      out.write("\t\t\t\t\t  type: 2,\n");
      out.write("\t\t\t\t\t  title: '查看沟通信息',\n");
      out.write("\t\t\t\t\t  area: ['780px', '550px'],\n");
      out.write("\t\t\t\t\t  shift: 1,\n");
      out.write("\t\t\t\t\t  shade: 0.5, //开启遮罩关闭\n");
      out.write("\t\t\t\t\t  content: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/lookcommunication.jsp?id='+id+'&name='+name,\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//添加沟通信息点击事件\n");
      out.write("\t\tfunction addCommunicationclick(){\n");
      out.write("\t\t\t$(\".addCommunication\").click(function(){\n");
      out.write("\t\t\t\tvar data=this.lang.split(\",\");\n");
      out.write("\t\t\t\tvar id=data[0];\n");
      out.write("\t\t\t\tvar name=data[1];\n");
      out.write("\t\t\t\tlayer.open({\n");
      out.write("\t\t\t\t\t  type: 2,\n");
      out.write("\t\t\t\t\t  title: '添加沟通信息',\n");
      out.write("\t\t\t\t\t  area: ['810px', '550px'],\n");
      out.write("\t\t\t\t\t  shift: 1,\n");
      out.write("\t\t\t\t\t  shade: 0.5, //开启遮罩关闭\n");
      out.write("\t\t\t\t\t  content: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/addcommunication.jsp?id='+id+'&name='+name,\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//加入VIP点击事件\n");
      out.write("\t\t//*未修复：1.重复添加会员\n");
      out.write("\t\t//\t    2.添加会员后，不能重置取消会员资格，否则会员编号，会和提示框中的编号不同\n");
      out.write("\t\tfunction joinclick(){\n");
      out.write("\t\t\t$(\".join\").click(function(){\n");
      out.write("\t\t\t\t//alert(\"功能暂未完善！\");\n");
      out.write("\t\t\t\t//return false;\n");
      out.write("\t\t\t\tvar data=this.lang.split(\",\");\n");
      out.write("\t\t\t\tif('true' == data[3]) {\n");
      out.write("\t\t\t\t\tlayer.msg(\"该体验者已经添加过了!\", {icon: 1});\n");
      out.write("\t\t\t\t\treturn ;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar id=data[0];\n");
      out.write("\t\t\t\tvar name=data[1];\n");
      out.write("\t\t\t\tvar tempNum=(\"\"+data[2]).split(\"0\");\n");
      out.write("\t\t\t\tvar num=tempNum[3];\n");
      out.write("\t\t\t\tif(!confirm(\"确认添加【\" + name + \"】\" + \"为会员吗？\"))\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/joinVIP.action\",{id:id},function(data){\n");
      out.write("\t\t\t\t\tif (isDataStatus(data)) {\n");
      out.write("\t\t\t\t\t\tgetData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\t\t\t\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//加入VIP点击事件\n");
      out.write("\t\t//*未修复：1.重复添加会员\n");
      out.write("\t\t//\t    2.添加会员后，不能重置取消会员资格，否则会员编号，会和提示框中的编号不同\n");
      out.write("\t\tfunction previpclick(){\n");
      out.write("\t\t\t$(\".preVIP\").click(function(){\n");
      out.write("\t\t\t\t//alert(\"功能暂未完善！\");\n");
      out.write("\t\t\t\t//return false;\n");
      out.write("\t\t\t\tvar data=this.lang.split(\",\");\n");
      out.write("\t\t\t\tif('true' == data[3]) {\n");
      out.write("\t\t\t\t\tlayer.msg(\"该体验者已经添加过了!\", {icon: 1});\n");
      out.write("\t\t\t\t\treturn ;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar id=data[0];\n");
      out.write("\t\t\t\tvar name=data[1];\n");
      out.write("\t\t\t\tvar tempNum=(\"\"+data[2]).split(\"0\");\n");
      out.write("\t\t\t\tvar num=tempNum[3];\n");
      out.write("\t\t\t\tif(!confirm(\"确认添加【\" + name + \"】\" + \"为预科计划吗？\"))\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\treturn;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/joinPreVIP.action\",{id:id},function(data){\n");
      out.write("\t\t\t\t\tif (isDataStatus(data)) {\n");
      out.write("\t\t\t\t\t\tgetData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\t\t\t\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//退出点击事件\n");
      out.write("\t\tfunction leftclick(){\n");
      out.write("\t\t\t$(\".left\").click(function(){\n");
      out.write("\t\t\t\tvar str = this.lang.split(\",\");\n");
      out.write("\t\t\t\tvar id=str[0];\n");
      out.write("\t\t\t\t//alert(str[1]);\n");
      out.write("\t\t\t\tif('' != str[1]) {\n");
      out.write("\t\t\t\t\tlayer.msg(\"<b style='color:red;'>该体验者已经退出或者变成会员了！</b>\", {icon: 2});\n");
      out.write("\t\t\t\t\treturn ;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/leftVIP.action\",{id:id},function(data){\n");
      out.write("\t\t\t\t\tif (isDataStatus(data)) {\n");
      out.write("\t\t\t\t\t\tgetData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//重置点击事件\n");
      out.write("\t\tfunction resetclick(){\n");
      out.write("\t\t\t$(\".reset\").click(function(){\n");
      out.write("\t\t\t\tvar id=this.lang;\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/resetVIPFlag.action\",{id:id},function(data){\n");
      out.write("\t\t\t\t\tif (isDataStatus(data)) {\n");
      out.write("\t\t\t\t\t\tgetData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t}\n");
      out.write("\t\t//删除点击事件\n");
      out.write("\t\tfunction deleteclick(){\n");
      out.write("\t\t\t$(\".delete\").click(function(){\n");
      out.write("\t\t\t\tvar id = this.lang;\n");
      out.write("\t\t\t\tlayer.confirm('您确定要删除该用户吗?删除该用户时，同时也会删除该用户的基本信息和信用信息，请谨慎操作！',{btn:['是','否']},//按钮一的回调函数\n");
      out.write("\t\t\t\t\t\tfunction(){\n");
      out.write("\t\t\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/deleteById.action?id=\" + id,function(data){\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.closeAll('dialog');\n");
      out.write("\t\t\t\t\t\t\t\t\tgetData(status,qq,aId,$(\"#btn-currentpage\").parent().attr(\"lang\"));\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t//点击姓名显示信息事件\n");
      out.write("\t\tfunction einfoOn(){\n");
      out.write("\t\t\t$(\".einfo\").click(function(){\n");
      out.write("\t\t\t\t$.ajaxSetup({async:false});\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/experience/getExperienceById.action\",{id:this.lang},function(data){\n");
      out.write("\t\t\t\t\t\tvar info=data.name+\"<br/>\";\n");
      out.write("\t\t\t\t\t\tinfo+=\"手机号码：\" + data.phone+\"<br/>\";\n");
      out.write("\t\t\t\t\t\tinfo+=\"QQ号码：\"+data.qq;\n");
      out.write("\t\t\t\t\t\tlayer.alert(info);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//详细信息点击事件\n");
      out.write("\t\tfunction msgclick(){\n");
      out.write("\t\t\t$(\".msg\").click(function(){\n");
      out.write("\t\t\t\tvar x=$(this);\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/getinfo.action?id=\" + this.lang,function(data){\n");
      out.write("\t\t\t\t\t\tvar info=\"\";\n");
      out.write("\t\t\t\t\t\tif(data==\"\"){\n");
      out.write("\t\t\t\t\t\t\tinfo=\"没有信息，该会员还没有填写\";\n");
      out.write("\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\tinfo=\"<table class='table table-bordered'>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>身份证号码</td><td>\"+ data.idNo + \"</td>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>QQ号码</td><td>\" + data.qqNo + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>支付宝</td><td>\" + data.payAccount + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>家庭联系人</td><td>\" + data.contactName + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>家庭联系人手机</td><td>\" + data.contactMobile + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>与家庭联系人关系</td><td>\" + data.relation + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"<td>收件地址</td><td>\" + data.address + \"</td>\"; \n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</tr><tr>\";\n");
      out.write("\t\t\t\t\t\t\tinfo+=\"</table>\";\n");
      out.write("\t\t\t\t\t\t}\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tlayer.alert(info);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction drawTable(data){\n");
      out.write("\t\t\tif(data.length == 0) {\n");
      out.write("\t\t\t\tlayer.msg(\"没有数据\", {\n");
      out.write("\t\t\t\t\ticon : 0\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#tbody\").html(\"\");\n");
      out.write("\t\t\t\treturn ;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tvar line = \"\";\n");
      out.write("\t\t\tfor(i=0;i<data.length;i++){\n");
      out.write("\t\t\t\tvar student=\"在学\"\n");
      out.write("\t\t\t\tif(data[i].student==false){\n");
      out.write("\t\t\t\t\tstudent=\"在职\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar aname=\"\";\n");
      out.write("\t\t\t\tif(data[i].admin!=null){\n");
      out.write("\t\t\t\t\taname=data[i].admin.realname;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar membernum=\"\";\n");
      out.write("\t\t\t\tif(data[i].user!=null){\n");
      out.write("\t\t\t\t\tmembernum=data[i].user.name;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar endtime=\"\";\n");
      out.write("\t\t\t\tif(data[i].endtime!=null){\n");
      out.write("\t\t\t\t\tendtime=data[i].endtime;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(data[i].flag==0 && data[i].endtime!=null){\n");
      out.write("\t\t\t\t\tdata[i].flag=3;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tswitch (data[i].flag) {\n");
      out.write("\t\t\t\tcase 1 : line += \"<tr class='rows success'>\";break;\n");
      out.write("\t\t\t\tcase 2 : line += \"<tr class='rows warning'>\";break;\n");
      out.write("\t\t\t\tcase 3 : line += \"<tr class='rows danger'>\";break;\n");
      out.write("\t\t\t\tdefault : line += \"<tr class='rows'>\";break;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tline=line + \"<td>\" + (i+1) + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + data[i].num + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td class='einfo' lang='\" + data[i].id + \"'>\" + data[i].name + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + isBlank(data[i].school) + \"</td>\";\n");
      out.write("\t\t\t\tline += \"<td class='nowrap'><span style='text-decoration:underline'><a href='tencent://message/?uin=\"+data[i].qq+\"&Site=&Menu=yes'>\" +isBlank(data[i].qq) + \"</a></span></td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + student +  \"</td>\";\t\n");
      out.write("\t\t\t\tline=line + \"<td>\" + datePattern(data[i].begintime) + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + membernum + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + aname + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td class='memo' id='memo\"+(i+1)+\"'>\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='添加' style='text-decoration:none' class='addCommunication' lang='\" + data[i].id + \",\" + data[i].name +\"'>添加\"+\"</a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='查看' style='text-decoration:none' class='lookCommunication' lang='\" + data[i].id + \",\" + data[i].name +\"'>查看\"+\"</a>\";\n");
      out.write("\t\t\t\tline=line + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='加入' style='text-decoration:none' class='join' lang='\"+ data[i].id + \",\" + data[i].name + \",\" + data[i].num + \",\" + data[i].flag +\"'>加入\"+\"</a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='预科' style='text-decoration:none' class='preVIP' lang='\"+ data[i].id + \",\" + data[i].name + \",\" + data[i].num + \",\" + data[i].flag +\"'>预科\"+\"</a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='退出' style='text-decoration:none' class='left' lang='\"+ data[i].id + \",\" + endtime +\"'>退出\"+\"</a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='重置' style='text-decoration:none' class='reset' lang='\"+data[i].id+\"'><i class='Hui-iconfont'>&#xe66b;</i></a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='修改' style='text-decoration:none' class='modify' lang='\"+data[i].id+\"'><i class='Hui-iconfont'>&#xe6df;</i></a>&nbsp;|&nbsp;\";\n");
      out.write("\t\t\t\tline=line + \"<a href='javascript:void(0)' title='删除' style='text-decoration:none' class='delete' lang='\"+data[i].id+\"'><i class='Hui-iconfont'>&#xe609;</i></a>\";\n");
      out.write("\t\t\t\tline=line + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"</tr>\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$(\"#tbody\").html(line);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<div class=\"panel panel-secondary\">\n");
      out.write("\t\t<div class=\"panel-header\">\n");
      out.write("\t\t\t<div style=\"float: left;\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"flag\" value=\"0\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-success\" id=\"add\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-plus\" aria-hidden=\"true\"></i> 添加体验者\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"btn-group\" style=\"float: left\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"estatus\" value=\"0\" />\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius active butname\"\n");
      out.write("\t\t\t\t\tlang=\"0\">全部信息</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius butname\"\n");
      out.write("\t\t\t\t\tlang=\"2\">正在体验</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius butname\"\n");
      out.write("\t\t\t\t\tlang=\"1\">已经加入</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius butname\"\n");
      out.write("\t\t\t\t\tlang=\"3\">已经退出</button>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius butname\"\n");
      out.write("\t\t\t\t\tlang=\"4\">预科计划</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<span class=\"select-box radius\"\n");
      out.write("\t\t\t\t\tstyle=\"width: 100px; background: white;\"> <select\n");
      out.write("\t\t\t\t\tclass=\"select\" name=\"assistant\">\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">所有人</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"73\">刘永</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"74\">张海浪</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"75\">李子月</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"76\">刘申鹏</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"77\">王健</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"79\">龚道松</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"80\">周兴华</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t</span> <input id=\"qq\" type=\"text\" placeholder=\"QQ号\" style=\"width: 100px\"\n");
      out.write("\t\t\t\t\tclass=\"input-text radius\" />\n");
      out.write("\t\t\t\t<button id=\"qqsearch\" class=\"btn btn-success\" type=\"button\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-search\" aria-hidden=\"true\"></i> QQ号模糊查询\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"btn-group\" style=\"float: right\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary radius\" id=\"download\">生成表格</button>\n");
      out.write("\t\t\t\t<a type=\"button\" class=\"btn btn-primary radius\" id=\"dl\">点击下载</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"panel-primary\">\n");
      out.write("\t\t\t<table class=\"table table-border table-bg table-bordered radius\">\n");
      out.write("\t\t\t\t<thead class=\"text-c\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>序号</th>\n");
      out.write("\t\t\t\t\t\t<th>用户名</th>\n");
      out.write("\t\t\t\t\t\t<th>姓名</th>\n");
      out.write("\t\t\t\t\t\t<th>学校</th>\n");
      out.write("\t\t\t\t\t\t<th>QQ</th>\n");
      out.write("\t\t\t\t\t\t<th>类型</th>\n");
      out.write("\t\t\t\t\t\t<th>开始时间</th>\n");
      out.write("\t\t\t\t\t\t<th>会员编号</th>\n");
      out.write("\t\t\t\t\t\t<th>助教</th>\n");
      out.write("\t\t\t\t\t\t<th>沟通</th>\n");
      out.write("\t\t\t\t\t\t<th>操作</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody id=\"tbody\" class='text-c'></tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"page-nav\" id=\"paging\"\n");
      out.write("\t\t\tstyle=\"float: right; margin-top: 10px;\"></div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /admin/experiencer/manageExperience.jsp(375,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin==null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write('	');
        out.write('	');
        if (true) {
          _jspx_page_context.forward("/user/login.jsp");
          return true;
        }
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
