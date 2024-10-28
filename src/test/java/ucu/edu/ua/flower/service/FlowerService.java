package ucu.edu.ua.flower.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.edu.ua.flower.model.Flower;
import ucu.edu.ua.flower.repository.FlowerRepository;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower createFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}