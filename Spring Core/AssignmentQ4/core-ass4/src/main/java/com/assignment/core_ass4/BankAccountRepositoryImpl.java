package com.assignment.core_ass4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("BankRepo")
public class BankAccountRepositoryImpl implements BankAccountRepository {

    @Autowired
    private BankAccount bankAccount1;

    @Autowired
    private BankAccount bankAccount2;

    public  void  BankAccountepositoryImpl(){}

    public BankAccountRepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

  
    public double getBalance(long accountId) {

       
        if(this.bankAccount1.getAccountId()==accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }
    }

    
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

      
        return updatedBal;
    }
}