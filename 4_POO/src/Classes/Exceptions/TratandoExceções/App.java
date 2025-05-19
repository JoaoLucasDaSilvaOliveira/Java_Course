package Classes.Exceptions.TratandoExceções;

import Classes.Exceptions.*;

public class App {
    public static void main(String[] args) {
        Account3 conta = new Account3("1234-5");
        conta.deposit(500);
        System.out.println(conta.toString());

        //o bloco só pega um catch, caso caia no primeira catch, não executa o segundo; entretanto, podemos ter
        // catchs aninhados
        try{
            conta.withdraw(600);
            System.out.println(conta);
        } catch (InsuficientFundsException e){
            System.out.println("Ops... pouco dinheiro. Só existe R$"+e.getCurrentBalance());
        } catch (IllegalArgumentException e){
            System.out.println("O valor não pode ser negativo");
        }/*multi-catch: tratamos mais de uma exceção por vez, da mesma forma ->
            catch (InsuficientFundsException | IllegalArgumentException e ){
                //alguma coisa
            }*/
        //bloco finally: executa de qlqr forma após o tratamento de qlqr exceção
         finally {
            System.out.print("Infos: ");
        }
        System.out.println(conta);
    }
}
