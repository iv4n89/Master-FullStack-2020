package main;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Principal {
    static Scanner entrada= new Scanner(System.in);
    final static int num=4; //Numero de aeropuertos
    static Aeropuerto[] aeropuertos= new Aeropuerto[num];

    public static void main(String[] args){
        insertarDatosAeropuerto(aeropuertos);
        menu();

        //insertar datos de los aeropuertos
    }

    private static void menu() {
        int opcion=0;
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Gestionar aeropuertos en esta aplicacion");
            System.out.println("2. Ver empresas (Privado) o subvencion (Publico)");
            System.out.println("3. Lista de compañias para un aeropuerto");
            System.out.println("4. Lista de vuelos por compañias");
            System.out.println("5. Lista de posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion=entrada.nextInt();
        }while(opcion!=6);

        switch (opcion){
            case 1:
                System.out.println("");
                mostrarDatosAeropuertos(aeropuertos);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                break;
            default:
                System.out.println("Se equivoco al introducir una opcion");
                break;

        }
    }

    public static void mostrarDatosAeropuertos(Aeropuerto[] aeropuertos){
        for(int i=0;i<aeropuertos.length;i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto privado");
                System.out.println("Nombre "+aeropuertos[i].getName()+", Ciudad: "+aeropuertos[i].getCity()+", Pais: "+aeropuertos[i].getCountry());
            }else{
                System.out.println("Aeropuerto publico");
                System.out.println("Nombre "+aeropuertos[i].getName()+", Ciudad: "+aeropuertos[i].getCity()+", Pais: "+aeropuertos[i].getCountry());

            }
            System.out.println("");
        }
    }

    public static void insertarDatosAeropuerto(Aeropuerto[] aero){
        aero[0]=new AeropuertoPublico("Jorge Chavez", "Lima", "Peru",8000000);
        aero[0].insertarCompany(new Company("AeroPeru"));
        aero[0].insertarCompany(new Company("LATAM"));
        aero[0].getCompany("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima","Mexico",150.90, 150));
        aero[0].getCompany("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompany("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90,160));
        aero[0].getCompany("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro","20BGHP", "Peruana"));
        aero[0].getCompany("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","PJKL20", "Mexicana"));
        aero[0].getCompany("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul","JH21KL","Peruana"));

        aero[1]=new AeropuertoPrivado("MAdrid Barajas","Madrid", "España");
        aero[1].insertarCompany(new Company("Iberia"));
        String[] empresas={"AirEuropa","Anguila34"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].getCompany("Iberia").insertarVuelo(new Vuelo("ES14", "Madrid","Barcelona", 150, 170));
        aero[1].getCompany("Iberia").insertarVuelo(new Vuelo("ES15", "Madrid", "Sevilla", 100, 230));
        aero[1].getCompany("Iberia").getVuelo("ES14").insertarPasajero(new Pasajero("Gonzalo", "34RRGT", "Española"));
        aero[1].getCompany("Iberia").getVuelo("ES15").insertarPasajero(new Pasajero("Gonzala", "RR44556", "Francesa"));

        aero[2]=new AeropuertoPublico("Jorge Chavez", "Lima", "Peru",8000000);
        aero[2].insertarCompany(new Company("AeroPeru"));
        aero[2].insertarCompany(new Company("LATAM"));
        aero[2].getCompany("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima","Mexico",150.90, 150));
        aero[2].getCompany("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[2].getCompany("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90,160));
        aero[2].getCompany("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro","20BGHP", "Peruana"));
        aero[2].getCompany("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","PJKL20", "Mexicana"));
        aero[2].getCompany("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul","JH21KL","Peruana"));

        aero[3]=new AeropuertoPrivado("MAdrid Barajas","Madrid", "España");
        aero[3].insertarCompany(new Company("Iberia"));
        String[] emprezas={"AirEuropa","Anguila34"};
        ((AeropuertoPrivado)aero[3]).insertarEmpresas(emprezas);
        aero[3].getCompany("Iberia").insertarVuelo(new Vuelo("ES14", "Madrid","Barcelona", 150, 170));
        aero[3].getCompany("Iberia").insertarVuelo(new Vuelo("ES15", "Madrid", "Sevilla", 100, 230));
        aero[3].getCompany("Iberia").getVuelo("ES14").insertarPasajero(new Pasajero("Gonzalo", "34RRGT", "Española"));
        aero[3].getCompany("Iberia").getVuelo("ES15").insertarPasajero(new Pasajero("Gonzala", "RR44556", "Francesa"));

    }
}
