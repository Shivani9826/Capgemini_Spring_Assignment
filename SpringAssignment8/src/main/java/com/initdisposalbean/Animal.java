package com.initdisposalbean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public Animal() {
		super();
	}

	@PostConstruct
	public void InitializingBean() {
		System.out.println("This Bean is Initialising Bean");
	}

	@PreDestroy
	public void DisposableBean() {
		System.out.println("This Bean is Disposal Bean");
	}
}