package cn.blibli.bli.dao;

import cn.blibli.bli.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserDao extends JpaRepository<User,Long> {
}
