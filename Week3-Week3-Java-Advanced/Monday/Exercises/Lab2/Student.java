import java.util.Objects;
/**
 * Lab 2 — Student. Replace UnsupportedOperationException bodies with real logic.
 * See ../README.md
 */
public class Student {
    private static int nextId = 0;
    private static int count;
    private final int id;
    private String name;
    private String program;



    public Student(String name, String program) {
        id = nextId;
        nextId += 1;
        count += 1;

        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public static int getEnrollmentCount() {
        return count;
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o)
        {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Student other = (Student) o;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}