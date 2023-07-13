import ThirdPartyApi.HDFCBankApi;
import ThirdPartyApi.YesBankApi;

public class HDFC_Bank_Adapter implements BankApis{

    private final HDFCBankApi hb = new HDFCBankApi();
    @Override
    public double checkBalance(String acc_no) {
        return hb.fetchBalance(acc_no);
    }

    @Override
    public void transferMoney(String from_accNo, String to_accNo, double money) {
        hb.transferAmount(from_accNo, to_accNo, money);
    }
}
