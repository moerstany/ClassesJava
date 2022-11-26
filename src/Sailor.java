public class Sailor extends Human
{

    double   Work_experience;
    double Volume_of_catch;



    public Sailor() {
        Name = "NoName";
        Age = 0;
        Salary = 0.00;
        Work_experience=0.00;
        Volume_of_catch=0.00;
    }

    public Sailor(String Name,int Age, double Salary, double Work_experience,double Volume_of_catch) {
        super(Name, Age,  Salary);
        this.Work_experience = Work_experience;
        this.Volume_of_catch = Volume_of_catch;

    }

    public double getWork_experience() {
        return Work_experience;
    }

    public void setWork_experience(double Work_experience) {
        this.Work_experience = Work_experience;
    }

    public double getVolume_of_catch() {
        return Volume_of_catch;
    }

    public void setVolume_of_catch(double Volume_of_catch) {
        this.Volume_of_catch = Volume_of_catch;
    }

}
