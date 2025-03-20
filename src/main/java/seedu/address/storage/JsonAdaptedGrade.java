package seedu.address.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.person.Grade;

/**
 * Jackson-friendly version of {@link Grade}.
 */
public class JsonAdaptedGrade {
    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Grade's %s field is missing!";

    private final String subject;
    private final String grade;

    /**
     * Constructs a {@code JsonAdaptedGrade} with the given grade details.
     */
    @JsonCreator
    public JsonAdaptedGrade(@JsonProperty("subject") String subject, @JsonProperty("grade") String grade) {
        this.subject = subject;
        this.grade = grade;
    }

    /**
     * Converts a given {@code Grade} into this class for Jackson use.
     */
    public JsonAdaptedGrade(Grade source) {
        subject = source.subject;
        grade = source.grade;
    }

    /**
     * Converts this Jackson-friendly adapted grade object into the model's {@code Grade} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted grade.
     */
    public Grade toModelType() throws IllegalValueException {
        if (subject == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, "subject"));
        }
        if (grade == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT, "grade"));
        }
        if (!Grade.isValidGrade(subject, grade)) {
            throw new IllegalValueException(Grade.MESSAGE_CONSTRAINTS);
        }
        return new Grade(subject, grade);
    }
}