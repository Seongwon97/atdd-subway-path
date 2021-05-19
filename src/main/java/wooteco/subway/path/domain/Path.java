package wooteco.subway.path.domain;

import wooteco.subway.station.domain.Station;

import java.util.List;

public class Path {

    private final List<Station> pathStations;
    private final Integer distance;

    public Path(List<Station> pathStations, Integer distance) {
        this.pathStations = pathStations;
        this.distance = distance;
    }

    public List<Station> getPathStations() {
        return pathStations;
    }

    public Integer getDistance() {
        return distance;
    }
}
