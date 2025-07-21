package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class rua extends lia implements tua {
    rua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // defpackage.tua
    public final void E1(jua juaVar, String str) {
        Parcel O = O();
        nia.f(O, juaVar);
        O.writeString(str);
        l3(1, O);
    }
}
