package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import defpackage.lz2;
import defpackage.mk5;
import defpackage.nj2;
import defpackage.og0;
import defpackage.ov3;
import defpackage.pz2;
import defpackage.r02;
import defpackage.rv1;
import defpackage.sk5;
import defpackage.tr1;
import defpackage.x19;
import defpackage.xq8;
import defpackage.z06;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class a implements Cloneable {
    private boolean B;
    private boolean H;
    private boolean L;
    private boolean N;
    private int a;
    private Drawable e;
    private int f;
    private Drawable g;
    private int h;
    private boolean m;
    private Drawable r;
    private int s;
    private boolean x;
    private Resources.Theme y;
    private float b = 1.0f;
    private tr1 c = tr1.e;
    private Priority d = Priority.NORMAL;
    private boolean i = true;
    private int j = -1;
    private int k = -1;
    private ov3 l = r02.c();
    private boolean n = true;
    private sk5 t = new sk5();
    private Map u = new og0();
    private Class w = Object.class;
    private boolean M = true;

    private boolean F(int i) {
        return G(this.a, i);
    }

    private static boolean G(int i, int i2) {
        return (i & i2) != 0;
    }

    private a O(DownsampleStrategy downsampleStrategy, xq8 xq8Var) {
        return P(downsampleStrategy, xq8Var, true);
    }

    private a P(DownsampleStrategy downsampleStrategy, xq8 xq8Var, boolean z) {
        a Y = z ? Y(downsampleStrategy, xq8Var) : K(downsampleStrategy, xq8Var);
        Y.M = true;
        return Y;
    }

    private a Q() {
        return this;
    }

    private a R() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return Q();
    }

    public final boolean A() {
        return this.H;
    }

    public final boolean B() {
        return this.i;
    }

    public final boolean D() {
        return F(8);
    }

    boolean E() {
        return this.M;
    }

    public final boolean H() {
        return this.m;
    }

    public final boolean I() {
        return x19.r(this.k, this.j);
    }

    public a J() {
        this.x = true;
        return Q();
    }

    final a K(DownsampleStrategy downsampleStrategy, xq8 xq8Var) {
        if (this.B) {
            return clone().K(downsampleStrategy, xq8Var);
        }
        f(downsampleStrategy);
        return X(xq8Var, false);
    }

    public a M(int i, int i2) {
        if (this.B) {
            return clone().M(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        return R();
    }

    public a N(Priority priority) {
        if (this.B) {
            return clone().N(priority);
        }
        this.d = (Priority) z06.d(priority);
        this.a |= 8;
        return R();
    }

    public a S(mk5 mk5Var, Object obj) {
        if (this.B) {
            return clone().S(mk5Var, obj);
        }
        z06.d(mk5Var);
        z06.d(obj);
        this.t.e(mk5Var, obj);
        return R();
    }

    public a T(ov3 ov3Var) {
        if (this.B) {
            return clone().T(ov3Var);
        }
        this.l = (ov3) z06.d(ov3Var);
        this.a |= 1024;
        return R();
    }

    public a U(float f) {
        if (this.B) {
            return clone().U(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.b = f;
        this.a |= 2;
        return R();
    }

    public a V(boolean z) {
        if (this.B) {
            return clone().V(true);
        }
        this.i = !z;
        this.a |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        return R();
    }

    public a W(xq8 xq8Var) {
        return X(xq8Var, true);
    }

    a X(xq8 xq8Var, boolean z) {
        if (this.B) {
            return clone().X(xq8Var, z);
        }
        rv1 rv1Var = new rv1(xq8Var, z);
        Z(Bitmap.class, xq8Var, z);
        Z(Drawable.class, rv1Var, z);
        Z(BitmapDrawable.class, rv1Var.c(), z);
        Z(lz2.class, new pz2(xq8Var), z);
        return R();
    }

    final a Y(DownsampleStrategy downsampleStrategy, xq8 xq8Var) {
        if (this.B) {
            return clone().Y(downsampleStrategy, xq8Var);
        }
        f(downsampleStrategy);
        return W(xq8Var);
    }

    a Z(Class cls, xq8 xq8Var, boolean z) {
        if (this.B) {
            return clone().Z(cls, xq8Var, z);
        }
        z06.d(cls);
        z06.d(xq8Var);
        this.u.put(cls, xq8Var);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.M = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        return R();
    }

    public a a(a aVar) {
        if (this.B) {
            return clone().a(aVar);
        }
        if (G(aVar.a, 2)) {
            this.b = aVar.b;
        }
        if (G(aVar.a, 262144)) {
            this.H = aVar.H;
        }
        if (G(aVar.a, Constants.MB)) {
            this.N = aVar.N;
        }
        if (G(aVar.a, 4)) {
            this.c = aVar.c;
        }
        if (G(aVar.a, 8)) {
            this.d = aVar.d;
        }
        if (G(aVar.a, 16)) {
            this.e = aVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (G(aVar.a, 32)) {
            this.f = aVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (G(aVar.a, 64)) {
            this.g = aVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (G(aVar.a, 128)) {
            this.h = aVar.h;
            this.g = null;
            this.a &= -65;
        }
        if (G(aVar.a, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH)) {
            this.i = aVar.i;
        }
        if (G(aVar.a, 512)) {
            this.k = aVar.k;
            this.j = aVar.j;
        }
        if (G(aVar.a, 1024)) {
            this.l = aVar.l;
        }
        if (G(aVar.a, ProgressEvent.PART_FAILED_EVENT_CODE)) {
            this.w = aVar.w;
        }
        if (G(aVar.a, 8192)) {
            this.r = aVar.r;
            this.s = 0;
            this.a &= -16385;
        }
        if (G(aVar.a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.s = aVar.s;
            this.r = null;
            this.a &= -8193;
        }
        if (G(aVar.a, 32768)) {
            this.y = aVar.y;
        }
        if (G(aVar.a, 65536)) {
            this.n = aVar.n;
        }
        if (G(aVar.a, 131072)) {
            this.m = aVar.m;
        }
        if (G(aVar.a, ProgressEvent.PART_COMPLETED_EVENT_CODE)) {
            this.u.putAll(aVar.u);
            this.M = aVar.M;
        }
        if (G(aVar.a, 524288)) {
            this.L = aVar.L;
        }
        if (!this.n) {
            this.u.clear();
            int i = this.a;
            this.m = false;
            this.a = i & (-133121);
            this.M = true;
        }
        this.a |= aVar.a;
        this.t.d(aVar.t);
        return R();
    }

    public a a0(boolean z) {
        if (this.B) {
            return clone().a0(z);
        }
        this.N = z;
        this.a |= Constants.MB;
        return R();
    }

    public a b() {
        if (this.x && !this.B) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.B = true;
        return J();
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            sk5 sk5Var = new sk5();
            aVar.t = sk5Var;
            sk5Var.d(this.t);
            og0 og0Var = new og0();
            aVar.u = og0Var;
            og0Var.putAll(this.u);
            aVar.x = false;
            aVar.B = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public a d(Class cls) {
        if (this.B) {
            return clone().d(cls);
        }
        this.w = (Class) z06.d(cls);
        this.a |= ProgressEvent.PART_FAILED_EVENT_CODE;
        return R();
    }

    public a e(tr1 tr1Var) {
        if (this.B) {
            return clone().e(tr1Var);
        }
        this.c = (tr1) z06.d(tr1Var);
        this.a |= 4;
        return R();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.b, this.b) == 0 && this.f == aVar.f && x19.c(this.e, aVar.e) && this.h == aVar.h && x19.c(this.g, aVar.g) && this.s == aVar.s && x19.c(this.r, aVar.r) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.m == aVar.m && this.n == aVar.n && this.H == aVar.H && this.L == aVar.L && this.c.equals(aVar.c) && this.d == aVar.d && this.t.equals(aVar.t) && this.u.equals(aVar.u) && this.w.equals(aVar.w) && x19.c(this.l, aVar.l) && x19.c(this.y, aVar.y);
    }

    public a f(DownsampleStrategy downsampleStrategy) {
        return S(DownsampleStrategy.h, z06.d(downsampleStrategy));
    }

    public a g() {
        return O(DownsampleStrategy.c, new nj2());
    }

    public final tr1 h() {
        return this.c;
    }

    public int hashCode() {
        return x19.m(this.y, x19.m(this.l, x19.m(this.w, x19.m(this.u, x19.m(this.t, x19.m(this.d, x19.m(this.c, x19.n(this.L, x19.n(this.H, x19.n(this.n, x19.n(this.m, x19.l(this.k, x19.l(this.j, x19.n(this.i, x19.m(this.r, x19.l(this.s, x19.m(this.g, x19.l(this.h, x19.m(this.e, x19.l(this.f, x19.j(this.b)))))))))))))))))))));
    }

    public final int i() {
        return this.f;
    }

    public final Drawable k() {
        return this.e;
    }

    public final Drawable l() {
        return this.r;
    }

    public final int m() {
        return this.s;
    }

    public final boolean n() {
        return this.L;
    }

    public final sk5 o() {
        return this.t;
    }

    public final int p() {
        return this.j;
    }

    public final int q() {
        return this.k;
    }

    public final Drawable r() {
        return this.g;
    }

    public final int s() {
        return this.h;
    }

    public final Priority t() {
        return this.d;
    }

    public final Class u() {
        return this.w;
    }

    public final ov3 v() {
        return this.l;
    }

    public final float w() {
        return this.b;
    }

    public final Resources.Theme x() {
        return this.y;
    }

    public final Map y() {
        return this.u;
    }

    public final boolean z() {
        return this.N;
    }
}
