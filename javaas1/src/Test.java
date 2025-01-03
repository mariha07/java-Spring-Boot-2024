public class Test {
    public static void main(String[] args){
        Teacher teacher1=new Teacher();//obj create
        Teacher teacher2=new Teacher();

        teacher1.name="Mariha";
        teacher1.gender="female";
        teacher1.age=18;
        teacher1.displayInformation();//method call
        teacher2.setInformation("Tabassum","female",22);//obj initialize
        teacher2.displayInformation();//method call
        Teacher teacher3=new Teacher("jinia","female",25);//constructor
        teacher3.displayInformation();//method call
        StaticMethod ob1=new StaticMethod();
        ob1.display1();
        StaticMethod.display2();
        System.out.println("\n");
        StaticBlock.display();
        //String manipulation
        String s1="Mariha Tabassum";
        String s2=new String("Mariha Tabassum");

        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);

        int len =s1.length();
        System.out.println("Length of s1= "+len);
        //reverse String
        String str="abc";
        String rev=" ";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("rev: "+rev);
        //replace String
        System.out.println("replace: "+str.replace('a','d'));
        //Trim
        System.out.println("trim: "+str.trim());
        //substring
        System.out.println("substring: "+str.substring(1,2));
        //encapsulation,set,get
        Person o1=new Person();
        o1.name="Rupa";
        System.out.println(o1.name);
        //inheritance
        Student p1=new Student();
        p1.name="Himu";
        p1.gender="female";
        p1.age=22;
        p1.displayInfo2();
        //poly
        //p1.display();
        p1.display();
        //super
        Animal mycat=new Cat();
        mycat.AniSound();
    }}

