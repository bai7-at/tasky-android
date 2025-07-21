package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.e52;
import defpackage.s55;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class wj8 {
    public static final a Companion = new a(null);
    public static final int b = ET2SimpleScope.b;
    private final ET2SimpleScope a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public wj8(ET2SimpleScope eT2SimpleScope) {
        zq3.h(eT2SimpleScope, "et2Scope");
        this.a = eT2SimpleScope;
    }

    public final Object a(CoroutineScope coroutineScope, by0 by0Var) {
        Object i = ET2SimpleScope.i(this.a, s55.t.c, null, null, null, null, null, null, null, coroutineScope, by0Var, 254, null);
        return i == kotlin.coroutines.intrinsics.a.h() ? i : ww8.a;
    }

    public final void b(boolean z) {
        String str = z ? "toggle on" : "toggle off";
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("system text size", str, null, null, null, null, null, null, "text size", 252, null), new u32(null, "text size", str, 1, null), null, 8, null);
    }

    public final void c(String str) {
        zq3.h(str, "textSize");
        ET2SimpleScope eT2SimpleScope = this.a;
        e52.e eVar = new e52.e();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        zq3.g(lowerCase, "toLowerCase(...)");
        ET2PageScope.DefaultImpls.a(eT2SimpleScope, eVar, new s42("text size tap", lowerCase, null, null, null, null, null, null, "text size", 252, null), new u32(null, "text size", "tap", 1, null), null, 8, null);
    }
}
