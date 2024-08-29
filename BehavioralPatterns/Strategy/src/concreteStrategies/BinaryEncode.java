package concreteStrategies;

import strategy.Encode;

public class BinaryEncode implements Encode {
    @Override
    public String run(String content) {
        return "Binary encoded: " + content;
    }
}
