public class Caranddrivingdistans {

    static void main(){

        int gräns = 1000;

        Bil bil1 = new Bil("Volvo", "740", 15000 );
        Bil bil2 = new Bil("Suzuki", "Swift", 900);

       IO.println( kontrollera(bil1, gräns));
        IO.println(kontrollera(bil2, gräns));

    }
    static String kontrollera(Bil b, int gräns){

     if ( gräns > b.mil())
        return "Bilen har gått under gränsen";

     return "Bilen har gått över gränsen";

    }

    record Bil(String märke, String modell,int mil){}
}
