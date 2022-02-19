package OO.shape;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle hinhtron = new Circle(" nhac xuan tet ");
        hinhtron.rotate();
        hinhtron.playSound();
        Square hinhvuong = new Square(" nhac mua he ");
        hinhvuong.rotate();
        hinhtron.playSound();
        Triangle hinhtamgiac = new Triangle(" nhac mua thu ");
        hinhtamgiac.rotate();
        hinhtamgiac.playSound();
        Amoeba amoeba = new Amoeba(" nhac mua dong " );
        amoeba.rotate();
        amoeba.playSound();
        Amoeba amoeba2 = new Amoeba(" cach quay hinh ", 3, 5);
        amoeba2.rotate();
        amoeba2.playSound();
        amoeba.x = 2;
    }
}
