package com.example.demo.xml;

import java.util.function.Supplier;

class MessageProducer implements Supplier<String> {

	@Override
	public String get() {
		return "Hello, bean ref!";
	}

}
