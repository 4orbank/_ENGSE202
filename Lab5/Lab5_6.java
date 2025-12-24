package Lab5;
import java.util.Scanner;

class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media mediaItem) {
        mediaItem.process();
    }
}

public class Lab5_6 {
    public static void main(String[] args) {
        Scanner mediaInputReader = new Scanner(System.in);

        String videoTitle = mediaInputReader.nextLine();
        int videoDuration = Integer.parseInt(mediaInputReader.nextLine());

        String audioTitle = mediaInputReader.nextLine();
        String audioQuality = mediaInputReader.nextLine();

        Media videoMedia = new Video(videoTitle, videoDuration);
        Media audioMedia = new Audio(audioTitle, audioQuality);

        Processor.runProcessor(videoMedia);
        Processor.runProcessor(audioMedia);

        mediaInputReader.close();
    }
}
