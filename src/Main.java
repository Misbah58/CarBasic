public class Main {
    public static void main(String[] args) {
        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.power="A3";
        audi.model="5000cc";

        Engine x=new Engine();
        x.cylinders="8";
        x.size="1234cc";
        x.weight="6453k ";


        color col=new color();
        col.colorType="True";
        col.colorLights="False";
        col.colorwindow="True";


        Lights neon=new Lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";
    }
}