public class DollarCalculator implements ICalculator{

    private int price=1;

//    계산기에서 통신이 이루어지면 이상하므로 다른 클래스로 분리함
//    public void init(){
//        //naver or kakao 로 접속 현재 달러 환율 불러와서 계산
//        this.price = connect();
//    }
//
//    public int connect(){
//        // 통신이 이루어짐
//        return 1100;
//    }

//    외부클래스에서 가격을 가져와서 생성자에 주입
    private MarketApi marketApi;

    public DollarCalculator(MarketApi marketApi){
        this.marketApi = marketApi;
    }

    public  void init(){
        this.price = marketApi.connect();
    }





    @Override
    public int sum(int x, int y) {
        x*=price;
        y*=price;
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        x*=price;
        y*=price;
        return x-y;
    }
}
