/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest.swagger;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestSwaggerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "basePath": ((RestSwaggerComponent) target).setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "componentName": ((RestSwaggerComponent) target).setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": ((RestSwaggerComponent) target).setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((RestSwaggerComponent) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "produces": ((RestSwaggerComponent) target).setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "specificationUri": ((RestSwaggerComponent) target).setSpecificationUri(property(camelContext, java.net.URI.class, value)); return true;
        case "sslContextParameters": ((RestSwaggerComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useGlobalSslContextParameters": ((RestSwaggerComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((RestSwaggerComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((RestSwaggerComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "basepath": ((RestSwaggerComponent) target).setBasePath(property(camelContext, java.lang.String.class, value)); return true;
        case "componentname": ((RestSwaggerComponent) target).setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": ((RestSwaggerComponent) target).setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((RestSwaggerComponent) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "produces": ((RestSwaggerComponent) target).setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "specificationuri": ((RestSwaggerComponent) target).setSpecificationUri(property(camelContext, java.net.URI.class, value)); return true;
        case "sslcontextparameters": ((RestSwaggerComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters": ((RestSwaggerComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((RestSwaggerComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((RestSwaggerComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
