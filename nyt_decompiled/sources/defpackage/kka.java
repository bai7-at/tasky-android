package defpackage;

import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public abstract class kka {
    static long a(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return ((i & 1) == 0 ? a(j2, i2) : j * (a(j2, i2) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            fgb.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long e = e(strArr, 0, 6);
        d(i, e, b(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            long a = hka.a(strArr[i3 - 1]);
            long a2 = hka.a(strArr[i3 + 5]);
            String b = b(strArr, i3, 6);
            e = ((((((e + 1073807359) - ((a(16785407L, 5) * ((a + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((a2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i, e, b, length2, priorityQueue);
            i3++;
        }
    }

    static void d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        jka jkaVar = new jka(j, str, i2);
        if ((priorityQueue.size() != i || (((jka) priorityQueue.peek()).c <= jkaVar.c && ((jka) priorityQueue.peek()).a <= jkaVar.a)) && !priorityQueue.contains(jkaVar)) {
            priorityQueue.add(jkaVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(String[] strArr, int i, int i2) {
        long a = (hka.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((hka.a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
