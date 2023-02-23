package tamgiac;

import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        //input: a, b
        //output: cv, dt
        //Buoc1: Nhap gia tri chieu dai va chieu rong
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap a, b = ");
        double a = in.nextDouble();//Chieu dai
        double b = in.nextDouble();//Chieu rong
        if(a<0 || b<0){
            System.out.print("Nhap lai gia tri");
            System.exit(0);
        }
        //Buoc2: Tinh chu vi va dien tich
        double cv = 2*a + 2*b;
        double dt = a*b;
        //Buoc3: Hien thi ket qua
        System.out.printf("Hinhchunhat[Chu vi  = %.2f cm, Dien tich = %.2f cm^2",cv,dt);
    }
}
