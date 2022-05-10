package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {

	@PostConstruct   // 构造器以后调用
	public void init() {
		// 解决netty启动冲突问题
		//  来自于 Netty4Utils.setAvailableProcessors()
		System.setProperty("es.set.netty.runtime.available.processors", "false");

	}

	public static void main(String[] args) {

		SpringApplication.run(CommunityApplication.class, args);
	}

}
