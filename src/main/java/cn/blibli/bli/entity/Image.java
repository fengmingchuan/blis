package cn.blibli.bli.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Image {
    private Long image_id;

    private Long message_id;

    private String images;

}