public class StaticBlock {
static int id;
static String name;

static{
    id=101;
    name="Mariha";
}
 static void display(){
    System.out.println("id :"+id);
    System.out.println("name "+name);
     System.out.println("\n");
}
}
