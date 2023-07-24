package example.starbuzz;

import java.math.BigDecimal;

/**
 * 功能描述: 医疗
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 17:32:58
 */
public abstract class Beverage {

    /**
     * 饮料的描述
     */
    private String desc;

    /**
     * 饮料的价格
     * @return 价格
     */
    public abstract BigDecimal cost();



    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
