package context;

import strategy.Encode;

public class Encoder {
    private Encode encode;
    private String content;

    public Encoder(Encode encode, String content){
        this.encode = encode;
        this.content = content;
    }

    public void setEncode(Encode encode) {
        this.encode = encode;
    }

    public String doEncode(){
        return this.encode.run(this.content);
    }
}
