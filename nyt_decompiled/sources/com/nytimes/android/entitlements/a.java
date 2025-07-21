package com.nytimes.android.entitlements;

import androidx.fragment.app.f;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.cu;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface a extends com.nytimes.android.entitlements.b, b.InterfaceC0262b {
    public static final C0261a Companion = C0261a.a;

    /* renamed from: com.nytimes.android.entitlements.a$a, reason: collision with other inner class name */
    public static final class C0261a {
        static final /* synthetic */ C0261a a = new C0261a();

        private C0261a() {
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(a aVar, f fVar, String str, RegiInterface regiInterface, String str2, by0 by0Var, int i, Object obj) {
            if (obj == null) {
                return aVar.n(fVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : regiInterface, (i & 8) != 0 ? null : str2, by0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: link");
        }
    }

    boolean a();

    boolean b();

    Flow c();

    Object d(by0 by0Var);

    boolean f();

    String g();

    Flow h();

    void k(cu cuVar);

    Object l(List list, by0 by0Var);

    boolean m();

    Object n(f fVar, String str, RegiInterface regiInterface, String str2, by0 by0Var);

    Set o();

    boolean p();

    String u();
}
