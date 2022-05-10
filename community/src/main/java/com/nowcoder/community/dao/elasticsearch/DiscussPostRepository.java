package com.nowcoder.community.dao.elasticsearch;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yzw
 * @version 1.0
 */

@Repository // 数据访问注解
public interface DiscussPostRepository extends ElasticsearchRepository<DiscussPost, Integer> {


}
