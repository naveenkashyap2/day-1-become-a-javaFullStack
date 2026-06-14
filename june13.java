public class june13 {

    // Function in java

    public static void Ram(){
    System.out.println("Hello Naveen");

    }
    public static int multi(int a, int b){
    return (a * b);
    }

    public static int add(int a, int b) {
    return (a + b);
    }

    public static int sub(int a, int b) {
    return (a - b);
    }

    public static int div(int a, int b) {
    return (a / b);
    }

    public static int sum(int a, int b,int c) {
    return (a + b + c);
    }

    // // typecasting

    static int tri(double a, double b){
    return (int)(a+b);
    }

    public static void main(String args[]){
    Ram();
    System.out.println(multi(3,2));
    System.out.println(add(10, 2));
    System.out.println(sub(10, 2));
    System.out.println(div(12, 2));

    System.out.println(sum(12, 20 ,10));
    System.out.println(tri(23, 23));

    }

      static String Name = "Naveen";


    public static void main(String args[]) {
    //     // Scope of variable



        int x = 4; // local variable
        int y = 5;

        System.out.println(x + "," + y);
        System.out.println(Name);

        Ram();
    }

    static void Ram(){
        int x = 20; // local variable
        int y = 30;

        int c = (int)(x+y);
        System.out.println(Name);

        System.out.println(c);
        System.out.println(Name);
    }



    //class

    public static void main(String args[]){
         Student s1 = new Student();
         Student s2 = new Student();


         s1.name = "Naveen";
         s1.age  = 21;
         s1.rollName = 101;
         s1.collage = "Apollo institute of technology kanpur";






         s2.name = "Krishna";
         s2.age = 19;
         s2.rollName = 102;
         s2.collage = "Apollo institute of technology kanpur";

         s1.markAttendance();
         s2.markAttendance();

         s1.print();
         s2.print();

    }

   
}


class Student {
    String name;
    int age;
    int rollName;
    String collage;


    void markAttendance(){
        System.out.println("Attendance marked by" + name);
    }

    void print(){
        System.out.println(name + " , " + age + " , " + rollName + " , " + collage);
    }

}
