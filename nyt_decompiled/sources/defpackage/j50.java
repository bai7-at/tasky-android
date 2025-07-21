package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j50 extends ue4 {
    public /* synthetic */ j50(String str, String str2, v15 v15Var, na2 na2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, v15Var, (i & 8) != 0 ? null : na2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(String str, String str2, v15 v15Var, na2 na2Var) {
        super(du8.a("canonical_url", str), du8.a("nyt_uri", str2), du8.a("native_app", v15Var), du8.a("fastly_headers", na2Var));
        zq3.h(v15Var, "nativeApp");
    }
}
