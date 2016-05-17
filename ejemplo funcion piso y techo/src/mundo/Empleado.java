package mundo;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.848AAD4A-B825-D334-BC64-857E96B8AE54]
// </editor-fold> 
public class Empleado {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0A8591DB-BECC-64D7-C123-3CEDA28C3C8A]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.221A8036-8583-B7F9-5439-1D3580619DB8]
    // </editor-fold> 
    private long cedula;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FC08BCB9-775D-1494-058C-85DF99CB47CE]
    // </editor-fold> 
    private byte tipoEmpleado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D3291F5-410E-8D9C-39E5-6C2D4B8FA8A3]
    // </editor-fold> 
    public Empleado () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3BA3FE48-8C4D-3427-0579-067DCF55C79C]
    // </editor-fold> 
    public long getCedula () {
        return cedula;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.825773B4-D3E6-7975-8B8D-78763184ED96]
    // </editor-fold> 
    public void setCedula (long val) {
        this.cedula = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.05046EE1-30D2-05A1-4E58-816CCB844BD3]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.93ADA504-411F-65F0-B043-41BFB17167AF]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06870CF0-5A52-324D-699B-52DFC6ADC88F]
    // </editor-fold> 
    public byte getTipoEmpleado () {
        return tipoEmpleado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.59CD057A-59E5-1BEC-E28D-8DEB88B9E07D]
    // </editor-fold> 
    public void setTipoEmpleado (byte val) {
        this.tipoEmpleado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6C1C16D5-41ED-A981-D954-9EAAFB90278F]
    // </editor-fold> 
    public float getSubsidio () {
        return 0.0f;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5DDE06A8-54AB-4167-4ECF-BE43603059AB]
    // </editor-fold> 
    public float getPension () {
        return 0.0f;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F371C6D9-A5A4-06D7-12D6-3F24CCA398B3]
    // </editor-fold> 
    public float getSalarioBasico () {
        
        switch(this.getTipoEmpleado())
        {
            case 1: return 9000000;
            case 2: return 4500000;
            case 3: return 1500000;
            case 4: return 750000;
            case 5: return 585000;
            default: return 0;
        
        }
      
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EFA9FD12-A605-CD9E-B4EE-62585ED642A8]
    // </editor-fold> 
    public String getNombreCargo () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F2912986-4585-B045-5191-9D3BDC1493C3]
    // </editor-fold> 
    public float getSalarioTotal () {
        return 0.0f;
    }

}

