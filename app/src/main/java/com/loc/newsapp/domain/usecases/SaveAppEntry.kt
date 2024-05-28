package com.loc.newsapp.domain.usecases

import com.loc.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManagerImpl: LocalUserManager
) {
    suspend operator fun invoke(){
        localUserManagerImpl.saveAppEntry()
    }
}