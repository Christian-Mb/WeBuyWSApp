package univ.tours.WeBuyWSApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univ.tours.WeBuyWSApp.dao.StoreJPARepository;
import univ.tours.WeBuyWSApp.entity.Store;

@Service
@Transactional
public class StoreImplService implements IStoreService{

	@Autowired
	StoreJPARepository StoreService;
	@Override
	public List<Store> findAllStore() {
		return StoreService.findAllStore(); 
	}

	
}
