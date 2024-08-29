package ConcreteOriginator;

import Originator.Originator;

import java.time.LocalDateTime;

//Concrete Originator
public class XFile implements Originator<XFile.Snapshot> {
    private String fileName;
    private LocalDateTime createAt;
    private String content;

    public XFile(String fileName, LocalDateTime createAt, String content){
        this.fileName = fileName;
        this.createAt = createAt;
        this.content = content;
    }

    @Override
    public Snapshot checkpoint() {
        return new Snapshot(this.fileName, this.createAt, this.content);
    }

    @Override
    public void restore(Snapshot snapshot) {
        this.fileName = snapshot.getFileName();
        this.createAt = snapshot.getCreateAt();
        this.content = snapshot.getContent();
    }

    @Override
    public String toString(){
        return "Name: " + this.fileName + "\n" +
                "Created At: " + this.createAt + "\n" +
                "Content: " + this.content + "\n";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Concrete Memento
    public class Snapshot{
        private String fileName;
        private LocalDateTime createAt;
        private String content;

        public Snapshot(String fileName, LocalDateTime createAt, String content) {
            this.fileName = fileName;
            this.createAt = createAt;
            this.content = content;
        }

        private String getFileName() {
            return fileName;
        }

        private LocalDateTime getCreateAt() {
            return createAt;
        }

        private String getContent() {
            return content;
        }
    }
}
