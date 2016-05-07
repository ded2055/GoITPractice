import java.util.Arrays;

public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {
        int[] gnamesSorted = Arrays.copyOf(gnames, gnames.length);
        int[] portionsSorted = Arrays.copyOf(portions, portions.length);
        int[] result = new int[gnames.length];

        Arrays.sort(gnamesSorted);
        Arrays.sort(portionsSorted);

        for (int i = 0; i < gnames.length; i++)
            for (int j = 0; j < gnamesSorted.length; j++)
                if (gnames[i] == gnamesSorted[j])
                    for (int k = 0; k < portions.length; k++)
                        if (portionsSorted[j] == portions[k]) result[i] = k;


        return result;
    }
}
