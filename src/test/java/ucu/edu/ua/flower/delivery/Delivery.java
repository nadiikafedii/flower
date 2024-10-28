package ucu.edu.ua.flower.delivery;

import java.util.List;
import ucu.edu.ua.flower.model.Item;

public interface Delivery {
    boolean deliver(List<Item> items);
}

