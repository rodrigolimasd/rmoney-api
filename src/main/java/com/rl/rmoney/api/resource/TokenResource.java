package com.rl.rmoney.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 18/03/2018
 */
@RestController
@RequestMapping("/tokens")
public class TokenResource {


    @DeleteMapping("/revoke")
    public void revoke(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("refreshToken", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(false); // TODO em produção true
        cookie.setPath(request.getContextPath()+"/oauth/token");
        cookie.setMaxAge(0);

        response.addCookie(cookie);
        response.setStatus(HttpStatus.NO_CONTENT.value());
    }

}
