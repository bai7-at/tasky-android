package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class lu6 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final ET2Scope a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public lu6(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("gateway", "AND_SUBSCRIBE_CORE_HAWKEYE", null, null, null, null, null, null, "dismissible regi bundle", 252, null), null, null, 12, null);
    }

    public final void b(String str) {
        zq3.h(str, "elementLabel");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("gateway", "AND_SUBSCRIBE_CORE_HAWKEYE", null, null, null, null, null, new y32(str, null, null, null, null, null, 62, null), "dismissible regi bundle", 124, null), null, null, 12, null);
    }

    public final void c(String str) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("registration", "AND_SUBSCRIBE_CORE_HAWKEYE", null, null, null, null, null, new y32(str, null, null, null, null, null, 62, null), "dismissible regi bundle", 124, null), null, null, 12, null);
    }
}
