package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment {
    private Long comment_id;

    private String comment_text;

    private Long message_id;

    private Long user_id;


}