package androidx.navigation;

import android.content.Context;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g {
    public static final a c = new a(null);
    private static final ThreadLocal d = new ThreadLocal();
    private final Context a;
    private final k b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(Context context, k kVar) {
        zq3.h(context, "context");
        zq3.h(kVar, "navigatorProvider");
        this.a = context;
        this.b = kVar;
    }
}
