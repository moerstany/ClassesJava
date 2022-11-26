public class Животное {
    String Name;
    int Age;
    double Height;
    double Weight;

    public Животное() {
        Name = "NoName";
        Age = 0;
        Height=0.00;
        Weight=0.00;
    }

    public Животное (String Name, int Age,double Height ,double Weight) {
        this.Name = Name;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }
    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;}
}
