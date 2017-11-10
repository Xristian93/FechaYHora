
/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    // the dia of the calendar
    private DisplayDosCaracteres dia;
    // the mes of the calendar
    private DisplayDosCaracteres mes;
    // the ano of the calendar
    private DisplayDosCaracteres ano;
    // the hours of the clock
    private NumberDisplay hours;
    // the minutes of the clock
    private NumberDisplay minutes;
    private String displayString; 

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
    }

    /**
     * Update the internal string that represents the display.
     */
    public String getFechaYHora()
    {
        displayString = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay() + " " +
                        hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
        return displayString;
    }
    
    /**
     * Advance one dia in the calendar and one minute
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
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
    }
    
    /**
     * Set the calendar date and the time
     */
    public void fijarFechaYHora(int actualDia, int actualMes, int actualAno, int hour, int minute)
    {
        if (actualDia > 0 & actualMes > 0 & actualAno >0){
            dia.setValorAlmacenado(actualDia);
            mes.setValorAlmacenado(actualMes);
            ano.setValorAlmacenado(actualAno);
        }
        else{
            System.out.println ("You have to input a correct date");
        }
        hours.setValue(hour);
        minutes.setValue(minute);
    }
}
