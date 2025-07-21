package defpackage;

import android.content.Context;
import android.view.View;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;

/* loaded from: classes3.dex */
public final class f0c implements r8c, t7c {
    private final Context a;
    private final wlb b;
    private final v0e c;
    private final zzcei d;
    private k8e e;
    private boolean f;

    public f0c(Context context, wlb wlbVar, v0e v0eVar, zzcei zzceiVar) {
        this.a = context;
        this.b = wlbVar;
        this.c = v0eVar;
        this.d = zzceiVar;
    }

    private final synchronized void a() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        try {
            if (this.c.U && this.b != null) {
                if (dyf.a().a(this.a)) {
                    zzcei zzceiVar = this.d;
                    String str = zzceiVar.zzb + InstructionFileId.DOT + zzceiVar.zzc;
                    v1e v1eVar = this.c.W;
                    String a = v1eVar.a();
                    if (v1eVar.b() == 1) {
                        zzeihVar = zzeih.VIDEO;
                        zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                    } else {
                        v0e v0eVar = this.c;
                        zzeih zzeihVar2 = zzeih.HTML_DISPLAY;
                        zzeiiVar = v0eVar.f == 1 ? zzeii.ONE_PIXEL : zzeii.BEGIN_TO_RENDER;
                        zzeihVar = zzeihVar2;
                    }
                    k8e b = dyf.a().b(str, this.b.A(), "", "javascript", a, zzeiiVar, zzeihVar, this.c.m0);
                    this.e = b;
                    Object obj = this.b;
                    if (b != null) {
                        dyf.a().c(this.e, (View) obj);
                        this.b.I0(this.e);
                        dyf.a().d(this.e);
                        this.f = true;
                        this.b.t("onSdkLoaded", new so());
                    }
                }
            }
        } finally {
        }
    }

    @Override // defpackage.t7c
    public final synchronized void zzq() {
        wlb wlbVar;
        try {
            if (!this.f) {
                a();
            }
            if (!this.c.U || this.e == null || (wlbVar = this.b) == null) {
                return;
            }
            wlbVar.t("onSdkImpression", new so());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.r8c
    public final synchronized void zzr() {
        if (this.f) {
            return;
        }
        a();
    }
}
