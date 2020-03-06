class Test{
    void noChange(int i, int j){
        i += j;
        j = -j;
        System.out.println(i+j);
    }
    


}
class CallByValue{
     public static void main(String[] args){
       Test ob = new Test();
       int a = 15,b= 20;
       System.out.println(a+b);
       ob.noChange(a, b);
       System.out.println(a+b);
     //System.out.println(ob1.sameVolume(ob3));
    }
}
