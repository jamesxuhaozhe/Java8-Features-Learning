import spi.learn.example.CrazyService;

import java.util.ServiceLoader;

public class SpiDemo {
    public static void main(String[] args) {
        ServiceLoader<CrazyService> serviceLoaders = ServiceLoader.load(CrazyService.class);
        for (CrazyService crazyService : serviceLoaders) {
            crazyService.getCrazy();
        }
    }
}
