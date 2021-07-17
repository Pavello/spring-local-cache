package io.github.pavello.cache.local.config;

import org.springframework.cache.annotation.Cacheable;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CachedDataSupplier {

	private final DataSupplier dataSupplier;

	@Cacheable("mySimpleCache")
	public Data getCachedData(String key) {
		return dataSupplier.getData(key);
	}
}
