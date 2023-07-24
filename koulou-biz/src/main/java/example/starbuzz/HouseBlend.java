package example.starbuzz;

import java.math.BigDecimal;

/**
 * 功能描述: 黑咖啡
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 17:35:46
 */
public class HouseBlend extends Beverage {


    @Override
    public BigDecimal cost() {
        return new BigDecimal("1");
    }


    @Override
    public String getDesc() {
        return "黑咖啡";
    }

}
