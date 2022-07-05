public class Method {
    public static void main(String[] args) {
        display();
        Demo demo = new Demo();
        Demo demo1 = new Demo(10);
        System.out.println(demo.a);
        System.out.println(demo1.m7());
        int a = 10;
        int[] b = {10};
        System.out.println("Giá trị biến a:" + a);
        System.out.println("Giá trị b[0]:" + b[0]);
        System.out.println(demo1.m13(a));
        System.out.println(demo1.m14(b));
        System.out.println("Giá trị biến a:" + a);
        System.out.println("Giá trị b[0]:" + b[0]);
    }

    public static void display() {
        System.out.println("C0522G1");
    }

    //các thành phần không thể thiếu: void hoặc KDL giá trị trả về, tên phương thức, ngoặc tròn
    void display2() {
        System.out.println("C0522G1");
    }
}
