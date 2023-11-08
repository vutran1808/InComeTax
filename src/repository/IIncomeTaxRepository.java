/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;
import model.Children;
import model.Parent;
import model.Person;


public interface IIncomeTaxRepository {

    void detailOfDeduction(Person person, List<Children> childrens, List<Parent> parents);

    void inputData(Person person, List<Children> childrens, List<Parent> parents);
    
}