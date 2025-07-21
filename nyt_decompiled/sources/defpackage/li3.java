package defpackage;

import android.content.Context;
import defpackage.ni3;

/* loaded from: classes2.dex */
public final class li3 {
    public static final li3 a = new li3();

    private li3() {
    }

    private final void c() {
        if (c11.d(this)) {
            return;
        }
        try {
            pi3 pi3Var = pi3.a;
            ni3.b bVar = ni3.s;
            pi3.e(bVar.d(), bVar.e());
            bVar.d().clear();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public static final void d(Context context) {
        ni3.b bVar;
        ni3 c;
        if (c11.d(li3.class)) {
            return;
        }
        try {
            zq3.h(context, "context");
            if (si3.a("com.android.billingclient.api.Purchase") == null || (c = (bVar = ni3.s).c(context)) == null || !bVar.f().get()) {
                return;
            }
            if (pi3.d()) {
                c.p("inapp", new Runnable() { // from class: ji3
                    @Override // java.lang.Runnable
                    public final void run() {
                        li3.e();
                    }
                });
            } else {
                c.o("inapp", new Runnable() { // from class: ki3
                    @Override // java.lang.Runnable
                    public final void run() {
                        li3.f();
                    }
                });
            }
        } catch (Throwable th) {
            c11.b(th, li3.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        if (c11.d(li3.class)) {
            return;
        }
        try {
            a.c();
        } catch (Throwable th) {
            c11.b(th, li3.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        if (c11.d(li3.class)) {
            return;
        }
        try {
            a.c();
        } catch (Throwable th) {
            c11.b(th, li3.class);
        }
    }
}
