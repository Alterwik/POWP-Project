package factory;

public class FactoryProvider {
    public AbstractFactory getFactory(String choice){
        if("SportsCar".equalsIgnoreCase(choice)){
            return new SportsCarFactory();
        }
        return null;
    }
}
