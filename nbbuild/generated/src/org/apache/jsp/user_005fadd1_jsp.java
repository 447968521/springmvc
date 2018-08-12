package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class user_005fadd1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>用户信息添加</h1>\r\n");
      out.write("<form action=\"user/test/add1\" method=\"post\">\r\n");
      out.write("\t账号：<input  type=\"text\" name=\"userNumber\" /><br/>\r\n");
      out.write("\t密码：<input  type=\"text\" name=\"passWord\" /><br/>\r\n");
      out.write("\t<input type=\"submit\" value=\"提交\"/>\r\n");
      out.write("</form>\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\r');
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('\r');
      out.write('\n');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    ");
  
                List list = new ArrayList();  
                List list1 = new ArrayList();  
                List list2 = new ArrayList();  
                list1.add("1-a");  
                list1.add("1-b");  
                list2.add("2-d");  
                list2.add("2-c");  
                list.add(list1);  
                list.add(list2);  
                request.setAttribute("list1", list1);  
                request.setAttribute("list", list);  
            
      out.write("  \r\n");
      out.write("            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"item\">  \r\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"item2\">  \r\n");
      out.write("                    <tr>  \r\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item2 }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>  \r\n");
      out.write("                    </tr>  \r\n");
      out.write("            </c:forEach>  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
