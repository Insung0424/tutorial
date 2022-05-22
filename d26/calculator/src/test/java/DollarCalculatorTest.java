import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DollarCalculatorTest {

    @Mock
    public MarketApi marketApi;

    @BeforeEach //테스트 실행전 초기화
    public void init(){
        Mockito.lenient().when(marketApi.connect()).thenReturn(3000);
                        // 마켓에이피아이를 불러올때 가격을 3000 으로 한다
    }

    @Test
    public void testHello(){

        System.out.println("hello");
    }

//    @Test
//    public void dollarTest(){
//        MarketApi marketApi = new MarketApi();
//        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
//        dollarCalculator.init();
//
//        Calculator calculator = new Calculator(dollarCalculator);
//
//        Assertions.assertEquals(22000, calculator.sum(10,10)); // 테스트 실패시만 걸림
//        Assertions.assertEquals(0,calculator.minus(10,10)); // 테스트 실패시만 걸림
//    }

    @Test
    public void mockTest(){
//        MarketApi marketApi = new MarketApi();
        // 이걸 만들면 당연히 새로운 마켓에이피아이가 생성되고 그 기본값인 1100이 입력되서 에러가 발생함
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();

        Calculator calculator = new Calculator(dollarCalculator);
        System.out.println(calculator.sum(10,10));

        Assertions.assertEquals(60000, calculator.sum(10,10));// 테스트 실패시만 걸림
        Assertions.assertEquals(0,calculator.minus(10,10)); // 테스트 실패시만 걸림
    }
}
