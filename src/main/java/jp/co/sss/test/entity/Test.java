package jp.co.sss.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_id")
    // @SequenceGenerator(name = "seq_id", sequenceName = "seq_id", allocationSize = 1)
    private Integer id;
    @Column
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
