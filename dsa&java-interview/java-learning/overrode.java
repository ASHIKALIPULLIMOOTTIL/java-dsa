class Student{
    int roll;
    String name;
    double m1,m2;
    
    double average(){
        return (m1+m2)/2;
    }
    public String toString(){  //You must use public because you cannot reduce access level when overriding a method.
        return "roll no:"+roll+"\nname:"+name; //here you overrode toString() method that already exits in java.
    }
}

 class overrode {
    public static void main(String[] args) {
        Student s=new Student();
        s.roll=1;
        s.name="ashik";
        s.m1=16.2;
        s.m2=7;
        System.out.println("Average :"+s.average());
        System.out.println(s);//overroding
    }
}
//System.out.println(object) automatically calls toString() — and you overrode it to control the output.