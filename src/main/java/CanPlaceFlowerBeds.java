public class CanPlaceFlowerBeds {
    int result;

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0;
        int next = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            next = (i + 1 < len) ? flowerbed[i + 1] : 0;
            if (prev == 0 && next == 0 && flowerbed[i] == 0) {
                n--;
                flowerbed[i] = 1;
            }
            prev = flowerbed[i];
        }
        return n <= 0;
    }
}
