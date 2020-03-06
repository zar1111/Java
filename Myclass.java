class Myclass{
    private int alpha;
     void setalpha(int a){
         alpha = a;
     }
     int getalpha(){
         return alpha;
     }
     public int beta;


}
class AccessDemo{
     public static void main(String[] args){

     Myclass ob = new Myclass();
     ob.setalpha(-99);
     System.out.println(ob.getalpha());
     //ob.alpha = 10;
     ob.beta = 20;
     System.out.println(ob.beta);

    }
}