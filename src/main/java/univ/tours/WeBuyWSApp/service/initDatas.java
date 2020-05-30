package univ.tours.WeBuyWSApp.service;

import univ.tours.WeBuyWSApp.entity.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class initDatas {
    ArrayList<Store> stores = new ArrayList<>();
    ArrayList<Deal> deal = new ArrayList<>();
    ArrayList<Product> produt = new ArrayList<>();
    ArrayList<PurshaseGroup> groupes = new ArrayList<>();
    ArrayList<User> users = new ArrayList<User>();

    //User
    User u1 = new User();
    User u2 = new User();
    User u3 = new User();
    User u4 = new User();
    User u5 = new User();
    User u6 = new User();
    User u7 = new User();


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

        s6.setName("Auchan");
        s6.setLogo("https://res.cloudinary.com/westfielddg/image/upload/westfield-media/fr/retailer/logos/xvotuvkhefu3tozayn8r.png");





        stores.add(s1);
        stores.add(s2);
        stores.add(s3);
        stores.add(s4);
        stores.add(s5);
        stores.add(s6);
        stores.add(s7);

        return stores;
    }

    protected ArrayList<Deal> getPromotionsList() {
        //String nom, String description, float prixAvecPromo, int quantiteMin, int quantiteMax, int stock, String duree,
        //Produit produit, Magasin magasin
        pr1.setUserLike(200);
        pr1.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr1.setUserDislike(200);
        pr1.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr1.setPrice(20);
        pr1.setPrice_pomo(15);
        pr1.setProduct(p1);
        pr1.setQuantity_available(1000);
        pr1.setQuantity_to_buy(4);
        pr1.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr1.setStore(s1);

        pr2.setUserLike(200);
        pr2.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr2.setUserDislike(200);
        pr1.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr2.setPrice(20);
        pr2.setPrice_pomo(15);
        pr2.setProduct(p2);
        pr2.setQuantity_available(1000);
        pr2.setQuantity_to_buy(4);
        pr2.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr2.setStore(s2);

        pr3.setUserLike(200);
        pr3.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr3.setUserDislike(200);
        pr3.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr3.setPrice(20);
        pr3.setPrice_pomo(15);
        pr3.setProduct(p3);
        pr3.setQuantity_available(1000);
        pr3.setQuantity_to_buy(4);
        pr3.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr3.setStore(s3);

        pr4.setUserLike(200);
        pr4.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr4.setUserDislike(200);
        pr4.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr4.setPrice(20);
        pr4.setPrice_pomo(15);
        pr4.setProduct(p4);
        pr4.setQuantity_available(1000);
        pr4.setQuantity_to_buy(4);
        pr4.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr4.setStore(s4);

        pr5.setUserLike(200);
        pr5.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr5.setUserDislike(20);
        pr5.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr5.setPrice(50);
        pr5.setPrice_pomo(35);
        pr5.setProduct(p5);
        pr5.setQuantity_available(2000);
        pr5.setQuantity_to_buy(8);
        pr5.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr5.setStore(s5);

        pr6.setUserLike(400);
        pr6.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr6.setUserDislike(40);
        pr6.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr6.setPrice(40);
        pr6.setPrice_pomo(35);
        pr6.setProduct(p6);
        pr6.setQuantity_available(200);
        pr6.setQuantity_to_buy(3);
        pr6.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr6.setStore(s6);

        pr7.setUserLike(400);
        pr7.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr7.setUserDislike(40);
        pr7.setEndedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr7.setPrice(90);
        pr7.setPrice_pomo(55);
        pr7.setProduct(p7);
        pr7.setQuantity_available(200);
        pr7.setQuantity_to_buy(6);
        pr7.setStartedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        pr7.setStore(s7);





        deal.add(pr1);
        deal.add(pr2);
        deal.add(pr3);
        deal.add(pr4);
        deal.add(pr5);
        deal.add(pr6);
        deal.add(pr7);

        return deal;
    }

    protected ArrayList<Product> getProduitsList() {
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

    protected ArrayList<PurshaseGroup> getGroupesList() {

        g1.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        g1.setArticle_quantity(5);
        g1.setInvitationCode("NOCHOICE3H34");
        g1.setDeal(pr1);
        g1.setUser(u1);
        g1.setNbrs_users_wanted(6);

        g2.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        g2.setArticle_quantity(2);
        g2.setInvitationCode("NOCHOICE3H34");
        g2.setDeal(pr2);
        g2.setUser(u2);
        g2.setNbrs_users_wanted(2);

        g3.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        g3.setArticle_quantity(2);
        g3.setInvitationCode("NOCHOICE3H34");
        g3.setDeal(pr3);
        g3.setUser(u1);
        g3.setNbrs_users_wanted(2);

         g4.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
            g4.setArticle_quantity(2);
            g4.setInvitationCode("NOCHOICE3H34");
            g4.setDeal(pr4);
            g4.setUser(u2);
            g4.setNbrs_users_wanted(2);

            g5.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
            g5.setArticle_quantity(2);
            g5.setInvitationCode("NOCHOICE3H34");
            g5.setDeal(pr5);
            g5.setUser(u2);
            g5.setNbrs_users_wanted(2);

            g6.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
            g6.setArticle_quantity(2);
            g6.setInvitationCode("NOCHOICE3H34");
            g6.setDeal(pr6);
            g6.setUser(u3);
            g6.setNbrs_users_wanted(2);


            g7.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
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

        u1.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        u1.setEmail("c'est de la merde");
        u1.setMobileNumber("je suisd ans la joie");
        u1.setPassword("Chris");
        u2.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        u2.setEmail("c'est de la merde");
        u2.setMobileNumber("je suisd ans la joie");
        u2.setPassword("Christian");
        u3.setCreatedAt(Timestamp.valueOf(String.valueOf(LocalDate.now())));
        u3.setEmail("c'est de la merde");
        u3.setMobileNumber("je suisd ans la joie");
        u3.setPassword("Christ");

        users.add(u1);
        users.add(u2);
        users.add(u3);


        return users;

    }

}
