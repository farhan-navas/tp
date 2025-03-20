package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Command guide component that is displayed on the left hand side of the main window.
 */
public class CommandGuidePanel extends UiPart<Region> {
    private static final String FXML = "CommandGuidePlaceholder.fxml";
    private static final String COMMAND_GUIDE_TITLE = "Command Guide";
    private static final String COMMAND_GUIDE_DESCRIPTION =
            "These are the list of commands available in the application.";
    private static final String ADD_COMMAND = "Add a person: add n/NAME p/PHONE e/EMAIL a/ADDRESS t/TAG";
    private static final String CLEAR_COMMAND = "Clear all persons: clear";
    private static final String DELETE_COMMAND = "Delete a person: delete INDEX";
    private static final String EDIT_COMMAND =
            "Edit a person: edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]";
    private static final String EXIT_COMMAND = "Exit the application: exit";
    private static final String FIND_COMMAND = "Find persons: find KEYWORD [MORE_KEYWORDS]";
    private static final String HELP_COMMAND = "Open help window: help";
    private static final String LIST_COMMAND = "List all persons: list";

    @FXML
    private VBox commandGuidePlaceholder;

    @FXML
    private Label commandGuideTitle;

    @FXML
    private Label commandGuideDescription;

    @FXML
    private Label addCommand;

    @FXML
    private Label clearCommand;

    @FXML
    private Label deleteCommand;

    @FXML
    private Label editCommand;

    @FXML
    private Label exitCommand;

    @FXML
    private Label findCommand;

    @FXML
    private Label helpCommand;

    @FXML
    private Label listCommand;

    /**
     * Creates a {@code CommandGuidePlaceholder} with hardcoded commands.
     */
    public CommandGuidePanel() {
        super(FXML);
        commandGuideTitle.setText(COMMAND_GUIDE_TITLE);
        commandGuideDescription.setText(COMMAND_GUIDE_DESCRIPTION);
        addCommand.setText(ADD_COMMAND);
        clearCommand.setText(CLEAR_COMMAND);
        deleteCommand.setText(DELETE_COMMAND);
        editCommand.setText(EDIT_COMMAND);
        exitCommand.setText(EXIT_COMMAND);
        findCommand.setText(FIND_COMMAND);
        helpCommand.setText(HELP_COMMAND);
        listCommand.setText(LIST_COMMAND);
    }
}
