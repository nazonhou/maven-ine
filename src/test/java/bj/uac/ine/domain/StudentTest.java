package bj.uac.ine.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void testThatMeanIsZero() {
        Student student = new Student();
        student.setName("John Doe");
        student.setNotes(new ArrayList<Double>());

        Assert.assertTrue(student.getMean() == 0);
    }

    @Test
    public void testThatMeanIs15() {
        Student student = new Student();
        student.setName("John Doe");
        List<Double> notes = Arrays.asList(15.0, 15.0);
        student.setNotes(notes);

        Assert.assertTrue(student.getMean() == 15.0);
    }
}
