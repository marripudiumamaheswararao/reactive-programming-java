package com.vmca.reactivesample;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
	
	@Async
	public void asyncMentod() {
		System.out.println("asyncMentod started: " + Thread.currentThread().getName());
		
		System.out.println("asyncMentod ended: " + Thread.currentThread().getName());
		
	}

}
