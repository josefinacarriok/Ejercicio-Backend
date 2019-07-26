package com.cliengo.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class NewTeachingAssistantUtils {
    public List<TeachingAssistant> getNewsTeachingAssistants(List<Student> students){
        return students.stream()
            .filter(Student::isApproved)
            .map(TeachingAssistant::new)
            .collect(Collectors.toList());
    }
}
