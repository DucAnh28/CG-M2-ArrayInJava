import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);
    }
    //phương thức trừa tường: từ khóa abstract
//    abstract void m1();
    public int a;

    //constructor: hàm khởi tạo
    //có tên trùng với tên lớp, không chứa return datatype hoặc void
    //mặc định 1 lớp sẽ chứa 1 constructor không tham số nếu không có constructor nào được tạo
    public Demo() {

    }

    public Demo(int a) {
        this.a = a;
    }

    //phương thức bình thường: từ khóa void
    void m2(){}

    //phương thức bình thường: void + access modifier
    public void m3(){
    }
    protected void m4(){}
    private void m5(){}

    //phương thức bình thường: return datatypes
    int m6(){return 0;}

    //phương thức bình thường: return datatypes + access modifier
    public int m7(){return 100;}
    protected int m8(){return 0;}
    private int m9(){return 0;}

    //kết hợp 1 số từ khóa khác: final, static
    public final void m10(){}
    public static void m11(){}
    private static final void m12(){}

    //tham trị và tham chiếu
    public int m13(int a) {
        a = 100;
        return a;
    }

    public int m14(int[] a) {
        a[0] = 100;
        return a[0];
    }
}
