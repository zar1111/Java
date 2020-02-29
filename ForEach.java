class ForEach{
    /*public static void main (String[] args){
        int nums[] = {1,2,4,3,5,6};
        int sum = 0;
        for(int x: nums){
            System.out.println("Value is " + x);
            System.out.println(sum);
            sum+= x;
        }
        System.out.println(sum);
    }
    */
    public static void main (String[] args){
        int[][] nums = new int [3][5];
        int sum = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
            nums[i][j] = (i+1)*(j+1);

        for(int[] x : nums){
            for (int y : x){
                System.out.println("Value is "+ y);
                sum += y;
            }
        }
        System.out.println(sum);
    }
}