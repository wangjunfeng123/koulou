package example.starbuzz;

/**
 * 功能描述:
 *
 * @Author: wangjunfeng@payeasenet.com
 * @date: 2023年07月23日 18:01:50
 */
public class StartbuzzService {

    public static void main(String[] args) {
        Beverage decor = new Espresso();
        Milk milk = new Milk(decor);
        System.out.println(milk.cost().toString());




    }
}
