package domain;

/**
 * Представляє художника, який є працівником.
 */
public class Artist extends Employee {

    /**
     * Конструктор для створення об'єкту художника з вказаними навичками, ім'ям, посадою, рівнем і відділом.
     * 
     * @param skills масив рядків, що містить навички художника
     * @param name ім'я художника
     * @param jobTitle посада художника
     * @param level рівень художника
     * @param dept відділ художника
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Конструктор для створення об'єкту художника з вказаними навичками.
     * 
     * @param skills масив рядків, що містить навички художника
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }
    
    /**
     * Конструктор для створення об'єкту художника зі стандартними значеннями навичок.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядок, що містить інформацію про художника та його навички.
     * 
     * @return рядок інформації про художника та його навички
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skills;

    /**
     * Повертає рядок, що містить навички художника, розділені комами.
     * 
     * @return рядок із навичками художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює навички художника.
     * 
     * @param skills масив рядків, що містить навички художника
     */
    public void setSkills(String[] skills) {
        this.skills=skills;
    }

    /**
     * Повертає масив рядків, що містить навички художника.
     * 
     * @return масив рядків із навичками художника
     */
    public String[] getSkillsList() {
        return skills;
    }
}
