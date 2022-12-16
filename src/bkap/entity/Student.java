package bkap.entity;

import bkap.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentId;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private boolean status;
    public Student(){

    }

    public Student(String studentId, String studentName, int age, float diemToan, float diemLy, float diemHoa, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputdata(Scanner sc) {
        System.out.println("Nhập ID :");
        this.studentId = sc.nextLine();
        System.out.println("Nhập Tên : ");
        this.studentName = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem Toan : ");
        this.diemToan = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem Ly : ");
        this.diemLy = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap diem Hoa : ");
        this.diemHoa = Float.parseFloat(sc.nextLine());
        this.status = true;
    }

    @Override
    public void displaydata() {
        System.out.printf("Id: %-5s | Name: %-30s | Age: %-5d | Toan: %-5.1f | Ly: %-5.1f | Hoa : %-5.1f | TB: %-5.1f | Trang thai: %-20s\n",this.studentId, this.studentName, this.age,this.diemToan, this.diemLy, this.diemHoa,this.diemTB, this.status?"Hoat dong":"Khong hoat dong");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }
    public void tinhDiemTB(){
        this.diemTB = (this.diemToan+this.diemHoa+this.diemLy)/3;
    }
    public boolean isPassMark(){
        if (this.diemTB >5) {
            return true;
        }else {
            return false;
        }
    }
}
