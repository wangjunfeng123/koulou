package example.starbuzz;

import java.math.BigDecimal;

/**
 * 功能描述:
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 18:01:18
 */
public class Milk extends CondimentDecorator{

    private Beverage beverage;

    @Override
    public BigDecimal cost() {
        return new BigDecimal(0.2).add(beverage.cost());
    }


    @Override
    public String getDesc() {
        return "牛奶" + beverage.getDesc();
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
}
