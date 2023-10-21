public class App {
    public static void main(String[] args) {
        PetStore catFood = new CatsFoodProducer();
        catFood.orderPetFood();

        PetStore dogFood = new DogsFoodProducer();
        dogFood.orderPetFood();
    }
}
