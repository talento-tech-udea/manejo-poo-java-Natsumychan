import java.util.Date;
/*
    Clase Shopping
    1. Definir el constructor
    2. Definir metodos heredados
 */
class Shopping extends Task {
    public Shopping(String taskName, int priority, Date deadline){
        super(taskName, priority, deadline);
    }

    @Override
    void performTask(){
        System.out.println("Se está ejecutando la tarea tipo shopping " + this.taskName);
    }
}