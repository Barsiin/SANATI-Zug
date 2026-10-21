public class Zug
{
    private String bezeichnung;
    private int wagen;
    private boolean klimatisiert;
    
    public Zug( String neuBezeichnung, int neuWagen, boolean neuKlimatisiert)
    {
        setBezeichnung(neuBezeichnung);
        setWagen( neuWagen);
        setKlimatisiert(neuKlimatisiert);
    }
    
    public Zug( String neuBezeichnung, int neuWagen)
    {
        setBezeichnung(neuBezeichnung);
        setWagen( neuWagen);
        setKlimatisiert(false);
    }
    
    public Zug( String neuBezeichnung, boolean neuKlimatisiert)
    {
        setBezeichnung(neuBezeichnung);
        setWagen(1);
        setKlimatisiert(neuKlimatisiert);
    }
    
    public Zug( int neuWagen, boolean neuKlimatisiert)
    {
        setBezeichnung("UNKN");
        setWagen( neuWagen);
        setKlimatisiert(neuKlimatisiert);
    }
    
    public Zug()
    {
        setBezeichnung("UNKN");
        setWagen(1);
        setKlimatisiert(false);
    }
    
    public String getBezeichnung()
    {
        return bezeichnung;
    }
    
    public int getWagen()
    {
        return wagen;
    }
    
    public boolean getKlimatisiert()
    {
        return klimatisiert;
    }
    
    public void setBezeichnung( String neuBezeichnung)
    {
        bezeichnung = neuBezeichnung;
    }
    
    public void setWagen( int neuWagen)
    {
        if (( neuWagen >=1) && ( neuWagen <= 30))
        {
            this.wagen = neuWagen;
        }
        else
        {
            System.out.println("Fehler :Die Anzahl der Wagen muss zwieschen 1 und 30 liegen!");
        {
           this.wagen=1;     
        }
        }
    }
    
    public void setKlimatisiert( boolean neuKlimatisiert)
    {
        klimatisiert = neuKlimatisiert;
    }
    
    public void printZug()
    {
        if ( klimatisiert==true)
        {
            System.out.println("Zug : " + bezeichnung +"-" + wagen + " Wagen - klimatisiert");
        }
        else
        {
            System.out.println("Zug : " + bezeichnung +"-" + wagen + " Wagen - nicht klimatisiert");
        }
    }
    
    
    
}