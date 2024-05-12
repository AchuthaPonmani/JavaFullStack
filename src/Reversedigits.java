public class Reversedigits {
    public static void main(String[] args) {
        int num=876;
        while(num>0)
        {
            int i=num%10;
            System.out.print(i);
            num=num/10;
        }
    }
}
