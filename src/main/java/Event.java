public class Event {
  private int mPeoples;
  private int mWings;
  private int mChips;
  private int mBeers;
  private String mDecorations;

  public Event(int peoples, int wings, int chips, int beers, String decorations){
    mPeoples = peoples;
    mWings = wings;
    mChips = chips;
    mBeers = beers;
    mDecorations = decorations;
  }
  public int getPeople(){
    return mPeoples;
  }
  public int getWings(){
    return mWings;
  }
  public int getChips(){
    return mChips;
  }
  public int getBeers(){
    return mBeers;
  }
  public String getDecorations(){
    return mDecorations;
  }
  public boolean eventCalculator(){
    return true;
  }
}
