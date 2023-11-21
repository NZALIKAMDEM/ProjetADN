open  class Compte (Num :Int,Solde:Int ,Plancher:Int ) {

    var Num :Int = Num
    var Solde :Int=Solde
    var Plancher:Int  = Plancher

    fun Consulter():Int {
        return this.Solde
    }
    fun crediterCompte(entreeMontant : Int):Unit{
        this.Solde +=entreeMontant
    }

    fun debiterCompter(entreeMontant: Int):Boolean{
        if (this.Solde-this.Plancher >=entreeMontant) {
            this.Solde -= entreeMontant
            return true
        }
        else {
            return false
        }
    }

}