package com.rhss.rhssp01.Model.entiey.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rhss.rhssp01.Model.entiey.domain.Article;
import com.rhss.rhssp01.Model.entiey.mapper.ArticleMapper;
import com.rhss.rhssp01.Model.entiey.service.ArticleService;
import org.springframework.stereotype.Service;

/**
* @author Rhss
* @description 针对表【article(文章表)】的数据库操作Service实现
* @createDate 2024-05-09 23:00:51
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{
}




