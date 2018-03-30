package unal.poo.practica;

import becker.robots.*;
import java.util.Scanner;
import java.util.ArrayList;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot elevador1, elevador2;
        
        
	public static void main (String[] args){
            
            ArrayList<Thing> personas = new ArrayList<Thing>();
            
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            Scanner teclado = new Scanner(System.in);
            
            int xEL1 = 0, yEL1 = 9,  xEL2 = 1, yEL2 = 9;
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            elevador1 = new Robot(objetos,9, 1, Direction.NORTH,0);
            elevador2 = new Robot(objetos,9, 0, Direction.NORTH,0);
            
                        
            System.out.println ("A que piso se dirige una nueva persona");
            int entradaTeclado = 0;
            entradaTeclado = teclado.nextInt();
            System.out.println ("Has ingresado: \"" + entradaTeclado +"\""); 
                        
            if(entradaTeclado > 0)
            {               
                Persona per1 = new Persona( 9, entradaTeclado);
                personas.add(new Thing(objetos, 9, 2));          
                
                El1TomarPersona();
                personas.remove(0);
                
                El1LlevarPersona(entradaTeclado-1);
            }
            
            
            System.out.println ("A que piso se dirige una nueva persona");
            entradaTeclado = 0;
            entradaTeclado = teclado.nextInt();
            System.out.println ("Has ingresado: \"" + entradaTeclado +"\""); 
                        
            if(entradaTeclado > 0)
            {               
                Persona per1 = new Persona( 9, entradaTeclado);
                personas.add(new Thing(objetos, 9, 2));          
                
                El1TomarPersona();
                personas.remove(0);
                
                El1LlevarPersona(entradaTeclado-1);
            }
            
            
            /* System.out.println("se borrara la persona");
            personas.remove(0);
            System.out.println("reaparecera la persona");
            personas.add(new Thing(objetos, 5, 5));
            System.out.println(personas); */
            
            /*
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
            elevador.move ();
            
            //Girar a la izquierda
            elevador.turnLeft();
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = elevador.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               elevador.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = elevador.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            elevador.putThing();
                       
            //Si el frente esta libre de Wall
            elevador.frontIsClear();
            
            //Invocando una funcion
            funcionMovimiento(4);
            
            //Toman un Thing
            elevador.pickThing();
            */
            
	}
        
        public static void El1TomarPersona(){
            elevador1.turnLeft();
            elevador1.turnLeft();
            elevador1.turnLeft();
            
            elevador1.move();
            
            elevador1.pickThing();
            
            elevador1.turnLeft();
            elevador1.turnLeft();
            
            elevador1.move();
            
            elevador1.turnLeft();
            elevador1.turnLeft();
            elevador1.turnLeft();
        }
        
        public static void El1LlevarPersona(int destino){
            funcionMovimientoEL1(destino);
            
            elevador1.turnLeft();
            elevador1.turnLeft();
            elevador1.turnLeft();
            
            elevador1.move();
            
            elevador1.putThing();
            
            elevador1.turnLeft();
            elevador1.turnLeft();
            
            elevador1.move();
            
            elevador1.turnLeft();
            elevador1.turnLeft();
            elevador1.turnLeft();
        }
        
        public static void funcionMovimientoEL1(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                elevador1.move();
        }
        public static void funcionMovimientoEL2(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                elevador2.move();
        }
                public static void funcionGiroDerechaEL1(){
                elevador1.turnLeft();
                elevador1.turnLeft();
                elevador1.turnLeft();
        }
                public static void funcionGiroDerechaEL2(){
                elevador2.turnLeft();
                elevador2.turnLeft();
                elevador2.turnLeft();
        }
}
