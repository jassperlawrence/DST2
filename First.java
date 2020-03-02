public class First<T,U> {
    private T t;
    private  U u;

    public First(T t,U u) {
        this.t=t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }

    public void execute(){
       if( u instanceof java.lang.String && t instanceof java.lang.String){
           //do string check
           if(u.equals(t)){
               System.out.println("The string is equal");
           }
           else
               System.out.println("The string is not equal");
       }
       else if((u instanceof Integer && t instanceof Integer) ){
           //do check for double or int

       }

    }
}
