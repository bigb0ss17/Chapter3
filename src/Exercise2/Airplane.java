package Exercise2;

public class Airplane implements Flight{
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
        System.out.println ("I'm an airplane that relies on an engine to fly.");
    }
}
