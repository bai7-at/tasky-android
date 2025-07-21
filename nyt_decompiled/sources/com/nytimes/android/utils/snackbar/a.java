package com.nytimes.android.utils.snackbar;

import android.app.Activity;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface a {
    public static final C0443a Companion = C0443a.a;

    /* renamed from: com.nytimes.android.utils.snackbar.a$a, reason: collision with other inner class name */
    public static final class C0443a {
        static final /* synthetic */ C0443a a = new C0443a();

        private C0443a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(Activity activity) {
            zq3.h(activity, "activity");
            a aVar = activity instanceof a ? (a) activity : null;
            return aVar != null && aVar.isUsingCompose();
        }
    }

    public static final class b {
        public static boolean a(a aVar) {
            return false;
        }
    }

    static boolean m(Activity activity) {
        return Companion.a(activity);
    }

    boolean isUsingCompose();
}
