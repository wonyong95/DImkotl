package laon.lec04;

public class Lec04Main {

    public static void main(String[] args){
        laon.JavaMoney money1 = new laon.JavaMoney(1_000L);
        laon.JavaMoney money2 = new JavaMoney(2_000L);
        System.out.println(money1.plus(money2));
    }

}
