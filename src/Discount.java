public class Discount {

    public static void main(String[] args) {
        int price;
        price=500;
        float payable;
        float discount;
        if(price<500)
        {
            System.out.println("Payable Amount is "+ price);
        }
        else if(price<=500 && price>1000)
        {
            discount=(float)0.1*price;
            payable=price-discount;
            System.out.println("Payable Amount is "+ payable);

        }
        else if(price>=1000)
        {
            discount=(float)0.2*price;
            payable=price-discount;
            System.out.println("Payable Amount is "+ payable);

        }
    }
}
