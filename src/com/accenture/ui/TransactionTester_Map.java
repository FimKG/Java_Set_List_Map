package com.accenture.ui;
/*
Map Assignment:

    Create a TransactionTester class with main method.
    Create 3 transaction objects and add all objects into a map so that the order of transactions is kept.
    The map should store transactionId as key and transaction object as value.
    Pass this map and account number to printAllTransactions() method and
    print transactions ids for the specified account.
 */
import com.accenture.maptask.Transaction;
import com.accenture.maptask.TransactionService;

import java.util.LinkedHashMap;
import java.util.Map;

public class TransactionTester_Map {

    public static void main(String[] args) {
        // Create 3 transaction objects
        Transaction t1 = new Transaction(
                "ACC9482",
                9482736452L,
                3748291023L,
                30.35
        );
        Transaction t2 = new Transaction(
                "ACC1928",
                1928374659L,
                2938475621L,
                35.40
        );
        Transaction t3 = new Transaction(
                "ACC4839",
                4839201736L,
                9482736452L,
                40.45
        );

        // add all objects into a map
        Map<String, Transaction> transactionMap = new LinkedHashMap<>();
        transactionMap.put(t1.getTransactionId(), t1);
        transactionMap.put(t2.getTransactionId(), t2);
        transactionMap.put(t3.getTransactionId(), t3);

        /*
         Pass the map and the account number to printAllTransactions()
         method to print transactions ids for the specified account.
        */
        TransactionService.printAllTransactions(transactionMap, 9482736452L);
    }

}
