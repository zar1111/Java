class StringArrays{

    public static void main(String[] args){

        String[] strs = {"This", "is", "a", "test."};
        
        System.out.println("\n");
        strs[1] = "was";
        for(String s: strs){
            System.out.println(s);
        }

        String orgString = "java makes the web move";
        String substr = orgString.substring(1,6);
        System.out.println(substr);

    }
}