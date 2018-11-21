package com.apress.quickpoll.domain.repository

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "POLL")
class Poll {
    @Id
    Integer id
    @Column
    String question

    @OneToMany
    List<Option> options
}
