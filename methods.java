

public class methods {
    int sum(int x, int y){
        int z;
        z=x+y;
        return z;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        methods obj=new methods();
        int c =obj.sum(a, b);
        System.out.println("The sum is "+ c);
    }
}
