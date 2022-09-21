package gumballstate;

/**
 * @name: GumballMachine
 * @author: yoga
 * @create: 2022-09-19 16:04
 **/
public class GumballMachine {
    /**
     * 已售罄状态
     */
    State soldOutState;
    /**
     * 未投币状态
     */
    State noQuarterState;
    /**
     * 已投币状态
     */
    State hasQuarterState;
    /**
     * 售卖状态
     */
    State soldState;
    /**
     * 赢家状态
     */
    State winnerState;
    /**
     * 当前状态
     */
    State state = soldOutState;
    /**
     * 剩余数量
     */
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0)
            state = noQuarterState;
    }

    /**
     * 当投币时执行
     */
    public void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 当退币时执行
     */
    public void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 当售卖时执行(转动曲柄)
     */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0)
            count -= 1;
    }

    void refill(int count){
        this.count += count;
        System.out.println("The gumball machine was jest refilled;its new count is:" + this.count);
        state.refill();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
