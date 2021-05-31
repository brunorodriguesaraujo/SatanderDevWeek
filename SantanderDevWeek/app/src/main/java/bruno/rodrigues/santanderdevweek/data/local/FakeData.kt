package bruno.rodrigues.santanderdevweek.data.local

import bruno.rodrigues.santanderdevweek.data.Cartao
import bruno.rodrigues.santanderdevweek.data.Cliente
import bruno.rodrigues.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta{
        val cliente = Cliente("Bruno")
        val cartao = Cartao("3233")
        return Conta(
                "1234567-8",
                "1020",
                "1.000.000,00",
                "10.456.123,00",
                cliente,
                cartao);
    }



}