package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.DepartamentoTestSamples.*;
import static com.mycompany.myapp.domain.EmpleadoTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Empleado.class);
        Empleado empleado1 = getEmpleadoSample1();
        Empleado empleado2 = new Empleado();
        assertThat(empleado1).isNotEqualTo(empleado2);

        empleado2.setId(empleado1.getId());
        assertThat(empleado1).isEqualTo(empleado2);

        empleado2 = getEmpleadoSample2();
        assertThat(empleado1).isNotEqualTo(empleado2);
    }

    @Test
    void departamentoTest() {
        Empleado empleado = getEmpleadoRandomSampleGenerator();
        Departamento departamentoBack = getDepartamentoRandomSampleGenerator();

        empleado.setDepartamento(departamentoBack);
        assertThat(empleado.getDepartamento()).isEqualTo(departamentoBack);

        empleado.departamento(null);
        assertThat(empleado.getDepartamento()).isNull();
    }
}
