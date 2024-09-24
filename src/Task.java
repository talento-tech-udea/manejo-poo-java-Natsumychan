import java.util.Date;

/*
    Clase abstracta Task
    1. Definir el constructor y los parametros para la clase
    - taskName
    - prority
    - deadline

    2. Definir el metodo abstracto
    - performTask

    3. Crear un metodo que retorne un String para obtener los detalles de un Task
    - getDetails
 */
abstract class Task {
    protected String taskName;
    private int priority;
    private Date deadline;

    public Task( String taskName, int priority, Date deadline){
        this.taskName = taskName;
        this.priority = priority;
        this.deadline = deadline;

    }

    abstract void performTask();

    public String getDetails() {
        return "Tarea {" +
                "taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}