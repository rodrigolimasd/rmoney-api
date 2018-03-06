package com.rl.rmoney.api.event;

import org.springframework.context.ApplicationEvent;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 06/03/2018
 */
public class RecursoCriadoEvent extends ApplicationEvent {

    private HttpServletResponse response;
    private Long codigo;

    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
        super(source);
        this.response = response;
        this.codigo = codigo;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public Long getCodigo() {
        return codigo;
    }
}
