public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double volume = height*baseArea;
        return volume;
    }
    private static double getBaseArea(int radius){
        return Math.PI*radius*radius;
    }
}
