package codewars2019;

public class CountIPAddresses
{

    public static long ipsBetween(String start, String end)
    {
        IPAddress iPAddress1 = ipAddressFrom(start);
        IPAddress iPAddress2 = ipAddressFrom(end);

        return (iPAddress2.int4-iPAddress1.int4 +
            (long)(iPAddress2.int3-iPAddress1.int3) * 256 +
            (long)(iPAddress2.int2-iPAddress1.int2) * 256 * 256 +
            (long)(iPAddress2.int1-iPAddress1.int1) * 256 * 256 * 256
        );
    }



    private static class IPAddress
    {
        final int int1;
        final int int2;
        final int int3;
        final int int4;

        public IPAddress(int int1, int int2, int int3, int int4)
        {
            this.int1 = int1;
            this.int2 = int2;
            this.int3 = int3;
            this.int4 = int4;
        }

    }
    public static IPAddress ipAddressFrom(String str)
    {
        String[] parts = str.split("\\.");
        return new IPAddress(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
    }

}