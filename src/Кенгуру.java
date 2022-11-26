public class Кенгуру extends Животное {
    String Сolor;
    String Food ;
    Double Speed;


    public Кенгуру() {
        Name = "NoName";
        Age = 0;
        Height=0.00;
        Weight=0.00;
        Сolor="White";
        Food ="NoFood";
        Speed=0.00;
    }

    public Кенгуру (String Name, int Age,double Height ,double Weight,
    String Сolor, String Food,Double Speed) {
        super(Name,Age,Height,Weight);
        this.Сolor = Сolor;
        this.Food = Food;
        this.Speed = Speed;

    }

    public String getСolor() {
        return Сolor;
    }

    public void setСolor(String Сolor) {
        this.Сolor = Сolor;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String Food) {
        this.Food = Food;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double Speed) {
        this.Speed = Speed;
    }

}

