package be.dog.d.steven.config;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

public class MvcConfigTest {
    @Test
    public void testAddResourceHandlers() {
        // TODO: This test is incomplete.

        ResourceHandlerRegistry registry = new ResourceHandlerRegistry(new AnnotationConfigApplicationContext(), null);
        (new MvcConfig()).addResourceHandlers(registry);
    }

    @Test
    public void testAddResourceHandlers2() {
        // TODO: This test is incomplete.

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.setResourceLoader(new AnnotationConfigApplicationContext());
        ResourceHandlerRegistry registry = new ResourceHandlerRegistry(annotationConfigApplicationContext, null);
        (new MvcConfig()).addResourceHandlers(registry);
    }
}

