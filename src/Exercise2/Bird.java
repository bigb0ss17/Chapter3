package Exercise2;

public class Bird implements Flight{
    private String type;

    //non parameter constructor

    public Bird (){
        this.type = "Falcon";
    }
    //constructor

    public Bird (String type){
        this.type = type;
    }

    //setter

    public void setType(String type){this.type = type;}

    //getter

    public String getType(){return this.type;}

    //toString

    public String toString(){
        return "Bird [Type: " + type + "]:";
    }

    //fly

    public void fly(){
        System.out.println("I'm a bird who flaps my wings to fly.");
    }


}
