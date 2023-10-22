public class CreditCard{
    String Accountnumber;
    int CurrentAmountInTheAccount;

    public CreditCard(String Accountnumber, int CurrentAmountInTheAccount ) {
        this.Accountnumber = Accountnumber;
        this.CurrentAmountInTheAccount =CurrentAmountInTheAccount ;

    }

    void info(String text) {
        System.out.println( " Account Number: "+ Accountnumber + "Balance:" + CurrentAmountInTheAccount );
    }

Integer ReplenishmentOfBalance( int count)
{
   count+=CurrentAmountInTheAccount;
   return count;
}
Integer WrittingOffMoney( int count1)
{   int count2 = 0;
    if(CurrentAmountInTheAccount>0)
    {
       count2=CurrentAmountInTheAccount-count1;
    }else
    {
        System.out.println("NO MONEY....");
    }
    return count2;
}

}


