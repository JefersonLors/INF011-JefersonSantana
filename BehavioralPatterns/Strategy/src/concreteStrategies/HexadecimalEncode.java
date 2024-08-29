package concreteStrategies;

import strategy.Encode;

public class HexadecimalEncode implements Encode {
    @Override
    public String run(String content) {
        return "Hexadecimal encoded: " + content;
    }
}
