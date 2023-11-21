enum class Nucleotide(val value: String) {
     Adenine("A"){
         override fun complement(): Nucleotide {
             return Nucleotide.Thymine
         };
         override fun toString(): String {
             return Nucleotide.Adenine.value
         }
     },
    Cytosine("C"){
        override fun complement(): Nucleotide {
            return Nucleotide.Guanine
        };
        override fun toString(): String {
            return Nucleotide.Cytosine.value
        }
    },
    Guanine("G"){
        override fun complement(): Nucleotide {
            return Nucleotide.Cytosine
        };
        override fun toString(): String {
            return Nucleotide.Guanine.value
        }
    },
    Thymine("T"){
        override fun complement(): Nucleotide {
            return Nucleotide.Adenine
        };
        override fun toString(): String {
            return Nucleotide.Thymine.value
        }
    };

    abstract fun complement():Nucleotide
}
