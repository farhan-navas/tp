package seedu.address.model.person;

import static seedu.address.commons.util.AppUtil.checkArgument;
import static java.util.Objects.requireNonNull;

public class Grade {
    public static final String MESSAGE_CONSTRAINTS =
            "Subject should be less than 100 characters and grade should be A-F\n"
                    + "Format: subject:grade";
    public static final String GRADE_VALIDATION_REGEX = "[A-F]";
    public static final int MAX_SUBJECT_LENGTH = 100;

    public final String subject;
    public final String grade;


    public Grade(String gradeString) {
        requireNonNull(gradeString);
        String[] parts = gradeString.trim().split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException(MESSAGE_CONSTRAINTS);
        }
        String subject = parts[0].trim();
        String grade = parts[1].trim();
        checkArgument(isValidGrade(subject, grade), MESSAGE_CONSTRAINTS);
        this.subject = subject;
        this.grade = grade;
    }

    public Grade(String subject, String grade) {
        requireNonNull(subject);
        requireNonNull(grade);
        checkArgument(isValidGrade(subject, grade), MESSAGE_CONSTRAINTS);
        this.subject = subject;
        this.grade = grade;
    }

    public static boolean isValidGrade(String subject, String grade) {
        if (subject == null || grade == null) {
            return false;
        }
        return !subject.isEmpty()
                && subject.length() <= MAX_SUBJECT_LENGTH
                && grade.matches(GRADE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return subject + ":" + grade;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Grade)) {
            return false;
        }

        Grade otherGrade = (Grade) other;
        return subject.equals(otherGrade.subject)
                && grade.equals(otherGrade.grade);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}