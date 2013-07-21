public class OperacionesBasicasG{
     Integer x
     Integer y

     Float  w
     Float  z

    public int suma(){
    return x + y	
    }
    

    public int multiply(){
    	return x * y
    }

    public int substract(){
    	return x - y
    }

    public int divide(){
    	return x / y
    }
}

def ob = new OperacionesBasicasG()
def path
ob.x = 5
ob.y = 6
println ob.class
/*println 'multiplicacion es igual = ' + ob.multiply()
println  'resta de ${ob.x} entre ${ob.y} es igual = ' + ob.substract()
println "division de ${ob.x} entre ${ob.y} es igual = " + ob.divide() 
println """este es un text muy largo entonces xxxxxxxx
         xxxxxxxxxx
         xxxxxxxxxxx """ */