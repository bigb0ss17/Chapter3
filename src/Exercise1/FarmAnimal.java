package Exercise1;

public abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    //constructor

    public FarmAnimal(){
        this.name = "Bobby";
        this.gender = "Male";
        this.weight = 6.9;
        this.age = 9;
    }

    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    //setters

    public void setName(String name){this.name = name;}
    public void setGender(String gender){this.name = name;}
    public void setWeight(double weight){this.weight = weight;}
    public void setAge(int age){this.age = age;}

    //getters

    public String getName(){return this.name;}
    public String getGender(){return this.gender;}
    public double getWeight(){return this.weight;}
    public int getAge(){return this.age;}

    //abstract method
    public abstract String feedLoadingSchedule();

    //toString

    public String toString(){
        return (" [name = " + name + ", gender = " + gender + ", weight = " + weight + ", age = " + age + "]");
    }
}
