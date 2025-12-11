package com.mycompany.pharmacy;
import java.math.BigDecimal;
import java.time.LocalDate;

class Medicine {
    private int medicineId;
    private String name;
    private Category category;
    private BigDecimal unitPrice;
    private int stockQuantity;
    private LocalDate expirationDate;
    private Supplier supplier;

    public Medicine() {}

    public Medicine(int medicineId, String name, Category category, BigDecimal unitPrice, int stockQuantity, LocalDate expirationDate, Supplier supplier) {
        this.medicineId = medicineId;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
        this.expirationDate = expirationDate;
        this.supplier = supplier;
    }

    public int getMedicineId() { return medicineId; }
    public void setMedicineId(int medicineId) { this.medicineId = medicineId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public BigDecimal getUnitPrice() { return unitPrice; }
    public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }

    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    public LocalDate getExpirationDate() { return expirationDate; }
    public void setExpirationDate(LocalDate expirationDate) { this.expirationDate = expirationDate; }

    public Supplier getSupplier() { return supplier; }
    public void setSupplier(Supplier supplier) { this.supplier = supplier; }

    public boolean decreaseStock(int quantity) {
        if (quantity <= 0) return false;
        if (stockQuantity < quantity) return false;
        stockQuantity -= quantity;
        return true;
    }
}
