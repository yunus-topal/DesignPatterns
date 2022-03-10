package BuilderPackage;

public class BpBuilder implements Builder{
    private BasketballPlayer bb;

    public BpBuilder(){
        bb = new BasketballPlayer();
    }
    @Override
    public void setName(String name) {
        bb.setName(name);
    }

    @Override
    public void setHeight(double height) {
        bb.setHeight(height);
    }

    @Override
    public void setValue(int value) {
        bb.setValue(value);
    }

    @Override
    public void setWeight(int weight) {
        bb.setWeight(weight);
    }

    @Override
    public void setPosition(String position) {
        bb.setPosition(position);
    }

    @Override
    public void setAge(int age) {
        bb.setAge(age);
    }

    @Override
    public void setNation(String nation) {
        bb.setNation(nation);
    }
    public BasketballPlayer getProduct(){
        BasketballPlayer product = this.bb;
        this.bb = new BasketballPlayer();
        return product;
    }
}
