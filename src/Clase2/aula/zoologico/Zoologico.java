package Clase2.aula.zoologico;

public class Zoologico {

    //Aca declaras como tipo Atributo
    public static void main(String[] args) {
        //Zoologico.doConstruye();
        doCasting2();
    }

    public static void executeCasting() {
        Gallina gallina = new Gallina();
        Zoologico.doCasting(gallina);
        Zoologico.doCasting(new Tigre());
    }

    public static void doCasting1(Animal animal) {
        if (animal instanceof Tigre) {
            Tigre tigre = (Tigre) animal;
            tigre.hacerRuido(true);
            tigre.zarpar();
            //Zoologico.doCasting(new Tigre());

        } else if (animal instanceof Gallina) {
            Gallina gallina = (Gallina) animal;
            gallina.hacerRuido();
            gallina.picar();
        }
    }

    public static void doCasting2() {
        Animal[] animales = {new Tigre("Tiger"), new Gallina("Mamba"), new Gallina("Pepa")};

        for (Animal animal : animales) {
            animal.printNombrePatas();
            if (animal instanceof Tigre) {
                ((Tigre) animal).hacerRuido(true);
            } else if (animal instanceof Gallina) {
                Gallina gallitos = (Gallina) animal;
                gallitos.picar();
            }
        }
    }

    public static void doHerencia() {
        //tigrito(clase hijo) herencia de su padre Animal
        Tigre tigrito = new Tigre();
        tigrito.setNumeroPatas(4);
        tigrito.hacerRuido();
        System.out.println(tigrito.getNumeroPatas());
        tigrito.hacerRuido(true);
        tigrito.hacerRuido("grr");

        //gallinita(objeto hijo) de la clase herencia
        Gallina gallinita = new Gallina();
        gallinita.setNumeroPatas(2);
        System.out.println(gallinita.getNumeroPatas());
        gallinita.hacerRuido();
    }

    public static void doConstruye() {
        Gallina galli = new Gallina();
        galli.setNombre("PEPA");
        galli.setNumeroPatas(2);
        galli.printNombrePatas();

        Gallina memba = new Gallina("Memba");
        memba.printNombrePatas();
    }

    public static void doInstance() {
        //Clase             Tipo        
        Animal tigre = new Animal();
        tigre.setNombre("Tiger");

        System.out.println("Es:" + tigre.getNombre());
        tigre.hacerRuido();
    }

    public static void doCasting(Animal animalejo) {
        animalejo.hacerRuido();
    }
}
