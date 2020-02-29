class Phone{

    public static void main(String[] args){

         String[][] numbers = {
             {"Tom","1234"},
             {"Amy","2345"},
         };

         int i;

         if (args.length != 1)
         System.out.print("NO");
         else {
             for (i = 0; i<numbers. length; i++){
                 if(numbers[i][0].equals(args[0])){
                     System.out.println("Find");
                 }
             }
         }   
    }
}