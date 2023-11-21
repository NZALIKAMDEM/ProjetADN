class Rationnal (num:Int , den:Int){

    var num :Int =num
    var den :Int  = den
    constructor(num: Int):this(num,1)

    fun normaliser():Unit{
      val pgcdValue:Int = pgcd(this.num,this.den)
         this.num =this.num/pgcdValue
        this.den=this.den/pgcdValue
    }
    fun pgcd(a:Int,b:Int):Int{
        var result = 0 ;
        if (a==0){
            result=b
        }else if (b==0){
            result = a;
        }else if (a>b) {
            result = pgcd(a - b, b)
        } else {
            result= pgcd(b-a,a)
        }
        return result
    }
    fun add (r:Rationnal):Rationnal{
        return Rationnal(this.num*r.den+this.den+r.num,this.den*r.den);
    }
    fun sub (r:Rationnal):Rationnal{
        return Rationnal(this.num*r.den-this.den+r.num,this.den*r.den);
    }
    fun mult (r: Rationnal):Rationnal{
        var result = Rationnal(this.num*r.num, this.den*r.den);
        result.normaliser()
        return  result
    }
    fun div (r: Rationnal):Rationnal{
        return this.mult(r);
    }

    override fun toString(): String {
        return "$num"+"/"+"$den"
    }

    companion object {
        fun fleche (tab:MutableList<Rationnal>):Rationnal{

            var res: Rationnal = tab[0]
            for (c in tab){
                if (res.num/res.den.toDouble()>c.num/c.den)
                    res =c
            }
            return res
        }
    }

}
fun main (){
    var r1 :Rationnal = Rationnal(2,6)
    var r2 :Rationnal  = Rationnal(6,5)
    r1.normaliser()
     println(r1.toString())
     println(r2.toString())

    //println(r1.add(r2).toString())

    var tab:MutableList<Rationnal> = arrayListOf(r1,r2)
   println(Rationnal.fleche(tab))




}