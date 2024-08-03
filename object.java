/*class myClass{
    int a; String name;
    myClass(){
        a = 10;
        name = "Mohammed Khalander";
    }
    void showName(){
        System.out.println("Name is "+name+" and a is "+a);
    }
}


public class object{
    public static void main(String args[]){
        myClass ref = new myClass();
        ref.showName();
    }
}*/



/*class myClass{
    int a; String name;
    myClass(int x, String naam){
        a = x;
        name = naam;
    }
    void display(){
        System.out.println(a + " " + name +" ");        //  We cannot directly use the value of 'x' and 'name' so we need to use the instance vatiable which are initialised while creating the class \\

    }
}
class object{
    public static void main(String[] args) {
        myClass ref = new myClass(10,"Mohammed Khalander");
        ref.display();
    }
}*/

                        /*Copy Constructor */

/*class myClass {
    int num; String name;
    myClass(int a, String b){
        num = a;
        name = b;
        System.out.println(num + " " + name);
    }
    myClass(myClass ref){
        int num2; String name2;
        num2 = ref.num;
        name2 = ref.name;
        System.out.println(num2 + " " + name2);

    }
}

class object{
    public static void main(String[] args) {
        myClass ref1 = new myClass(20,"Anything");
        myClass ref2 = new myClass(ref1);
        ref2.num = 210;     // This will not change the value
    }
}*/

                            /*Private constructor */

/* public class object{
        int number; String fullName;
    private object(int num, String name){
        number  = num;
        fullName = name;
    }
    static void displayData(int number){
        System.out.println(number);
    }
    // Here we can only create static methods and we can't access private constructor outside the class, so we are creating our 'main' method inside this class itself 
    And static method cannot access the instance variable directly
    \\ 
    public static void main(String[] args) {
        object ref = new object(10,"Mohammed Khalander");
            displayData(ref.number);
    }
}  */


                        /*Constructor overloading */
/*class object{
    int a; String name;
    object(){
        a = 100;
        name ="Mohammed khalander";
    }
    object(int num, String name2){
        a = num;
        name = name2;
    }
    void display(){
        System.out.println(a + " " + name);
    }
    public static void main(String[] args) {
        object ref = new object();
        object ref2 = new object(99,"Vijaya");
        ref.display();
        ref2.display();    // Very interesting
        // Here we can even have private constructor
    }
}*/


                    /*Instance block */
/*class myClass{
    int a; String name;
    myClass(int num, String FullName){
        a = num;
        name = FullName;
        System.out.println(a + " " + name);
    }
    {
        System.out.println("Hello");
    }
}
public class object{
    public static void main(String[] args) {
        myClass ref = new myClass(10,"Mohammed Khalander");
        myClass ref2 = new myClass(20,"Navneeth");
            // Instance block executes always, and first
    }
}*/

                            /* Order of execution */
/*class myClass {
    int a; String name;
    myClass(){
        System.out.println("It will execute almost at last");
    }
    {
        System.out.println("It will execute after static block");
    }
    static{
        System.out.println("Static has highest priority among everyone");
    }
    
}      
public class object{
    public static void main(String[] args) {
        myClass ref = new myClass();
        System.out.println("This is almost last after everyone");
        
    }
}  */                   

                    //Accessing members
/*class myClass {
    int a; String name;
    myClass(int num,String name2){
        a = num;
        name = name2;
        System.out.println(a +" "+name);
    }
    {
        System.out.println(a +" "+name);  // It can access but only we get 'zero' and 'null'
    }
    static{
        System.out.println(a +" "+name);  // It cannot access 
    }       // I can only acess these by making the instance variable static ----> very important
    
}      
public class object{
    public static void main(String[] args) {
        myClass ref = new myClass(20,"Anything");
        System.out.println(ref.a +" "+ref.name);
        
    }
} */