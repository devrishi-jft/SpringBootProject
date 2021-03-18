package com.jft.rams.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Record {
    @Id
    private int rId;
    @OneToMany
    private List<Field> field;

}
