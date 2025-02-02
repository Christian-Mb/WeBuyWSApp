package univ.tours.WeBuyWSApp.service;

import univ.tours.WeBuyWSApp.entity.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class InitDatas {
    ArrayList<Store> stores = new ArrayList<>();
    ArrayList<Deal> deal = new ArrayList<>();
    ArrayList<Product> produt = new ArrayList<>();
    ArrayList<PurshaseGroup> groupes = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<StoreAddress> storeAddresses = new ArrayList<>();
    ArrayList<ParticipateToPurshase> participateToPurshases = new ArrayList<>();
    //User
    User u1 = new User();
    User u2 = new User();
    User u3 = new User();
    User u4 = new User();
    User u5 = new User();
    User u6 = new User();
    User u7 = new User();

    //ParticipateToPurshaseGroup
    ParticipateToPurshase pt1 = new ParticipateToPurshase();
    ParticipateToPurshase pt2 = new ParticipateToPurshase();
    ParticipateToPurshase pt3 = new ParticipateToPurshase();
    ParticipateToPurshase pt4 = new ParticipateToPurshase();
    ParticipateToPurshase pt5 = new ParticipateToPurshase();
    ParticipateToPurshase pt6 = new ParticipateToPurshase();
    ParticipateToPurshase pt7 = new ParticipateToPurshase();
    ParticipateToPurshase pt8 = new ParticipateToPurshase();




    //Address
    StoreAddress a1 = new StoreAddress();
    StoreAddress a7 = new StoreAddress();
    StoreAddress a2 = new StoreAddress();
    StoreAddress a3 = new StoreAddress();
    StoreAddress a4 = new StoreAddress();
    StoreAddress a5 = new StoreAddress();
    StoreAddress a6 = new StoreAddress();



    // Stores

    Store s1 = new Store();
    Store s2  = new Store();
    Store s3  = new Store();
    Store s4  = new Store();
    Store s5  = new Store();
    Store s6  = new Store();
    Store s7  = new Store();

    // Products

    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new Product();
    Product p4 = new Product();
    Product p5 = new Product();
    Product p6 = new Product();
    Product p7 = new Product();
    Product p8 = new Product();
    Product p9 = new Product();
    Product p10 = new Product();
    Product p11 = new Product();
    Product p12 = new Product();
    Product p13= new Product();
    Product p14= new Product();
    Product p15= new Product();
    Product p16= new Product();
    Product p17 = new Product();
    Product p18= new Product();
    Product p19= new Product();
    Product p20= new Product();
    Product p21= new Product();
    Product p22= new Product();
    Product p23= new Product();
    Product p24= new Product();
    Product p25= new Product();
    Product p26= new Product();
    Product p27 = new Product();
    Product p28 = new Product();
    Product p29 = new Product();
    Product p30 = new Product();
    Product p31 = new Product();
    Product p32 = new Product();
    Product p35 = new Product();


    // Deals

    Deal pr1 = new Deal();
    Deal pr2 = new Deal();
    Deal pr3 = new Deal();
    Deal pr4 = new Deal();
    Deal pr5 = new Deal();
    Deal pr6= new Deal();
    Deal pr7= new Deal();
    Deal pr8= new Deal();
    Deal pr9= new Deal();
    Deal pr10= new Deal();
    Deal pr11= new Deal();
    Deal pr12= new Deal();
    Deal pr13= new Deal();
    Deal pr14= new Deal();
    Deal pr15= new Deal();
    Deal pr16= new Deal();
    Deal pr17= new Deal();
    Deal pr18= new Deal();
    Deal pr19= new Deal();
    Deal pr20= new Deal();
    Deal pr21= new Deal();
    Deal pr22= new Deal();
    Deal pr23= new Deal();
    Deal pr24= new Deal();
    Deal pr25= new Deal();
    Deal pr26= new Deal();
    Deal pr27= new Deal();
    Deal pr28= new Deal();
    Deal pr29= new Deal();
    Deal pr30= new Deal();
    Deal pr31= new Deal();
    Deal pr32= new Deal();
    Deal pr33= new Deal();
    Deal pr34= new Deal();
    Deal pr35= new Deal();

    // Groups

    PurshaseGroup g1 = new PurshaseGroup();
    PurshaseGroup g2= new PurshaseGroup();
    PurshaseGroup g3= new PurshaseGroup();
    PurshaseGroup g4= new PurshaseGroup();
    PurshaseGroup g5= new PurshaseGroup();
    PurshaseGroup g6= new PurshaseGroup();
    PurshaseGroup g7= new PurshaseGroup();
    PurshaseGroup g8= new PurshaseGroup();
    PurshaseGroup g9= new PurshaseGroup();
    PurshaseGroup g10= new PurshaseGroup();
    PurshaseGroup g11= new PurshaseGroup();
    PurshaseGroup g12= new PurshaseGroup();
    PurshaseGroup g13= new PurshaseGroup();
    PurshaseGroup g14= new PurshaseGroup();
    PurshaseGroup g15= new PurshaseGroup();
    PurshaseGroup g16= new PurshaseGroup();
    PurshaseGroup g17= new PurshaseGroup();
    PurshaseGroup g18= new PurshaseGroup();
    PurshaseGroup g19= new PurshaseGroup();
    PurshaseGroup g20 = new PurshaseGroup();

    protected ArrayList<Store> getMagasinsList() {
        s1.setName("Carrefour");
        s1.setLogo( "https://www.cc-carrefour-venissieux.com/wp-content/uploads/sites/54/2016/11/file.jpg");

        s2.setName("Monoprix");
        s2.setLogo("https://www.macommune.info/wp-content/uploads/2018/10/monoprix-logo-940x600.jpg");

        s3.setName("Leclerc");
        s3.setLogo("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Logo_E.Leclerc_Sans_le_texte.svg/1200px-Logo_E.Leclerc_Sans_le_texte.svg.png");

        s4.setName("Bricorama");
        s4.setLogo("https://static-pepper.dealabs.com/threads/thread_large/default/1896098_2.jpg");

        s5.setName("La Halle");
        s5.setLogo("https://static-pepper.dealabs.com/threads/thread_large/default/1890225_1.jpg");


        s6.setName("Darty");
        s6.setLogo("https://static-pepper.dealabs.com/merchants/avatar_web_square_94/avatar/2_3.jpg");

        s7.setName("Auchan");
        s7.setLogo("https://res.cloudinary.com/westfielddg/image/upload/westfield-media/fr/retailer/logos/xvotuvkhefu3tozayn8r.png");





        stores.add(s1);
        stores.add(s2);
        stores.add(s3);
        stores.add(s4);
        stores.add(s5);
        stores.add(s6);
        stores.add(s7);

        return stores;

    }

    protected ArrayList<Deal> getDealsList() {
        //String nom, String description, float prixAvecPromo, int quantiteMin, int quantiteMax, int stock, String duree,
        //Produit produit, Magasin magasin
        pr1.setUserLike(200);
        pr1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr1.setUserDislike(200);
        pr1.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr1.setPrice(20);
        pr1.setPrice_pomo(15);
        pr1.setProduct(p1);
        pr1.setQuantity_available(1000);
        pr1.setQuantity_to_buy(4);
        pr1.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr1.setStore(s1);
        pr1.setUser(u1);

        pr2.setUserLike(200);
        pr2.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr2.setUserDislike(200);
        pr1.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr2.setPrice(20);
        pr2.setPrice_pomo(15);
        pr2.setProduct(p2);
        pr2.setQuantity_available(1000);
        pr2.setQuantity_to_buy(4);
        pr2.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr2.setStore(s1);
        pr2.setUser(u2);

        pr3.setUserLike(200);
        pr3.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr3.setUserDislike(200);
        pr3.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr3.setPrice(20);
        pr3.setPrice_pomo(15);
        pr3.setProduct(p3);
        pr3.setQuantity_available(1000);
        pr3.setQuantity_to_buy(4);
        pr3.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr3.setStore(s3);
        pr3.setUser(u1);

        pr4.setUserLike(200);
        pr4.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr4.setUserDislike(200);
        pr4.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr4.setPrice(20);
        pr4.setPrice_pomo(15);
        pr4.setProduct(p4);
        pr4.setQuantity_available(1000);
        pr4.setQuantity_to_buy(4);
        pr4.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr4.setStore(s4);
        pr4.setUser(u2);

        pr5.setUserLike(200);
        pr5.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr5.setUserDislike(20);
        pr5.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr5.setPrice(50);
        pr5.setPrice_pomo(35);
        pr5.setProduct(p5);
        pr5.setQuantity_available(2000);
        pr5.setQuantity_to_buy(8);
        pr5.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr5.setStore(s5);
        pr5.setUser(u3);

        pr6.setUserLike(400);
        pr6.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr6.setUserDislike(40);
        pr6.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr6.setPrice(40);
        pr6.setPrice_pomo(35);
        pr6.setProduct(p6);
        pr6.setQuantity_available(200);
        pr6.setQuantity_to_buy(3);
        pr6.setStore(s6);
        pr6.setUser(u1);

        pr7.setUserLike(400);
        pr7.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        pr7.setUserDislike(40);
        pr7.setEndedAt(new Timestamp(System.currentTimeMillis()));
        pr7.setPrice(90);
        pr7.setPrice_pomo(55);
        pr7.setProduct(p7);
        pr7.setQuantity_available(200);
        pr7.setQuantity_to_buy(6);
        pr7.setStartedAt(new Timestamp(System.currentTimeMillis()));
        pr7.setStore(s7);
        pr7.setUser(u3);





        deal.add(pr1);
        deal.add(pr2);
        deal.add(pr3);
        deal.add(pr4);
        deal.add(pr5);
        deal.add(pr6);
        deal.add(pr7);

        return deal;
    }

    protected ArrayList<Product> getProductsList() {
        p1.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1896032_2.jpg");
        p1.setLabel("Ketchup Heinz 900g");
        p1.setContent("Je suis dans la joie, une joie immense");

        p2.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1864749_2.jpg");
        p2.setLabel("Lessive Skip 15 capsules");
        p2.setContent("Je suis dans la joie, une joie immense");

        p3.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1895681_1.jpg");
        p3.setLabel("Lessive Skip 15 capsules oups");
        p3.setContent("Je suis dans la joie, une joie immense");

        p4.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1398373_2.jpg");
        p4.setLabel("Tropicana pur jus orange avec pulpe 1.5L");
        p4.setContent("Je suis dans la joie, une joie immense");

        p5.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1894462_1.jpg");
        p5.setLabel("Lot x3 Chocolat Milka Oreo 100g");
        p5.setContent("Je suis dans la joie, une joie immense");


        p6.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1894602_2.jpg");
        p6.setLabel("Gel douche Le Petit Marseillais 250ml");
        p6.setContent("Je suis dans la joie, une joie immense");

        p7.setImage("https://static-pepper.dealabs.com/threads/thread_large/default/1894139_1.jpg");
        p7.setLabel("Thé Arizona 50cl chris 2.0");
        p7.setContent("Je suis dans la joie, une joie immense");

        produt.add(p1);
        produt.add(p2);
        produt.add(p3);
        produt.add(p4);
        produt.add(p5);
        produt.add(p6);
        produt.add(p7);

        return produt;
    }

    protected ArrayList<PurshaseGroup> getGroupsList() {

        g1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        g1.setArticle_quantity(5);
        g1.setInvitationCode("NOCHOICE3H34");
        g1.setDeal(pr1);
        g1.setUser(u1);
        g1.setNbrs_users_wanted(6);

        g2.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        g2.setArticle_quantity(2);
        g2.setInvitationCode("NOCHOICE3H34");
        g2.setDeal(pr2);
        g2.setUser(u2);
        g2.setNbrs_users_wanted(2);

        g3.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        g3.setArticle_quantity(2);
        g3.setInvitationCode("NOCHOICE3H34");
        g3.setDeal(pr3);
        g3.setUser(u1);
        g3.setNbrs_users_wanted(2);

         g4.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            g4.setArticle_quantity(2);
            g4.setInvitationCode("NOCHOICE3H34");
            g4.setDeal(pr4);
            g4.setUser(u2);
            g4.setNbrs_users_wanted(2);

            g5.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            g5.setArticle_quantity(2);
            g5.setInvitationCode("NOCHOICE3H34");
            g5.setDeal(pr5);
            g5.setUser(u2);
            g5.setNbrs_users_wanted(2);

            g6.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            g6.setArticle_quantity(2);
            g6.setInvitationCode("NOCHOICE3H34");
            g6.setDeal(pr6);
            g6.setUser(u3);
            g6.setNbrs_users_wanted(2);


            g7.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            g7.setArticle_quantity(4);
            g7.setInvitationCode("NOCHOICE3H34");
            g7.setDeal(pr7);
            g7.setUser(u3);
            g7.setNbrs_users_wanted(5);





        groupes.add(g1);
        groupes.add(g2);
        groupes.add(g3);
        groupes.add(g4);
        groupes.add(g5);
        groupes.add(g6);
        groupes.add(g7);


        return groupes;
    }

    public  ArrayList<User> getUsers(){


        u1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        u1.setEmail("google@sfr.fr");
        u1.setMobileNumber("je suisd ans la joie");
        u1.setPassword("123");

        u2.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        u2.setEmail("user@sfr.fr");
        u2.setMobileNumber("je suisd ans la joie");
        u2.setPassword("abc");

        u3.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        u3.setEmail("ahah@tv.fr");
        u3.setMobileNumber("je suisd ans la joie");
        u3.setPassword("zzz");

        users.add(u1);
        users.add(u2);
        users.add(u3);


        return users;

    }

    public ArrayList<StoreAddress> getAllStoreAddress(){

        a1.setDepartment("37010");
        a2.setDepartment("37000");
        a3.setDepartment("37100");
        a4.setDepartment("37300");
        a5.setDepartment("37200");
        a6.setDepartment("37000");
        a7.setDepartment("37150");

        a1.setLongitude(47.336979);
        a2.setLongitude(47.336979);
        a3.setLongitude(47.336979);
        a4.setLongitude(47.336979);
        a5.setLongitude(47.336979);
        a6.setLongitude(47.336979);
        a7.setLongitude(47.336979);

        a1.setLatitude(0.700475);
        a2.setLatitude(0.700475);
        a3.setLatitude(0.700475);
        a4.setLatitude(0.700475);
        a5.setLatitude(0.700475);
        a6.setLatitude(0.700475);
        a7.setLatitude(0.700475);

        a1.setStore(s1);
        a2.setStore(s2);
        a3.setStore(s3);
        a4.setStore(s4);
        a5.setStore(s5);
        a6.setStore(s6);
        a7.setStore(s7);


        storeAddresses.add(a1);
        storeAddresses.add(a2);
        storeAddresses.add(a3);
        storeAddresses.add(a4);
        storeAddresses.add(a5);
        storeAddresses.add(a6);
        storeAddresses.add(a7);

       return storeAddresses;
    }



}
