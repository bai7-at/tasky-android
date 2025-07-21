package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ai4 {
    public static final a Companion = new a(null);
    private final float a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ai4(Application application) {
        zq3.h(application, "app");
        this.a = application.getResources().getDisplayMetrics().density;
    }

    private final int a(int i) {
        return (int) (this.a * i);
    }

    public final Bitmap b(String str) {
        if (str == null) {
            return null;
        }
        return og3.c().o(str).n(a(64), a(64)).get();
    }
}
