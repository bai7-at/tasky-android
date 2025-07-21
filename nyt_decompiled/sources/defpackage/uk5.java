package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.request.CachePolicy;
import coil.size.Scale;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class uk5 {
    private final Context a;
    private final Bitmap.Config b;
    private final ColorSpace c;
    private final au7 d;
    private final Scale e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final Headers j;
    private final zf8 k;
    private final qo5 l;
    private final CachePolicy m;
    private final CachePolicy n;
    private final CachePolicy o;

    public uk5(Context context, Bitmap.Config config, ColorSpace colorSpace, au7 au7Var, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, zf8 zf8Var, qo5 qo5Var, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = au7Var;
        this.e = scale;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = headers;
        this.k = zf8Var;
        this.l = qo5Var;
        this.m = cachePolicy;
        this.n = cachePolicy2;
        this.o = cachePolicy3;
    }

    public final uk5 a(Context context, Bitmap.Config config, ColorSpace colorSpace, au7 au7Var, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, zf8 zf8Var, qo5 qo5Var, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        return new uk5(context, config, colorSpace, au7Var, scale, z, z2, z3, str, headers, zf8Var, qo5Var, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.g;
    }

    public final ColorSpace e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uk5) {
            uk5 uk5Var = (uk5) obj;
            if (zq3.c(this.a, uk5Var.a) && this.b == uk5Var.b && zq3.c(this.c, uk5Var.c) && zq3.c(this.d, uk5Var.d) && this.e == uk5Var.e && this.f == uk5Var.f && this.g == uk5Var.g && this.h == uk5Var.h && zq3.c(this.i, uk5Var.i) && zq3.c(this.j, uk5Var.j) && zq3.c(this.k, uk5Var.k) && zq3.c(this.l, uk5Var.l) && this.m == uk5Var.m && this.n == uk5Var.n && this.o == uk5Var.o) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.b;
    }

    public final Context g() {
        return this.a;
    }

    public final String h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        ColorSpace colorSpace = this.c;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31;
        String str = this.i;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final CachePolicy i() {
        return this.n;
    }

    public final Headers j() {
        return this.j;
    }

    public final CachePolicy k() {
        return this.o;
    }

    public final qo5 l() {
        return this.l;
    }

    public final boolean m() {
        return this.h;
    }

    public final Scale n() {
        return this.e;
    }

    public final au7 o() {
        return this.d;
    }

    public final zf8 p() {
        return this.k;
    }
}
