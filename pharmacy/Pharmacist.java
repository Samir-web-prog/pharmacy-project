
package com.mycompany.pharmacy;

import java.time.LocalDate;

class Pharmacist extends User {
    private int pharmacistId;
    private String phone;
    private LocalDate hireDate;

    public Pharmacist() {
        super();
        setRole(Role.PHARMACIST);
    }

    public Pharmacist(int pharmacistId, int userId, String username, String passwordHash, String email, String phone, LocalDate hireDate) {
        super(userId, username, passwordHash, email, Role.PHARMACIST);
        this.pharmacistId = pharmacistId;
        this.phone = phone;
        this.hireDate = hireDate;
    }

    public int getPharmacistId() { return pharmacistId; }
    public void setPharmacistId(int pharmacistId) { this.pharmacistId = pharmacistId; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }
}
