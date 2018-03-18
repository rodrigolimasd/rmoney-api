package com.rl.rmoney.api.secutiry.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 18/03/2018
 */
public class GeradorSenha {

    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("admin"));
    }
}
