package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class nz1 {
    private final pz1 a;

    public nz1(pz1 pz1Var) {
        zq3.h(pz1Var, "embraceInfo");
        this.a = pz1Var;
    }

    public final String a() {
        return this.a.a() ? this.a.getDeviceId() : "";
    }

    public /* synthetic */ nz1(pz1 pz1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new dh1() : pz1Var);
    }
}
