package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class kh5 implements jh5 {
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

    public kh5(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    @Override // defpackage.jh5
    public void a() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("one-tap lire", "exit", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    @Override // defpackage.jh5
    public void b() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("one-tap lire", "Sign in with Google", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    @Override // defpackage.jh5
    public void c(boolean z) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("login", "google", null, Boolean.valueOf(z), null, null, null, null, null, 500, null), null, null, 12, null);
    }
}
