package takeout;

import static takeout.utils.PrintUtils.CommonPrintMethod.print;
import static takeout.utils.PrintUtils.CommonPrintMethod.println;
import static takeout.utils.PrintUtils.PrintTitle.*;

public class Menu {

    MainDish beef = new MainDish("Beef Wellington", 13.00);
    MainDish fish = new MainDish("Miso Salmon", 12.00);
    MainDish chicken = new MainDish("Chicken Teriaki", 7.00);
    MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    Side rice = new Side("Brown Rice", 2.99);
    Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    Side beens = new Side("Green Beans Amandine", 5.00);
    Side potato = new Side("Creamy Mashed Potatoes", 4.00);

    Drink water = new Drink("Perrier carbonated mineral water", 3.50);
    Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
    Drink wineRed = new Drink("Chateau Corton Grancey Grand Cru", 40.00);
    Drink juiceApple = new Drink("Fresh squeezed Apple juice", 10.00);

    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new Side[]{rice, asparagus, beens, potato};
    Drink[] drinks = new Drink[]{water, wineWhite, wineRed, juiceApple};

    public MainDish getBeef() {
        return beef;
    }

    public void setBeef(MainDish beef) {
        this.beef = beef;
    }

    public MainDish getFish() {
        return fish;
    }

    public void setFish(MainDish fish) {
        this.fish = fish;
    }

    public MainDish getChicken() {
        return chicken;
    }

    public void setChicken(MainDish chicken) {
        this.chicken = chicken;
    }

    public MainDish getPork() {
        return pork;
    }

    public void setPork(MainDish pork) {
        this.pork = pork;
    }

    public Side getRice() {
        return rice;
    }

    public void setRice(Side rice) {
        this.rice = rice;
    }

    public Side getAsparagus() {
        return asparagus;
    }

    public void setAsparagus(Side asparagus) {
        this.asparagus = asparagus;
    }

    public Side getBeens() {
        return beens;
    }

    public void setBeens(Side beens) {
        this.beens = beens;
    }

    public Side getPotato() {
        return potato;
    }

    public void setPotato(Side potato) {
        this.potato = potato;
    }

    public Drink getWater() {
        return water;
    }

    public void setWater(Drink water) {
        this.water = water;
    }

    public Drink getWineWhite() {
        return wineWhite;
    }

    public void setWineWhite(Drink wineWhite) {
        this.wineWhite = wineWhite;
    }

    public Drink getWineRed() {
        return wineRed;
    }

    public void setWineRed(Drink wineRed) {
        this.wineRed = wineRed;
    }

    public Drink getJuiceApple() {
        return juiceApple;
    }

    public void setJuiceApple(Drink juiceApple) {
        this.juiceApple = juiceApple;
    }

    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }
    public double[] getSidesPrice() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }



    public String[] getDrinksNames() {
        String[] drinksNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinksNames[i] = drinks[i].getDrinkName();

        }
        return drinksNames;
    }
    public double[] getDrinksPrice() {
        double[] drinksPrices = new double[drinks.length];
        for (int i = 0; i < sides.length; i++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }

    String[] mainDishesNames = getMainDishesNames();
    double[] mainDishesPrices = getMainDishesPrices();

    private void printMainDishes() {
        printMainDishesTitle();
        for(int i = 0; i < getMainDishesNames().length; i++) {
            print(mainDishesNames[i]);
            printPrice(mainDishesPrices[i]);
            println();
        }
        println();

    }

    private void printSides() {
        printSidesTitle();
        for(int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printPrice(getSidesPrice()[i]);
            println();
        }
        println();
    }

    private void printDrinks() {
        printDrinksTitle();
        for(int i = 0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printPrice(getDrinksPrice()[i]);
            println();
        }
        println();
    }

    public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();

    }



}
