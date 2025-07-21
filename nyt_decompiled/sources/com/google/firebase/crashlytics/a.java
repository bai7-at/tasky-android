package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.d;
import defpackage.c91;
import defpackage.cb3;
import defpackage.cy0;
import defpackage.df3;
import defpackage.fl;
import defpackage.gl1;
import defpackage.hi2;
import defpackage.k11;
import defpackage.ko1;
import defpackage.m94;
import defpackage.og8;
import defpackage.p11;
import defpackage.r62;
import defpackage.tc;
import defpackage.ue2;
import defpackage.uh2;
import defpackage.vg8;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class a {
    final k11 a;

    /* renamed from: com.google.firebase.crashlytics.a$a, reason: collision with other inner class name */
    class C0214a implements cy0 {
        C0214a() {
        }

        @Override // defpackage.cy0
        public Object then(og8 og8Var) {
            if (og8Var.q()) {
                return null;
            }
            m94.f().e("Error fetching settings.", og8Var.l());
            return null;
        }
    }

    class b implements Callable {
        final /* synthetic */ boolean a;
        final /* synthetic */ k11 b;
        final /* synthetic */ d c;

        b(boolean z, k11 k11Var, d dVar) {
            this.a = z;
            this.b = k11Var;
            this.c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.a) {
                return null;
            }
            this.b.g(this.c);
            return null;
        }
    }

    private a(k11 k11Var) {
        this.a = k11Var;
    }

    public static a a() {
        a aVar = (a) uh2.k().i(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a b(uh2 uh2Var, hi2 hi2Var, gl1 gl1Var, gl1 gl1Var2) {
        Context j = uh2Var.j();
        String packageName = j.getPackageName();
        m94.f().g("Initializing Firebase Crashlytics " + k11.i() + " for " + packageName);
        ue2 ue2Var = new ue2(j);
        c91 c91Var = new c91(uh2Var);
        df3 df3Var = new df3(j, packageName, hi2Var, c91Var);
        p11 p11Var = new p11(gl1Var);
        tc tcVar = new tc(gl1Var2);
        k11 k11Var = new k11(uh2Var, df3Var, p11Var, c91Var, tcVar.e(), tcVar.d(), ue2Var, r62.c("Crashlytics Exception Handler"));
        String c = uh2Var.m().c();
        String n = CommonUtils.n(j);
        m94.f().b("Mapping file ID is: " + n);
        try {
            fl a = fl.a(j, df3Var, c, n, new ko1(j));
            m94.f().i("Installer package name is: " + a.c);
            ExecutorService c2 = r62.c("com.google.firebase.crashlytics.startup");
            d l = d.l(j, c, df3Var, new cb3(), a.e, a.f, ue2Var, c91Var);
            l.p(c2).i(c2, new C0214a());
            vg8.c(c2, new b(k11Var.o(a, l), k11Var, l));
            return new a(k11Var);
        } catch (PackageManager.NameNotFoundException e) {
            m94.f().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public void c(String str) {
        this.a.k(str);
    }

    public void d(Throwable th) {
        if (th == null) {
            m94.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.l(th);
        }
    }

    public void e(String str, String str2) {
        this.a.p(str, str2);
    }

    public void f(String str) {
        this.a.q(str);
    }
}
