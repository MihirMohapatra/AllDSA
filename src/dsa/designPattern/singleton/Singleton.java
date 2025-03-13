package dsa.designPattern.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

    public static Singleton instance;

    private Singleton(){
        //protect against reflection
        if (instance==null){
            throw new IllegalArgumentException("Singleton instance already created.");
        }
    }


    public static Singleton getInstance() {
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    //Protect against Serialization
    private Object readResolve(){
        return instance;
    }


    //protected from clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton clone not allowed.");
    }
}
