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
public class Info {
    @Id
    private Long info_id;

    private String info_text;

    private Long user_sendid;

    private Long user_rpid;

    private Date info_date;

}