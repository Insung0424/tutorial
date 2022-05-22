import jdk.dynalink.beans.StaticClass;

public class Main {
    public static void main(String args[]){
        System.out.println("hello Junit");

//        Calculator calculator = new Calculator(new KrwCalculator());
//        System.out.println(calculator.sum(10,20)); 기존 방식

        // 변경된 방식
        MarketApi marketApi = new MarketApi(); //가격불러오기
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi); //달러로 동작할 계산기
        dollarCalculator.init(); //달러계산기 실행

        Calculator calculator = new Calculator(dollarCalculator);
        System.out.println(calculator.sum(10,10));

    }

}
