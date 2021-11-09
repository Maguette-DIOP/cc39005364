package cc39005364.q1;

public class FactorySerializer {
    public static final FactorySerializer INSTANCE = new FactorySerializer();
    public static FactorySerializer getInstance(){
        return INSTANCE;
    }
    public Serializer create(TypeSerializer type, String name){
        switch (type){
            case FILESERIALIZER:
                return new FileSerializer(name);
            default:
                return new ScreenSerializer(name);
        }
    }
}
