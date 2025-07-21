package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class lyf implements nxf {
    private final MediaCodec a;

    public lyf(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // defpackage.nxf
    public final void a(int i, int i2, j7f j7fVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, 0, j7fVar.a(), j, 0);
    }

    @Override // defpackage.nxf
    public final void b(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.nxf
    public final void c(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // defpackage.nxf
    public final void zzb() {
    }

    @Override // defpackage.nxf
    public final void zzc() {
    }

    @Override // defpackage.nxf
    public final void zzg() {
    }

    @Override // defpackage.nxf
    public final void zzh() {
    }
}
