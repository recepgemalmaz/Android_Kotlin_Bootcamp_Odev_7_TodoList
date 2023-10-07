package com.recepgemalmaz.odev_7_todolist.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.recepgemalmaz.odev_7_todolist.data.repo.IslerDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class KayitFragmentViewModel @Inject constructor(var irepo: IslerDaoRepository) : ViewModel() {

    fun kayit(yapilacak_is_ad:String){
        irepo.isKayit(yapilacak_is_ad)
    }
}