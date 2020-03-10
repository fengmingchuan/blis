package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    private Long user_id;

    private String user_name;

    private Integer user_grade;

    private String user_pwd;

    private Date user_date;

    private String user_image;

    private Integer user_integral;

    private String user_describe;

    private String user_code;


}