package io.github.pavello.cache.local.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SuppliersConfig {

	@Bean
	DataSupplier dataSupplier() {
		return new DataSupplier(Duration.ofSeconds(5));
	}

	@Bean
	CachedDataSupplier cachedDataSupplier() {return new CachedDataSupplier(dataSupplier());}
}
