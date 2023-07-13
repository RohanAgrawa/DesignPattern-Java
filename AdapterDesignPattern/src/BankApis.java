import ThirdPartyApi.YesBankApi;

public interface BankApis {


    public double checkBalance(String acc_no);
    public void transferMoney(String from_accNo, String to_accNo, double money);
}
