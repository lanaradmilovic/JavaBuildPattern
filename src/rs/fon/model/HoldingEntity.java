/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.fon.model;

/**
 *
 * @author student2
 */
public class HoldingEntity extends Company {

    private final Long pib;
    private final String locations;

    public HoldingEntity(Builder builder) {
        super(builder);
        this.pib = builder.pib;
        this.locations = builder.locations;
    }

    public static class Builder extends Company.Builder<Builder> {

        private final Long pib;
        private String locations = "n/a";

        public Builder(Long id, String name, Long pib) {
            super(id, name);
            this.pib = pib;
        }

        public Builder locations(String locations) {
            this.locations = locations;
            //V1
            //return this;
            //V2
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public HoldingEntity build() {
            return new HoldingEntity(this);
        }

    }

}
