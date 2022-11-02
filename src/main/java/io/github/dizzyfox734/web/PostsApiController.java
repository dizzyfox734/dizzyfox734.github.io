package io.github.dizzyfox734.web;

import io.github.dizzyfox734.service.PostsService;
import io.github.dizzyfox734.web.dto.PostsSaveRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsApiController {
    private PostsService postsService;

    @Autowired
    public PostsApiController(PostsService postService) {
        this.postsService = postService;
    }

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }
}
