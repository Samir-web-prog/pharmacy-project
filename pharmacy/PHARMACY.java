 

package com.mycompany.pharmacy;

 
public class PHARMACY {
    public static void main(String[] args) {

        // Category
        Category cat = new Category(1, "Antibiotics");

        // Supplier
        Supplier sup = new Supplier(1, "pharma supply", "0100000000", "Cairo");

        // Medicine
        Medicine med = new Medicine(
                1,
                "Amoxicillin 500mg",
                cat,
                new java.math.BigDecimal("15.50"),
                50,
                java.time.LocalDate.of(2026, 5, 20),
                sup
        );

        // Customer
        Customer c = new Customer(1, "Ahmed Ali", "01123456789", "Nasr City");

        // Pharmacist
        Pharmacist p = new Pharmacist(
                1,
                10,
                "pharm1",
                "HASHED",
                "ph@ph.com",
                "01033333333",
                java.time.LocalDate.of(2024, 1, 10)
        );

        // Sale + Detail
        Sale sale = new Sale();
        sale.setCustomer(c);
        sale.setPharmacist(p);

        SaleDetail d = new SaleDetail(
                1,
                med,
                3,
                med.getUnitPrice()
        );

        sale.addDetail(d);

        System.out.println("=== Sale Information ===");
        System.out.println("Customer: " + c.getName());
        System.out.println("Pharmacist: " + p.getUsername());
        System.out.println("Medicine: " + med.getName());
        System.out.println("Quantity: " + d.getQuantity());
        System.out.println("Total: " + sale.calculateTotal());
    }
}
