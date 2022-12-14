package io.github.dizzyfox734.springboot.web;

import io.github.dizzyfox734.springboot.service.PostsService;
import io.github.dizzyfox734.springboot.web.dto.PostsUpdateRequestDto;
import io.github.dizzyfox734.springboot.web.dto.PostsResponseDto;
import io.github.dizzyfox734.springboot.web.dto.PostsSaveRequestDto;
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
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
