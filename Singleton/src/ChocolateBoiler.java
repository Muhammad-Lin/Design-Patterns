/**
 * @name: ChocolateBoiler
 * @author: yoga
 * @create: 2022-09-06 16:10
 **/
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    //synchronized关键字，使每个线程在进入该方法前，要先等候别的线程离开该方法。
    // 即不会有两个线程可以同时进入这个方法。
    public static synchronized ChocolateBoiler getInstance(){
        if (uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        return uniqueInstance;
    }

    public void fill(){//向锅炉填入原料时锅炉必须是空的
        if(isEmpty()){
            empty = false;
            boiled = false;
            //在锅炉内填充巧克力和牛奶的混合物
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()) {//锅炉排出时必须是满的且煮过的
            //排出煮沸的巧克力和牛奶
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){//煮混合物时，锅炉必须是满的且没有煮过
            //将锅炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
