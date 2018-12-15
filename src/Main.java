import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1. Create an Array of Adjectives
        String adjectives[] = {"pretty", "ugly", "gigantic", "large", "small", "funny", "fuzzy", "long", "enormous", "scary", "little", "big", "brave", "furious"};
        // 2. Create an Array of Nouns
        String nouns[] = {"woman", "dog", "boy", "elderly", "cat", "ball", "doll", "necklace", "kitchen", "church", "man", "teacher", "professor", "cop"};
        // 3. Generate a random name
        System.out.println(randomNameGenerator(adjectives, nouns));
    }
      //static method that generates the name
    public static String randomNameGenerator(String adj[], String noun[]) {
        Random random = new Random();
        int adjIndex = random.nextInt(adj.length);
        int nounIndex = random.nextInt(noun.length);
        return adj[adjIndex] + " "+ noun[nounIndex];
    }
}
