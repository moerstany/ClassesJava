public class Pilot extends Human {
    String Countries;
    double flight_hours;

    public Pilot() {
        Name = "NoName";
        Age = 0;
        Salary = 0.00;
        Countries="None";
        flight_hours = 0.00;

    }

    public Pilot(String Name,int Age, double Salary, String Countries, double flight_hours) {
        super(Name, Age,  Salary);
        this.Countries = Countries;
        this.flight_hours = flight_hours;

    }

    public String getCountries() {
        return Countries;
    }

    public void setCountries(String Countries) {
        this.Countries = Countries;
    }

    public double getFlight_hours() {
        return flight_hours;
    }

    public void setFlight_hours(double flight_hours) {
        this.flight_hours = flight_hours;
    }
}