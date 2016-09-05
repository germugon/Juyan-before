package com.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    /**
     * Cookie 追加
     * @return
     * @throws Exception
     */
    public static void addCookie(String name, String value, int timeLong, HttpServletResponse response){
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(timeLong);
        response.addCookie(cookie);
    }
    
    /**
     * Cookie 获取
     * @return
     * @throws Exception
     */
    public static String getCookie(String name, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name))
                    return cookie.getValue();
            }
        }
        return null;
    }
}