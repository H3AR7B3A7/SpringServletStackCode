package be.dog.d.steven.config;

import org.junit.jupiter.api.Test;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.junit.jupiter.api.Assertions.*;

public class DispatcherConfigTest {
    @Test
    public void testViewResolver() {
        InternalResourceViewResolver actualViewResolverResult = (new DispatcherConfig()).viewResolver();
        assertTrue(actualViewResolverResult.isCache());
        assertTrue(actualViewResolverResult.isCacheUnresolved());
        assertEquals(2147483647, actualViewResolverResult.getOrder());
    }

    @Test
    public void testMethodValidationPostProcessor() {
        MethodValidationPostProcessor actualMethodValidationPostProcessorResult = (new DispatcherConfig())
                .methodValidationPostProcessor();
        assertFalse(actualMethodValidationPostProcessorResult.isOpaque());
        assertFalse(actualMethodValidationPostProcessorResult.isProxyTargetClass());
        assertFalse(actualMethodValidationPostProcessorResult.isOptimize());
        assertFalse(actualMethodValidationPostProcessorResult.isFrozen());
        assertFalse(actualMethodValidationPostProcessorResult.isExposeProxy());
        assertEquals(2147483647, actualMethodValidationPostProcessorResult.getOrder());
    }
}

