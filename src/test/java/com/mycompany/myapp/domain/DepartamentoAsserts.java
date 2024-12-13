package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class DepartamentoAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDepartamentoAllPropertiesEquals(Departamento expected, Departamento actual) {
        assertDepartamentoAutoGeneratedPropertiesEquals(expected, actual);
        assertDepartamentoAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDepartamentoAllUpdatablePropertiesEquals(Departamento expected, Departamento actual) {
        assertDepartamentoUpdatableFieldsEquals(expected, actual);
        assertDepartamentoUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDepartamentoAutoGeneratedPropertiesEquals(Departamento expected, Departamento actual) {
        assertThat(expected)
            .as("Verify Departamento auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDepartamentoUpdatableFieldsEquals(Departamento expected, Departamento actual) {
        assertThat(expected)
            .as("Verify Departamento relevant properties")
            .satisfies(e -> assertThat(e.getNombreDepartamento()).as("check nombreDepartamento").isEqualTo(actual.getNombreDepartamento()))
            .satisfies(e ->
                assertThat(e.getUbicacionDepartamento()).as("check ubicacionDepartamento").isEqualTo(actual.getUbicacionDepartamento())
            )
            .satisfies(e ->
                assertThat(e.getPresupuestoDepartamento())
                    .as("check presupuestoDepartamento")
                    .isEqualTo(actual.getPresupuestoDepartamento())
            );
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertDepartamentoUpdatableRelationshipsEquals(Departamento expected, Departamento actual) {
        assertThat(expected)
            .as("Verify Departamento relationships")
            .satisfies(e -> assertThat(e.getJefe()).as("check jefe").isEqualTo(actual.getJefe()));
    }
}
