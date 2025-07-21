package defpackage;

import android.app.Activity;
import android.app.Application;
import defpackage.wc;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class op6 {
    public static final op6 a = new op6();

    public static final class a implements wc {
        a() {
        }

        @Override // defpackage.wc
        public void a(m98 m98Var) {
            wc.a.e(this, m98Var);
        }

        @Override // defpackage.wc
        public void c(Activity activity) {
            wc.a.c(this, activity);
        }

        @Override // defpackage.wc
        public void d(Application application) {
            wc.a.d(this, application);
        }

        @Override // defpackage.wc
        public void e(Activity activity) {
            wc.a.b(this, activity);
        }

        @Override // defpackage.g42
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(uc ucVar) {
            wc.a.a(this, ucVar);
        }
    }

    private op6() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wc a(Application application, hc hcVar) {
        zq3.h(application, "application");
        zq3.h(hcVar, "analyticsChannelHandlers");
        return ((bh8) application).a() ? new a() : new xc(i.X0(hcVar.a()));
    }
}
