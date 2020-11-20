package uaslp.enginering.labs;

import uaslp.enginering.labs.list.ArrayList;
import uaslp.enginering.labs.model.Student;

public class Main {

    // String pool

    public static void main(String[] args) {
        ArrayList<Student> group1 = new ArrayList<>();

        group1.add(new Student("Ivan"));
        group1.add(new Student("Mario"));
        group1.add(new Student("Juan"));

        ArrayList<Student>.Iterator iterator = group1.getIterator();

        while(iterator.hasNext()){
            Student student = iterator.next();

            System.out.println(student.getName());
        }


        ArrayList<String> cadenas = new ArrayList<>();

        cadenas.add("Uresti");
        cadenas.add("Jimenez");
        cadenas.add("López");

        ArrayList<String>.Iterator stringsIterator = cadenas.getIterator();

        while(stringsIterator.hasNext()){
            String cadena = stringsIterator.next();

            System.out.println(cadena);
        }

        ArrayList<Integer> enteros = new ArrayList<>();

        enteros.add(30);
        enteros.add(12);
        enteros.add(73);

        ArrayList<Integer>.Iterator integerIterator = enteros.getIterator();

        while(integerIterator.hasNext()){
            int numero = integerIterator.next();

            System.out.println(numero);
        }
    }
}
