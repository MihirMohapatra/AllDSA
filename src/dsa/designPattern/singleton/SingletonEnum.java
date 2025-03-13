package dsa.designPattern.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void perform() {
        System.out.println("Singleton: " + this.hashCode());
    }
}
