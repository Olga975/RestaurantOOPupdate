package takeout;

public class MainDish {
    private String mainDishName;
    private double mainDishPrice;
    MainDish(String name, double price) {
        this.mainDishName = name;
        this.mainDishPrice = price;
    }

    public String getMainDishName() {
        return mainDishName;
    }

    public void setMainDishName(String mainDishName) {
        this.mainDishName = mainDishName;
    }

    public double getMainDishPrice() {
        return mainDishPrice;
    }

    public void setMainDishPrice(double mainDishPrice) {
        this.mainDishPrice = mainDishPrice;
    }


}
