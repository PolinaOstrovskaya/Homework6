import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      CreditCard card=new CreditCard("124354", 500);
        CreditCard card1=new CreditCard("345679",1000);
        CreditCard card2=new CreditCard("382547295",467);
        System.out.println(card.ReplenishmentOfBalance(500));
        System.out.println(card1.ReplenishmentOfBalance(354));
        System.out.println(card2.WrittingOffMoney(367));
        Bankomat ATM=new Bankomat(3,35,333);
        Bankomat ATM2=new Bankomat(12,5,3);
        Bankomat ATM3=new Bankomat(34,36,33);
        System.out.println(ATM2.withdrawMoney(340));
    }
}