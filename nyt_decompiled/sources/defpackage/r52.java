package defpackage;

import com.nytimes.android.eventtracker.UserType;

/* loaded from: classes2.dex */
public final class r52 implements q52 {
    private final z58 a;
    private final mz1 b;

    public r52(z58 z58Var, mz1 mz1Var) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(mz1Var, "embraceIdentifier");
        this.a = z58Var;
        this.b = mz1Var;
    }

    private final UserType b(boolean z, boolean z2) {
        return (z && z2) ? UserType.SUBSCRIBER : (!z || z2) ? (z || !z2) ? UserType.ANONYMOUS : UserType.REGISTERED : UserType.ANONYMOUS_SUB;
    }

    @Override // defpackage.q52
    public lz8 a() {
        return new lz8(this.a.G(), this.a.D(), b(this.a.F(), this.a.q()), this.a.o(), this.a.s(), new q09(c()));
    }

    public String c() {
        return this.b.a();
    }
}
