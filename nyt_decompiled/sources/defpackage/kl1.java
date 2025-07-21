package defpackage;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import defpackage.jr8;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final class kl1 {
    private final Lifecycle a;
    private final fu7 b;
    private final Scale c;
    private final CoroutineDispatcher d;
    private final CoroutineDispatcher e;
    private final CoroutineDispatcher f;
    private final CoroutineDispatcher g;
    private final jr8.a h;
    private final Precision i;
    private final Bitmap.Config j;
    private final Boolean k;
    private final Boolean l;
    private final CachePolicy m;
    private final CachePolicy n;
    private final CachePolicy o;

    public kl1(Lifecycle lifecycle, fu7 fu7Var, Scale scale, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, jr8.a aVar, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.a = lifecycle;
        this.b = fu7Var;
        this.c = scale;
        this.d = coroutineDispatcher;
        this.e = coroutineDispatcher2;
        this.f = coroutineDispatcher3;
        this.g = coroutineDispatcher4;
        this.h = aVar;
        this.i = precision;
        this.j = config;
        this.k = bool;
        this.l = bool2;
        this.m = cachePolicy;
        this.n = cachePolicy2;
        this.o = cachePolicy3;
    }

    public final Boolean a() {
        return this.k;
    }

    public final Boolean b() {
        return this.l;
    }

    public final Bitmap.Config c() {
        return this.j;
    }

    public final CoroutineDispatcher d() {
        return this.f;
    }

    public final CachePolicy e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kl1) {
            kl1 kl1Var = (kl1) obj;
            if (zq3.c(this.a, kl1Var.a) && zq3.c(this.b, kl1Var.b) && this.c == kl1Var.c && zq3.c(this.d, kl1Var.d) && zq3.c(this.e, kl1Var.e) && zq3.c(this.f, kl1Var.f) && zq3.c(this.g, kl1Var.g) && zq3.c(this.h, kl1Var.h) && this.i == kl1Var.i && this.j == kl1Var.j && zq3.c(this.k, kl1Var.k) && zq3.c(this.l, kl1Var.l) && this.m == kl1Var.m && this.n == kl1Var.n && this.o == kl1Var.o) {
                return true;
            }
        }
        return false;
    }

    public final CoroutineDispatcher f() {
        return this.e;
    }

    public final CoroutineDispatcher g() {
        return this.d;
    }

    public final Lifecycle h() {
        return this.a;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.a;
        int hashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        fu7 fu7Var = this.b;
        int hashCode2 = (hashCode + (fu7Var != null ? fu7Var.hashCode() : 0)) * 31;
        Scale scale = this.c;
        int hashCode3 = (hashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.d;
        int hashCode4 = (hashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.e;
        int hashCode5 = (hashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f;
        int hashCode6 = (hashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.g;
        int hashCode7 = (hashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        jr8.a aVar = this.h;
        int hashCode8 = (hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Precision precision = this.i;
        int hashCode9 = (hashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.m;
        int hashCode13 = (hashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.n;
        int hashCode14 = (hashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.o;
        return hashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }

    public final CachePolicy i() {
        return this.m;
    }

    public final CachePolicy j() {
        return this.o;
    }

    public final Precision k() {
        return this.i;
    }

    public final Scale l() {
        return this.c;
    }

    public final fu7 m() {
        return this.b;
    }

    public final CoroutineDispatcher n() {
        return this.g;
    }

    public final jr8.a o() {
        return this.h;
    }
}
