package com.springboot.springbootgraphqldemo.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.springboot.springbootgraphqldemo.models.Greeting;
import com.springboot.springbootgraphqldemo.repo.GreetingRepository;

@Component
public class GreetingQuery implements GraphQLQueryResolver {

	@Autowired
	private GreetingRepository greetRepo;

	public Greeting getGreeting(String id) {
		return greetRepo.find(id);
	}
}
