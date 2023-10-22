package com.ssafy.springserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Broadcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "broadcast_id", nullable = false)
    private Long id;

    @Column(length = 20)
    private String name;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
    private Timestamp broadcastTime;

    @Column(columnDefinition = "default 0")
    private Integer count;

    @Column(columnDefinition = "default 0")
    private Integer like;

    @ManyToOne
    @JoinColumn(name = "child_id")
    private Child child;

    @PrePersist
    private void prePersist() {
        this.count = 0;
        this.like = 0;
    }
}