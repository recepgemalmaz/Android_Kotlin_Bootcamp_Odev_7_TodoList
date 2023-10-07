package com.recepgemalmaz.odev_7_todolist.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.recepgemalmaz.odev_7_todolist.data.repo.IslerDaoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetayFragmentViewModel @Inject constructor(var irepo: IslerDaoRepository) : ViewModel() {

    fun guncelle(yapilacak_id:Int, yapilacak_is:String){
       irepo.isGuncelle(yapilacak_id,yapilacak_is)
    }
}