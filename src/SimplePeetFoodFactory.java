public class SimplePeetFoodFactory {
  public PetFood createPetFood(String request) {
    PetFood petFood = null;
    if ("CAT FOOD".equals(request)) {
      petFood = new CatFood();
    } else if ("DOG FOOD".equals(request)) {
      petFood = new DogFood();
    }
    return petFood;
  }

}
