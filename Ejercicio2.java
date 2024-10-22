package Ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio2 {
    static Stack<Integer>p1=new Stack<>();
    static Stack<Integer>p2=new Stack<>();
    static Queue<Integer>c1=new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            p1.push(i);
        }
        for(int i=10; i>0;i--){
            c1.add(i);
        }


        System.out.println(p1);
        System.out.println(c1);

        if(Funcion1(c1,p1)){
            System.out.println("La cola es inversa a la pila");
        }else{
            System.out.println("La cola NO es inversa a la pila");
        }
    }


    public static boolean Funcion1(Queue<Integer> cola, Stack<Integer> pila){
        if(cola.isEmpty() && pila.isEmpty()){
            return true;
        }
        if(cola.isEmpty() || pila.isEmpty()){
            return false;
        }

        if(cola.peek().equals(pila.pop())){
            cola.poll();
            return Funcion1(cola,pila);
        }
        return false;

    }


}
