package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream()
                .map(profile -> profile.getAddress())
                .sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
                .distinct()
                .collect(Collectors.toList());

    }
}