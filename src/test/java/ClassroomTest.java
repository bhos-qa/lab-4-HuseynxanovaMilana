import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClassroomTest {

    Classroom classroom = new Classroom();

    @Test
    public void testAddStudent() {
        assertTrue(classroom.addStudent("John Doe"));
    }

    @Test
    public void testRemoveStudent() {
        assertTrue(classroom.removeStudent("John Doe"));
    }

    @Test
    public void testTotalStudents() {
        assertEquals(20, classroom.totalStudents());
    }

    @Test
    public void testStudentExists() {
        assertTrue(classroom.studentExists("John Doe"));
    }

    @Test
    public void testAssignGrade() {
        assertEquals("A", classroom.assignGrade("John Doe", 90));
    }
}
