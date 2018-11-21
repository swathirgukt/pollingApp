package com.apress.quickpoll.domain.repository

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "OPTION")
class Option {
    @Id
    Integer id
    @Column
    String val
    @ManyToOne
    Poll poll
}
