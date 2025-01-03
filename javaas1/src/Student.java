//inheritance
    public class Student extends Teacher{
        //name,gender,age
        void displayInfo2(){
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Age: "+age);
        }
        @Override
        void display(){
            System.out.println("i am Student");
        }
        void display3(){

        }
    }

