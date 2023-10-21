public class SimpleBurgerFactory {
  public PetFood createBuger(String request) {
    PetFood burger = null;
    if ("BEEF".equals(request)) {
      burger = new CatFood();
    } else if ("VEGGIE".equals(request)) {
      burger = new DogFood();
    }
    return burger;
  }

}
