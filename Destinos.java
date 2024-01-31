/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package destinos;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author esmer
 */
public class Destinos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos básicos del usuario
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu apellido paterno:");
        String apellidoPaterno = scanner.nextLine();

        System.out.println("Ingresa tu apellido materno:");
        String apellidoMaterno = scanner.nextLine();

        System.out.println("Ingresa tu sexo:");
        String sexo = scanner.nextLine();

        System.out.println("Ingresa tu correo:");
        String correo = scanner.nextLine();

        // Pedir destino de vuelo
        System.out.println("Selecciona tu destino de vuelo (1-5):");
        System.out.println("1. Londres");
        System.out.println("2. Shangai");
        System.out.println("3. Mónaco");
        System.out.println("4. Moscú");
        System.out.println("5. Ámsterdam");

        int opcionDestino = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de nextInt

        // Asignar datos de vuelo en base al destino seleccionado
        String destinoVuelo;
        String numeroVuelo;
        String aeropuerto;
        Date fechaSalida = new Date();  // Fecha actual

        switch (opcionDestino) {
            case 1:
                destinoVuelo = "Londes";
                numeroVuelo = "Vuelo123";
                aeropuerto = "AeropuertoA";
                break;
            case 2:
                destinoVuelo = "Shangai";
                numeroVuelo = "Vuelo456";
                aeropuerto = "AeropuertoB";
                break;
            case 3:
                destinoVuelo = "Mónaco";
                numeroVuelo = "Vuelo789";
                aeropuerto = "AeropuertoC";
                break;
            case 4:
                destinoVuelo = "Moscú";
                numeroVuelo = "Vuelo101";
                aeropuerto = "AeropuertoD";
                break;
            case 5:
                destinoVuelo = "Ámsterdam";
                numeroVuelo = "Vuelo202";
                aeropuerto = "AeropuertoE";
                break;
            default:
                System.out.println("Opción no válida. Seleccionando Ciudad 1 por defecto.");
                destinoVuelo = "Londres";
                numeroVuelo = "Vuelo123";
                aeropuerto = "AeropuertoA";
        }

        // Crear objeto Usuario con los datos ingresados
        Usuario usuario1 = new Usuario(nombre, apellidoPaterno, apellidoMaterno, sexo, correo, destinoVuelo);

        // Mostrar los datos del usuario y del vuelo asignado
        System.out.println("\nDatos del usuario:");
        imprimirDatosUsuario(usuario1);

        System.out.println("\nDatos del vuelo asignado:");
        imprimirDatosVuelo(numeroVuelo, aeropuerto, fechaSalida);
    }

    // Método para imprimir los datos de un objeto Usuario
    public static void imprimirDatosUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getN());
        System.out.println("Apellido Paterno: " + usuario.getAp());
        System.out.println("Apellido Materno: " + usuario.getAm());
        System.out.println("Sexo: " + usuario.getS());
        System.out.println("Correo: " + usuario.getC());
        System.out.println("Destino de vuelo: " + usuario.getD());
    }

    // Método para imprimir los datos del vuelo asignado
    public static void imprimirDatosVuelo(String numeroVuelo, String aeropuerto, Date fechaSalida) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaSalidaStr = dateFormat.format(fechaSalida);

        System.out.println("Número de vuelo: " + numeroVuelo);
        System.out.println("Aeropuerto de salida: " + aeropuerto);
        System.out.println("Fecha de salida: " + fechaSalidaStr);
    }
}

class Usuario {
    private String N, Ap, Am, S, C, D;

    public Usuario(String N, String Ap, String Am, String S, String C, String D) {
        this.N = N;
        this.Ap = Ap;
        this.Am = Am;
        this.S = S;
        this.C = C;
        this.D = D;
    }

    public String getN() {
        return N;
    }

    public String getAp() {
        return Ap;
    }

    public String getAm() {
        return Am;
    }

    public String getS() {
        return S;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }
}


