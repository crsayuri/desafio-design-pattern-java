public class DogsFoodProducer extends PetStore {
  @Override
  public PetFood createPetFood() {
    return new DogFood();
  }
}
