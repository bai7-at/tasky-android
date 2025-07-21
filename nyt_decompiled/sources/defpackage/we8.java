package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.e52;
import defpackage.s55;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes4.dex */
public final class we8 {
    public static final int b = ET2SimpleScope.b;
    private final ET2SimpleScope a;

    public we8(ET2SimpleScope eT2SimpleScope) {
        zq3.h(eT2SimpleScope, "et2Scope");
        this.a = eT2SimpleScope;
    }

    private final void c(String str, String str2, String str3, String str4) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42(str3, str2, null, null, null, null, null, null, str, 252, null), new u32(null, str4, "tap", 1, null), null, 8, null);
    }

    public final void a() {
        s55.r rVar = s55.r.c;
        c(rVar.d(), "download now", "open", rVar.d());
    }

    public final void b() {
        c(s55.q.c.d(), "download the athletic app", "open modal", AssetConstants.ARTICLE_TYPE);
    }

    public final void d() {
        s55.r rVar = s55.r.c;
        c(rVar.d(), "no thanks", "close", rVar.d());
    }

    public final void e() {
        c(s55.q.c.d(), "read in the athletic app", "open", AssetConstants.ARTICLE_TYPE);
    }

    public final Object f(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        Object i = ET2SimpleScope.i(this.a, s55.r.c, null, null, null, null, null, null, null, eT2CoroutineScope, by0Var, 254, null);
        return i == a.h() ? i : ww8.a;
    }
}
