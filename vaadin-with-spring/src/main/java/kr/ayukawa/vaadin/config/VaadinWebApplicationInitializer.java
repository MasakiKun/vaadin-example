package kr.ayukawa.vaadin.config;

import com.vaadin.flow.spring.VaadinMVCWebAppInitializer;

import java.util.Collection;
import java.util.Collections;

public class VaadinWebApplicationInitializer extends VaadinMVCWebAppInitializer {
	@Override
	protected Collection<Class<?>> getConfigurationClasses() {
		return Collections.singleton(SpringConfiguration.class);
	}
}
