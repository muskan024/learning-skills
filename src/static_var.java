public class static_var {
    static int i=0;
    static_var(){
        i++;
        System.out.println(i);
    }
    public static void main(String []args){
        static_var s1= new static_var();
        static_var s2= new static_var();
        static_var s3= new static_var();
        static_var s4= new static_var();
        static_var s5= new static_var();
    }
}
