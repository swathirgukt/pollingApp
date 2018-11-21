package com.apress.quickpoll.domain.repository

import javax.persistence.Column
import javax.persistence.OneToMany
import javax.persistence.Table

@Table(name = "COMPUTE_RESULT")
class ComputeResult {
    @Column
    Integer totalVotes
    @OneToMany
    List<Result> results
}
