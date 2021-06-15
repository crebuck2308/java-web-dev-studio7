package org.launchcode.studio7;

public abstract class BaseDisc {

    private String title;
    private double runTime;
    private String mediaType;
    private String discType;

    public BaseDisc(String aDiscType, String aTitle, String aMediaType, double aRuntime){
        discType = aDiscType;
        title = aTitle;
        mediaType = aMediaType;
        runTime = aRuntime;
    }

    public String reportInfo(){
        return "This is a " + discType + "that contains a " +mediaType+ " that is titled: "
                + title + "an has a runtime of " + runTime + ".";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
}
