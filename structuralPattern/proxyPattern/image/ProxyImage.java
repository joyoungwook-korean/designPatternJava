package structuralPattern.proxyPattern.image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String filenName) {
        this.fileName = filenName;
    }

    @Override
    public String display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        return realImage.display();
    }
}
