package baseball.domain;

public class Calculator{
    /** 상수 변수: 클래스 변수이면서 값이 변하지 않는 변수, 대문자_사용 */
    public static final int SHARE_BIRTHDAY = 1104;

    /** 클래스변수: 인스턴스들이 공유하는 변수
     * 해당 클래스로 만들어진 모든 인스턴스들은 같은 값을 가진다.
     * 그래서 "인스턴스명"이 아닌 "클래스명"으로 접근해도 된다 Ex) Calculator.shareResult
     * */
    public static int shareResult = 0;

    /** 인스턴스 변수 */
    public int result = 0;

    /** 생성자 */
    public Calculator() {
    }

    public int add(int number1, int number2){
        result = number1 + number2;
        shareResult = result;
        return result;
    }

}