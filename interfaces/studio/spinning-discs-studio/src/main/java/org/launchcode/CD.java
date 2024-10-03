package org.launchcode;

public class CD extends Media implements Rewritable {
    // TODO: Implement your custom interface.
    private boolean isMusicCD;

    public CD(String name, boolean isMusicCD) {
        super(name, "", 800, 700);
        this.isMusicCD = isMusicCD;
        setDiscType(isMusicCD ? "music CD" : "CD-RW");
    }

    public CD(String name) {
        this(name, false);
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public String toString() {
        String header = isMusicCD ? "Tracks" : "Files";
        return super.toString() + getFormattedFileList(header);
    }

    //rewrtiable methods

    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCD ? "Track" : "File";
        if (getFiles().contains(file)) {
            System.out.println("The " + fileType + " " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING: THERE IS NOT ENOUGH SPACE ON THE " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The " + fileType + " " + file.getName() + " has been added to " + getName() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        if (isMusicCD) {
            System.out.println("Single files cannot be removed from a music CD once written.");
        } else {
            spinDisc();
            if (fileIsPresent(file)) {
                getFiles().remove(file);
                System.out.println("The file " + file.getName() + " has been removed from the " + getDiscType());
            }
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
        setMusicCD(false);
        setDiscType("CD-RW");
        setName("Unnamed CD-RW");
    }

    @Override
    public void runFile(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            String verb = isMusicCD ? "Playing" : "Opening file ";
            System.out.println(verb + " " + file.getName() + "...");
        }
    }
}
