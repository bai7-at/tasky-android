package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.jrc;
import defpackage.lia;
import defpackage.nia;

/* loaded from: classes2.dex */
public final class b0 extends lia implements jrc {
    b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // defpackage.jrc
    public final void S(boolean z) {
        Parcel O = O();
        int i = nia.b;
        O.writeInt(z ? 1 : 0);
        l3(5, O);
    }

    @Override // defpackage.jrc
    public final void zze() {
        l3(4, O());
    }

    @Override // defpackage.jrc
    public final void zzg() {
        l3(3, O());
    }

    @Override // defpackage.jrc
    public final void zzh() {
        l3(2, O());
    }

    @Override // defpackage.jrc
    public final void zzi() {
        l3(1, O());
    }
}
