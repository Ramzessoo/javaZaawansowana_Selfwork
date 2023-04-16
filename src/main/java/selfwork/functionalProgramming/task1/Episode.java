package selfwork.functionalProgramming.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@ToString

public class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;

}
