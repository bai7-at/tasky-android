package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s3f {
    static HashSet a(int i) {
        return new HashSet(d(i));
    }

    public static LinkedHashMap b(int i) {
        return new LinkedHashMap(d(i));
    }

    public static List c(int i) {
        return i == 0 ? Collections.emptyList() : new ArrayList(i);
    }

    private static int d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
