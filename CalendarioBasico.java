/**
 * This is a normal calendar
 */
public class CalendarioBasico
{
    // the dia of the calendar
    private DisplayDosCaracteres dia;
    // the mes of the calendar
    private DisplayDosCaracteres mes;
    // the ano of the calendar
    private DisplayDosCaracteres ano;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
    }

    /**
     * Set the calendar date
     */
    public void fijarFecha(int actualDia, int actualMes, int actualAno)
    {
        if (actualDia > 0 & actualMes > 0 & actualAno >0){
            dia.setValorAlmacenado(actualDia);
            mes.setValorAlmacenado(actualMes);
            ano.setValorAlmacenado(actualAno);
        }
        else{
            System.out.println ("You have to input a correct date");
        }
    }

    /**
     * Print calendar date
     */
    public String obtenerFecha()
    {
        return dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay();
    }

    /**
     * Advance one dia in the calendar
     */
    public void avanzarFecha()
    {
        dia.incrementaValorAlmacenado();
        if (dia.getValorAlmacenado() == 1){
            mes.incrementaValorAlmacenado();
            if (mes.getValorAlmacenado() == 1){
                ano.incrementaValorAlmacenado();
                }
        }
    }

    /**
     * Get a 8 characters string of the date
     */
    public String getString()
    {
        return dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + "20" + ano.getTextoDelDisplay();
    }
}
