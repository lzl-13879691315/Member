/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-21 11:17:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>来访历史-Java互助学习VIP群业务运行系统</title>\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tableTemplet/css/H-ui.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/tableTemplet/lib/Hui-iconfont/1.0.1/iconfont.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layer-v2.0/layer/layer.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\t//第一次点击进来的默认值\n");
      out.write("\tvar page2=1;\n");
      out.write("\tgetData(page2);\n");
      out.write("\tfunction getData(page2){\n");
      out.write("\t\t$.ajaxSetup({async:false});\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/visit/getVisitorByPage.action\",{page2:page2},function(data){\n");
      out.write("\t\t\t//alert(data);\n");
      out.write("\t\t\tvar dataObj = eval(\"(\"+data+\")\");\n");
      out.write("\t\t\tvar navbar=dataObj.returnMap.navbar;\n");
      out.write("\t\t\tvar list=dataObj.returnMap.list;\n");
      out.write("\t\t\t$(\".page-nav\").html(navbar);\n");
      out.write("\t\t\tbtnclick();\n");
      out.write("\t\t\tdrawTable(list);\n");
      out.write("\t\t})\n");
      out.write("\t\t\n");
      out.write("\t}\t\n");
      out.write("\t//分页按钮点击事件\n");
      out.write("\tfunction btnclick(){\n");
      out.write("\t\t$(\".nav-btn\").click(function(){\n");
      out.write("\t\t\tpage2=this.lang;\n");
      out.write("\t\t\tgetData(page2);\n");
      out.write("\t\t})\n");
      out.write("\t}\n");
      out.write("\tfunction drawTable(data){\n");
      out.write("\t\tvar line=\"\";\n");
      out.write("\t\tline=line + \"<thead class='text-c'>\"\n");
      out.write("\t\tline=line + \"<tr>\";\n");
      out.write("\t\tline=line + \"<th>序号</th>\";\n");
      out.write("\t\tline=line + \"<th>真实姓名</th>\";\n");
      out.write("\t\tline=line + \"<th>来访时间</th>\";\n");
      out.write("\t\tline=line + \"<th>离开时间</th>\";\n");
      out.write("\t\tline=line + \"<th>用户类型</th>\";\n");
      out.write("\t\tline=line + \"</tr>\";\n");
      out.write("\t\tline=line + \"</thead>\"\n");
      out.write("\t\tfor(i=0;i<data.length;i++){\n");
      out.write("\t\t\t\tline=line + \"<tbody class='text-c'>\"\t\t\t\t\n");
      out.write("\t\t\t\tline=line + \"<tr>\"\n");
      out.write("\t\t\t\tline=line + \"<td>\" + (i+1)+ \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + (data[i].memAndExp.name) + \"</td>\";\n");
      out.write("\t\t\t\tline=line + \"<td>\" + (data[i].formatVisitTime) + \"</td>\";\n");
      out.write("\t\t\t\tvar leftTime=\"在线\";\n");
      out.write("\t\t\t\tif(data[i].formatLeftTime!=null)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tleftTime=data[i].formatLeftTime;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tline=line + \"<td>\" + leftTime + \"</td>\";\t\t\t\n");
      out.write("\t\t\t\tvar userType=(data[i].agent);\n");
      out.write("\t\t\t\tif(userType==true){\n");
      out.write("\t\t\t\t\tuserType=\"手机用户\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(userType==false){\n");
      out.write("\t\t\t\t\tuserType=\"电脑用户\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tline=line + \"<td>\" + userType + \"</td>\";\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tline=line + \"</tr>\";\n");
      out.write("\t\t\t\tline=line + \"</tbody>\"\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"#visits\").html(line);\n");
      out.write("\t}\t\n");
      out.write("})\t\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1 style=\"text-align: center\">用户历史访问记录</h1>\n");
      out.write("\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\" id=\"title\">\n");
      out.write("\t\t<span style=\"color: #F5FAFE\">1</span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"mt-20\">\n");
      out.write("\t\t<table class=\"table table-border table-bg table-bordered radius\"\n");
      out.write("\t\t\tid=\"visits\">\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<br />\n");
      out.write("\t<div class='page-nav' style=\"padding-right: 120px\"></div>\n");
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
}
