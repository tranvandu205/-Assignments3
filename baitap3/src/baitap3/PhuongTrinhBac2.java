/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3;

import java.util.Scanner;

public class PhuongTrinhBac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khởi tạo đối tượng Scanner để đọc input từ người dùng

        // Nhập các hệ số của phương trình bậc 2
        System.out.print("Nhap he so a (khong bang 0): ");
        double a = scanner.nextDouble(); // Nhập hệ số a
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble(); // Nhập hệ số b
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble(); // Nhập hệ số c

        // Kiểm tra nếu a = 0
        if (a == 0) {
            System.out.println("Day khong phai la phuong trinh bac 2 vi he so a phai khac 0.");
        } else {
            // Tính delta (discriminant)
            double delta = b * b - 4 * a * c; // Công thức tính delta

            // Kiểm tra giá trị của delta để xác định số nghiệm
            if (delta > 0) {
                // Nếu delta > 0, có 2 nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a); // Công thức tính nghiệm x1
                double x2 = (-b - Math.sqrt(delta)) / (2 * a); // Công thức tính nghiệm x2
                System.out.printf("Phuong trinh co hai nghiem phan biet: x1 = %.2f, x2 = %.2f%n", x1, x2);
            } else if (delta == 0) {
                // Nếu delta = 0, có 1 nghiệm kép
                double x = -b / (2 * a); // Công thức tính nghiệm
                System.out.printf("Phuong trinh co mot nghiem kep: x = %.2f%n", x);
            } else {
                // Nếu delta < 0, phương trình vô nghiệm
                System.out.println("Phuong trinh vo nghiem (khong co nghiem thuc).");
            }
        }

        scanner.close(); // Đóng Scanner để giải phóng tài nguyên
    }
}

