package CCuenta;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;

    public CCuenta () {
    }

    public CCuenta (String nom, String cue, double sal) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom) {
        nombre=nom;
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public double saldo()
    {
        return saldo;
    }

    public String ingresar(double cantidad) {
        if (cantidad>0){
            saldo = saldo + cantidad;
            return "El ingreso ha sido correcto";
        }
        else{
            return "No se puede ingresar una cantidad negativa";
        }
    }

    public String retirar (double cantidad) {
        if (cantidad > 0){
            if (saldo > cantidad) {
                saldo -= cantidad;
                return "Dinero retirado satisfactoriamente";
            }
            else {
                return"No hay suficiente saldo";
            }
        }
        else {
            return "No se puede retirar una cantidad negativa";
        }
    }

    public String obtenerCuenta (){
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
