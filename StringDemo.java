import sun.net.www.content.text.plain;

class StringDemo{
    public static void main(String[] args){
        String str1 = new String("Java string are objects.");
        String str2 = "They are constructed varius ways.";
        String str3 = new String(str2);
        System.out.println(str1+str3);

        int result, idx;
        char ch;
    /*    System.out.println(str1.length());

        if (str1.equals(str2))
        System.out.print("equal");
        else
        System.out.println(str1+str3);

        for(int i=0; i<str1.length();i++)
        {
            System.out.print(str1.charAt(i)+" ");
        }

        result = str1.compareTo(str3);
        if(result < 0){
            System.out.println("str1 and str3 are equal");
        }
*/
        idx = str1.indexOf("av");
        System.out.println(idx);



    }
}