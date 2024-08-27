package Ejercicio3hilospako;


public class Seguidores_Iluvatar extends Guerrero{


    public LibroConjuros libro;
    public TomBombadil tom;



    public Seguidores_Iluvatar(LibroConjuros libro,TomBombadil tom){
        this.libro = libro;
        this.tom= tom;
    }


    @Override
    public void obtenerenergia() {
        try {

          energia= libro.leerConjuro();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run(){
        while (true){

            try {
                Thread.sleep(2000);
                obtenerenergia();
                cogerarmas();
                luchar(tom);
                devolverarmas();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }



    }







}
