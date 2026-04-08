class Student {
    // 🔒 Private variables (data hiding)
    private int roll=1;  //defualt=1 //private =>Cannot be accessed directly outside the class want to use setter and getter
    private String name;

    // 🔁 Setter methods (to set values)    //this help to validate user input
    public void setRoll(int roll) {
        if(roll<=0){
            this.roll = 0;
        }else{
        this.roll = roll;}
    }

    public void setName(String name) {
        this.name = name;
    }

    // 🔍 Getter methods (to get values)
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();

        //s.roll=1; => error

        // Using setters
        s.setRoll(-8);
        s.setName("Ashik");

        // Using getters
        System.out.println("Roll: " + s.getRoll());
        System.out.println("Name: " + s.getName());
    }
}