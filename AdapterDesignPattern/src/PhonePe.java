public class PhonePe {

    BankApis bankApis;
    public PhonePe(BankApis bankApis)
    {
        this.bankApis = bankApis;
    }

    public double doSomething(){
        return bankApis.checkBalance("23") * 2;
    }



}
