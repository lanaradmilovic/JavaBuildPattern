/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.fon.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student2
 */
public abstract class Company {

    private final Long id;
    private final String name;
    private final String phone;
    private final String mail;
    private final String address;
    private final List<String> contacts;

    public Company(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
        this.mail = builder.mail;
        this.address = builder.address;
        this.contacts = builder.contacts;
    }

    public abstract static class Builder<T extends Builder<T>> {

        private final Long id;
        private final String name;
        private String phone;
        private String mail;
        private String address;
        private List<String> contacts = new ArrayList<>();

        public Builder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public T address(String address) {
            this.address = address;
            return self();
        }

        public T mail(String mail) {
            this.mail = mail;
            return self();
        }

        public T phone(String phone) {
            this.phone = phone;
            return self();
        }

        public T contact(String contact) {
            this.contacts.add(contact);
            return self();
        }

        protected abstract T self();

        public abstract Company build();

    }

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", mail=" + mail + ", address=" + address + ", contacts=" + contacts + '}';
    }

}
