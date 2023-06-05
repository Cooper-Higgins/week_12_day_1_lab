public class Bottle {
    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int drinkVolume(){
        this.volume = volume - 10;
        return volume;
    }

    public int emptyVolume(){
        this.volume = 0;
        return volume;
    }

    public int fillVolume(){
        this.volume = 100;
        return volume;
    }
}