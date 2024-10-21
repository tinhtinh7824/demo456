import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hãy nhập giá của sản phẩm: ");
        Scanner myObj = new Scanner(System.in);
        int gia = myObj.nextInt();
        double thue = gia * 8.25/100;
        System.out.println("Số tiền phải trả cho pần thuế là: " + thue);
        double giacuoi = gia+thue;
        System.out.println("Giá sau khi tính thuế là: "+ giacuoi);

    }
}