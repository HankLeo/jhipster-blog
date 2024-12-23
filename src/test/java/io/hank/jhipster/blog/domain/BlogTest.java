package io.hank.jhipster.blog.domain;

import static io.hank.jhipster.blog.domain.BlogTestSamples.getBlogSample1;
import static io.hank.jhipster.blog.domain.BlogTestSamples.getBlogSample2;
import static org.assertj.core.api.Assertions.assertThat;

import io.hank.jhipster.blog.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class BlogTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Blog.class);
        Blog blog1 = getBlogSample1();
        Blog blog2 = new Blog();
        assertThat(blog1).isNotEqualTo(blog2);

        blog2.setId(blog1.getId());
        assertThat(blog1).isEqualTo(blog2);

        blog2 = getBlogSample2();
        assertThat(blog1).isNotEqualTo(blog2);
    }
}
