package com.nytimes.android.ads;

import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.by0;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.nytimes.android.ads.a$a, reason: collision with other inner class name */
    public static final class C0234a {
        public static long a(a aVar) {
            return AbraPackageKt.MS_IN_HOUR;
        }

        public static String b(a aVar) {
            return aVar.i() ? "tablet" : "phone";
        }
    }

    boolean a();

    String b();

    Object c(by0 by0Var);

    long d();

    String e();

    String f();

    String g();

    String getAppVersion();

    String h();

    boolean i();

    boolean j();

    Object n(by0 by0Var);
}
