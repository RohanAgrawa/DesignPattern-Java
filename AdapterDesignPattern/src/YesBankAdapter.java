import ThirdPartyApi.YesBankApi;

public class YesBankAdapter implements BankApis{

    private final YesBankApi yb = new YesBankApi();
    @Override
    public double checkBalance(String acc_no) {
        return yb.getBalance(acc_no);
    }

    @Override
    public void transferMoney(String from_accNo, String to_accNo, double money) {
        yb.addMoney(from_accNo, to_accNo, money);
    }
}
