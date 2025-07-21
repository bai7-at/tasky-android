package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class eu3 {
    public static final eu3 a = new eu3();

    private eu3() {
    }

    public final List a(int i, int[] iArr, String[] strArr, int[] iArr2) {
        String str;
        zq3.h(iArr, "stack");
        zq3.h(strArr, "pathNames");
        zq3.h(iArr2, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = strArr[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
