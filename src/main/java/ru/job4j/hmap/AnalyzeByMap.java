package ru.job4j.hmap;

import java.util.*;
import java.util.function.BiFunction;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                score += subject.score();
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        int count = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            label.add(new Label(pupil.name(), score / count));
            score = 0;
            count = 0;
        }
        return label;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);
            }
        }
        for (String key : temp.keySet()) {
            label.add(new Label(key, (double) temp.get(key) / pupils.size()));
        }
        return label;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        double score = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            label.add(new Label(pupil.name(), score));
            score = 0;
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                temp.merge(subject.name(), subject.score(), (oldValue, newValue) -> oldValue + newValue);
            }
        }
        for (String key : temp.keySet()) {
            label.add(new Label(key, (double) temp.get(key)));
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }
}
