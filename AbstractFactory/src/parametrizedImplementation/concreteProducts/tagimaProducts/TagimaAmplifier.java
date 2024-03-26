package parametrizedImplementation.concreteProducts.tagimaProducts;

import parametrizedImplementation.products.Amplifier;

public class TagimaAmplifier implements Amplifier {
    /**
     *
     */
    @Override
    public void identifyAmplifier() {
        System.out.println("Tagima amplifier");
    }

    /**
     *
     */
    @Override
    public void play() {
        System.out.println("playing tagima guitar amplifier");
    }
}
