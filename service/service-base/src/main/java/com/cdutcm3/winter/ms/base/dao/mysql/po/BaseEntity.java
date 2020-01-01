package com.cdutcm3.winter.ms.base.dao.mysql.po;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * *****************************************************
 *
 * @ClassName BaseEntity
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:59
 * @Version 1.0
 * *****************************************************
 **/
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    private Long id;

    private Timestamp createTimestamp = new Timestamp(System.currentTimeMillis());

    @UpdateTimestamp
    private Timestamp updateTimestamp;

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o.getClass() == getClass())) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "#" + this.getId();
    }
}
