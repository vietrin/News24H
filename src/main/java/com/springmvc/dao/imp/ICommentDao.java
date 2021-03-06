package com.springmvc.dao.imp;

import java.util.List;

import com.springmvc.model.Comment;
/**
 * @author rinnv
 *
 */
public interface ICommentDao {
	public List<Comment> getAll(int id);
	public int create(Comment comment);
	public int countComment(int id);
}
