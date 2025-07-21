package defpackage;

/* loaded from: classes3.dex */
final class vvf implements wrf {
    final /* synthetic */ xvf a;

    /* synthetic */ vvf(xvf xvfVar, tvf tvfVar) {
        this.a = xvfVar;
    }

    @Override // defpackage.wrf
    public final void b(Exception exc) {
        jrf jrfVar;
        ezd.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        jrfVar = this.a.z0;
        jrfVar.b(exc);
    }

    @Override // defpackage.wrf
    public final void zzb() {
        uff uffVar;
        uff uffVar2;
        xvf xvfVar = this.a;
        uffVar = xvfVar.J0;
        if (uffVar != null) {
            uffVar2 = xvfVar.J0;
            uffVar2.zzb();
        }
    }
}
