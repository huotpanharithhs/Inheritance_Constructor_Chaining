package inherit;

public class Car extends Vehicle{
    private String modelName = "Mastang";
    public void setModelName(String modelName){
        this.modelName = modelName;
    }
    public String getModelName(){
        return modelName;
    }
}
