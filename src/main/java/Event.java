public class Event {
  private int mPeople;
  private int mWings;
  // private int mChip;
  // private int mBeer;
  // private String mDecoration;

  public Event(int people, int wings){
    mPeople = people;
    mWings = wings;
  }
  public int getPeople(){
    return mPeople;
  }
  public int getWings(){
    return mWings;
  }
}
