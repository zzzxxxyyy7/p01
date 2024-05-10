package com.rhss.rhssp01.Controller;

import com.rhss.rhssp01.Model.dto.ArticleSaveDto;
import com.rhss.rhssp01.Model.entiey.domain.Article;
import com.rhss.rhssp01.Services.ArticleControllerService;
import com.rhss.rhssp01.Utils.RestResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
@Tag(name = "文章管理接口" , description = "文章的增删改查")
public class ArticleController {
    @Resource
    private ArticleControllerService articleControllerService;

    @GetMapping("/list")
    @Operation(summary = "展示所有文章列表")
    public RestResponse<List<Article>> getlist() {
        return articleControllerService.getList();
    }

    @PostMapping("/save")
    @Operation(summary = "保存文章")
    public void save(ArticleSaveDto articleSaveDto) {
        articleControllerService.save(articleSaveDto);
    }

    @PostMapping("/delete")
    @Operation(summary = "删除文章")
    public void delete(@RequestParam Integer id) {
        articleControllerService.delete(id);
    }
}