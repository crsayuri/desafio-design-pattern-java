public abstract class PetStore {

  public void orderPetFood() {
    System.out.println("Ordering your pet's food...");
    PetFood petFood = createPetFood();
    petFood.prepare();
  }

  public abstract PetFood createPetFood();

}
