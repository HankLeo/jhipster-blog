package io.hank.jhipster.blog.domain;

import static io.hank.jhipster.blog.domain.AuthorityTestSamples.getAuthoritySample1;
import static io.hank.jhipster.blog.domain.AuthorityTestSamples.getAuthoritySample2;
import static org.assertj.core.api.Assertions.assertThat;

import io.hank.jhipster.blog.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class AuthorityTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Authority.class);
        Authority authority1 = getAuthoritySample1();
        Authority authority2 = new Authority();
        assertThat(authority1).isNotEqualTo(authority2);

        authority2.setName(authority1.getName());
        assertThat(authority1).isEqualTo(authority2);

        authority2 = getAuthoritySample2();
        assertThat(authority1).isNotEqualTo(authority2);
    }

    @Test
    void hashCodeVerifier() {
        Authority authority = new Authority();
        assertThat(authority.hashCode()).isZero();

        Authority authority1 = getAuthoritySample1();
        authority.setName(authority1.getName());
        assertThat(authority).hasSameHashCodeAs(authority1);
    }
}
