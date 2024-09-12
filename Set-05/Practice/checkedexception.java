class Test1 {
    void display(){
        System.out.println("Hello");
    }
}

public class checkedexception {
    public static void main(String[] args) throws Exception {
     
        Test1 t1 = new Test1();
        t1.display();
        Class.forName("Test2");
      
      
    }

}
