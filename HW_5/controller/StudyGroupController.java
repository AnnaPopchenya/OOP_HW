package controller;


import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

public class StudyGroupController {
    private StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroup(int teacherId, List<Student> students) {
        Teacher teacher = getTeacherById(teacherId);
        return studyGroupService.createStudyGroup(teacher, students);
    }

    private Teacher getTeacherById(int teacherId) {
        return new Teacher(teacherId, "Крантовский", "Михаил", "Александрович");
    }
}