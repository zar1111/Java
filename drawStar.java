
class StarDrawer {
	
        void drawStars(int n){
            if(n == 1)
            System.out.print("x");
            else {
                System.out.print("x");
                drawStars(n - 1);
            }
        }
}

class StarDrawingDemo{
public static void main(String[] args){
    StarDrawer drawer = new StarDrawer();
    drawer.drawStars(1);
    System.out.println();
    drawer.drawStars(12);
    System.out.println();
}

}