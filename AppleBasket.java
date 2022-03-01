package assignment6.comparable;

public class AppleBasket implements Comparable<AppleBasket>{
    private int numApples;

    public AppleBasket(int numApples){
        this.numApples = numApples;
    }

    public int getNumApples() {
        return numApples;
    }

    @Override
    public String toString() {
        return "AppleBasket{" +
                "numApples=" + numApples +
                '}';
    }

    @Override
    public int compareTo(AppleBasket obj) {
        if(numApples == obj.getNumApples()){
            return 0;
        }else if(numApples > obj.getNumApples()){
            return 1;
        }else{
            return -1;
        }
    }

}
