package cl.onevet.onevetapi;

import cl.onevet.onevetapi.model.Producto;
import cl.onevet.onevetapi.repository.ProductoRepository;
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
            productoRepository.save(new Producto(
                    null,
                    "Shampoo dermatológico",
                    "Producto veterinario para cuidado de piel sensible",
                    8990.0,
                    15
            ));

            productoRepository.save(new Producto(
                    null,
                    "Alimento clínico renal",
                    "Alimento veterinario formulado para apoyo nutricional renal",
                    28990.0,
                    8
            ));

            productoRepository.save(new Producto(
                    null,
                    "Suplemento articular",
                    "Apoyo nutricional para movilidad y articulaciones",
                    15990.0,
                    12
            ));
        }
    }
}