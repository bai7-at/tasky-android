package com.nytimes.android.ad;

import com.nytimes.android.ad.DFPEnvironmentProvider;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class c {
    private final DFPEnvironmentProvider a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DFPEnvironmentProvider.Environment.values().length];
            try {
                iArr[DFPEnvironmentProvider.Environment.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public c(DFPEnvironmentProvider dFPEnvironmentProvider) {
        zq3.h(dFPEnvironmentProvider, "dfpEnvironment");
        this.a = dFPEnvironmentProvider;
    }

    public String a() {
        DFPEnvironmentProvider.Environment a2 = this.a.a();
        return (a2 == null ? -1 : a.a[a2.ordinal()]) == 1 ? "6253334" : "29390238";
    }
}
