package ucu.edu.ua.flower.delivery;

import java.util.List;
import ucu.edu.ua.flower.model.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivering items by Post.");
        return true;
    }
}

