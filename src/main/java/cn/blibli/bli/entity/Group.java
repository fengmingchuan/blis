package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Group {
    private Long group_id;

    private String group_name;

    private Long user_id;

    private Long ma_id;

}