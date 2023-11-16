package bj.uac.ine.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private List<Double> notes;

    public double getMean() {
        if (notes.size() == 0) {
            return 0.0;
        }

        double mean = 0;

        for (double note : notes) {
            mean += note;
        }

        return mean / notes.size();
    }
}
