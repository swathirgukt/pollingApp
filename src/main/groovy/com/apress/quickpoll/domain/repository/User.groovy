package com.apress.quickpoll.domain.repository

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "USER")
class User {
    @Id
    Integer id
    @Column
    String name
    @Column
    String country
    @Column
    int age
    @Column
    String gender
}
