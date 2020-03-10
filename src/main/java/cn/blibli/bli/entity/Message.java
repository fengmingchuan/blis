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
public class Message {
    @Id
    private Long message_id;

    private Long user_id;

    private String message_title;

    private Date message_date;

    private Integer message_type;

    private Integer message_like;

    private Integer message_look;

    private Integer message_transmit;

    private Integer message_collectCount;

    private String message_text;

}