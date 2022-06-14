package Case2ConstructionMethod;

import Case2ConstructionMethod.Tools.Market;
import Case2ConstructionMethod.Tools.Person;

public class Case2Test {
    public static void main(String[] args) {
        Market m=new Market("COSTA",15,30,20);
        m.describe();
        System.out.println(m.profit());
        //当方法需要有值输入覆盖时，采用输入的值进行计算
        System.out.println(m.profit(50,20));
        System.out.println(m.profit(10,20,15));
        //无输入值时采用默认输入值
        System.out.println(m.vipprofit(true));
      //静态方法的重载与静态变量使用
        Person.getinf();
        Person p=new Person();
        p.getinf(true);
    }
}
