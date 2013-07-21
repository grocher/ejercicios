
def alumnos = []
/*def content = new  File(/C:\groovy_course\lession\HelloWorld.groovy/).eachLine { line ->*/
def content = new  File('alumnos.txt').eachLine { line ->
	println line 
	println line.class
def alumno = new Alumno	()

def dataArray = line.split(',')
println dataArray
alumno.nombre = dataArray[0].trim()
alumno.edad = dataArray[1].trim()
alumno.telefono = dataArray[2].trim()
alumno.genero = dataArray[3].trim()
alumno.direccion = dataArray[4].trim()

alumnos.add(alumno)

}

println alumnos.size()
println alumnos
def alguien = alumnos.get(2)
println alguien.nombre + " " + alguien.edad


new File('alumnos_out.txt').withWriter { out ->alumnos.get(2)
	alumnos.each{
		out.writeLine(it.nombre + " " + it.edad + " " + it.telefono + " " + it.genero + " " + it.direccion) 
	}
}

 new File("alumnos_out.txt").eachLine { line ->
	println line
}