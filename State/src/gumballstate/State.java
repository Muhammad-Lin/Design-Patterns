package gumballstate;

/**
 * @name: State
 * @author: yoga
 * @create: 2022-09-20 14:13
 **/
public interface State {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 售卖(转动曲柄)
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();

    /**
     *
     */
    void refill();
}
