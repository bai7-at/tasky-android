package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.poisonpill.model.Pill;
import defpackage.e52;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ky5 extends FragmentManager.k implements jy5 {
    public static final a Companion = new a(null);
    private static final e52.d d = new e52.d();
    private static final e52.e e = new e52.e();
    private static final s42 f = new s42("poison pill dismiss", null, null, null, null, null, null, null, null, 510, null);
    private static final s42 g = new s42("poison pill update", null, null, null, null, null, null, null, null, 510, null);
    private static final u32 h = new u32(null, "poison pill", "tap", 1, null);
    private final ET2Scope a;
    private final dz5 b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ky5(ET2Scope eT2Scope, dz5 dz5Var, String str) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(dz5Var, "repo");
        zq3.h(str, "versionCode");
        this.a = eT2Scope;
        this.b = dz5Var;
        this.c = str;
    }

    private final void r(s42 s42Var) {
        ET2PageScope.DefaultImpls.a(this.a, e, s42Var, h, null, 8, null);
    }

    @Override // defpackage.jy5
    public void a(jk jkVar) {
        zq3.h(jkVar, "activity");
        jkVar.getSupportFragmentManager().m1(this, false);
    }

    @Override // defpackage.jy5
    public void b() {
        r(g);
    }

    @Override // defpackage.jy5
    public void c() {
        r(f);
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public void l(FragmentManager fragmentManager, Fragment fragment) {
        zq3.h(fragmentManager, "fm");
        zq3.h(fragment, QueryKeys.VISIT_FREQUENCY);
        super.l(fragmentManager, fragment);
        if (fragment instanceof rc7) {
            ET2Scope eT2Scope = this.a;
            e52.d dVar = d;
            Pair a2 = du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, "poison pill");
            Pair a3 = du8.a("current_build", this.c);
            Pill a4 = this.b.a();
            ET2PageScope.DefaultImpls.a(eT2Scope, dVar, new ue4(a2, a3, du8.a("dismisses_remaining", Integer.valueOf((a4 != null ? a4.a() : 0) - this.b.b()))), null, null, 12, null);
        }
    }
}
