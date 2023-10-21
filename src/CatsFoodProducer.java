public class CatsFoodProducer extends Restaurant {

  @Override
  public PetFood createPetFood() {
    return new CatFood();
  }
}
