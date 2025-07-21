package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qxb implements via {
    private wlb a;
    private final Executor b;
    private final zwb c;
    private final Clock d;
    private boolean e = false;
    private boolean f = false;
    private final fxb g = new fxb();

    public qxb(Executor executor, zwb zwbVar, Clock clock) {
        this.b = executor;
        this.c = zwbVar;
        this.d = clock;
    }

    private final void s() {
        try {
            final JSONObject zzb = this.c.zzb(this.g);
            if (this.a != null) {
                this.b.execute(new Runnable() { // from class: pxb
                    @Override // java.lang.Runnable
                    public final void run() {
                        qxb.this.k(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            pzc.l("Failed to call video active view js", e);
        }
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        boolean z = this.f ? false : uiaVar.j;
        fxb fxbVar = this.g;
        fxbVar.a = z;
        fxbVar.d = this.d.elapsedRealtime();
        this.g.f = uiaVar;
        if (this.e) {
            s();
        }
    }

    public final void a() {
        this.e = false;
    }

    public final void c() {
        this.e = true;
        s();
    }

    final /* synthetic */ void k(JSONObject jSONObject) {
        this.a.M0("AFMA_updateActiveView", jSONObject);
    }

    public final void l(boolean z) {
        this.f = z;
    }

    public final void n(wlb wlbVar) {
        this.a = wlbVar;
    }
}
