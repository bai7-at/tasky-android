package defpackage;

import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes3.dex */
public final class unb {
    private final int a;
    public final int b;
    public final int c;

    private unb(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static unb a() {
        return new unb(0, 0, 0);
    }

    public static unb b(int i, int i2) {
        return new unb(1, i, i2);
    }

    public static unb c(zzq zzqVar) {
        return zzqVar.zzd ? new unb(3, 0, 0) : zzqVar.zzi ? new unb(2, 0, 0) : zzqVar.zzh ? a() : b(zzqVar.zzf, zzqVar.zzc);
    }

    public static unb d() {
        return new unb(5, 0, 0);
    }

    public static unb e() {
        return new unb(4, 0, 0);
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final boolean g() {
        return this.a == 2;
    }

    public final boolean h() {
        return this.a == 5;
    }

    public final boolean i() {
        return this.a == 3;
    }

    public final boolean j() {
        return this.a == 4;
    }
}
