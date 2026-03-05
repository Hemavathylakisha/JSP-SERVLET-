package com.StudentInformationSystem;

import java.util.List;

public class Student {

    private String studentId;
    private PersonalInfo personalInfo;
    private AcademicDetails academicDetails;
    private List<ExtraCurricular> extraCurricular;
    private Scholarship scholarship;

    public Student() {}

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public void setPersonalInfo(PersonalInfo personalInfo) { this.personalInfo = personalInfo; }

    public AcademicDetails getAcademicDetails() { return academicDetails; }
    public void setAcademicDetails(AcademicDetails academicDetails) { this.academicDetails = academicDetails; }

    public List<ExtraCurricular> getExtraCurricular() { return extraCurricular; }
    public void setExtraCurricular(List<ExtraCurricular> extraCurricular) { this.extraCurricular = extraCurricular; }

    public Scholarship getScholarship() { return scholarship; }
    public void setScholarship(Scholarship scholarship) { this.scholarship = scholarship; }
}
