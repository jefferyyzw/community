package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yzw
 * @version 1.0
 */
@Mapper
@Repository
public interface CommentMapper {
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit) ;

    int selectCountByEntity(int entityType, int entityId);

    int insertComment(Comment comment);
}
