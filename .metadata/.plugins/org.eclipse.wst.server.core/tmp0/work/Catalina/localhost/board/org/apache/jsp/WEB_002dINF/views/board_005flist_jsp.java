/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2024-02-15 16:28:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.my.dto.BoardDto;
import java.util.ArrayList;

public final class board_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/BoardSpring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1706835792776L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.my.dto.BoardDto");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

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
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

	Object obj = request.getAttribute("listBoard");
	ArrayList<BoardDto> list1 = (ArrayList<BoardDto>) obj;   // 자-부 (X)
	
	int pageNum = (Integer) request.getAttribute("pageNum");
	int startPNum = (Integer) request.getAttribute("startPNum");
	int endPNum = (Integer) request.getAttribute("endPNum");
	int lastPageNum = (int) request.getAttribute("lastPageNum");
	
	String msg = (String) request.getAttribute("msg");
	request.setAttribute("msg", null);

      out.write('\r');
      out.write('\n');

	if(msg!=null) {

      out.write("\r\n");
      out.write("		<script>alert(\"");
      out.print(msg);
      out.write("\");</script>\r\n");

	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>게시글 목록</title>\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.6.3.min.js\"></script>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(function() {\r\n");
      out.write("			$(\"tr\").click(function() {\r\n");
      out.write("				let bno = $(this).find(\".bno\").text();\r\n");
      out.write("				location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/detail?bno=\" + bno;\r\n");
      out.write("			});\r\n");
      out.write(" 			$(\"#btn_write\").click(function() {\r\n");
      out.write("				location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/write\";\r\n");
      out.write("			});\r\n");
      out.write(" 			\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	<style>\r\n");
      out.write("		.fl { float: left; }\r\n");
      out.write("		.fr { float: right; }\r\n");
      out.write("		table { border-collapse: collapse; border: 1px solid grey; }\r\n");
      out.write("		td, th { font-size:14px; }\r\n");
      out.write("		#pagination { \r\n");
      out.write("			font-size: 30px;\r\n");
      out.write("		    width: 300px;\r\n");
      out.write("	    	margin: 0 auto; \r\n");
      out.write("	    	color:#4CAF50;\r\n");
      out.write("		}\r\n");
      out.write("		#pagination a {\r\n");
      out.write("			text-decoration: none;\r\n");
      out.write("			color:grey;\r\n");
      out.write("		}\r\n");
      out.write("		#btn_write{\r\n");
      out.write("			background-color: #4CAF50;\r\n");
      out.write("	        color: white;\r\n");
      out.write("	        padding: 10px 20px;\r\n");
      out.write("	        border: none;\r\n");
      out.write("	        border-radius: 5px;\r\n");
      out.write("	        cursor: pointer;\r\n");
      out.write("	        font-size: 14px;\r\n");
      out.write("	        margin-right: 10px;\r\n");
      out.write("		}\r\n");
      out.write("	</style>		\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1>게시글 전체보기</h1>\r\n");
      out.write("		<!-- <button id=\"btn_logout\" class=\"fr\">로그아웃</button> -->\r\n");
      out.write("		<div style=\"clear:both;\"></div>\r\n");
      out.write("		<table class=\"table table-striped\" page=\"");
      out.print(pageNum);
      out.write("\">\r\n");
      out.write("			<tr >\r\n");
      out.write("				<th>글번호</th>\r\n");
      out.write("				<th>제목</th>\r\n");
      out.write("				<th>작성자</th>\r\n");
      out.write("				<th>작성일시</th>\r\n");
      out.write("				<th>조회수</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");

				for(BoardDto dto : list1) {
			
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"bno\">");
      out.print(dto.getBno() );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(dto.getTitle() );
      out.write(" </td>\r\n");
      out.write("						<td>");
      out.print(dto.getWriter() );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(dto.getWritedate() );
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(dto.getHitcount() );
      out.write("</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		<button id=\"btn_write\">글쓰기</button>\r\n");
      out.write("		<div id=\"pagination\">\r\n");
      out.write("			");
 if(startPNum>1) { 
      out.write("\r\n");
      out.write("				<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list?page=");
      out.print(startPNum-1);
      out.write("\">&lt;&lt;</a>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("			");
 for(int i=startPNum; i<=endPNum; i++) { 
      out.write("\r\n");
      out.write("			");
	if(i>lastPageNum) break; 
      out.write("\r\n");
      out.write("			");
	if(i==pageNum) { 
      out.write("\r\n");
      out.write("				<span>");
      out.print(i );
      out.write("</span>\r\n");
      out.write("			");
  } else {  
      out.write("\r\n");
      out.write("				<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list?page=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a>\r\n");
      out.write("			");
  } 
      out.write("\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("			");
 if(endPNum+1 <= lastPageNum) { 
      out.write("\r\n");
      out.write("				<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/list?page=");
      out.print(endPNum+1);
      out.write("\">&gt;&gt;</a>\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/board_list.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/board_list.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/board_list.jsp(6,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
