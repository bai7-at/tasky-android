package defpackage;

import android.content.Context;
import android.view.View;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;

/* loaded from: classes3.dex */
public final class jic implements r8c, tof, t7c {
    private final Context a;
    private final wlb b;
    private final v0e c;
    private final zzcei d;
    private final zzbbz e;
    k8e f;

    public jic(Context context, wlb wlbVar, v0e v0eVar, zzcei zzceiVar, zzbbz zzbbzVar) {
        this.a = context;
        this.b = wlbVar;
        this.c = v0eVar;
        this.d = zzceiVar;
        this.e = zzbbzVar;
    }

    @Override // defpackage.tof
    public final void O() {
    }

    @Override // defpackage.tof
    public final void Q1(int i) {
        this.f = null;
    }

    @Override // defpackage.tof
    public final void Y4() {
    }

    @Override // defpackage.tof
    public final void h6() {
    }

    @Override // defpackage.tof
    public final void n4() {
        if (this.f == null || this.b == null) {
            return;
        }
        if (((Boolean) pla.c().a(mpa.Z4)).booleanValue()) {
            return;
        }
        this.b.t("onSdkImpression", new so());
    }

    @Override // defpackage.tof
    public final void s4() {
    }

    @Override // defpackage.t7c
    public final void zzq() {
        if (this.f == null || this.b == null) {
            return;
        }
        if (((Boolean) pla.c().a(mpa.Z4)).booleanValue()) {
            this.b.t("onSdkImpression", new so());
        }
    }

    @Override // defpackage.r8c
    public final void zzr() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        zzbbz zzbbzVar = this.e;
        if ((zzbbzVar == zzbbz.REWARD_BASED_VIDEO_AD || zzbbzVar == zzbbz.INTERSTITIAL || zzbbzVar == zzbbz.APP_OPEN) && this.c.U && this.b != null) {
            if (dyf.a().a(this.a)) {
                zzcei zzceiVar = this.d;
                String str = zzceiVar.zzb + InstructionFileId.DOT + zzceiVar.zzc;
                v1e v1eVar = this.c.W;
                String a = v1eVar.a();
                if (v1eVar.b() == 1) {
                    zzeihVar = zzeih.VIDEO;
                    zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzeiiVar = this.c.Z == 2 ? zzeii.UNSPECIFIED : zzeii.BEGIN_TO_RENDER;
                    zzeihVar = zzeih.HTML_DISPLAY;
                }
                k8e b = dyf.a().b(str, this.b.A(), "", "javascript", a, zzeiiVar, zzeihVar, this.c.m0);
                this.f = b;
                if (b != null) {
                    dyf.a().c(this.f, (View) this.b);
                    this.b.I0(this.f);
                    dyf.a().d(this.f);
                    this.b.t("onSdkLoaded", new so());
                }
            }
        }
    }
}
