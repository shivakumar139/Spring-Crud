package com.crud.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID studentId;

    private String studentName;
    private String studentEmail;
    private String studentNumber;
}
