package defpackage;

import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes2.dex */
public abstract class gfc extends mia implements kgc {
    public gfc() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        ee3 O = ee3.a.O(parcel.readStrongBinder());
        ee3 O2 = ee3.a.O(parcel.readStrongBinder());
        nia.c(parcel);
        B1(readString, O, O2);
        parcel2.writeNoException();
        return true;
    }
}
