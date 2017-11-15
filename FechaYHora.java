class FechaYHora
{
    private CalendarioBasico calendario;
    private ClockDisplay reloj;
    
    /**
     * Constructor of the class
     */
    public FechaYHora()
    {
        calendario = new CalendarioBasico();
        reloj = new ClockDisplay();
    }
    
    /**
     * Method that get the date of the calendar and the time 
     */
    public String getFechaYHora()
    {
       return calendario.obtenerFecha() + " " + reloj.getTime();
    }
    
    /**
     * Method that set the date of the calendar and the time
     */
    public void fijarFechaYHora(int day, int month, int year, int hours, int minutes)
    {
        calendario.fijarFecha(day,month,year);
        reloj.setTime(hours, minutes);
    }
    
    /**
     * Method that advance one minute
     */
    public void avanzar()
    {
        reloj.timeTick();
        if(reloj.getTime().equals("00:00")) {
            calendario.avanzarFecha();
        }
    }
    
  
}