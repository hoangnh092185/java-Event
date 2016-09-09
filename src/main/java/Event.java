public class Event {
  private int mPeoples;
  private int mCatering;
  private int mEntertainment;
  private int mAlcohol;
  private String mDecorations;
  private int mCosts;

  public Event(int peoples, int catering, int entertainment, int alcohol, String decorations){
    mPeoples = peoples;
    mCatering = catering;
    mEntertainment = entertainment;
    mAlcohol = alcohol;
    mDecorations = decorations;
  }
  public int getPeoples(){
    return mPeoples;
  }
  public int getCatering(){
    return mCatering;
  }
  public int getEntertainment(){
    return mEntertainment;
  }
  public int getAlcohol(){
    return mAlcohol;
  }
  public String getDecorations(){
    return mDecorations;
  }
  public int eventCalculator(){
    mCosts = mPeoples + (mCatering * 20) + (mEntertainment * 100) + (mAlcohol * 10);
    if (mDecorations.equalsIgnoreCase("Yes")){
      mCosts += 5;
    }
    if (mPeoples >= 50) {
      mCosts += 100;
    }
    return mCosts;
  }
}
