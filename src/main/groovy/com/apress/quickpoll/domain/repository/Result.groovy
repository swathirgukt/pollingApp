package com.apress.quickpoll.domain.repository

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "RESULT")
class Result {
    @Id
    Integer id
    @Column
    Integer count
}
