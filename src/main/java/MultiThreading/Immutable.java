package MultiThreading;


final class Immutable {

    private final String name ;

    Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ImmutableImpl{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Immutable immutable = new Immutable("vishnu");
        System.out.println(immutable.getName());
    }

}
