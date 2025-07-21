package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import defpackage.d3g;
import defpackage.e8f;
import defpackage.g8f;
import defpackage.l6a;
import defpackage.mrf;
import defpackage.myf;
import defpackage.prf;
import defpackage.pt9;
import defpackage.qgf;
import defpackage.srd;
import defpackage.t7f;
import defpackage.uvd;
import defpackage.vbf;
import defpackage.wmc;
import defpackage.y7f;

/* loaded from: classes3.dex */
final class tn implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, pt9, mrf, d3g, myf, y7f, t7f {
    final /* synthetic */ wn a;

    /* synthetic */ tn(wn wnVar, vbf vbfVar) {
        this.a = wnVar;
    }

    @Override // defpackage.pt9
    public final void U(String str) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.k(str);
    }

    @Override // defpackage.pt9
    public final void V(l6a l6aVar, g8f g8fVar) {
        qgf qgfVar;
        this.a.J = l6aVar;
        qgfVar = this.a.q;
        qgfVar.u(l6aVar, g8fVar);
    }

    @Override // defpackage.pt9
    public final void W(long j, int i) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.i(j, i);
    }

    @Override // defpackage.pt9
    public final void X(final wmc wmcVar) {
        uvd uvdVar;
        this.a.Z = wmcVar;
        uvdVar = this.a.k;
        uvdVar.d(25, new srd() { // from class: pbf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((rnb) obj).W(wmc.this);
            }
        });
        uvdVar.c();
    }

    @Override // defpackage.pt9
    public final void Y(e8f e8fVar) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.Q(e8fVar);
        this.a.J = null;
        this.a.P = null;
    }

    @Override // defpackage.pt9
    public final void Z(e8f e8fVar) {
        qgf qgfVar;
        this.a.P = e8fVar;
        qgfVar = this.a.q;
        qgfVar.U(e8fVar);
    }

    @Override // defpackage.mrf
    public final void a(long j) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.d(j);
    }

    @Override // defpackage.pt9
    public final void a0(String str, long j, long j2) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.f(str, j, j2);
    }

    @Override // defpackage.mrf
    public final void b(Exception exc) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.G(exc);
    }

    @Override // defpackage.pt9
    public final void b0(Object obj, long j) {
        qgf qgfVar;
        Object obj2;
        uvd uvdVar;
        qgfVar = this.a.q;
        qgfVar.g(obj, j);
        wn wnVar = this.a;
        obj2 = wnVar.L;
        if (obj2 == obj) {
            uvdVar = wnVar.k;
            uvdVar.d(26, new srd() { // from class: sbf
                @Override // defpackage.srd
                public final void zza(Object obj3) {
                }
            });
            uvdVar.c();
        }
    }

    @Override // defpackage.mrf
    public final void c(int i, long j, long j2) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.V(i, j, j2);
    }

    @Override // defpackage.pt9
    public final void c0(Exception exc) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.h(exc);
    }

    @Override // defpackage.mrf
    public final void d(prf prfVar) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.D(prfVar);
    }

    @Override // defpackage.pt9
    public final void d0(int i, long j) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.I(i, j);
    }

    @Override // defpackage.mrf
    public final void e(l6a l6aVar, g8f g8fVar) {
        qgf qgfVar;
        this.a.K = l6aVar;
        qgfVar = this.a.q;
        qgfVar.y(l6aVar, g8fVar);
    }

    @Override // defpackage.mrf
    public final void f(Exception exc) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.E(exc);
    }

    @Override // defpackage.mrf
    public final void g(prf prfVar) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.z(prfVar);
    }

    @Override // defpackage.mrf
    public final void h(e8f e8fVar) {
        qgf qgfVar;
        this.a.Q = e8fVar;
        qgfVar = this.a.q;
        qgfVar.r(e8fVar);
    }

    @Override // defpackage.mrf
    public final void i(e8f e8fVar) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.l(e8fVar);
        this.a.K = null;
        this.a.Q = null;
    }

    @Override // defpackage.mrf
    public final void j(String str, long j, long j2) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.C(str, j, j2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        wn.z(this.a, surfaceTexture);
        this.a.P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.S(null);
        this.a.P(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.P(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.mrf
    public final void s(String str) {
        qgf qgfVar;
        qgfVar = this.a.q;
        qgfVar.N(str);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.P(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.P(0, 0);
    }

    @Override // defpackage.mrf
    public final void t(final boolean z) {
        boolean z2;
        uvd uvdVar;
        wn wnVar = this.a;
        z2 = wnVar.U;
        if (z2 == z) {
            return;
        }
        wnVar.U = z;
        uvdVar = this.a.k;
        uvdVar.d(23, new srd() { // from class: mbf
            @Override // defpackage.srd
            public final void zza(Object obj) {
                ((rnb) obj).t(z);
            }
        });
        uvdVar.c();
    }
}
