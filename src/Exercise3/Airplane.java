package Exercise3;

public class Airplane implements Flight, Movement {
    private String model;
    private int year;

    //non parameter constructor

    public Airplane(){
        this.model = "Boeing";
        this.year = 1999;
    }

    //constructor

    public Airplane(String model, int year){
        this.model = model;
        this.year = year;
    }

    //setter
    public void setModel(String model){this.model = model;}
    public void setYear(int year){this.year = year;}

    //getter
    public String getModel(){return this.model;}
    public int getYear(){return this.year;}

    //toString

    public String toString(){
        return "Airplane [Model: " +model+ " Year: " + year + "]:";
    }

    //fly

    public void fly(){
        System.out.println ("I rely on my engines to fly.");
    }

    //walk

    public void walk(){System.out.println("I tax on my wheels");}

    //jump

    public void jump(){System.out.println("I cannot jump.");}
}
