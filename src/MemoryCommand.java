import java.util.ArrayList;
import java.util.List;

/**
 * Created by Termex on 11/02/2016.
 */
public class MemoryCommand {
    private List<Command> history = new ArrayList<Command>();

    public MemoryCommand() {
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }

    public List<Command> getHistoryCommand(){
        return history;
    }
}
