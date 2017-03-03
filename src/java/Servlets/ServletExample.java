
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletExample extends HttpServlet {

    String msg;
    @Override
    public void init() {
         msg="hello servleet programmers";
        
    }


    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html;charset=UTF8");
            PrintWriter out=response.getWriter();
            
            try{
                
                out.println(msg);
                String name=request.getParameter("name");
            String password=request.getParameter("password");
            out.write("hello "+name+" ,your password is "+password);
            
            }
            
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
     
    }

    

}
