public class Radio {
    private int station;
    private int volume;
    private int maxStation;
    public Radio(){
        this.maxStation = 9;
    }
    public Radio(int stations) {
        this.maxStation = stations - 1;
    }

    public void next() {
        if (station != maxStation) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station != 0) {
            station--;
        } else {
            station = maxStation;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }
    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

        public void minus () {
            if (volume > 0) {
                volume = volume - 1;
            }
        }

        public void setVolume ( int volume){
            if (volume < 0) {
                return;
            }
            if (volume > 100) {
                return;
            }
            this.volume = volume;
        }
    }
