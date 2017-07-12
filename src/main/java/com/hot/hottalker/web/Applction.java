package com.hot.hottalker.web;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.hot.hottalker.web.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @author by user on 17/7/12.
 */
public class Applction extends ResourceConfig {
    public Applction() {
        packages(AccountService.class.getPackage().getName());
        register(JacksonJsonProvider.class);
        register(Logger.class);
    }
}
