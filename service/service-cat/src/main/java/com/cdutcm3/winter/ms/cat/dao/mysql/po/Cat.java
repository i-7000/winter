package com.cdutcm3.winter.ms.cat.dao.mysql.po;

import com.cdutcm3.winter.model.base.enums.GenderEnum;
import com.cdutcm3.winter.ms.base.dao.mysql.po.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * *****************************************************
 *
 * @ClassName Cat
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:56
 * @Version 1.0
 * *****************************************************
 **/
@Entity
@Table(name = "winter_cat")
@Setter
@Getter
public class Cat extends BaseEntity {


    @Column(columnDefinition = "varchar(32) comment '名称'")
    private String name;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Column(columnDefinition = "int comment '年龄'")
    private Integer age;
}
