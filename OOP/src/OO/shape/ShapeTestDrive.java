package OO.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle hinhtron = new Circle(" nhac xuan tet ");
        hinhtron.Rotate();
        hinhtron.playSound();
        Square hinhvuong = new Square(" nhac mua he ");
        hinhvuong.Rotate();
        hinhtron.playSound();
        Triangle hinhtamgiac = new Triangle(" nhac mua thu ");
        hinhtamgiac.Rotate();
        hinhtamgiac.playSound();
        Amoeba amoeba = new Amoeba(" nhac mua dong " );
        amoeba.Rotate();
        amoeba.playSound();
    }
}
