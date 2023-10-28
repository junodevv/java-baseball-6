package baseball.domain;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    public List<Integer> createRandomNumbers(){
        List<Integer> numbers = new ArrayList<>();
        while(numbers.size() < 3){
            int number = pickNumberInRange(1,9);
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        }
        return numbers;
    }
}
