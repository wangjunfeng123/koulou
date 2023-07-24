package example.starbuzz;

import java.math.BigDecimal;

/**
 * 功能描述: 浓缩
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 17:35:46
 */
public class Espresso extends Beverage {


    @Override
    public BigDecimal cost() {
        return new BigDecimal("2");
    }


    @Override
    public String getDesc() {
        return "浓缩" ;
    }


    public Espresso() {
    }

}
