package rsi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
//@XmlRootElement(name = "JDG")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlSeeAlso({JDG.class})
//public class JDG implements Serializable {
public class JDG {

    public JDG() {
    }

//    public JDG(JDG jdg) {
//        this.nip = jdg.getNip();
//    }
//    public JDG(JDG jdg) {
//        //this.nip = jdg.getNip();
//        this.nip = jdg.nip;
//    }
//
//    public JDG(String nip) {
//        this.nip = nip;
//    }
//    public JDG(JDG jdg) {
//        this.nip = jdg.nip;
//        this.nazwa = jdg.nazwa;
//        this.wlasciciel = jdg.wlasciciel;
//        this.dataZalozenia = jdg.dataZalozenia;
//        this.krs = jdg.krs;
//        this.rodzajDzialalnosci = jdg.rodzajDzialalnosci;
//        this.adresSiedziby = jdg.adresSiedziby;
//        this.czyPierwsza = jdg.czyPierwsza;
//    }
    public JDG(
            String nip,
            String nazwa,
            String wlasciciel,
            String dataZalozenia,
            String krs,
            String rodzajDzialalnosci,
            String adresSiedziby,
            boolean czyPierwsza) {
        this.nip = nip;
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.dataZalozenia = dataZalozenia;
        this.krs = krs;
        this.rodzajDzialalnosci = rodzajDzialalnosci;
        this.adresSiedziby = adresSiedziby;
        this.czyPierwsza = czyPierwsza;
    }
    //@XmlElement(name = "nipp")
    // @XmlElement //@XmlElement(required = true)
    //@XmlAnyElement
    public String nip;
    public String nazwa;
    public String wlasciciel;
    public String adresSiedziby;
    public String rodzajDzialalnosci;
    public String krs;
    public String dataZalozenia;
    public boolean czyPierwsza;
//    public String nip;
//    private String nazwa;
//    private String wlasciciel;
//    private String adresSiedziby;
//    private String rodzajDzialalnosci;
//    private String krs;
//    private String dataZalozenia;
//    private boolean czyPierwsza;

//    /**
//     * @return the nazwa
//     */
//    public String getNazwa() {
//        return nazwa;
//    }
//
//    /**
//     * @param nazwa the nazwa to set
//     */
//    public void setNazwa(String nazwa) {
//        this.nazwa = nazwa;
//    }
//
//    /**
//     * @return the wlasciciel
//     */
//    public String getWlasciciel() {
//        return wlasciciel;
//    }
//
//    /**
//     * @param wlasciciel the wlasciciel to set
//     */
//    public void setWlasciciel(String wlasciciel) {
//        this.wlasciciel = wlasciciel;
//    }
//
//    /**
//     * @return the adresSiedziby
//     */
//    public String getAdresSiedziby() {
//        return adresSiedziby;
//    }
//
//    /**
//     * @param adresSiedziby the adresSiedziby to set
//     */
//    public void setAdresSiedziby(String adresSiedziby) {
//        this.adresSiedziby = adresSiedziby;
//    }
//
//    /**
//     * @return the rodzajDzialalnosci
//     */
//    public String getRodzajDzialalnosci() {
//        return rodzajDzialalnosci;
//    }
//
//    /**
//     * @param rodzajDzialalnosci the rodzajDzialalnosci to set
//     */
//    public void setRodzajDzialalnosci(String rodzajDzialalnosci) {
//        this.rodzajDzialalnosci = rodzajDzialalnosci;
//    }
//
//    /**
//     * @return the krs
//     */
//    public String getKrs() {
//        return krs;
//    }
//
//    /**
//     * @param krs the krs to set
//     */
//    public void setKrs(String krs) {
//        this.krs = krs;
//    }
//
//    public String getNip() {
//        return nip;
//    }
//
//    public void setNip(String nip) {
//        this.nip = nip;
//    }
//
//    public String getDataZalozenia() {
//        return dataZalozenia;
//    }
//
//    public void setDataZalozenia(String dataZalozenia) {
//        this.dataZalozenia = dataZalozenia;
//    }
//
//    public boolean isCzyPierwsza() {
//        return czyPierwsza;
//    }
//
//    public void setCzyPierwsza(boolean czyPierwsza) {
//        this.czyPierwsza = czyPierwsza;
//    }
    public String toString() {
        return "nip" + nip + "\n";
    }
}
//package rsi_jdg_ws;
//
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement
//public class JDG {
//
//    public JDG() {
//    }
//
////    public JDG(JDG jdg) {
////        this.nip = jdg.getNip();
////    }
//    public JDG(JDG jdg) {
//        this.nip = jdg.getNip();
//    }
//
//    public JDG(String nip) {
//        this.nip = nip;
//    }
////    public JDG(JDG jdg) {
////        this.setNip(jdg.getNip());
////        this.setNazwa(jdg.getNazwa());
////        this.setWlasciciel(jdg.getWlasciciel());
////        this.setDataZalozenia(jdg.getDataZalozenia());
////        this.setKrs(jdg.getKrs());
////        this.setRodzajDzialalnosci(jdg.getRodzajDzialalnosci());
////        this.setAdresSiedziby(jdg.getAdresSiedziby());
////        this.setCzyPierwsza(jdg.isCzyPierwsza());
////    }
////
////    public JDG(
////            String nip,
////            String nazwa,
////            String wlasciciel,
////            String adresSiedziby,
////            String rodzajDzialalnosci,
////            String krs,
////            String dataZalozenia,
////            boolean czyPierwsza) {
////        this.setNip(nip);
////        this.setNazwa(nazwa);
////        this.setWlasciciel(wlasciciel);
////        this.setDataZalozenia(dataZalozenia);
////        this.setKrs(krs);
////        this.setRodzajDzialalnosci(rodzajDzialalnosci);
////        this.setAdresSiedziby(adresSiedziby);
////        this.setCzyPierwsza(czyPierwsza);
////    }
//    //@XmlElement
//    private String nip;
////    private String nazwa;
////    private String wlasciciel;
////    private String adresSiedziby;
////    private String rodzajDzialalnosci;
////    private String krs;
////    private String dataZalozenia;
////    private boolean czyPierwsza;
//
////    /**
////     * @return the nazwa
////     */
////    public String getNazwa() {
////        return nazwa;
////    }
////
////    /**
////     * @param nazwa the nazwa to set
////     */
////    public void setNazwa(String nazwa) {
////        this.nazwa = nazwa;
////    }
////
////    /**
////     * @return the wlasciciel
////     */
////    public String getWlasciciel() {
////        return wlasciciel;
////    }
////
////    /**
////     * @param wlasciciel the wlasciciel to set
////     */
////    public void setWlasciciel(String wlasciciel) {
////        this.wlasciciel = wlasciciel;
////    }
////
////    /**
////     * @return the adresSiedziby
////     */
////    public String getAdresSiedziby() {
////        return adresSiedziby;
////    }
////
////    /**
////     * @param adresSiedziby the adresSiedziby to set
////     */
////    public void setAdresSiedziby(String adresSiedziby) {
////        this.adresSiedziby = adresSiedziby;
////    }
////
////    /**
////     * @return the rodzajDzialalnosci
////     */
////    public String getRodzajDzialalnosci() {
////        return rodzajDzialalnosci;
////    }
////
////    /**
////     * @param rodzajDzialalnosci the rodzajDzialalnosci to set
////     */
////    public void setRodzajDzialalnosci(String rodzajDzialalnosci) {
////        this.rodzajDzialalnosci = rodzajDzialalnosci;
////    }
////
////    /**
////     * @return the krs
////     */
////    public String getKrs() {
////        return krs;
////    }
////
////    /**
////     * @param krs the krs to set
////     */
////    public void setKrs(String krs) {
////        this.krs = krs;
////    }
//    /**
//     * @return the nip
//     */
//    public String getNip() {
//        return nip;
//    }
//
//    /**
//     * @param nip the nip to set
//     */
//    public void setNip(String nip) {
//        this.nip = nip;
//    }
//
//    /**
//     * @return the dataZalozenia
//     */
////    public String getDataZalozenia() {
////        return dataZalozenia;
////    }
////
////    /**
////     * @param dataZalozenia the dataZalozenia to set
////     */
////    public void setDataZalozenia(String dataZalozenia) {
////        this.dataZalozenia = dataZalozenia;
////    }
////
////    /**
////     * @return the czyPierwsza
////     */
////    public boolean isCzyPierwsza() {
////        return czyPierwsza;
////    }
////
////    /**
////     * @param czyPierwsza the czyPierwsza to set
////     */
////    public void setCzyPierwsza(boolean czyPierwsza) {
////        this.czyPierwsza = czyPierwsza;
////    }
//    public String toString() {
//        return "nip" + nip + "\n";
//    }
//}

