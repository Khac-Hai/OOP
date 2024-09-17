package week4;

// Lớp Tune
class Tune {
    public void play() {
        System.out.println("Playing a regular tune...");
    }
}

// Lớp ObnoxiousTune kế thừa Tune
class ObnoxiousTune extends Tune {
    @Override
    public void play() {
        System.out.println("Playing an obnoxious tune!");
    }
}

// Lớp CellPhone có phương thức ring
class CellPhone {
    public void ring(Tune tune) {
        tune.play();
    }
}

// Lớp DisruptLecture để chạy chương trình
public class DisruptLecture {
    public static void main(String[] args) {
        CellPhone noiseMaker = new CellPhone();
        ObnoxiousTune ot = new ObnoxiousTune();
        noiseMaker.ring(ot); // ot là lớp con của Tune, sẽ hoạt động
    }
}

