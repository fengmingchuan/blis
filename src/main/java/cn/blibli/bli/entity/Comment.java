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
public class Comment {
    @Id
    private Long comment_id;

    private String comment_text;

    private Long message_id;

    private Long user_id;


}