package Bridge.ImageParseInMultipleSystem.images;

import Bridge.ImageParseInMultipleSystem.systems.ISystem;

public abstract class Image {
    protected ISystem iSystem;
    
    public Image (ISystem iSystem) {
        this.iSystem = iSystem;
    }
    
    public abstract void parseFile(String fileName);
}
