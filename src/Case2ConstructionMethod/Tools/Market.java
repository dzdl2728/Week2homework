package Case2ConstructionMethod.Tools;

public class Market {
    public String name;
    public int count;
    public double soldPrice;
    public double purchasePrice;

//
//    public Market(String name,int count,double soldPrice,double purchasePrice){
//        this.name=name;
//        this.count=count;
//        this.soldPrice=soldPrice;
//        this.purchasePrice=purchasePrice;
//
//    }


    public Market(String name, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.count = count;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
    }

//    public Market(String name, int count) {
//        this.name = name;
//        this.count = count;
//    }
    public void describe() {
        System.out.println("商品名字叫做" + name + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }
    public double profit(){
        return (count*(soldPrice-purchasePrice));
    }
    public double profit(int count,double soldPrice,double purchasePrice){
        return (soldPrice-purchasePrice);
    }
    public double profit(double soldPrice,double purchasePrice){
        return soldPrice-purchasePrice;
    }

    public double vipprofit(boolean isVip){
        return 0.75*profit(count,soldPrice,purchasePrice);
    }

}
