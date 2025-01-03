public class Teacher {
    String name,gender;
    int age;
    static String UniName="IUBAT";//static variable

    //parametrised method
    void setInformation(String n,String g,int a){
        name=n;
        gender=g;
        age=a;

    }

Teacher(){

}

Teacher(String n,String g,int a){
        name = n;
        gender = g;
       age = a;
   }
            void displayInformation(){
                System.out.println("Name: "+name);
                System.out.println("Gender: "+gender);
                System.out.println("Age: "+age);
                System.out.println("UniName: "+UniName);
                System.out.println("\n");
        }
    void display(){
        System.out.println("i am Student");
    }
    }



