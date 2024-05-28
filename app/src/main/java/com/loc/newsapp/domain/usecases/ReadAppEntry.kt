package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow


class ReadAppEntry (
    private val localUserManagerImpl: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManagerImpl.readAppEntry()
    }
}