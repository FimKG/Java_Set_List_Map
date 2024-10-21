package com.accenture.maptask;
/*
Create a Transaction class in for holding details such
	String transactionId,
	long senderAccountNumber,
	long recipientAccountNumber and
	double transactionAmount.
Also add parameterized constructors to set their values, getters-setters and toString() method.
 */
public class Transaction {

    private String transactionId;
    private long senderAccountNumber;
    private long recipientAccountNumber;
    private double transactionAmount;

    public Transaction(
            String transactionId,
            long senderAccountNumber,
            long recipientAccountNumber,
            double transactionAmount) {
        this.transactionId = transactionId;
        this.senderAccountNumber = senderAccountNumber;
        this.recipientAccountNumber = recipientAccountNumber;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public long getSenderAccountNumber() {
        return senderAccountNumber;
    }

    public void setSenderAccountNumber(long senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    public long getRecipientAccountNumber() {
        return recipientAccountNumber;
    }

    public void setRecipientAccountNumber(long recipientAccountNumber) {
        this.recipientAccountNumber = recipientAccountNumber;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", senderAccountNumber=" + senderAccountNumber +
                ", recipientAccountNumber=" + recipientAccountNumber +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
