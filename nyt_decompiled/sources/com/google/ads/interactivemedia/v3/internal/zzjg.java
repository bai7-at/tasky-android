package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzjg implements zzqh {
    final /* synthetic */ zzot zza;

    zzjg(zzji zzjiVar, zzot zzotVar) {
        this.zza = zzotVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqh
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
