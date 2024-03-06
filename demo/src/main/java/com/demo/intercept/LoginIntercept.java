package com.demo.intercept;

import io.jsonwebtoken.Jwts;
import org.apache.ibatis.plugin.Intercepts;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component

public class LoginIntercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      String flag= request.getParameter("flag");
      if(flag==null){
          response.getWriter().print("未登录");
          return false;
      }
      try {
          Jwts.parser().setSigningKey("yang@361881").parseClaimsJws(flag).getBody();
          return true;
      }
      catch (Exception e){
          e.printStackTrace();
          response.getWriter().print("未登录");
          return false;
      }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
