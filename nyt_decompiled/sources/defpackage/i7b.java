package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class i7b extends lia implements k7b {
    i7b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // defpackage.k7b
    public final void B(ee3 ee3Var) {
        Parcel O = O();
        nia.f(O, ee3Var);
        l3(13, O);
    }

    @Override // defpackage.k7b
    public final void E4(int i, int i2, Intent intent) {
        Parcel O = O();
        O.writeInt(i);
        O.writeInt(i2);
        nia.d(O, intent);
        l3(12, O);
    }

    @Override // defpackage.k7b
    public final void H1(int i, String[] strArr, int[] iArr) {
        Parcel O = O();
        O.writeInt(i);
        O.writeStringArray(strArr);
        O.writeIntArray(iArr);
        l3(15, O);
    }

    @Override // defpackage.k7b
    public final void a() {
        l3(14, O());
    }

    @Override // defpackage.k7b
    public final void c() {
        l3(7, O());
    }

    @Override // defpackage.k7b
    public final void e() {
        l3(9, O());
    }

    @Override // defpackage.k7b
    public final void g() {
        l3(3, O());
    }

    @Override // defpackage.k7b
    public final void j0(Bundle bundle) {
        Parcel O = O();
        nia.d(O, bundle);
        Parcel Q1 = Q1(6, O);
        if (Q1.readInt() != 0) {
            bundle.readFromParcel(Q1);
        }
        Q1.recycle();
    }

    @Override // defpackage.k7b
    public final boolean m() {
        Parcel Q1 = Q1(11, O());
        boolean g = nia.g(Q1);
        Q1.recycle();
        return g;
    }

    @Override // defpackage.k7b
    public final void p2(Bundle bundle) {
        Parcel O = O();
        nia.d(O, bundle);
        l3(1, O);
    }

    @Override // defpackage.k7b
    public final void zzi() {
        l3(10, O());
    }

    @Override // defpackage.k7b
    public final void zzm() {
        l3(8, O());
    }

    @Override // defpackage.k7b
    public final void zzo() {
        l3(5, O());
    }

    @Override // defpackage.k7b
    public final void zzq() {
        l3(2, O());
    }

    @Override // defpackage.k7b
    public final void zzr() {
        l3(4, O());
    }
}
