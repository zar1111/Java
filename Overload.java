class Overload {
    void OvlDemo(){
        System.out.println("NOParameters");
    }

    void OvlDemo(int a){
    System.out.println("One P" + a);
    }
    int OvlDemo(int a, int b){
    System.out.println("Two P" + a + b);
    return a + b;
    }
}
class OverloadDemo{
    public static void main(String[] args){
        Overload ob = new Overload();
        int resI;
        //double resD;
        ob.OvlDemo();
        System.out.println();
        ob.OvlDemo(1);
        System.out.println();
        resI = ob.OvlDemo(2,3);
        System.out.println(resI);
    
    //System.out.println(ob.beta);

   }
}