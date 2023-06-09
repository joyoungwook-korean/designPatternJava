package structuralPattern.proxyPattern.image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public String display() {
        return "display " + fileName;
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading " + fileName);
    }

}
