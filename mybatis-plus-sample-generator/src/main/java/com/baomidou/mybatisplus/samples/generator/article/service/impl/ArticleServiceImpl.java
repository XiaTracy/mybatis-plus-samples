package com.baomidou.mybatisplus.samples.generator.article.service.impl;

import com.baomidou.mybatisplus.samples.generator.article.entity.Article;
import com.baomidou.mybatisplus.samples.generator.article.mapper.ArticleMapper;
import com.baomidou.mybatisplus.samples.generator.article.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发布号作者表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-12-27
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
