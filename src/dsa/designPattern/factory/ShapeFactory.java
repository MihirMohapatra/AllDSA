package dsa.designPattern.factory;

public class ShapeFactory {

    public Shape type(String type) {
        if(type == null || type.isEmpty()){
           throw new IllegalArgumentException("No Shape available");
        }

        if (type.equalsIgnoreCase("circle")){
            return  new Circle();
        }

        if (type.equalsIgnoreCase("Square")) return new Square();

        if (type.equalsIgnoreCase("rectangle")) return new Rectangle();

        return null;
    }
}
