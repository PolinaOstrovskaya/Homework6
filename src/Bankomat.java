public class Bankomat {
    int NumberOf20;
    int NumberOf50;
    int NumberOf100;

    public Bankomat(int NumberOf20, int NumberOf50, int NumberOf100 ) {
        this. NumberOf20 =NumberOf20;
        this. NumberOf50 = NumberOf50 ;
this.NumberOf100= NumberOf100;
    }
void addMoney( int NumberOf20, int NumberOf50, int NumberOf100)
{
    this.NumberOf20=NumberOf20;
    this.NumberOf50=NumberOf50;
    this.NumberOf100=NumberOf100;

}
    public boolean withdrawMoney(int amount) {
        int numOf100Needed = amount / 100;
        int numOf50Needed = (amount % 100) / 50;
        int numOf20Needed = ((amount % 100) % 50) / 20;
        if (numOf100Needed <=NumberOf100  && numOf50Needed <= NumberOf50 && numOf20Needed <= NumberOf20) {
            NumberOf100 -= numOf100Needed;
            NumberOf50 -= numOf50Needed;
            NumberOf20 -= numOf20Needed;
            System.out.println("Dispensing " + numOf100Needed + " x $100 bills, " + numOf50Needed + " x $50 bills, and " + numOf20Needed + " x $20 bills.");
            return true;
        } else {
            System.out.println("Insufficient funds in the Bankomat.");
            return false;
        }
    }

}
