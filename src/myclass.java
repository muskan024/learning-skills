public class myclass {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
    }

    static class student{
        int x,y;
    }
    public void a3(){
        student s=new student();
    }
    public void a2(){
        int j;a3();
    }
    public void a1(){
        int i=10;
        a2();
    }
    static class Cat {
        String name;

        void meow() {
            System.out.println(name + " : meow");
        }
    }
}