import java.util.Date;

/*
    Clase Meeting
    1. Definir el constructor con un parametro adicional
    - location
    2. Definir metodos heredados
 */
class Meeting extends Task implements Postponable {
    private String location;

    public Meeting(String taskName, int priority, Date deadline, String location){
        super(taskName, priority, deadline);
        this.location =location;

    }

    @Override
    public void postpone (int days){
        System.out.println("Se pospone el encuentro en: " + days + " días");
    }

    @Override
    void performTask(){
        System.out.println("Se está ejecutando la tarea " + this.taskName + " tipo Meeting en " + this.location);
    }
}