package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class mz1 {
    private final String a;

    public mz1(String str) {
        zq3.h(str, "identifier");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public /* synthetic */ mz1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new nz1(null, 1, null).a() : str);
    }
}
