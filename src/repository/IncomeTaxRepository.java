/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.IncomeTaxDao;
import java.util.List;
import model.Children;
import model.Parent;
import model.Person;


public class IncomeTaxRepository implements IIncomeTaxRepository {
    @Override
    public void inputData(Person person, List<Children> childrens, List<Parent> parents){
        IncomeTaxDao.Instance().inputData(person, childrens, parents);
    }
    
    @Override
    public void detailOfDeduction(Person person, List<Children> childrens, List<Parent> parents){
        IncomeTaxDao.Instance().detailOfDeduction(person, childrens, parents);
    }
}