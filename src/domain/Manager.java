package domain;

/**
 * Представляє менеджера, який є працівником.
 */
public class Manager extends Employee {

    /**
     * Конструктор для створення об'єкту менеджера з вказаними співробітниками, ім'ям, посадою, рівнем і відділом.
     * 
     * @param employees масив співробітників, які перебувають під керівництвом менеджера
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядок, що містить інформацію про менеджера та його підлеглих.
     * 
     * @return рядок інформації про менеджера та його підлеглих
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор для створення об'єкту менеджера з вказаними співробітниками.
     * 
     * @param employees масив співробітників, які перебувають під керівництвом менеджера
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор для створення об'єкту менеджера зі стандартними значеннями.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок, що містить імена підлеглих менеджера, розділені комами.
     * 
     * @return рядок із іменами підлеглих менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює співробітників, які перебувають під керівництвом менеджера.
     * 
     * @param employees масив співробітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив співробітників, які перебувають під керівництвом менеджера.
     * 
     * @return масив співробітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
