package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import seedu.address.commons.core.GuiSettings;
import seedu.address.model.flashcard.FlashcardSet;
import seedu.address.model.systemlevelmodel.ReadOnlyUserPrefs;

/**
 * The API of the Model component.
 */
public interface Model extends AddressBookModel, ScheduleModel, FlashcardModel, QuizModel {

    /** {@code Predicate} that always evaluate to true */
    Predicate<FlashcardSet> PREDICATE_SHOW_ALL_FLASHCARDSETS = unused -> true;

    /**
     * Replaces user prefs data with the data in {@code userPrefs}.
     */
    void setUserPrefs(ReadOnlyUserPrefs userPrefs);

    /**
     * Returns the user prefs.
     */
    ReadOnlyUserPrefs getUserPrefs();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Sets the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Sets the user prefs' address book file path.
     */
    void setAddressBookFilePath(Path addressBookFilePath);

    /**
     * Returns the user prefs' schedule file path.
     */
    Path getScheduleFilePath();

    /**
     * Sets the user prefs' schedule file path.
     */
    void setScheduleFilePath(Path scheduleFilePath);

}
