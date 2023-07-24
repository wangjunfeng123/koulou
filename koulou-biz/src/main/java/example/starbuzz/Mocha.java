package example.starbuzz;

import java.math.BigDecimal;

/**
 * 功能描述:moka
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 18:00:37
 */
public class Mocha extends CondimentDecorator{

    @Override
    public BigDecimal cost() {
        return new BigDecimal(0.1);
    }

}
