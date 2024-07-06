class Solution {
    public int passThePillow(int n, int time) {
        // Döngü uzunluğunu hesapla
        int cycleLength = 2 * (n - 1);
        // Etkin zamanı hesapla
        int effectiveTime = time % cycleLength;

        // Pozisyonu belirle
        if (effectiveTime < n) {
            return effectiveTime + 1; // İleri yönde
        } else {
            return 2 * n - effectiveTime - 1; // Geri yönde
        }
    }
}