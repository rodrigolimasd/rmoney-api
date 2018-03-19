package com.rl.rmoney.api.resource;

import com.rl.rmoney.api.config.RMoneyApiProperty;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private RMoneyApiProperty rMoneyApiProperty;

    @DeleteMapping("/revoke")
    public void revoke(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie = new Cookie("refreshToken", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(rMoneyApiProperty.getSeguranca().isEnableHttps());
        cookie.setPath(request.getContextPath()+"/oauth/token");
        cookie.setMaxAge(0);

        response.addCookie(cookie);
        response.setStatus(HttpStatus.NO_CONTENT.value());
    }

}
