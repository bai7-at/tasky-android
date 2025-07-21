package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzada;
import com.google.ads.interactivemedia.v3.internal.zzadb;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzadb<MessageType extends zzadb<MessageType, BuilderType>, BuilderType extends zzada<MessageType, BuilderType>> implements zzafz {
    protected int zza = 0;

    int zzat(zzags zzagsVar) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafz
    public final zzadr zzau() {
        try {
            int zzax = zzax();
            zzadr zzadrVar = zzadr.zzb;
            byte[] bArr = new byte[zzax];
            zzaea zzz = zzaea.zzz(bArr, 0, zzax);
            zzaO(zzz);
            zzz.zzA();
            return new zzado(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzav() {
        try {
            int zzax = zzax();
            byte[] bArr = new byte[zzax];
            zzaea zzz = zzaea.zzz(bArr, 0, zzax);
            zzaO(zzz);
            zzz.zzA();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
