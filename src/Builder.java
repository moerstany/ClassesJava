public class Builder extends Human
{
    String ConstructionObjects;
    double   WorkExperience;

    public Builder() {
        Name = "NoName";
        Age = 0;
        Salary = 0.00;
        ConstructionObjects="NoHouse";
        WorkExperience=0.00;
    }

    public Builder(String Name,int Age, double Salary, String ConstructionObjects, double WorkExperience) {
        super(Name, Age,  Salary);
        this.ConstructionObjects = ConstructionObjects;
        this.WorkExperience = WorkExperience;

    }

    public String getConstructionObjects() {
        return ConstructionObjects;
    }

    public void setConstructionObjects(String ConstructionObjects) {
        this.ConstructionObjects = ConstructionObjects;
    }

    public double getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(double WorkExperience) {
        this.WorkExperience = WorkExperience;
    }

    void displayInfo(){
        System.out.printf( "Name: %s \tAge: %d\n", Name, Age,Salary, ConstructionObjects,WorkExperience);
    }

}
