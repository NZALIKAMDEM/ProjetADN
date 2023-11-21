class Fibre <T> (var nucleotable:MutableList<T>) {

    constructor():this(arrayListOf<T>())

    fun emptyFibre(f1:Fibre<T>):Boolean{
        return nucleotable.isEmpty()
    }

    fun dupliquerFibre (): Fibre<T> {
       val f:Fibre<T> = Fibre()
        for (nucl in nucleotable){
            f.nucleotable.add(nucl.complement())
        }
        return f
    }

    fun comparerFibre (f1:Fibre<T>):Boolean{
        if (this.nucleotable.size==f1.nucleotable.size){
          for(i in 0 until  nucleotable.size){
              if(this.nucleotable[i]!=f1.nucleotable[i].complement()){
                  return false
              }

          }
            return true
        }
        return false
    }

    fun comparerSimple(f1: Fibre<T>):Boolean{
    return this.nucleotable.equals(f1.dupliquerFibre().nucleotable)
    }

    fun hamming (f1: Fibre<T>):Int{
        var result:Int= 0
        try {
            if (this.nucleotable.size!=f1.nucleotable.size){
                throw Exception()
                println(1)
            }
            else{
                for (i in 0 until this.nucleotable.size) {
                    if(this.nucleotable[i]!=f1.nucleotable[i])
                        result++
                }
            }
        }catch (e:Exception){
           println("taille")
        }
      return result
    }
    fun hammingSimple(f:Fibre<T>):Int{
        var result:Int = 0
        for (i in 0 until this.nucleotable.size) {
            if(this.nucleotable[i]!=f.nucleotable[i])
                result++
        }
        return result
    }

    /*
    fun duplicateFibre():Fibre{
        var result:Fibre=Fibre(mutableListOf())
        for(Fibre in this.nucleotable){
            result.nucleotable.add(complement(Fibre))
        }
        return result
    }

    fun complement(n:Nucleotide):Nucleotide{
        return  when(n){
            Nucleotide.Adenine->Nucleotide.Thymine
            Nucleotide.Thymine->Nucleotide.Adenine
            Nucleotide.Cytosine->Nucleotide.Guanine
            Nucleotide.Guanine->Nucleotide.Cytosine
        }
    }


    fun compareFibre(F1:Fibre):Boolean{
        if (this.nucleotable.size !== F1.nucleotable.size){
            return false
        }
        else{
            for (i in 0 until this.nucleotable.size){
                if (this.nucleotable[i]!=F1.nucleotable[i])
                    return false
            }
        }
        return true
    }
    fun hammingSimple(f:Fibre):Int{
       var result:Int = 0
       for (i in 0 until this.nucleotable.size) {
           if(this.nucleotable[i]!=f.nucleotable[i])
               result++
       }
        return result
    }*/
}