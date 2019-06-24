package io.lh.bitcoinexplorer_01.dto;

public class TransactionListDTO {
    private String txDetailId;

    private Double amount;

    public String getTxDetailId() {
        return txDetailId;
    }

    public void setTxDetailId(String txDetailId) {
        this.txDetailId = txDetailId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
