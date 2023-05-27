package com.vmca.reactivesample;

import java.time.Duration;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String test() {
		return "Hello test";
	}
	
	@GetMapping("/getMono")
	public Mono<String> getMono(@RequestParam String name){
		System.out.println(name + " :in getMono start : " + Thread.currentThread().getName());
		Mono<String> r = getMonoValue(name);
		System.out.println(name + " :in getMono end : " + Thread.currentThread().getName());
		return r;
	}
	
	@Async
	private Mono<String> getMonoValue(String name){
		System.out.println(name + " :in getMonoPrivate start : " + Thread.currentThread().getName());
		Mono<String> m = Mono.just("Hello Mono : " + name).log().delayElement(Duration.ofSeconds(10)).log();
		System.out.println(name + " :in getMonoPrivate end : " + Thread.currentThread().getName());
		return m;
	}

}
