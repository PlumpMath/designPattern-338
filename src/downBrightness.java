/**
 * Created by Termex on 11/02/2016.
 */
public class downBrightness implements Command{
    private Brightness brightness;
    private String name = "Baisse Luminosite";

    public downBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    @Override
    public String name() {
        return name;
    }

    public void execute() {
        brightness.brightnessDown();
    }
}
