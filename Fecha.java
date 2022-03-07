public class Fecha {
    public static boolean validarFecha(int anio, int mes, int dia) {
        //Inicializamos el boleano a false
        boolean fechaValida= false;
        /*Primer if, si se cumple todo vamos al segundo sino al return*/
        if ((dia > 0) && (mes > 0) && (anio > 0)) {
            /*Segundo if, si se cumple todo al siguiente sino al return*/
            if ((mes <= 12) && (dia <= 31)) {
                /*Tercer if si no se cumple al return y si se cumple vamos a la linea de abajo*/
                if (mes == 2) {
                    fechaValida = dia <= 28;
                } else if (mes % 2 == 0) { /* si el tercer if no se cumple pasamos aqui y sino vamos al return*/
                    fechaValida = dia <= 30;
                } else {/* si el tercer if no se cumple pasamos aqui y sino vamos al return*/
                    fechaValida = dia <= 31;
                }
            }
        }
        return fechaValida;
    }
}