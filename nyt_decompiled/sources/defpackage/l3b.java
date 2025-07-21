package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* loaded from: classes3.dex */
public final class l3b extends lia implements t3b {
    l3b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.t3b
    public final void B5(String str, String str2) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        l3(9, O);
    }

    @Override // defpackage.t3b
    public final void J2(int i) {
        throw null;
    }

    @Override // defpackage.t3b
    public final void K0(int i, String str) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        l3(22, O);
    }

    @Override // defpackage.t3b
    public final void K5(jua juaVar, String str) {
        Parcel O = O();
        nia.f(O, juaVar);
        O.writeString(str);
        l3(10, O);
    }

    @Override // defpackage.t3b
    public final void R0(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(23, O);
    }

    @Override // defpackage.t3b
    public final void Z0(zbb zbbVar) {
        Parcel O = O();
        nia.f(O, zbbVar);
        l3(16, O);
    }

    @Override // defpackage.t3b
    public final void a() {
        l3(11, O());
    }

    @Override // defpackage.t3b
    public final void c() {
        l3(18, O());
    }

    @Override // defpackage.t3b
    public final void e() {
        l3(20, O());
    }

    @Override // defpackage.t3b
    public final void e4(zzcag zzcagVar) {
        throw null;
    }

    @Override // defpackage.t3b
    public final void f2(zze zzeVar) {
        Parcel O = O();
        nia.d(O, zzeVar);
        l3(24, O);
    }

    @Override // defpackage.t3b
    public final void k() {
        l3(13, O());
    }

    @Override // defpackage.t3b
    public final void l() {
        l3(15, O());
    }

    @Override // defpackage.t3b
    public final void x(String str) {
        Parcel O = O();
        O.writeString(str);
        l3(21, O);
    }

    @Override // defpackage.t3b
    public final void zze() {
        l3(1, O());
    }

    @Override // defpackage.t3b
    public final void zzf() {
        l3(2, O());
    }

    @Override // defpackage.t3b
    public final void zzg(int i) {
        Parcel O = O();
        O.writeInt(i);
        l3(3, O);
    }

    @Override // defpackage.t3b
    public final void zzm() {
        l3(8, O());
    }

    @Override // defpackage.t3b
    public final void zzn() {
        l3(4, O());
    }

    @Override // defpackage.t3b
    public final void zzo() {
        l3(6, O());
    }

    @Override // defpackage.t3b
    public final void zzp() {
        l3(5, O());
    }
}
