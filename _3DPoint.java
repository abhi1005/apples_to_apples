package assignment6.comparable;

public class _3DPoint implements Comparable<_3DPoint>{

    private int x,y,z;

    public _3DPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "_3DPoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public int compareTo(_3DPoint obj) {
        double distance1 = Math.sqrt(x*x+y*y+z*z);
        double distance2 = Math.sqrt(obj.getX()*obj.getX()+obj.getY()*obj.getY()+obj.getZ()*obj.getZ());
        if(distance1 == distance2){
            return 0;
        }else if(distance1 > distance2){
            return 1;
        }else{
            return -1;
        }
    }
}
