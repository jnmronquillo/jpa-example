package com.rhemsolutions.util;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Util {
	
	public <T> T getSingleResult(TypedQuery<T> q) {
	    q.setMaxResults(1);
	    List<T> list = q.getResultList();
	    if (list == null || list.size() == 0) {
	        return null;
	    }
	    return list.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getSingleResult(Query q) {
		q.setMaxResults(1);
		List<T> list = q.getResultList();
		if (list == null || list.size() == 0) {
			return null;
		}
		return list.get(0);
	}
}
