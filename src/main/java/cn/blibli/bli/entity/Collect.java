package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Collect {
    private Long collect_id;

    private Long message_id;

    private Long user_id;

    private Date collect_date;

}