package selfwork.functionalProgramming.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var video = new Video("GOT1", "got1.com", VideoType.CLIP);
        var video1 = new Video("Got2", "got2.com", VideoType.EPISODE);
        var video2 = new Video("G0T3", "got3.com", VideoType.PREVIEW);
        var video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        var video4 = new Video("GOT5", "got5.com", VideoType.EPISODE);
        var video5 = new Video("GOT6", "got6.com", VideoType.CLIP);

        var episode = new Episode("got1", 1, Arrays.asList(video, video1));
        var episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        var episode2 = new Episode("got3", 3, Arrays.asList(video4, video5));
        var season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        var season1 = new Season("GOTS1", 2, Arrays.asList(episode2));

        List<Season> seasons = Arrays.asList(season, season1);

        List<Episode> episodes = seasons.stream()
                .flatMap(s -> season.episodes.stream()).toList();

        List<Video> videos = episodes.stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> episode.videos.stream()).toList();

        List<String> seasonNames = seasons.stream()
                .map(s -> s.seasonName).toList();

        List<Integer> seasonNumbers = seasons.stream()
                .map(s -> s.seasonNumber).toList();

        List<String> episodesNames = episodes.stream()
                .flatMap(s -> season.episodes.stream())
                .map(e -> e.episodeName).toList();
    }
}