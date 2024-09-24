import java.util.ArrayList;
import java.util.Date;

/*
    Clase principal para manejar la gestión de tareas diarias

    Se tiene una clase principal Task y tres subclases Meeting, Shopping y PersonalChore.
    Un Task tiene parametros base que se utilizaran en cada subclase.
    La interface Postponable nos da un metodo adicional para posponer un Task

    El objetivo es crear una lista de Tasks (Meeting, Shopping y PersonalChore)

    NOTA:
    Para esta practica los metodos solo deben imprimir un mensaje alucivo a la tarea que se realiza
    EX: "Atentiendo la reunion ......"
 */
public class Main {
    public static void main(String[] args) {
        // Crear una lista de tareas
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Meeting("Reunión con los socios", 1, new Date(), "Cali"));
        tasks.add(new Shopping("Hacer el mercado mensual", 5, new Date()));
        tasks.add(new PersonalChore("Sacar la basura", 10, new Date()));

        for (Task t: tasks){
            System.out.println(t.getDetails());
            t.performTask();
            if(t instanceof Meeting){
                ((Postponable) t).postpone(5);
            }
        };
        // Verificar si una clase es instancia de otra
        // task instanceof Postponable
    }
}