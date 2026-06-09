package com.jannabitte.productmanager;

import com.jannabitte.productmanager.model.Producto;
import com.jannabitte.productmanager.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    public DataLoader(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        if (productoRepository.count() == 0) {
            productoRepository.save(new Producto(null,
                    "Shampoo dermatológico",
                    "Producto de higiene para animales con problemas dermatológicos o piel sensible.",
                    12990.0));

            productoRepository.save(new Producto(null,
                    "Antiparasitario externo",
                    "Producto orientado al control de pulgas y garrapatas en perros y gatos.",
                    15990.0));

            productoRepository.save(new Producto(null,
                    "Alimento renal para gato",
                    "Alimento de apoyo nutricional para pacientes felinos con necesidades renales especiales.",
                    24990.0));

            productoRepository.save(new Producto(null,
                    "Suplemento articular",
                    "Producto de apoyo para perros senior o pacientes con movilidad reducida.",
                    18990.0));

            productoRepository.save(new Producto(null,
                    "Jaula de transporte",
                    "Accesorio utilizado para el traslado seguro de animales menores.",
                    29990.0));
        }
    }
}