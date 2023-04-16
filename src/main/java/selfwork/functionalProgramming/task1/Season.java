package selfwork.functionalProgramming.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@ToString

public class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;
}
