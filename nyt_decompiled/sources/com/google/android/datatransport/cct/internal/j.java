package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.f;

/* loaded from: classes2.dex */
public abstract class j {

    public static abstract class a {
        public abstract j a();

        public abstract a b(Integer num);

        public abstract a c(long j);

        public abstract a d(long j);

        public abstract a e(NetworkConnectionInfo networkConnectionInfo);

        abstract a f(byte[] bArr);

        abstract a g(String str);

        public abstract a h(long j);
    }

    private static a a() {
        return new f.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract NetworkConnectionInfo e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
