package com.lnicolet.domain.repositories

import com.lnicolet.domain.models.UserDomainModel
import io.reactivex.Single

interface UsersRepository {
    fun getUsers(): Single<List<UserDomainModel>>
    fun getUsersById(userId: Int): Single<UserDomainModel>
}