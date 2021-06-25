package com.delivery.main;

import com.delivery.api.dao.ClientDao;
import com.delivery.api.dao.MarketDao;
import com.delivery.api.dao.ProductDao;
import com.delivery.domain.Client;
import com.delivery.domain.Market;
import com.delivery.domain.Order;
import com.delivery.domain.Product;


import java.util.ArrayList;
import java.util.List;

import static com.delivery.domain.enums.Category.*;
import static com.delivery.domain.enums.Measure.*;
import static com.delivery.domain.enums.Size.*;

public class Main {

    public static void main(String[] args) {

        final ProductDao productDao;                        // for loose coupling use DAO interface
        final MarketDao marketDao;
        final ClientDao clientDao;

        //create clients list
        List<Client> clients = new ArrayList<Client>();

        clients.add(new Client(1L, "Ivan", "Polovinkin", "Grodno, ul.Sovetskaya 1", "client1@mail.com", 33665589, null));
        clients.add(new Client(6L, "Sasha", "Pushkin", "London, ul. Festivalnaya 90", "client3@ya.ru", 523265, null));
        clients.add(new Client(2L, "Petr", "Yashin", "Minsk, ul.Popedy 31", "client2@tut.by", 945812324, null));
        System.out.println("******** Clients ******************************************************************* ");
        clients.forEach(System.out::println);


        //create products list
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(3L, "Green Apple", 5, KILOGRAM, FRUITS, 30, null));
        products.add(new Product(4L, "Red Orange", 10, KILOGRAM, FRUITS, 45, null));
        products.add(new Product(5L, "Sprite", 10, LITER, DRINKS, 15, null));

        System.out.println("******* Products ******************************************************************* ");
        products.forEach(System.out::println);

        //create markets list
        List<Market> markets = new ArrayList<Market>();

        markets.add(new Market(7L, "Green", "marketGreen@mail.ru", "Grodno, ul.Tut 2", HYPER, null, null));
        markets.add(new Market(8L, "Corona", "Corona@mail.ru", "Grodno, ul.Tam 9", SUPER, null, null));

        System.out.println("******* Markets ******************************************************************* ");
        markets.forEach(System.out::println);


    }

    public class OrderFacade {
        private Client client = new Client();
        private Market market = new Market();
        private Order order = new Order();
        private Product product = new Product();

        public void startOrder(){

        }
    }
}
