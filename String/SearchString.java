public class SearchString {

  public static void main(String[] args) {
    String Name = "Akash_Holambe";
    char target = 's';

    int ans = search(Name, target);
    System.out.println(ans);
  }

  static int search(String Name, char target) {
    for (char i = 0; i <= Name.length() - 1; i++) {
      if (Name.charAt(i) == target) {
        return i;
      }
    }

    return -1;
  }
}
