/*
This is the main class
*/
fun main(){
    var miAparcamiento = Aparcamiento("ParkingGas", 200,100,NCoches("1234","12:00","16:00"))
    println(miAparcamiento.toString())
    var aparcamiento= Aparcamiento("ParkingGas", 200,100,NCoches("32432","18:00","21:00"))
    println(aparcamiento.toString())
    /*Created 2 objects and showed in ParkingGas*/
    var miAparc= Aparcamiento("Parking Público", 50,1,NCoches("456456","10:00","20:00"))
    println("La matricula de un coche que hay en ${miAparc.nombre} es ${miAparc.nCoches.matricula} y estuvo desde las ${miAparc.nCoches.horaEntrada} hasta las ${miAparc.nCoches.horaSalida}")
    var miAparca=Aparcamiento("Parking Público", 50,1,NCoches("65756","11:00","18:00"))
    println("La matricula de un coche que hay en ${miAparca.nombre} es ${miAparca.nCoches.matricula} y estuvo desde las ${miAparca.nCoches.horaEntrada} hasta las ${miAparca.nCoches.horaSalida}")
    /*Created 2 objects and showed in Parking Público*/
}