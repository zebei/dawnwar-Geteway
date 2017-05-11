package com.dawnwar;

import com.dawnwar.filter.AccessFilter;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class GetewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(GetewayApplication.class).web(true).run(args);
	}

	@Bean
	public AccessFilter accessFilter() {
		//路由过滤
		return new AccessFilter();
	}

}
