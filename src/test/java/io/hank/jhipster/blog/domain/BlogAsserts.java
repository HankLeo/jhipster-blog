package io.hank.jhipster.blog.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class BlogAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBlogAllPropertiesEquals(Blog expected, Blog actual) {
        assertBlogAutoGeneratedPropertiesEquals(expected, actual);
        assertBlogAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBlogAllUpdatablePropertiesEquals(Blog expected, Blog actual) {
        assertBlogUpdatableFieldsEquals(expected, actual);
        assertBlogUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBlogAutoGeneratedPropertiesEquals(Blog expected, Blog actual) {
        assertThat(expected)
            .as("Verify Blog auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBlogUpdatableFieldsEquals(Blog expected, Blog actual) {
        assertThat(expected)
            .as("Verify Blog relevant properties")
            .satisfies(e -> assertThat(e.getName()).as("check name").isEqualTo(actual.getName()))
            .satisfies(e -> assertThat(e.getHandle()).as("check handle").isEqualTo(actual.getHandle()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBlogUpdatableRelationshipsEquals(Blog expected, Blog actual) {
        // empty method
    }
}
