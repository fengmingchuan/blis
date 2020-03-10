package cn.blibli.bli.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Attention  {
    private Long attention_id;

    private Long user_oneselfid;

    private Long user_othersid;



}