/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-21 14:18:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.personal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mysummarys_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>查看周报</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layui/css/layui.css\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/favicon.ico\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tableTemplet/css/H-ui1.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tableTemplet/lib/Hui-iconfont/1.0.1/iconfont.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layer-v2.0/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t//第一次点击进来的默认值\r\n");
      out.write("\tvar checkType=\"all\";\r\n");
      out.write("\tvar ownerType=\"my\";\r\n");
      out.write("\tvar weekType=\"all\";\r\n");
      out.write("\tvar title;\r\n");
      out.write("\tvar page2=1;\r\n");
      out.write("\t/*\r\n");
      out.write("\t去除返回的功能\r\n");
      out.write("\t//从查看返回\r\n");
      out.write("\t//获取url中的参数,以便返回\r\n");
      out.write("    (function ($) {\r\n");
      out.write("        $.getUrlParam = function (name) {\r\n");
      out.write("            var reg = new RegExp(\"(^|&)\" + name + \"=([^&]*)(&|$)\");\r\n");
      out.write("            var r = window.location.search.substr(1).match(reg);\r\n");
      out.write("            if (r != null) return unescape(r[2]); return null;\r\n");
      out.write("        }\r\n");
      out.write("    })(jQuery);\r\n");
      out.write("\tif($.getUrlParam('page2')!=null)\r\n");
      out.write("\t{\r\n");
      out.write("\t    page2 = $.getUrlParam('page2');\r\n");
      out.write("\t    ownerType = $.getUrlParam('ownerType');\t\r\n");
      out.write("\t    checkType = $.getUrlParam('checkType');\r\n");
      out.write("\t    weekType = $.getUrlParam('weekType');\r\n");
      out.write("\t    setWeekTypeCheck(weekType);\r\n");
      out.write("\t    title = $.getUrlParam('title');\r\n");
      out.write("\t}\r\n");
      out.write("\t*/\r\n");
      out.write("\tsetWeekTypeCheck(weekType);\r\n");
      out.write("\tgetData(checkType,ownerType,weekType,title,page2);\r\n");
      out.write("\t$(\"#search-summary\").click(function(){\r\n");
      out.write("\t\tcheckType=$(\"[name='checkType']\").val();\r\n");
      out.write("\t\tweekType=$(\"[name='weekType']\").val();\r\n");
      out.write("\t\ttitle=$(\"[name='title']\").val();\r\n");
      out.write("\t\tpage2=1;\r\n");
      out.write("\t\t//设置weekType\r\n");
      out.write("\t\tif($(\"#weekType-1\").is(\":checked\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert($(\"#weekType-1\").val());\r\n");
      out.write("\t\t\tweekType=$(\"#weekType-1\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#weekType-2\").is(\":checked\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert($(\"#weekType-2\").val());\r\n");
      out.write("\t\t\tweekType=$(\"#weekType-2\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#weekType-3\").is(\":checked\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert($(\"#weekType-3\").val());\r\n");
      out.write("\t\t\tweekType=$(\"#weekType-3\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#weekType-4\").is(\":checked\"))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//alert($(\"#weekType-4\").val());\r\n");
      out.write("\t\t\tweekType=$(\"#weekType-4\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//alert(checkType);\r\n");
      out.write("\t\t//alert(ownerType);\r\n");
      out.write("\t\t//alert(weekType);\r\n");
      out.write("\t\t//alert(title);\r\n");
      out.write("\t\t//alert(page2);\r\n");
      out.write("\t\tgetData(checkType,ownerType,weekType,title,page2);\r\n");
      out.write("\t})\t\r\n");
      out.write("\r\n");
      out.write("\tfunction setWeekTypeCheck(weekType)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(weekType==\"all\"){\r\n");
      out.write("\t\t\t$(\"#weekType-1\").attr(\"checked\",true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(weekType==\"previous\"){\r\n");
      out.write("\t\t\t$(\"#weekType-2\").attr(\"checked\",true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(weekType==\"current\"){\r\n");
      out.write("\t\t\t$(\"#weekType-3\").attr(\"checked\",true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(weekType==\"next\"){\r\n");
      out.write("\t\t\t$(\"#weekType-4\").attr(\"checked\",true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getData(checkType,ownerType,weekType,title,page2){\r\n");
      out.write("\t\t$.ajaxSetup({async:false});\r\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/summary/getSummarysByPage1.action\",{checkType:checkType,ownerType:ownerType,weekType:weekType,title:title,page2:page2},function(data){\r\n");
      out.write("\t\t\t//alert(data);\r\n");
      out.write("\t\t\tvar dataObj = eval(\"(\"+data+\")\");\r\n");
      out.write("\t\t\tvar navbar=dataObj.returnMap.navbar;\r\n");
      out.write("\t\t\tvar tatolCount=dataObj.returnMap.totalCount;\r\n");
      out.write("\t\t\tvar list=dataObj.returnMap.list;\r\n");
      out.write("\t\t\tvar title=dataObj.returnMap.title;\r\n");
      out.write("\t\t\tvar titleTip=dataObj.returnMap.titleTip;\r\n");
      out.write("\t\t\t$(\"#titleTip\").html(titleTip);\r\n");
      out.write("\t\t\t$(\".page-nav\").html(navbar);\r\n");
      out.write("\t\t\tbtnclick();\r\n");
      out.write("\t\t\t$(\"#TATOLCOUNT\").html(tatolCount);\r\n");
      out.write("\t\t\t$(\"[name='title']\").val(title);\r\n");
      out.write("\t\t\tdrawTable(list);\r\n");
      out.write("\t\t//\ttrclick();\r\n");
      out.write("\t\t\ttitclick();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\t\r\n");
      out.write("\tfunction btnclick(){\r\n");
      out.write("\t\t$(\".nav-btn\").click(function(){\r\n");
      out.write("\t\t\tpage2=this.lang;\r\n");
      out.write("\t\t\tgetData(checkType,ownerType,weekType,title,page2);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\t\r\n");
      out.write("\t//查看周报\t\r\n");
      out.write("\tfunction showSum(sid){\t\r\n");
      out.write("\t\t\t//location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/summary/membersumcomment1.jsp?page2=\"+page2+\"&ownerType=\"+ownerType+\"&checkType=\"+checkType+\"&weekType=\"+weekType+\"&title=\"+title+\"&id=\"+id;\r\n");
      out.write("\t\t\t//window.open(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/summary/membersumcomment1.jsp?id=\"+id);\r\n");
      out.write("\t\tlayer.open({\r\n");
      out.write("\t\t\t  type: 2,\r\n");
      out.write("\t\t\t  title: '查看周报',\r\n");
      out.write("\t\t\t  area: ['80%', '500px'],\r\n");
      out.write("\t\t\t // closeBtn: 0, //不显示关闭按钮\r\n");
      out.write("\t\t\t  shift: 1,\r\n");
      out.write("\t\t\t  shade: 0.5, //开启遮罩关闭\r\n");
      out.write("\t\t\t  content: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/summary/membersumcomment1.jsp?id='+sid,\r\n");
      out.write("\t\t\t  end: function(){\r\n");
      out.write("\t\t\t\t  getData(checkType,ownerType,weekType,title,page2);\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction titclick(){\r\n");
      out.write("\t\t$(\".tit\").click(function(){\r\n");
      out.write("\t\t\tvar id=this.lang;\r\n");
      out.write("\t\t\tshowSum(id);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction trclick(){\r\n");
      out.write("\t\t//火狐对last不支持，在不该被点的td里面机上noclick的class\r\n");
      out.write("\t\t//$(\"tr td:not(':first,:last')\").click(function(){\r\n");
      out.write("\t\t$(\"tr td:not(.noclick)\").click(function(){\r\n");
      out.write("\t\t\tvar id=this.parentNode.lang;\r\n");
      out.write("\t\t\tshowSum(id);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction drawTable(data){\r\n");
      out.write("\t\tvar line=\"\";\r\n");
      out.write("\t\tvar recom=\"\";\r\n");
      out.write("\t\tline=line + \"<thead>\";\r\n");
      out.write("\t\tline=line + \"<tr class='text-c'>\";\r\n");
      out.write("\t\tline=line + \"<th width='25'><input type='checkbox' name='' value=''></th>\";\r\n");
      out.write("\t\tline=line + \"<th width='80'>序号</th>\";\r\n");
      out.write("\t\tline=line + \"<th width='80'>会员姓名</th>\";\r\n");
      out.write("\t\tline=line + \"<th width='180'>周报标题</th>\";\t\r\n");
      out.write("\t\tline=line + \"<th width='150'>提交时间</th>\";\r\n");
      out.write("\t\tline=line + \"<th width='60'>状态</th>\";\r\n");
      out.write("\t\tline=line + \"<th width='150'>操作</th>\";\r\n");
      out.write("\t\tline=line + \"</tr>\";\r\n");
      out.write("\t\tline=line + \"</thead>\";\r\n");
      out.write("\t\tline=line + \"<tbody>\";\r\n");
      out.write("\t\tfor(i=0;i<data.length;i++){\r\n");
      out.write("\t\t\tline=line + \"<tr class='text-c tr' lang='\"+data[i].id+\"'>\";\r\n");
      out.write("\t\t\tline=line + \"<td class='noclick'>\" + \"<input type='checkbox' name='' value=''>\" + \"</td>\";\r\n");
      out.write("\t\t\tif(data[i].recommendval=='1')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t\trecom=\"<span class='layui-badge layui-bg-orange' style='text-align: right;'>荐</span>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t\trecom=\"&nbsp;&nbsp;&nbsp;&nbsp;\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tline=line + \"<td>\" + (i+1) + \"</td>\";\r\n");
      out.write("\t\t\tline=line + \"<td>\" + data[i].name + \"</td>\";\r\n");
      out.write("\t\t\tline=line + \"<td>\" + data[i].title + \"</td>\";\r\n");
      out.write("\t\t\tline=line + \"<td>\" + data[i].time +\"&nbsp;&nbsp;\"+recom + \"</td>\";\r\n");
      out.write("\t\t\tline=line +\"<td class='td-status'>\";\r\n");
      out.write("\t\t\tif(data[i].ischeckval == '0')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tline=line+\"<span class='label label-danger radius'>未审核</span>\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tline=line+\"<span class='label label-success radius'>已审核</span>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tline=line +\"</td>\";\t\r\n");
      out.write("\t\t\tline=line + \"<td class='noclick'><a href='javascript:void(0)' class='tit' lang='\"+data[i].sid+\"'>查看</a></td>\";\r\n");
      out.write("\t\t\tline=line + \"</tr>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tline=line + \"</tbody>\";\r\n");
      out.write("\t\t$(\"#period\").html(line);\r\n");
      out.write("\t}\r\n");
      out.write("           \r\n");
      out.write("});\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"text-c\" style=\"overflow: auto; width: 100%;\">\r\n");
      out.write("\t\t<form id=\"\">\r\n");
      out.write("\t\t\t审核状态： <span class=\"select-box inline\"> <select\r\n");
      out.write("\t\t\t\tname=\"checkType\" class=\"select\">\r\n");
      out.write("\t\t\t\t\t<option value=\"all\">不限</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"checked\">已审核</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"nonchecked\">未审核</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t</span>&nbsp; &nbsp; 周报所属： <input type=\"radio\" id=\"weekType-1\"\r\n");
      out.write("\t\t\t\tname=\"weekType\" value=\"all\"> <label for=\"weekType-1\">全部</label>&nbsp;\r\n");
      out.write("\t\t\t<input type=\"radio\" id=\"weekType-2\" name=\"weekType\" value=\"previous\">\r\n");
      out.write("\t\t\t<label for=\"weekType-2\">向前一周</label>&nbsp; <input type=\"radio\"\r\n");
      out.write("\t\t\t\tid=\"weekType-3\" name=\"weekType\" value=\"current\"> <label\r\n");
      out.write("\t\t\t\tfor=\"weekType-3\">本周</label>&nbsp; <input type=\"radio\"\r\n");
      out.write("\t\t\t\tid=\"weekType-4\" name=\"weekType\" value=\"next\"> <label\r\n");
      out.write("\t\t\t\tfor=\"weekType-4\">向后一周</label>&nbsp; &nbsp; <input type=\"hidden\"\r\n");
      out.write("\t\t\t\tname=\"title\" value=\"\">\r\n");
      out.write("\t\t\t<button name=\"\" id=\"search-summary\" class=\"btn btn-success\"\r\n");
      out.write("\t\t\t\ttype=\"button\">\r\n");
      out.write("\t\t\t\t<i class=\"Hui-iconfont\">&#xe665;</i> 搜周报\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\" id=\"title\">\r\n");
      out.write("\t\t<span style=\"margin-left: 180px;\" id=\"titleTip\"></span> <span\r\n");
      out.write("\t\t\tclass=\"r\">共有数据：<strong id=\"TATOLCOUNT\"></strong> 条\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"mt-20\" style=\"overflow: auto; width: 100%;\">\r\n");
      out.write("\t\t<table\r\n");
      out.write("\t\t\tclass=\"table table-border table-bordered table-bg table-hover table-sort\"\r\n");
      out.write("\t\t\tid=\"period\">\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class='page-nav' style=\"margin-right: 4%;\"></div>\r\n");
      out.write("\r\n");
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
}