import java.util.Arrays;

public class CSLab8 {
    public static void main(String[] args) {
        int[][] adja = { { 0, 2, 6, 711, 711, 711, 711 },
                { 2, 0, 711, 5, 711, 711, 711 },
                { 6, 711, 0, 8, 711, 711, 711 },
                { 711, 5, 8, 0, 10, 15, 711 },
                { 711, 711, 711, 10, 0, 6, 2 },
                { 711, 711, 711, 15, 6, 0, 6 },
                { 711, 711, 711, 711, 2, 6, 0 }
        };
        int[] dist = { 0, 711, 711, 711, 711, 711, 711 };
        for (int city = 0; city < adja.length; city++) {
            for (int dest = 1; dest < adja.length; dest++) {
                if (dist[dest] < 711)
                    System.out.println("dest" + dest + "dist" + dist[dest]);

                if (dist[dest] < dist[dest] + adja[city][dest])
                    ;
                dest++;
                dist[dest] = dist[city] + adja[city][dest];

            }
            System.out.println(dist);
            // System.out.println("------------------------");
            /* q3 */
            // System.out.println(Arrays.toString(dist)); /* q4 */
        }
    }

}
