/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.fon.main;

import rs.fon.model.Company;
import rs.fon.model.HoldingEntity;

/**
 *
 * @author student2
 */
public class Main {

    public static void main(String[] args) {
//        Company company = new Company(1l, "FON");
//        Company company = new Company.Builder(1l, "FON").contact("c1").contact("c2").address("Jove Ilica 154").phone("011-3950-800").build();
        HoldingEntity holdingEntity = new HoldingEntity.Builder(2l, "HE2", 2l).phone("011-3950-800").locations("L1,L2").address("Jove Ilica 154").build();
        System.out.println(holdingEntity);
    }
}
