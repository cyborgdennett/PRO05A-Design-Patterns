import java.io.*;
import java.util.*;
import java.util.Vector;

class Persoon{
    Vector<WakkerBlijven> methodes = new Vector<WakkerBlijven>();

    public void blijf_wakker(){
        for(int i = 0; i < methodes.size(); i++){
            methodes.get(i).wek();
        }
    }
    public void addStimulator(WakkerBlijven w){
        methodes.add(w);
    }
}

interface WakkerBlijven{
    void wek();
}

class emmer_water implements WakkerBlijven
{
    @Override
    public void wek(){
        System.out.println("Er valt een emmer water op je hoofd.");
    }
}
class koffie_drinken implements WakkerBlijven
{
    @Override
    public void wek(){
        System.out.println("Je drink een kop caffeine en voelt het bloed weer naar je hoofd gaan.");
    }
}
class RedBull implements WakkerBlijven
{
    @Override
    public void wek(){
        System.out.println("Je drink een RedBull en je begint te vliegen.");
    }
}
class Wakker_blijven{
    public static void main(String args[]){
        Persoon Cas = new Persoon();
        WakkerBlijven koffie = new koffie_drinken();
        Cas.addStimulator(koffie);
        Cas.addStimulator(new RedBull());
        Cas.blijf_wakker();
    }
}
