package com.ricky.codelab.jersey;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:15
 */
public class RestJaxRsApplication extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public RestJaxRsApplication() {
        this.register(RequestContextFilter.class);
        this.register(JacksonFeature.class);
    }
}
