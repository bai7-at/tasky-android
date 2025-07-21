package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;
import defpackage.s55;

/* loaded from: classes4.dex */
public final class q93 {
    private final ET2Scope a;

    public q93(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("settings tap", null, null, null, null, null, null, new y32(null, null, null, "Settings", null, null, 55, null), null, 382, null), new u32(null, s55.f.c.d(), "tap", 1, null), null, 8, null);
    }

    public final void b() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("pull to refresh", null, null, null, null, null, null, null, null, 510, null), new u32(null, s55.f.c.d(), "pull", 1, null), null, 8, null);
    }
}
