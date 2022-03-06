package ThuaKe;


public class Lion extends Animal {
    private String eat;
    private String name;
    public Lion( String hunger, String picture, String roams,String name, String eat ){
        super("ot ot", "abc.fbd", "tim ban gai");
        this.eat = eat;
        this.name = name;
        }
    public void setEat(String eat) {
        this.eat = eat;
    }
    public String getEat() {
        return eat;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
