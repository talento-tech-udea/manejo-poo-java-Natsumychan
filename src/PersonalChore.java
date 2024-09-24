import java.util.Date;

/*
    Clase PersonalChore
    1. Definir el constructor
    2. Definir metodos heredados
 */
class PersonalChore extends Task implements Postponable {
    public PersonalChore(String taskName, int priority, Date deadline){
        super(taskName, priority, deadline);
    }

    @Override
    public void postpone (int days){
        System.out.println("Se pospone " + days);
    }

    @Override
    void performTask(){
        System.out.println("Se está ejecutando la tarea tipo personal chore " + this.taskName);
    }
}