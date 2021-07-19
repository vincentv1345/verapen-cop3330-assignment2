package ex37;
import java.util.ArrayList;
import java.util.Random;
public class getPasswordInstructions {

    private int length;
    private int characters;
    private int numbers;
    Random rand = new Random();
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCharacters() {
        return characters;
    }

    public void setCharacters(int characters) {
        this.characters = characters;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
    public void createRandomPassword(int length, int characters, int numbers){
        int alphabetLength = length - (characters+numbers);
        ArrayList<Character> randomCharacters = new ArrayList<Character>();
        ArrayList<Integer> randomIntegers = new ArrayList<Integer>();
        ArrayList<Character> randomLetters = new ArrayList<Character>();
        String randomCharactersList = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randNumbersList = "1234567890";
        for(char c: randomCharacters){
            randomCharacters.add(c);
        }
        for (int i: randomIntegers){
            randomIntegers.add(i);
        }
        for(char a: randomLetters){
            randomLetters.add(a);
        }
        for(int i = 0; i< numbers; i++){
            int x = rand.nextInt(randNumbersList.length());
        }
        for(int a = 0; a<alphabet.length(); a++){
            int y = rand.nextInt(alphabet.length());
        }
        for(int c = 0; c< characters; c++){
            int z = rand.nextInt(randomCharactersList.length());
        }
    }
}
