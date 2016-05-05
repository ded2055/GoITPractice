package goit.task3_2;


public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int border1 = gdp[0];
        int border1Index = 0;
        int border2 = gdp[0];
        int border2Index = 0;
        int period = 1;
        int maxPeriod = 1;

        if (gdp.length == 1) return 1;

        for ( int i = 1 ; i < gdp.length; i++)
        {
            if (border1 == border2) {
                if (gdp[i] == border1) {
                    period++;
                    continue;
                }
                if (Math.abs(gdp[i] - border1) < 2) {
                    period++;
                    border2 = gdp[i];
                    border2Index = i;
                    continue;
                }
                if(maxPeriod < period)maxPeriod = period;
                period=1;
                border1=gdp[i];
                border2=gdp[i];
                border1Index=i;
                border2Index=i;
                continue;
            }
            if (gdp[i] == border1)
            {
                if (border1Index < border2Index) border1Index = i;
                period++;
                continue;
            }
            if (gdp[i] == border2)
            {
                if (border2Index < border1Index) border2Index = i;
                period++;
                continue;
            }
            if (Math.abs(gdp[i] - border1) < 2)
            {
                if(maxPeriod < period) maxPeriod = period;
                if (border1Index > border2Index)
                {
                    period = i - border1Index+ 1;
                    border2 = gdp[i];
                    border2Index = i;
                }
                continue;
            }
            if (Math.abs(gdp[i] - border2) < 2) {
                if (maxPeriod < period) maxPeriod = period;
                if (border2Index > border1Index) {
                    period = i - border2Index + 1;
                    border1 = gdp[i];
                    border1Index = i;
                }
                continue;
            }

            if(maxPeriod < period)maxPeriod = period;
            period=1;
            border1=gdp[i];
            border2=gdp[i];
            border1Index=i;
            border2Index=i;
        }
        return maxPeriod;
    }
}
