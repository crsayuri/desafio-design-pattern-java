public class CatsFoodProducer extends PetStore {

  @Override
  public PetFood createPetFood() {
    return new CatFood();
  }
}
