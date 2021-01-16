package codewars_2020;

public class HumanReadableTime
{
    private HumanReadableTime()
    {
    }

    public static String makeReadable(int seconds)
    {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int sec = (seconds % 3600) % 60;
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", sec);
    }

}