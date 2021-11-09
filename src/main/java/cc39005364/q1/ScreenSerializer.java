package cc39005364.q1;

public class ScreenSerializer implements Serializer{
    public String name;

    public ScreenSerializer(String name) {
        this.name = name;
    }

    @Override
    public String name(String name) {
        return name(name);
    }

    @Override
    public int size(String name) {
        return name(name).length();
    }

    public ScreenSerializer() {
    }

    @Override
    public String write(String chaine) {
        return write(chaine);
    }
}
