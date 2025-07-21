package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.size.Precision;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.jr8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class dj1 {
    private final CoroutineDispatcher a;
    private final CoroutineDispatcher b;
    private final CoroutineDispatcher c;
    private final CoroutineDispatcher d;
    private final jr8.a e;
    private final Precision f;
    private final Bitmap.Config g;
    private final boolean h;
    private final boolean i;
    private final Drawable j;
    private final Drawable k;
    private final Drawable l;
    private final CachePolicy m;
    private final CachePolicy n;
    private final CachePolicy o;

    public dj1(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, jr8.a aVar, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.a = coroutineDispatcher;
        this.b = coroutineDispatcher2;
        this.c = coroutineDispatcher3;
        this.d = coroutineDispatcher4;
        this.e = aVar;
        this.f = precision;
        this.g = config;
        this.h = z;
        this.i = z2;
        this.j = drawable;
        this.k = drawable2;
        this.l = drawable3;
        this.m = cachePolicy;
        this.n = cachePolicy2;
        this.o = cachePolicy3;
    }

    public final boolean a() {
        return this.h;
    }

    public final boolean b() {
        return this.i;
    }

    public final Bitmap.Config c() {
        return this.g;
    }

    public final CoroutineDispatcher d() {
        return this.c;
    }

    public final CachePolicy e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dj1) {
            dj1 dj1Var = (dj1) obj;
            if (zq3.c(this.a, dj1Var.a) && zq3.c(this.b, dj1Var.b) && zq3.c(this.c, dj1Var.c) && zq3.c(this.d, dj1Var.d) && zq3.c(this.e, dj1Var.e) && this.f == dj1Var.f && this.g == dj1Var.g && this.h == dj1Var.h && this.i == dj1Var.i && zq3.c(this.j, dj1Var.j) && zq3.c(this.k, dj1Var.k) && zq3.c(this.l, dj1Var.l) && this.m == dj1Var.m && this.n == dj1Var.n && this.o == dj1Var.o) {
                return true;
            }
        }
        return false;
    }

    public final Drawable f() {
        return this.k;
    }

    public final Drawable g() {
        return this.l;
    }

    public final CoroutineDispatcher h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.i)) * 31;
        Drawable drawable = this.j;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.k;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.l;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final CoroutineDispatcher i() {
        return this.a;
    }

    public final CachePolicy j() {
        return this.m;
    }

    public final CachePolicy k() {
        return this.o;
    }

    public final Drawable l() {
        return this.j;
    }

    public final Precision m() {
        return this.f;
    }

    public final CoroutineDispatcher n() {
        return this.d;
    }

    public final jr8.a o() {
        return this.e;
    }

    public /* synthetic */ dj1(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, jr8.a aVar, Precision precision, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher2, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher3, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher4, (i & 16) != 0 ? jr8.a.b : aVar, (i & 32) != 0 ? Precision.AUTOMATIC : precision, (i & 64) != 0 ? s.f() : config, (i & 128) != 0 ? true : z, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) == 0 ? drawable3 : null, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
