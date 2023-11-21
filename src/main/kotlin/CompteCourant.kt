class CompteCourant(Num :Int,Solde:Int ,Plancher:Int,tauxAgios:Int,nbjour:Int):Compte(Num ,Solde ,Plancher) {
    var tauxAgios : Int = tauxAgios
    var nbjour : Int = nbjour

    fun calculAgios():Double{
        val x:Double =2.0
        return x
    }
}