package com.shiqi.dao;

import com.shiqi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-08-20-21:40
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
