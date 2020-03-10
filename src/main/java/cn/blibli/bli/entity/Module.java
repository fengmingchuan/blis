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

public class Module {
    @Id
    private Long module_id;

    private String module_type;



}