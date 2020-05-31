package univ.tours.WeBuyWSApp.service;

import univ.tours.WeBuyWSApp.entity.Deal;

import java.util.List;

public interface IDealService {

    public List<Deal> getAllDeals();
    public void delete(int id);
    public Deal getById(int id);
}
