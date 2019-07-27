package com.springboot.springbootgraphqldemo.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.springboot.springbootgraphqldemo.models.Greeting;
import com.springboot.springbootgraphqldemo.repo.GreetingRepository;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

	@Autowired
	GreetingRepository greetRepo;

	public Greeting newGreeting(String message) {
		Greeting greeting = new Greeting();
		greeting.setMessage(message);

		return greetRepo.save(greeting);
	}

}
