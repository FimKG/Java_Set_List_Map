package com.accenture.maptask;
/*
    Create a TransactionService class which has printAllTransactions() method which helps to
    filter transactions corresponding to a particular account.
 */
import java.util.Map;

public class TransactionService {

    public static void printAllTransactions(Map<String, Transaction> transactionMap, long accountNumber) {
        System.out.println("Transactions for account number: " + accountNumber);
        for (Map.Entry<String, Transaction> entry : transactionMap.entrySet()) {
            Transaction transaction = entry.getValue();
            if (transaction.getSenderAccountNumber() == accountNumber ||
                    transaction.getRecipientAccountNumber() == accountNumber) {
                System.out.println("Transaction ID: " + transaction.getTransactionId());
            }
        }
    }

}
