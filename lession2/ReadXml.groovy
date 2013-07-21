def alumnos = new XmlParser().parse(new File('alumnos.xml'))
//println alumnos.class
//println alumnos.name()
println alumnos.alumno[0].nombre
println alumnos.alumno[0].nombre.text()
//println alumnos.alumno*.nombre.text()
 def lista = []
 alumnos.each{
   println it.nombre.text() + " " + it.edad.text() + " " + it.telefono.text() + " " + it.genero.text() + " " +  it.direccion.text()
  
 
 def alumno = new Alumno()

  alumno.nombre = it.nombre.text()
  alumno.edad = it.edad.text()
  alumno.telefono =  it.telefono.text()
  alumno.genero = it.telefono.text()
  alumno.direccion = it.direccion.text()

   lista.add(alumno)
}

println lista.size()
println lista