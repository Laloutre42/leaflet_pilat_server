package org.zed.coding.configuration;

import org.resthub.web.springmvc.router.RouterConfigurationSupport;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arnaud on 26/06/14.
 */
@Configuration
public class RouterConfiguration extends RouterConfigurationSupport {

    @Override
    public List<String> listRouteFiles() {

        List<String> routeFiles = new ArrayList<String>();
        routeFiles.add("classpath*:routes.conf");
        return routeFiles;
    }
}
