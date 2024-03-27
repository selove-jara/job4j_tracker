package hashmap;

import java.util.*;
import java.util.function.BiFunction;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                sum += subject.score();
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        int sum = 0;
        List<Label> labels = new LinkedList();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum / pupil.subjects().size()));
            sum = 0;
        }
        return labels;

    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue + newValue;
                map.merge(subject.name(), subject.score(), function);
            }
        }
        List<Label> labels = new ArrayList<>();
        map.forEach((key, value) -> {
            labels.add(new Label(key, value / map.size()));
        });
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        int sum = 0;
        List<Label> labels = new LinkedList();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum));
            sum = 0;
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue + newValue;
                map.merge(subject.name(), subject.score(), function);
            }
        }
        List<Label> labels = new ArrayList<>();
        map.forEach((key, value) -> {
            labels.add(new Label(key, value));
        });
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}