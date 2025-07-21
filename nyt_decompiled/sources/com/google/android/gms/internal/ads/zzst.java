package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.khe;
import defpackage.pxf;

/* loaded from: classes3.dex */
public class zzst extends zzif {
    public final pxf zza;
    public final String zzb;

    public zzst(Throwable th, pxf pxfVar) {
        super("Decoder failed: ".concat(String.valueOf(pxfVar == null ? null : pxfVar.a)), th);
        this.zza = pxfVar;
        int i = khe.a;
        this.zzb = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
    }
}
