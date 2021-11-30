package com.example.demojsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import java.util.Arrays;

@SpringBootApplication
public class DemoJsfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJsfApplication.class, args);
	}

	@Bean
	ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
		//spring boot only works if this is set
		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

		//registration
		ServletRegistrationBean srb = new ServletRegistrationBean();
		srb.setServlet(new FacesServlet());
		srb.setUrlMappings(Arrays.asList("*.xhtml"));
		srb.setLoadOnStartup(1);
		return srb;	}

	/*@Bean
	public com.sun.faces.config.ConfigureListener mojarraConfigureListener() {
		return new com.sun.faces.config.ConfigureListener();
	}*/
}
