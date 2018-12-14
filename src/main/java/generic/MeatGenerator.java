package generic;

import java.util.Random;

public class MeatGenerator implements Generator<String> {

    private String[] meats = new String[]{"pork", "beaf", "lamb"};
    @Override
    public String next() {
        Random random = new Random();
        return meats[random.nextInt(3)];
    }
}
