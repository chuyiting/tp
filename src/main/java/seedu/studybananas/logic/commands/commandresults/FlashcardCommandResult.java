package seedu.studybananas.logic.commands.commandresults;

import seedu.studybananas.ui.util.UiStateType;

public class FlashcardCommandResult extends CommandResult {

    public FlashcardCommandResult(String feedbackToUser) {
        super(feedbackToUser);
    }

    @Override
    public UiStateType getCommandResultType() {
        return UiStateType.FLASHCARD;
    }
}
