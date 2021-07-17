package io.github.pavello.cache.local.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.pavello.cache.local.config.CachedDataSupplier;
import io.github.pavello.cache.local.config.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
class SimpleCacheController {

	private final CachedDataSupplier cachedDataSupplier;

	@GetMapping("/simple/cache/{key}")
	Data getData(@PathVariable String key) {
		return cachedDataSupplier.getCachedData(key);
	}

}
