public class Radio {
    private int station;
    private int volume;

    public void next() {
        if (station != 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station != 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
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
