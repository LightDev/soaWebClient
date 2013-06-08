package rsi;

import javax.jws.WebService;

@WebService(
        name = "RSI_JDG_WS",
        targetNamespace = "http://rsi_jdg_ws/")
public interface RSI_JDG_WS {

    public String dodajObj(JDG jdg);

    public String dodaj(String nip);

    public JDG[] pokaz();

    public String modyfikuj(JDG jdg);
//    public String modyfikuj(String nip);

    public String usun(String nip);

    public JDG pobierz(String nip);
}
