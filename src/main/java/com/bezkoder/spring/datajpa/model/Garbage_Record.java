package com.bezkoder.spring.datajpa.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Garbage_Record")
public class Garbage_Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "garbage_type")
    private Garbage_type garbage_type;

    @Column(name="weight")
    private double weight;

    @ManyToOne
    @JoinColumn(name = "user")
    private  User user;


    @Column(name="time")
    @Temporal(TemporalType.TIME)
    private Date time;


    @ManyToOne
    @JoinColumn(name = "machine_id")
    private  Machine machine_id;

    public Garbage_Record(Garbage_type garbage_type,double weight,User user,Date time,Machine machine_id){
          this.garbage_type=garbage_type;
          this.weight=weight;
          this.user=user;
          this.time=time;
          this.machine_id=machine_id;
    }

}
