package io.github.pavello.cache.local.config;

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class DataSupplier {

	private final Duration delay;

	public Data getData(String key) {
		log.info("I am goin to create some data ...");
		createDelay();
		log.info("Data created");

		return createSomeData(key);
	}

	void createDelay() {
		LockSupport.parkNanos(delay.toNanos());
	}

	Data createSomeData(String key) {
		return new Data(key, UUID.randomUUID().toString());
	}

}
