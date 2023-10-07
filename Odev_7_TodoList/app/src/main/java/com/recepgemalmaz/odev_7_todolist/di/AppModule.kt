package com.recepgemalmaz.odev_7_todolist.di

import android.content.Context
import androidx.room.Room
import com.recepgemalmaz.odev_7_todolist.data.repo.IslerDaoRepository
import com.recepgemalmaz.odev_7_todolist.room.IslerDao
import com.recepgemalmaz.odev_7_todolist.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideIslerDaoRepository(idao: IslerDao) : IslerDaoRepository {
        return IslerDaoRepository(idao)
    }

    @Provides
    @Singleton
    fun provideIslerDao(@ApplicationContext context : Context) : IslerDao {
        val vt = Room.databaseBuilder(context, Veritabani::class.java,"yapilacaklar.sqlite").createFromAsset("yapilacaklar.sqlite").build()
        return vt.getIslerDao()
    }

}