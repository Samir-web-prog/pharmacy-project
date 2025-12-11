package com.mycompany.pharmacy;

import java.math.BigDecimal;
class SaleDetail {
    private int detailId;
    private Medicine medicine;
    private int quantity;
    private BigDecimal price;

    public SaleDetail() {}

    public SaleDetail(int detailId, Medicine medicine, int quantity, BigDecimal price) {
        this.detailId = detailId;
        this.medicine = medicine;
        this.quantity = quantity;
        this.price = price;
    }

    public int getDetailId() { return detailId; }
    public void setDetailId(int detailId) { this.detailId = detailId; }

    public Medicine getMedicine() { return medicine; }
    public void setMedicine(Medicine medicine) { this.medicine = medicine; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public BigDecimal getSubtotal() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
