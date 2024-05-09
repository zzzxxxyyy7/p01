package com.rhss.rhssp01.Services;

import com.rhss.rhssp01.Model.dto.ArticleSaveDto;
import com.rhss.rhssp01.Model.entiey.domain.Article;
import com.rhss.rhssp01.Model.entiey.service.ArticleService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleControllerService {

    @Resource
    private ArticleService articleService;

    /**
     * 展示所有文章列表
     * @return
     */
    public List<Article> getList() {
        return articleService.list();
    }

    /**
     * 更新和保存文章
     * @param articleSaveDto
     */
    public void save(ArticleSaveDto articleSaveDto) {
        Integer articleId = articleSaveDto.getId();

        // 判断是 新增 还是 更新
        if (articleId == null) {
            Article article = new Article();
            article.setTitle(articleSaveDto.getTitle());
            article.setContent(articleSaveDto.getContent());
            article.setAuthor(articleSaveDto.getAuthor());
            article.setCreate_time(LocalDateTime.now());
            article.setUpdate_time(LocalDateTime.now());
            articleService.save(article);
        } else {
            Article article = articleService.getById(articleId);
            article.setTitle(articleSaveDto.getTitle());
            article.setContent(articleSaveDto.getContent());
            article.setAuthor(articleSaveDto.getAuthor());
            article.setUpdate_time(LocalDateTime.now());
        }
    }

    /**
     * 删除这篇文章
     * @param id
     */
    public void delete(Integer id) {
        articleService.getById(id).setIs_deleted(0);
    }
}
