package baseball;

// import baseball.domain.Calculator;

import baseball.domain.NumberGenerator;
import java.util.List;

/**
 * 객체지향 프로그래밍
 * 1. 기능을 가지고 있는 클래스를 인스턴스(객체)화 한다.
 * 2. 필요한 기능을 (역할에 맞는) 인스턴스가 수행하게 한다.(의인화)
 * 3. 각 결과를 종합한다. -> 하나의 프로그램을 만든다.
 */
public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);
    }
}

/*
        // Calculator 예시
        Calculator teacher = new Calculator();
        System.out.println(teacher.add(1,3));
        System.out.println(Calculator.shareResult);

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2000, 21));
        System.out.println(Calculator.shareResult);

        System.out.println(teacher.result); // 4
        System.out.println(Calculator.shareResult); // 2021

        System.out.println(Calculator.SHARE_BIRTHDAY); // 1104
 */