package tamgiac;

import java.util.Scanner;

public class tientro {
    public static void main(String[] args) {
        //input: So dien thang truoc (a) - SDTN (b) - So nuoc thang trc (c) - SNTN (d)
        //outout: Tong tien (t)

        //Buoc1: Nhap gia tri can thiet

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so dien thang truoc a = ");
        long a = in.nextLong();
        System.out.print("Nhap so dien thang nay b = ");
        long b = in.nextLong();
        System.out.print("Nhap so nuoc thang truoc c = ");
        long c = in.nextLong();
        System.out.print("Nhap so nuoc thang nay d = ");
        long d = in.nextLong();
        if(a > b || c > d){
            System.out.println("Nhap lai gia tri");
            System.exit(0);
        }
        //Buoc2: Tinh tien dien, tien nuoc, tien phong

        long td = (b - a) * 4;
        long tn = (d-c) * 30;
        long dvk = 1200;
        long tp = td + tn +dvk;

        //Buoc3: Hien thi ket qua

        System.out.println("Tien phong than nay la = " + tp);

    }
}
