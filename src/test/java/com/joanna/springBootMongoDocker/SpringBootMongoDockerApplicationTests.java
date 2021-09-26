package com.joanna.springBootMongoDocker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringBootMongoDockerApplicationTests {
	Calculator calcUnderTest = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void itShouldAddNumbers(){
		//given
		int a = 10, b=5;
		//when
		int result = calcUnderTest.add(a,b);
		//then
		int expected = 15;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void itShouldSubtractNumbers(){
		//given
		int a = 10, b=5;
		//when
		int result = calcUnderTest.add(a,b);
		//then
		int expected = 5;
		assertThat(result).isEqualTo(expected);
	}


	class Calculator {
		int add (int a, int b) {
			return a+b;
		}
		int subtract(int a, int b){return a-b;}
	}

}
