package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class i61 {
    private static int a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap b(int i) {
        return new LinkedHashMap(a(i));
    }
}
