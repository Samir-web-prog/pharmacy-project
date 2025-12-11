package com.mycompany.pharmacy;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

class Sale {
    private int saleId;
    private Customer customer;
    private Pharmacist pharmacist;
    private LocalDateTime saleDate;
    private List<SaleDetail> details = new ArrayList<>();

    public Sale() {
        this.saleDate = LocalDateTime.now();
    }

    public Sale(int saleId, Customer customer, Pharmacist pharmacist, LocalDateTime saleDate) {
        this.saleId = saleId;
        this.customer = customer;
        this.pharmacist = pharmacist;
        this.saleDate = saleDate != null ? saleDate : LocalDateTime.now();
    }

    public int getSaleId() { return saleId; }
    public void setSaleId(int saleId) { this.saleId = saleId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Pharmacist getPharmacist() { return pharmacist; }
    public void setPharmacist(Pharmacist pharmacist) { this.pharmacist = pharmacist; }

    public LocalDateTime getSaleDate() { return saleDate; }
    public void setSaleDate(LocalDateTime saleDate) { this.saleDate = saleDate; }

    public List<SaleDetail> getDetails() { return details; }

    public void addDetail(SaleDetail detail) {
        details.add(detail);
    }

    public java.math.BigDecimal calculateTotal() {
        return details.stream()
                .map(SaleDetail::getSubtotal)
                .reduce(java.math.BigDecimal.ZERO, java.math.BigDecimal::add);
    }
}