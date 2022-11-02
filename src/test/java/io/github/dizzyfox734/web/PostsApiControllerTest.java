package io.github.dizzyfox734.web;

import io.github.dizzyfox734.domain.posts.Posts;
import io.github.dizzyfox734.domain.posts.PostsRepository;
import io.github.dizzyfox734.web.dto.PostsSaveRequestDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PostsApiControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private PostsRepository postsRepository;

    @AfterEach
    public void tearDown() {
        postsRepository.deleteAll();
    }

    @Test
    void register_posts() throws Exception {
        // given
        String title = "title";
        String content = "content";
        String author = "author";
        PostsSaveRequestDto requestDto = new PostsSaveRequestDto.Builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
        String url = "http://localhost:" + port + "/api/v1/posts";

        // when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, requestDto, Long.class);

        // then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isGreaterThan(0L);

        List<Posts> postsList = postsRepository.findAll();
        assertThat(postsList.get(0).getTitle()).isEqualTo(title);
        assertThat(postsList.get(0).getContent()).isEqualTo(content);
        assertThat(postsList.get(0).getAuthor()).isEqualTo(author);
    }
}