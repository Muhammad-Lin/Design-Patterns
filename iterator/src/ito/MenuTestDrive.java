package ito;

/**
 * @name: MenuTestDrive
 * @author: yoga
 * @create: 2022-09-14 11:28
 **/
public class MenuTestDrive {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
