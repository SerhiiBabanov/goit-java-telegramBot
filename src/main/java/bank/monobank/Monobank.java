package bank.monobank;

import model.Bank;

public class Monobank extends Bank {
    @Override
    protected double getValuteExchange() {
        return 0;
    }
}