package univ.tours.WeBuyWSApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import univ.tours.WeBuyWSApp.dao.*;
import univ.tours.WeBuyWSApp.entity.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class InitWebuyImpl implements InitWebuy {

    InitDatas datas = new InitDatas();
    @Autowired
    UserJPARepository userJPARepository;
    @Autowired
    StoreJPARepository storeJPARepository;
    @Autowired
    ProductJPARepository productJPARepository;
    @Autowired
    PurshaseGroupJPARepository purshaseGroupJPARepository;
    @Autowired
    DealJPARepository dealJPARepository;
    @Autowired
    AdminJPARepository adminJPARepository;
    @Autowired
    StoreAddressJPARepository storeAddressJPARepository;

    @Override
    public void initStore() {
        for(Store store: datas.getMagasinsList()){
            storeJPARepository.save(store);
        }

    }

    @Override
    public void initProduct() {
        for(Product p: datas.getProduitsList()){
            productJPARepository.save(p);
        }

    }

    @Override
    public void initDeal() {
        for(Deal d: datas.getPromotionsList()){
            dealJPARepository.save(d);
        }
    }

    @Override
    public void initPurshaseGroup() {
        for(PurshaseGroup d: datas.getGroupesList()){
            purshaseGroupJPARepository.save(d);
        }
    }

    @Override
    public void initAddress() {
        for (StoreAddress s: datas.getAllStoreAddress()){
            storeAddressJPARepository.save(s);
        }
    }

    @Override
    public void initParticipateToPurshase() {

    }

    @Override
    public void initUser() {
        for(User u: datas.getUsers()){
            userJPARepository.save(u);
        }

    }

    @Override
    public void initAdmin() {
        User u= datas.getUsers().get(0);
            Admin a = new Admin();
            a.setUser(u);
            adminJPARepository.save(a);
        }


    @Override
    public void afficher() {
        System.out.println(datas.getUsers().get(1));
    }
}
