package com.rl.rmoney.api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Rodrigo Lima
 * @version 1.0
 * @since 18/03/2018
 */
@ConfigurationProperties("rmoney")
public class RMoneyApiProperty {

    private String originPermitida = "*";
    private final Seguranca seguranca = new Seguranca();

    public Seguranca getSeguranca() {
        return seguranca;
    }

    public String getOriginPermitida() {
        return originPermitida;
    }

    public void setOriginPermitida(String originPermitida) {
        this.originPermitida = originPermitida;
    }

    public static class Seguranca {

        private boolean enableHttps;

        public boolean isEnableHttps() {
            return enableHttps;
        }

        public void setEnableHttps(boolean enableHttps) {
            this.enableHttps = enableHttps;
        }
    }

}
