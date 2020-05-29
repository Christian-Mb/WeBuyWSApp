package univ.tours.WeBuyWSApp.service;

import univ.tours.WeBuyWSApp.entity.StoreAddress;

import java.util.List;

public interface IStoreAddressService {

    public List<StoreAddress> storeAddress(int id);
    public void delete(int id);
}
