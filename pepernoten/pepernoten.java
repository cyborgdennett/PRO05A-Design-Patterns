abstract class AbstractPepernoot{
    abstract void print();
}
class Pepernoot extends AbstractPepernoot{
    void print(){
        System.out.println("Pepernoot");
    }
}
abstract class PepernootDecorator extends AbstractPepernoot{
    AbstractPepernoot vorige;
    PepernootDecorator(AbstractPepernoot ap){
        vorige = ap;
    }
    abstract void print();
}
class Appeltaart extends PepernootDecorator{
    Appeltaart(AbstractPepernoot ap){
        super(ap);
    }
    void print(){
        super.vorige.print();
        System.out.println("Met Appeltaartsmaak");
    }
}
class Chocola extends PepernootDecorator{
    Chocola(AbstractPepernoot ap){
        super(ap);
    }
    void print(){
        super.vorige.print();
        System.out.println("Met chocola");
    }
}

class pepernoten{
    public static void main(String args[]){
        AbstractPepernoot choco = new Pepernoot();
        Chocola c = new Chocola(choco);
        c.print();
        
        choco = new Appeltaart(choco);
        choco.print();
    }
}