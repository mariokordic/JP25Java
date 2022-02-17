/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Polaznik;
import edunova.model.Smjer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import us.codecraft.xsoup.Xsoup;

/**
 *
 * @author CP
 */
public class PocetniInsert {
    public static void main(String[] args) {
        izvedi();
    }
    public static void izvedi(){
        Session session = HibernateUtil.getSession();
        session.beginTransaction(); 
        Faker faker = new Faker();
        
        List<Polaznik> polaznici = new ArrayList();
        Polaznik p;
        for(int i=0;i<100;i++){
            p=new Polaznik();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setEmail(faker.name().firstName().substring(0,1).toLowerCase() + 
                    faker.name().lastName().toLowerCase().replace(" ", "") + 
                    "@edunova.hr");
            p.setOib(ucitajOib());
            p.setBrojUgovora(distanceMeasurement());
            session.save(p);
        }
        Smjer s = new Smjer();
        s.setNaziv(faker.book().title());
        s.setCertificiran(Math.random()<0.5 ? true: false);
        s.setTrajanje((int)Math.random() * (200 - 100) + 100);
        s.setCijena(new BigDecimal(Math.random() * (10000 - 5000) + 5000));
        session.save(s);
        session.getTransaction().commit();
       
    }
  public static String ucitajOib(){
      String oib="";
        try {
            URL yahoo = new URL("http://oib.itcentrala.com/oib-generator/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yahoo.openStream()));

            String inputLine;
             StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            
            Document d = Jsoup.parse(sb.toString());
            
         oib =  Xsoup.compile("/html/body/div[1]/div[1]/text()").evaluate(d).get();
            
           // System.out.println(sb.toString());
            in.close();
            
        } catch (Exception e) {
        }
      return oib;
    }
  public static String distanceMeasurement() {
      Faker faker1 = new Faker();  
      return faker1.number().numberBetween(100, 10000) + ' ' + faker1.resolve("space.distance_measurement");
}

}
