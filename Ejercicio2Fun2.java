package Ejercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio2Fun2 {
    static Stack<Integer> p1= new Stack<>();
    static Stack<Integer> p2= new Stack<>();
    static Queue<Integer> c1= new LinkedList<>();

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            p1.push(i*2);
        }
        for (int i = 0; i < 10; i++) {
            p2.push(i*3);
        }

        System.out.println(p1);
        System.out.println(p2);
        Funcion2(p1,p2,c1);
        System.out.println(c1);
    }

    public static Boolean Funcion2(Stack<Integer> pila1, Stack<Integer> pila2, Queue<Integer> cola){
        if(pila1.isEmpty() && pila2.isEmpty()){
            return true;
        }
        if(!pila1.pop().equals(pila2.pop())){
            cola.add(pila1.pop());
            return Funcion2(pila1,pila2,cola);
        }

        return false;

    }
}
