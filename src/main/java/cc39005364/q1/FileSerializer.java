package cc39005364.q1;

public class FileSerializer implements Serializer{
    private String name;
    public FileSerializer(){}
    @Override
    public String name(String name) {
        return name(name);
    }

    public FileSerializer(String name) {
        this.name = name;
    }

    @Override
    public int size(String name) {
        return name(name).length();
    }

    @Override
    public String write(String chaine) {
        return write(chaine);
    }
}
