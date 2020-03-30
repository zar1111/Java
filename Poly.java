public class Poly {
    public static void main(String[] args) {
        int an = 2;
      if(an==1){
          show(new Cat());  
      }
      else{
          show(new Dog());
      } 
                
      //Animal a = new Cat();  
      //a.eat();               
      //Cat c = (Cat)a;        
      //c.work();       
  }  
            
    public static void show(Animal a)  {
        a.eat();  
       
        
    }  
}
 
abstract class Animal {  
    abstract void eat();  
}  
  
class Cat extends Animal {  
    public void eat() {  
        System.out.println("1");  
    }  
    public void work() {  
        System.out.println("2");  
    }  
}  
  
class Dog extends Animal {  
    public void eat() {  
        System.out.println("3");  
    }  
    public void work() {  
        System.out.println("4");  
    }  
}