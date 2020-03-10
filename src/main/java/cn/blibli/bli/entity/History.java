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
public class History {
    @Id
    private Long history_id;

    private Date history_date;

    private Long user_id;

    private Long message_id;


}