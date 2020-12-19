package com.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("this is a preHandler");
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
        if (dayOfWeek == 1) {  // 1 means sunday..2 means monday...
            response.setContentType("text/html");
            response.getWriter().println("<h1>Sorry! try to another day<h1>");
            return false;
        }
        return true;
    }
}


//some another examples

//    String name=request.getParameter("name");
//        if(name.startsWith("d")){
//                response.setContentType("text/html");
//                response.getWriter().println("<h1>Invalid name....Name should not be start with d</h1>");
//                return false;
//                }