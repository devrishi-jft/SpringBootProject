package com.jft.rams.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Field {
    @Id
    private int fId;
    private String fType;
    private String fName;
    @ManyToOne()
    private Record record;
}
