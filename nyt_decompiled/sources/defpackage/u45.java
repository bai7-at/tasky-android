package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class u45 {
    public static final int[] a(NetworkRequest networkRequest) {
        zq3.h(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return s45.a.a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 29; i++) {
            int i2 = iArr[i];
            if (p45.a.c(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return i.W0(arrayList);
    }

    public static final int[] b(NetworkRequest networkRequest) {
        zq3.h(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return s45.a.b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            int i2 = iArr[i];
            if (p45.a.d(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return i.W0(arrayList);
    }
}
