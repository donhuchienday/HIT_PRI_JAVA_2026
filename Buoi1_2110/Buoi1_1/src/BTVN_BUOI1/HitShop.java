package BTVN_BUOI1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HitShop {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten mat hang: ");
        String tenMatHang = sc.nextLine();
        System.out.print("Nhap don gia: ");
        Double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();
        double thanhTien = soLuong * donGia;


        final double VAT_RATE = 0.10;
        final double SHIPPING_FEE = 20000;
        double tongThanhToan = thanhTien + VAT_RATE*thanhTien + SHIPPING_FEE;


        System.out.println("--------------------------");
        System.out.println("ten MH: " + tenMatHang);
        System.out.println("so luong " + soLuong);
        System.out.println("thanh tien " + thanhTien);
        System.out.println("tong thanh toan " + tongThanhToan);

    }
}
