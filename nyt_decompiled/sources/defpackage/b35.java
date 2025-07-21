package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class b35 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private boolean a;
    private final MutableStateFlow b = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final MutableStateFlow b() {
        return this.b;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.a = false;
    }

    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getBoolean("NavigationStateHolder-state");
        }
    }

    public final void f(Bundle bundle) {
        zq3.h(bundle, "outState");
        bundle.putBoolean("NavigationStateHolder-state", this.a);
    }
}
