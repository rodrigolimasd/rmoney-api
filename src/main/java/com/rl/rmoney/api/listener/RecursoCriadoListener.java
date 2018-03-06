package com.rl.rmoney.api.listener;

import com.rl.rmoney.api.event.RecursoCriadoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 06/03/2018
 */
@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent> {


    @Override
    public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
        HttpServletResponse response = recursoCriadoEvent.getResponse();
        Long codigo = recursoCriadoEvent.getCodigo();

        adicionarHeaderLocation(response, codigo);
    }

    private void adicionarHeaderLocation(HttpServletResponse response, Long codigo) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
                .buildAndExpand(codigo).toUri();
        response.setHeader("Location", uri.toASCIIString());
    }
}
