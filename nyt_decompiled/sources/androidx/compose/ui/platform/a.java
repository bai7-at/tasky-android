package androidx.compose.ui.platform;

import defpackage.y2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class a implements y2 {
    protected String a;
    private final int[] b = new int[2];

    protected final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    protected final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        zq3.z("text");
        return null;
    }

    public void e(String str) {
        f(str);
    }

    protected final void f(String str) {
        this.a = str;
    }
}
