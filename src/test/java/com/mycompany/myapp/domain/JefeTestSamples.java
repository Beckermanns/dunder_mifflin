package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class JefeTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Jefe getJefeSample1() {
        return new Jefe().id(1L).nombreJefe("nombreJefe1").apellidoJefe("apellidoJefe1").telefonoJefe(1).correoJefe("correoJefe1");
    }

    public static Jefe getJefeSample2() {
        return new Jefe().id(2L).nombreJefe("nombreJefe2").apellidoJefe("apellidoJefe2").telefonoJefe(2).correoJefe("correoJefe2");
    }

    public static Jefe getJefeRandomSampleGenerator() {
        return new Jefe()
            .id(longCount.incrementAndGet())
            .nombreJefe(UUID.randomUUID().toString())
            .apellidoJefe(UUID.randomUUID().toString())
            .telefonoJefe(intCount.incrementAndGet())
            .correoJefe(UUID.randomUUID().toString());
    }
}
