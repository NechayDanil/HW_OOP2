public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0){
            return;
        }
        if (station > 9){
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0){
            return;
        }
        if (volume > 100){
            return;
        }
        this.volume = volume;
    }
}
