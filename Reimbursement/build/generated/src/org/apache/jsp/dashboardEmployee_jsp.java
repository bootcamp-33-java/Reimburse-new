package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div data-role=\"page\">\n");
      out.write("  <div data-role=\"header\">\n");
      out.write("  <h1>Collapsible Forms</h1>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div data-role=\"main\" class=\"ui-content\">\n");
      out.write("    <form method=\"post\" action=\"/action_page_post.php\">\n");
      out.write("      <fieldset data-role=\"collapsible\">\n");
      out.write("        <legend>Click me - I'm collapsible!</legend>\n");
      out.write("          <label for=\"name\">Full Name:</label>\n");
      out.write("          <input type=\"text\" name=\"text\" id=\"name\">\n");
      out.write("          <p>Favorite Color:</p>\n");
      out.write("        <div data-role=\"controlgroup\">\n");
      out.write("          <label for=\"red\">Red</label>\n");
      out.write("          <input type=\"checkbox\" name=\"favcolor\" id=\"red\" value=\"red\">\n");
      out.write("          <label for=\"green\">Green</label>\n");
      out.write("          <input type=\"checkbox\" name=\"favcolor\" id=\"green\" value=\"green\">\n");
      out.write("          <label for=\"blue\">Blue</label>\n");
      out.write("          <input type=\"checkbox\" name=\"favcolor\" id=\"blue\" value=\"blue\">\n");
      out.write("        </div>\n");
      out.write("      <input type=\"submit\" data-inline=\"true\" value=\"Submit\">\n");
      out.write("      </fieldset>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
