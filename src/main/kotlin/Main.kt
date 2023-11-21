fun main (){
    var f:Fibre = Fibre(arrayListOf<Nucleotide>(Nucleotide.Thymine,Nucleotide.Guanine,Nucleotide.Cytosine,Nucleotide.Adenine,Nucleotide.Thymine))
    var f1:Fibre = Fibre(arrayListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Cytosine,Nucleotide.Guanine,Nucleotide.Thymine,Nucleotide.Adenine))
    var f2:Fibre = Fibre(arrayListOf<Nucleotide>(Nucleotide.Adenine,Nucleotide.Cytosine,Nucleotide.Guanine,Nucleotide.Thymine,Nucleotide.Adenine))
    println(f.nucleotable)
    println(f1.nucleotable)
    println(f2.nucleotable)
  // println(f.dupliquerFibre().nucleotable)

    println(f.comparerFibre(f1))
    println(f1.comparerSimple(f2))
    println(f1.hamming(f2))
    println(f.hamming(f1))
    println(f1.hammingSimple(f2))
    println(f.hammingSimple(f1))

}