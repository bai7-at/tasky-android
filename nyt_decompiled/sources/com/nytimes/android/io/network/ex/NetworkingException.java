package com.nytimes.android.io.network.ex;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NetworkingException extends RuntimeException {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetworkingException(java.lang.String r2, java.lang.Object... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "message"
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = "args"
            defpackage.zq3.h(r3, r0)
            z38 r0 = defpackage.z38.a
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "format(...)"
            defpackage.zq3.g(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.io.network.ex.NetworkingException.<init>(java.lang.String, java.lang.Object[]):void");
    }
}
