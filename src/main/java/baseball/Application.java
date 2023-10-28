package baseball;

// import baseball.domain.Calculator;

import static camp.nextstep.edu.missionutils.Console.readLine;

import baseball.domain.Judgment;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> computer = generator.createRandomNumbers();

        Referee referee = new Referee();
        String result = "";
        do {
            result = referee.compare(computer, askNumbers());
            System.out.println(result);
        } while (!result.equals("0 볼 3 스트라이크"));
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    }

    public static List<Integer> askNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = readLine();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
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