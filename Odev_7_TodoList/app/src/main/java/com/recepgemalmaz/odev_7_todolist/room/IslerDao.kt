package com.recepgemalmaz.odev_7_todolist.room

import androidx.room.*
import com.recepgemalmaz.odev_7_todolist.data.entity.Isler

@Dao
interface IslerDao {
    @Query("SELECT * FROM yapilacaklar")
    suspend fun tumIsler() : List<Isler>

    @Insert
    suspend fun isEkle(isler:Isler)

    @Update
    suspend fun isGuncelle(isler:Isler)

    @Delete
    suspend fun isSil(isler:Isler)

    @Query("SELECT * FROM yapilacaklar WHERE yapilacak_is like '%' || :aramaKelimesi || '%' ")
    suspend fun isArama(aramaKelimesi:String) : List<Isler>
}