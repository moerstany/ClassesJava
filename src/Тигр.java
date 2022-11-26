public class Тигр extends Кенгуру {

        public Тигр() {
            Name = "NoName";
            Age = 0;
            Height=0.00;
            Weight=0.00;
            Сolor="White";
            Food ="NoFood";
            Speed=0.00;
        }

        public Тигр (String Name, int Age,double Height ,double Weight,
                         String Сolor, String Food,Double Speed) {
            super(Name,Age,Height,Weight,Сolor,Food,Speed);


        }
    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d \t Height: %f \nWeight: %f \tСolor: %s \t Food : %s \tSpeed: %f\n", this.Name, this.Age, this.Height, this.Weight, this.Сolor,this.Food, this.Speed);
    }


    }


