package cn.tz.www.customer.entity.repository.authority;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import cn.tz.www.customer.entity.repository.HibernateRepositoryImpl;
import cn.tz.www.customer.entity.table.Authority;
import cn.tz.www.customer.entity.table.User;
import cn.tz.www.customer.entity.tools.Groups;
import cn.tz.www.customer.entity.tools.Page;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by zzc on 11/11/2016.
 */

public class AuthorityRepositoryImpl extends HibernateRepositoryImpl<Authority> implements AuthorityRepositoryCustom {


  @PersistenceContext
  private EntityManager entityManager;

 


}