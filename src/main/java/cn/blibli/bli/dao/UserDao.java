package cn.blibli.bli.dao;

import cn.blibli.bli.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserDao   {
    /*\
    * @autn fmc
    * @Data 2020.7.27
    * */
    void  getinfo();//查询用户信息

}
