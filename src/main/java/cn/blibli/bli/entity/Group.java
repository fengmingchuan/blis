package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Group {
    @Id
    private Long group_id;

    private String group_name;

    private Long user_id;

    private Long ma_id;

}