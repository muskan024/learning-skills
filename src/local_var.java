public class local_var {
    void m(){
        int i=200;
        System.out.println(i);
    }
    public static void main(String []args){
        local_var l=new local_var();
       // System.out.println(i);
        l.m();
    }
}
