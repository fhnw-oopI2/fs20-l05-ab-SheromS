package ch.fhnw.oop2.module05.streams;

import java.util.stream.Stream;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Stream
			.iterate(0, n -> n + 2)
			.limit(10)
			.peek(n -> System.out.println("current position" + n))
			.forEach(System.out::println);
	}
	
}


