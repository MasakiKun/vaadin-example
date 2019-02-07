package kr.ayukawa.vaadin.config;

import com.vaadin.flow.spring.SpringServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public abstract class WebAppInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		servletContext.addListener(new ContextLoaderListener(context));

		ServletRegistration.Dynamic dispatcherServletRegistration = servletContext.addServlet("dispatcher", new SpringServlet(context));
		dispatcherServletRegistration.setLoadOnStartup(1);
		dispatcherServletRegistration.addMapping("/*");
	}
}
