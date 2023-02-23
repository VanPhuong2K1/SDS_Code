package tamgiac;

import java.util.Scanner;

// Nhap vao 3 so a-b-c tu ban phim. Hoi a,b,c co phai 3 canh cua tam giac hay khong?
// Neu co hay tinh chu vi va dien tich
public class tamgiac {
    public static void main(String[] args) {
        //Input: a, b, c
        //Output: cv, dt

        //Buoc1: Nhap a, b, c
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        if (a<0 || b<0 || c<0)
        {
            System.out.println("Hay nhap gia tri cua a, b, c lon hon 0 ");
            System.exit(0);
        }

        //Buoc2: Tinh chu vi va dien tich
        double cv = a+b+c;
        double p = cv/2;
        double v = p*(p-a)*(p-b)*(p-c);
        double dt = Math.sqrt(v);
        //Buoc3: Hien thi ket qua
        System.out.printf("Hinhtamgiac[Chu vi la: %.3f cm, Dien tich la: %.3f cm^2", cv,dt);
    }
}
