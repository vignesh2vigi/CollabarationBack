package com.niit.collabarate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.collabarate.model.BlogComment;
import com.niit.collabarate.model.BlogPost;
import com.niit.collabarate.dao.BlogPostDao;
@Repository
@Transactional
public class BlogPostDaoImpl implements BlogPostDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addBlogPost(BlogPost blogPost) {
		// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			//System.out.println("Blog post created"+ blogPost.getBlogTitle());

			session.save(blogPost);
			System.out.println("Blog post created"+ blogPost.getBlogTitle());
			
	}

	
	
		public List<BlogPost> getBlogs(int approved) {
			Session session = sessionFactory.getCurrentSession();
			String queryStr="";
			if(approved==1)
				queryStr="from BlogPost where approved="+approved;
			else
				queryStr="from BlogPost where rejectionReason is null and approved="+approved;
			Query query=session.createQuery(queryStr);
			return query.list();
	}



		
		public BlogPost geBlogById(int id) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			BlogPost blogPost=(BlogPost)session.get(BlogPost.class, id);
			return blogPost;
		}



	
		public void updateBlogPost(BlogPost blogPost) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			session.update(blogPost);
			
		}



		
		public void addBlogComment(BlogComment blogComment) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			session.save(blogComment);
			
		}



		public List<BlogComment> getBlogComments(int blogPostId) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			Query query=session.createQuery("from BlogComment where blogPost.id="+blogPostId);
			return query.list();
		}

}