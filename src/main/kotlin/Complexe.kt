class Complexe (re:Int,im:Int) {
    var re : Int = re
    var im : Int = im
    constructor(re: Int):this(re,0)

    override fun toString(): String {
        if (im<0)
        return "$re$im i"
        else
            return "$re + $im i"
    }


    fun affiche ():Unit {
        println("$re + $im i ")
    }
    fun add (c: Complexe):Complexe{
        return Complexe(this.re+c.re,this.im+c.im)
    }
    fun sub (c: Complexe):Complexe{
        return Complexe(this.re-c.re,this.im-c.im)
    }
    fun mult (c: Complexe):Complexe{
        return Complexe(this.re*c.re-this.im*c.im ,this.re*c.im+this.im*c.re)
    }
    companion object {
        fun flecher (tab:MutableList<Complexe>):Unit{
           for (c in tab)
               c.im+=1
        }

    }

}
fun main (){
    var c1 =Complexe (2,-6)
    var c2 = Complexe(1)

    var result = c1.mult(c2)
    println(c1.add(c2).toString())
}
