package io.github.dizzyfox734.web;

import io.github.dizzyfox734.service.PostsService;
import io.github.dizzyfox734.web.dto.PostsResponseDto;
import io.github.dizzyfox734.web.dto.PostsSaveRequestDto;
import io.github.dizzyfox734.web.dto.PostsUpdateRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
