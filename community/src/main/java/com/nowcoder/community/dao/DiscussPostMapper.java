package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yzw
 * @version 1.0
 */
@Mapper
@Repository
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts( int userId, int offset,  int limit);
//    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset,  @Param("limit") int limit);
//    用于给参数取别名，如果只有一个参数，并且在<if>中使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
