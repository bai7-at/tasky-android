package com.nytimes.android.ad;

import com.nytimes.android.ad.DFPEnvironmentProvider;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class b {
    private final DFPEnvironmentProvider a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DFPEnvironmentProvider.Environment.values().length];
            try {
                iArr[DFPEnvironmentProvider.Environment.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DFPEnvironmentProvider.Environment.STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public b(DFPEnvironmentProvider dFPEnvironmentProvider) {
        zq3.h(dFPEnvironmentProvider, "environmentProvider");
        this.a = dFPEnvironmentProvider;
    }

    public String a() {
        DFPEnvironmentProvider.Environment a2 = this.a.a();
        int i = a2 == null ? -1 : a.a[a2.ordinal()];
        return i != 1 ? i != 2 ? "nyt" : "zznyt" : "dfp_example_ad";
    }
}
