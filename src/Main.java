import bkap.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("---------------------- MENU -----------------------");
            System.out.println("1. Nhap thong tin n sinh vien");
            System.out.println("2. Tinh diem trung binh sinh vien");
            System.out.println("3. Xet diem qua sinh vien");
            System.out.println("4. Hien thi thong tin sinh vien");
            System.out.println("5. Thoat");
            System.out.println("Nhap lua chon cua ban");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong sinh vien muon them");
                    int n = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student s = new Student();
                        s.inputdata(input);
                        list.add(s);
                    }
                    break;
                case 2:
                    for (Student s : list
                    ) {
                        s.tinhDiemTB();
                    }
                    break;
                case 3:
                    for (Student s : list) {
                        System.out.printf("Name = %-30s - %-10s \n", s.getStudentName(), s.isPassMark() ? "Pass" : "Fail");
                    }
                    break;
                case 4:
                    for (Student s : list) {
                        s.displaydata();
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}