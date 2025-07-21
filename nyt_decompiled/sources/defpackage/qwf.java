package defpackage;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class qwf extends qab implements xof {
    public qwf() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // defpackage.qab
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzp();
        } else {
            if (i != 2) {
                return false;
            }
            zzq();
        }
        return true;
    }
}
