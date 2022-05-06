package com.example.p1.decorator;

public class AudiDecorator implements ICar{
    //기존을 유지하되 필요한형태로 꾸밈,확장필요시 상속대안으로 사용,solid : od
    protected ICar audi;

    protected String modelName;

    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName, int modelPrice){
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }


    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "cost is " + getPrice());
    }
}
