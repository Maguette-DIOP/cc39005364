package cc39005364.q4;

public class Zone {
    private String id;

    public String getId() {
        return id;
    }

    public static class ZoneBuilder{
        private String id;

        public ZoneBuilder withId(String id){
            this.id = id;
            return this;
        }
        public ZoneBuilder abonnement(){
            return this;
        }

        public ZoneBuilder addConsommation(){
            return this;
        }

        public ZoneBuilder consommation(){
            return this;
        }

        public Zone reset(){
            Zone zone = new Zone();
            zone.withId= id;
            return zone;
        }
    }
}
