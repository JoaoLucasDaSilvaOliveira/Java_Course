package Classes.Exceptions.AninhandoExceções;

import Classes.Exceptions.Account3;
import Classes.Exceptions.InsuficientFundsException;

public class AcountService {

    public void createAndWithdraw(String number, double amount) throws ServiceException{
        Account3 account = new Account3(number);
        account.deposit(1000);
        try{
            account.withdraw(amount);
        } catch (InsuficientFundsException e) {
            //passando apenas a mensagem
            //  throw new ServiceException(e.getMessage());
            //passando apenas a exceção
            //  throw new ServiceException(e);
            //passando uma mensagem e a exceção
            throw new ServiceException("Erro durante o saque", e); //essa forma é melhor pois temos um histórico completo dos erros
        }
    }

}
