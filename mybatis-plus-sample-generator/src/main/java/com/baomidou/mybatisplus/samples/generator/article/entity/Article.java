package com.baomidou.mybatisplus.samples.generator.article.entity;

import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 发布号作者表
 * </p>
 *
 * @author jobob
 * @since 2019-12-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Article extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否有效  1.有效  2无效
     */
    private String deleteStatus;


}
