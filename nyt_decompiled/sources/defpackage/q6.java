package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjb;
import defpackage.p15;

/* loaded from: classes2.dex */
public class q6 {
    private final sof a;
    private final Context b;
    private final jxa c;

    public static class a {
        private final Context a;
        private final c0b b;

        public a(Context context, String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            c0b c = kia.a().c(context, str, new d3b());
            this.a = context2;
            this.b = c;
        }

        public q6 a() {
            try {
                return new q6(this.a, this.b.zze(), sof.a);
            } catch (RemoteException e) {
                fgb.e("Failed to build AdLoader.", e);
                return new q6(this.a, new gmd().x6(), sof.a);
            }
        }

        public a b(p15.c cVar) {
            try {
                this.b.p4(new a7b(cVar));
            } catch (RemoteException e) {
                fgb.h("Failed to add google native ad listener", e);
            }
            return this;
        }

        public a c(o6 o6Var) {
            try {
                this.b.r3(new gie(o6Var));
            } catch (RemoteException e) {
                fgb.h("Failed to set AdListener.", e);
            }
            return this;
        }

        public a d(t15 t15Var) {
            try {
                this.b.u1(new zzbjb(4, t15Var.e(), -1, t15Var.d(), t15Var.a(), t15Var.c() != null ? new zzfk(t15Var.c()) : null, t15Var.h(), t15Var.b(), t15Var.f(), t15Var.g(), t15Var.i() - 1));
            } catch (RemoteException e) {
                fgb.h("Failed to specify native ad options", e);
            }
            return this;
        }

        public final a e(String str, eie eieVar, gtd gtdVar) {
            xva xvaVar = new xva(eieVar, gtdVar);
            try {
                this.b.b2(str, xvaVar.d(), xvaVar.c());
            } catch (RemoteException e) {
                fgb.h("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public final a f(o6f o6fVar) {
            try {
                this.b.p4(new yva(o6fVar));
            } catch (RemoteException e) {
                fgb.h("Failed to add google native ad listener", e);
            }
            return this;
        }

        public final a g(s15 s15Var) {
            try {
                this.b.u1(new zzbjb(s15Var));
            } catch (RemoteException e) {
                fgb.h("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    q6(Context context, jxa jxaVar, sof sofVar) {
        this.b = context;
        this.c = jxaVar;
        this.a = sofVar;
    }

    private final void c(final xvc xvcVar) {
        mpa.a(this.b);
        if (((Boolean) ora.c.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: sp9
                    @Override // java.lang.Runnable
                    public final void run() {
                        q6.this.b(xvcVar);
                    }
                });
                return;
            }
        }
        try {
            this.c.P4(this.a.a(this.b, xvcVar));
        } catch (RemoteException e) {
            fgb.e("Failed to load ad.", e);
        }
    }

    public void a(n7 n7Var) {
        c(n7Var.a);
    }

    final /* synthetic */ void b(xvc xvcVar) {
        try {
            this.c.P4(this.a.a(this.b, xvcVar));
        } catch (RemoteException e) {
            fgb.e("Failed to load ad.", e);
        }
    }
}
