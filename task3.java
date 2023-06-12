// *Сравнить время выполнения замены символа "а" на "А" любой строки 
// содержащей >1000 символов средствами String и StringBuilder.

public class task3 {
  public static void main(String[] args) {
    String s1 = "gbUGkrMEoCmXZmFcs78NtDT4VNNSeRTLe0FPf6kC8Y0JJUveJ8rv7zTAn74IZsztjKggEbnwoOYHjJXgtMFS5wn6VlOJQgl0QZyZBRWwGHcmbRUN9CbXkHRHgoVatK8eFGhrYectioxRPa6v9KKvSgS5lwJhHwhZtW5O8FDTHuClVqwJSijOOQac4DfTGQg7kQj728ffbRbGd7sJXe9JXX5D0byCHdjedH4mmCwkjStdTWXFaNuxXSJiDgrQKy0Cpdt5BwHZ9pgr7A8Am4V5mZvI2uNeLXlVP6ekfyrvVl8fOtHIO0xdy1QKg56bFkwwFZE4hZ76QtNnRam58iM0fqxWwfRefnM4vCJt41jHyGirEh2MRKUVImFSQfeoqxDU3cMugDjcFKpqaKKriqf2rvwkTryaKHq1DxPbFx3VOSYG6yPkU5Hw4edUqCQIL3wLxAJGxFm4S8IwDGOcubFegOBlItLFfMPKD8LwJyozqLBbaP3SFnU4CwSbRjUG0DsIxdRZfh5dppf4HRpmDX2fTAKDAkoNidsiumABPXHk4JhCXP5aLjDiVRdF8HBqCLiqnnLfnEJHTkq5rHcxuvOBFNZAok0fwOhx1cs6oAsKQlwTGepCcBIhJ2F8vSDdwcQjKj6C1bDMiaYgfzDJKkzh5pwU8fdfYJldf2lFARfE6MNm0p7ex85HhOZBULKTv5eYg7loSCXXgSjRi62R35Gvh08uT764abvypywBb5s5wsRfCYtYdOM5RT6ro5X06nXIaLNQ9c8cItHdgJXkAUcrSivA7b2zslfoVrIanKWjIZATBu9jbyeREriu1IL8yF9tp6nnamQ4Cuf9A4K6zgnWEBZzF6xGKwRLPTK4I1uFqBHGfWsFj8mXyfYzdf4z9oFM2N0pBmzeRz3uee318cLdKLAFtiow4bNuqxLqrvv0l2xhLfCKb9ZrwmSc6Dpfm6d5ZuqbQhrpRaaZdJOFBQ0ewIzQE0g7Mn945JLtHjvAQUCHXRfrCgOMrGJV2Rn7J74yBc7wXFN0zYVXgkcN1HqOgLoX9bA6Rb4awE8AXPgUBhUQ0XC1qftzx06MByWDJI7Umq9NSrbJ52av";
    StringBuilder s2 = new StringBuilder(s1);
    long start = System.nanoTime();
    s1 = s1.replace('a', 'A');
    // long elapsedTimeMillis = System.currentTimeMillis() - start;
    System.out.printf("Для String операция заняла %s наносекунд \n", (System.nanoTime() - start));
    start = System.nanoTime();
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'a') {
        s2.setCharAt(i, 'A');
      }
    }
    // elapsedTimeMillis = System.currentTimeMillis() - start;
    System.out.printf("Для StringBuilder операция заняла %s наносекунд \n", (System.nanoTime() - start));
  }
    
}
