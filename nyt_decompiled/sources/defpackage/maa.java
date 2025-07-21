package defpackage;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class maa {
    private final Executor a;

    public maa(Handler handler) {
        this.a = new kaa(this, handler);
    }

    public final void a(zaa zaaVar, zzaqj zzaqjVar) {
        zaaVar.n("post-error");
        ((kaa) this.a).a.post(new laa(zaaVar, dba.a(zzaqjVar), null));
    }

    public final void b(zaa zaaVar, dba dbaVar, Runnable runnable) {
        zaaVar.s();
        zaaVar.n("post-response");
        ((kaa) this.a).a.post(new laa(zaaVar, dbaVar, runnable));
    }
}
