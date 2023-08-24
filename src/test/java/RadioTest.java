import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMax() {
        Radio radio = new Radio();
        radio.setStation(9);
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMin() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.setStation(0);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMinus() {
        Radio radio = new Radio();
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMaximus() {
        Radio radio = new Radio();
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationOne() {
        Radio radio = new Radio();
        radio.setStation(1);
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationEight() {
        Radio radio = new Radio();
        radio.setStation(8);
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int expected = 50;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(77);
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMinus() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMaximus() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeOne() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNineHundredNine() {
        Radio radio = new Radio();
        radio.setVolume(99);
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStationNext(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationNextZero(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationNextFive(){
        Radio radio = new Radio();
        radio.setStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPrevFive(){
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPrevZero(){
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPrevNine(){
        Radio radio = new Radio();
        radio.setStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPlus(){
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPlusMin(){
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationPlusMidl(){
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationMinuss(){
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.minus();
        int expected = 99;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationMinusZero(){
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.minus();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationMinusMidl(){
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.minus();
        int expected = 49;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testStationRadio() {
        Radio radio = new Radio(29);
        radio.setStation(20);
        int expected = 20;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }


}