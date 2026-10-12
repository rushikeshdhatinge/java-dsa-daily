class Solution {

  int year = 2026;
  boolean isLeapYear = false;

  public boolean isLeapYear() {
    isLeapYear = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true;
        }else{
          return isLeapYear = false;
        }
      } else {
        isLeapYear = true;
      }
    }

    return isLeapYear;
  }

  public static void main(String[] args) {

    Solution s1 = new Solution();

    if (s1.isLeapYear()) {
      System.out.println("Year is leapyear");
    } else {
      System.out.println("Not");

    }

  }
}