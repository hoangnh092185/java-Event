public class Event {
  private int mPeoples;
  private int mWings;
  private int mChips;
  private int mBeers;
  private String mDecorations;
  private int mCosts;

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
  public int eventCalculator(){
    mCosts = (mWings * 3) + mChips + (mBeers * mPeoples / 10);
    if (mDecorations.equals("Yes")){
      mCosts += 5;
    }
    return mCosts;
  }
}
