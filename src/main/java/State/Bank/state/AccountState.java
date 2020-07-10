package State.Bank.state;

import State.Bank.Account;

// 抽象状态类
public abstract class AccountState {
    public Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}