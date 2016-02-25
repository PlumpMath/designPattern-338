/**
 * Created by Termex on 11/02/2016.
 */
public class highterBrightness implements Command{
    private Brightness brightness;
    private String name = "Augmente Luminosite";;
    public highterBrightness(Brightness brightness) {
        this.brightness = brightness;
    }

    @Override
    public String name() {
        return name;
    }

    public void execute(){
        brightness.brightnessUp();
    }
}
