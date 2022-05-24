package com.bezkoder.spring.datajpa.model;

import lombok.Getter;
import lombok.Setter;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Garbage_recordDTO {
    private  long garbage_type;
    private  double weight;
    private  long user;
    private  long machine_id;

}