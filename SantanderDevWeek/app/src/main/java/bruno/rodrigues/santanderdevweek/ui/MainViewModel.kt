package bruno.rodrigues.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import bruno.rodrigues.santanderdevweek.data.Conta
import bruno.rodrigues.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel(){

    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData()

    fun buscarContaCliente(): LiveData<Conta> {
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }
}