package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sle {
    private final Object a;
    private final Object b;
    private final byte[] c;
    private final zzgvz d;
    private final int e;
    private final String f;
    private final ble g;
    private final int h;

    sle(Object obj, Object obj2, byte[] bArr, int i, zzgvz zzgvzVar, int i2, String str, ble bleVar) {
        this.a = obj;
        this.b = obj2;
        this.c = Arrays.copyOf(bArr, bArr.length);
        this.h = i;
        this.d = zzgvzVar;
        this.e = i2;
        this.f = str;
        this.g = bleVar;
    }

    public final int a() {
        return this.e;
    }

    public final ble b() {
        return this.g;
    }

    public final zzgvz c() {
        return this.d;
    }

    public final Object d() {
        return this.a;
    }

    public final Object e() {
        return this.b;
    }

    public final String f() {
        return this.f;
    }

    public final byte[] g() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int h() {
        return this.h;
    }
}
