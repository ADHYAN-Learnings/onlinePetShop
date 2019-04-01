/** @Author AdityaPandey
 *  13 May 2018
 */
package org.framework.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {ApplicationConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		registration.setMultipartConfig(getMultipartConfigElement());
	}

	private MultipartConfigElement getMultipartConfigElement() {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION,MAX_FILE_SIZE,MAX_REQUEST_SIZE,FILE_SIZE_THRESHOLD);
		return multipartConfigElement;
	}
	
	private static final String LOCATION ="C:/data/";
	private static final long MAX_FILE_SIZE = 1024 * 1024 * 25;
	private static final long MAX_REQUEST_SIZE = 1024 * 1024 * 30;
	private static final int FILE_SIZE_THRESHOLD = 0;

	
}
