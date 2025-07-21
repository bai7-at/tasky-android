package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class us9 extends uka implements ku9 {
    public us9() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    @Override // defpackage.uka
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            V2((Status) tab.a(parcel, Status.CREATOR));
        } else if (i == 2) {
        } else {
            if (i != 4) {
                return false;
            }
        }
        return true;
    }
}
