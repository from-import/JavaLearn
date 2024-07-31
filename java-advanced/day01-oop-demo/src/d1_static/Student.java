package d1_static;


public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }


    // static 如何修饰方法
    // static 修饰的方法为静态方法，用类.方法访问
    // 不可出现 this 关键字
    public static int get_max(int num1,int num2){
        return num1 > num2 ? num1 : num2;
    }


    // 实例方法
    // 属于对象的方法
    public void study(){
        System.out.println(this.name);
    }


    public static void main(String[] args) {
        System.out.println(get_max(20,50));
        Student stu1 = new Student("player1");
        stu1.study();
    }
}

