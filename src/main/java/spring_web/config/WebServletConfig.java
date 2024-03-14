package spring_web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {

		AnnotationConfigWebApplicationContext anWebCon = new AnnotationConfigWebApplicationContext();
		anWebCon.register(SpringServlet.class);
		anWebCon.setServletContext(ctx);
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(anWebCon));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
