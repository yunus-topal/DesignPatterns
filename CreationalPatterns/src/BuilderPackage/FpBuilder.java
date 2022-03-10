package BuilderPackage;

public class FpBuilder implements Builder{
    private FootballPlayer fb;
    public FpBuilder(){
        this.fb = new FootballPlayer();
    }

    @Override
    public void setName(String name) {
        fb.setName(name);
    }

    @Override
    public void setHeight(double height) {
        fb.setHeight(height);
    }

    @Override
    public void setValue(int value) {
        fb.setValue(value);
    }

    @Override
    public void setWeight(int weight) {
        fb.setWeight(weight);
    }

    @Override
    public void setPosition(String position) {
        fb.setPosition(position);
    }

    @Override
    public void setAge(int age) {
        fb.setAge(age);
    }

    @Override
    public void setNation(String nation) {
        fb.setNation(nation);
    }

    public FootballPlayer getProduct(){
        FootballPlayer product = this.fb;
        this.fb = new FootballPlayer();
        return product;
    }
}
