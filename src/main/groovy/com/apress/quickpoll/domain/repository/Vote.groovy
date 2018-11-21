package com.apress.quickpoll.domain.repository

import javax.persistence.*

@Entity
@Table(name="VOTE")
class Vote {
    @Id
    Integer id
    @OneToOne
    Option option
}
