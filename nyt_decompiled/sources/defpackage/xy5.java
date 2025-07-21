package defpackage;

import androidx.fragment.app.FragmentManager;
import com.nytimes.android.poisonpill.model.Pill;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class xy5 implements wy5 {
    public static final a Companion = new a(null);
    private final dz5 a;
    private final String b;
    private final jy5 c;
    private final qs2 d;
    private final gt2 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xy5(dz5 dz5Var, String str, jy5 jy5Var, qs2 qs2Var, gt2 gt2Var) {
        zq3.h(dz5Var, "repo");
        zq3.h(str, "defaultPillCopy");
        zq3.h(jy5Var, "analytics");
        zq3.h(qs2Var, "viewBuilder");
        zq3.h(gt2Var, "urlBrowserLauncher");
        this.a = dz5Var;
        this.b = str;
        this.c = jy5Var;
        this.d = qs2Var;
        this.e = gt2Var;
    }

    @Override // defpackage.wy5
    public void a(jk jkVar) {
        zq3.h(jkVar, "activity");
        if (f()) {
            yy5 yy5Var = (yy5) this.d.mo865invoke();
            FragmentManager supportFragmentManager = jkVar.getSupportFragmentManager();
            zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
            yy5Var.F(supportFragmentManager);
            this.c.a(jkVar);
        }
    }

    @Override // defpackage.wy5
    public String b() {
        String c;
        Pill a2 = this.a.a();
        return (a2 == null || (c = a2.c()) == null) ? this.b : c;
    }

    @Override // defpackage.wy5
    public boolean c() {
        return this.a.d();
    }

    @Override // defpackage.wy5
    public void d(jk jkVar) {
        zq3.h(jkVar, "activity");
        this.e.invoke("market://details?id=com.nytimes.android", jkVar);
        this.c.b();
    }

    @Override // defpackage.wy5
    public void e() {
        this.a.c();
        this.c.c();
    }

    public boolean f() {
        return this.a.a() != null;
    }
}
