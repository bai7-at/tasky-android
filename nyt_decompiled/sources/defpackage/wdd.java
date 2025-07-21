package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class wdd {
    private odd a;

    wdd() {
    }

    public static wdd b(odd oddVar) {
        return new wdd(oddVar);
    }

    public final odd a(Clock clock, qdd qddVar, k9d k9dVar, d8e d8eVar) {
        odd oddVar = this.a;
        return oddVar != null ? oddVar : new odd(clock, qddVar, k9dVar, d8eVar);
    }

    private wdd(odd oddVar) {
        this.a = oddVar;
    }
}
