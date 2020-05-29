package univ.tours.WeBuyWSApp.service;

import java.util.List;

import univ.tours.WeBuyWSApp.entity.Store;

public interface IStoreService {

	public List<Store> findAllStore();
	public void delete(int id);
	public void add(Store store);
}
