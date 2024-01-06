package string;

public class
RadioStation {

    /**
     * Stores the frequency passed to the constructor.
     */
    private final String $frequency;

    /**
     * Stores the mode passed to the constructor.
     */
    private final String $mode;

    /**
     * Stores the stationName passed to the constructor.
     */
    private final String $stationName;

    /**
     * Instantiates the instance with the provided radio station information.
     * @param $frequency the frequency for FM or AM example 99100, 1060, etc
     * @param mode the radio band of the frequency. Either {@link RadioConstants#TYPE_AM} or {@link RadioConstants#TYPE_FM}.
     * @param stationName the name of the station
     */
    public RadioStation(String $frequency, String mode, String stationName) {
        this.$frequency = $frequency;
        this.$mode = mode;
        this.$stationName = stationName;
    }

    /**
     * Gets the frequency.
     * @return the frequency.
     */
    public String getFrequency() {
        return $frequency;
    }

    /**
     * Gets the mode.
     * @return the mode.
     */
    public String getMode() {
        return $mode;
    }

    /**
     * Gets the stationName.
     * @return the stationName.
     */
    public String getStationName() {
        return $stationName;
    }
}