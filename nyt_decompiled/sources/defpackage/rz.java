package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.AuthMethod;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class rz {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final Map d;

    public rz(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = t.m(du8.a(AuthMethod.PASSWORD, Boolean.valueOf(z)), du8.a(AuthMethod.FACEBOOK, Boolean.valueOf(z2)), du8.a(AuthMethod.GOOGLE, Boolean.valueOf(z3)));
    }

    public final Map a() {
        return this.d;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public /* synthetic */ rz(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
