package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class tna extends mia implements koa {
    public tna() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
