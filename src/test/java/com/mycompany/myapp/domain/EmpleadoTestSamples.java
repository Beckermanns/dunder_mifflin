package com.mycompany.myapp.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class EmpleadoTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Empleado getEmpleadoSample1() {
        return new Empleado().id(1L).nombreEmpleado("nombreEmpleado1").apellidoEmpleado("apellidoEmpleado1").telefono(1).correo("correo1");
    }

    public static Empleado getEmpleadoSample2() {
        return new Empleado().id(2L).nombreEmpleado("nombreEmpleado2").apellidoEmpleado("apellidoEmpleado2").telefono(2).correo("correo2");
    }

    public static Empleado getEmpleadoRandomSampleGenerator() {
        return new Empleado()
            .id(longCount.incrementAndGet())
            .nombreEmpleado(UUID.randomUUID().toString())
            .apellidoEmpleado(UUID.randomUUID().toString())
            .telefono(intCount.incrementAndGet())
            .correo(UUID.randomUUID().toString());
    }
}
