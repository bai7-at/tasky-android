package com.nytimes.android.performancetrackerclientphoenix.tracing;

import android.app.Activity;
import android.os.Bundle;
import defpackage.es7;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface a extends es7 {

    /* renamed from: com.nytimes.android.performancetrackerclientphoenix.tracing.a$a, reason: collision with other inner class name */
    public static final class C0375a {
        public static void a(a aVar, Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            es7.a.a(aVar, activity, bundle);
        }

        public static void b(a aVar, Activity activity) {
            zq3.h(activity, "activity");
            es7.a.b(aVar, activity);
        }

        public static void c(a aVar, Activity activity) {
            zq3.h(activity, "activity");
            es7.a.c(aVar, activity);
        }

        public static void d(a aVar, Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            zq3.h(bundle, "outState");
            es7.a.e(aVar, activity, bundle);
        }

        public static void e(a aVar, Activity activity) {
            zq3.h(activity, "activity");
            es7.a.f(aVar, activity);
        }

        public static void f(a aVar, Activity activity) {
            zq3.h(activity, "activity");
            es7.a.g(aVar, activity);
        }
    }

    String a();

    boolean b();
}
