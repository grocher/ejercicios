def array = [1,2,3,4,5,6]

println "array size:" + array.size()
for (int i = 0;i < array.size();i++)
{
	println "valor ${i}" + array[i]
}

def suma = 0
array.each{index ->
	println "val"+ index
	suma += index
}
println "la suma es" + suma

def arreglo2 = []
if (arreglo2.size() > 0) {
arreglo2.each{
   println "valor del arrelgo" + it
}
}

(10..1).each{
	println "valor" + it
}

def mapa_hijos = [nombre:'andre',edad:6]
def mapa = [nombre:'gladys',edad:15,genero:'F', hijos:mapa_hijos]
println "mapa.nombre:" + mapa.nombre
println "mapa.edad:" + mapa.edad
println "mapa.genero:" + mapa.genero

mapa.nombre = 'carlos'
mapa.edad   = 10
mapa.genero = 'M'

mapa.each{k,v ->
	println "${k} ${v}"
	if (k == 'hijos')
	{
		println "hijos"
		v.each{kh,vh ->
         println "${kh} ${vh}"
		 }
	}
}

