package defpackage;

import com.google.android.gms.internal.pal.zzvn;

/* loaded from: classes3.dex */
abstract /* synthetic */ class gpf {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[zzvn.values().length];
        a = iArr;
        try {
            iArr[zzvn.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[zzvn.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
