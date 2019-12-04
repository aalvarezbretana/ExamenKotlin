/*This is the class Aparcamiento used to create objects("aparcamientos") made out of parameters and other object
That have for parameters nombre as String, plazasTotales as Int and plazasLibres as Int.
The last parameter is nCoches to use the parameters of the class NCoches used to create objects("coches") */
data class Aparcamiento(var nombre:String, var plazasTotales:Int, var plazasLibres:Int, var nCoches: NCoches ) {

}