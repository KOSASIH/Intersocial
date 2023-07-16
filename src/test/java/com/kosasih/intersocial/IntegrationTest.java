package com.kosasih.intersocial;

import com.kosasih.intersocial.IntersocialApp;
import com.kosasih.intersocial.config.AsyncSyncConfiguration;
import com.kosasih.intersocial.config.EmbeddedElasticsearch;
import com.kosasih.intersocial.config.EmbeddedKafka;
import com.kosasih.intersocial.config.EmbeddedSQL;
import com.kosasih.intersocial.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { IntersocialApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
