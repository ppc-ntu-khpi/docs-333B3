package domain;

/**
 * Представляє редактора, який є підтипом художника.
 */
public class Editor extends Artist {

    /**
     * Конструктор для створення об'єкту редактора з вказаними параметрами.
     * 
     * @param electronicEditing флаг, що вказує на можливість редагування електронним методом
     * @param skills масив рядків, що містить навички редактора
     * @param name ім'я редактора
     * @param jobTitle посада редактора
     * @param level рівень редактора
     * @param dept відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкту редактора з вказаними навичками та параметром електронного редагування.
     * 
     * @param electronicEditing флаг, що вказує на можливість редагування електронним методом
     * @param skills масив рядків, що містить навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор для створення об'єкту редактора з параметром електронного редагування.
     * 
     * @param electronicEditing флаг, що вказує на можливість редагування електронним методом
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор для створення об'єкту редактора зі стандартними значеннями.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядок, що містить інформацію про редактора та його вподобання щодо редагування.
     * 
     * @return рядок інформації про редактора та його вподобання щодо редагування
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Повертає флаг, що вказує на можливість редагування електронним методом.
     * 
     * @return true, якщо редагування можливе електронним методом, false - у протилежному випадку
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює вподобання щодо редагування.
     * 
     * @param electronic флаг, що вказує на можливість редагування електронним методом
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
