package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import defpackage.cd4;
import defpackage.l29;
import defpackage.p50;
import defpackage.r39;
import defpackage.rc4;
import defpackage.wc4;
import defpackage.zx3;

/* loaded from: classes.dex */
public class c extends a {
    private final Paint D;
    private final Rect E;
    private final Rect F;
    private final rc4 G;
    private p50 H;
    private p50 I;

    c(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new zx3(3);
        this.E = new Rect();
        this.F = new Rect();
        this.G = lottieDrawable.Q(layer.n());
    }

    private Bitmap P() {
        Bitmap bitmap;
        p50 p50Var = this.I;
        if (p50Var != null && (bitmap = (Bitmap) p50Var.h()) != null) {
            return bitmap;
        }
        Bitmap H = this.p.H(this.q.n());
        if (H != null) {
            return H;
        }
        rc4 rc4Var = this.G;
        if (rc4Var != null) {
            return rc4Var.b();
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        if (this.G != null) {
            float e = l29.e();
            rectF.set(0.0f, 0.0f, this.G.f() * e, this.G.d() * e);
            this.o.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.K) {
            if (cd4Var == null) {
                this.H = null;
                return;
            } else {
                this.H = new r39(cd4Var);
                return;
            }
        }
        if (obj == wc4.N) {
            if (cd4Var == null) {
                this.I = null;
            } else {
                this.I = new r39(cd4Var);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        Bitmap P = P();
        if (P == null || P.isRecycled() || this.G == null) {
            return;
        }
        float e = l29.e();
        this.D.setAlpha(i);
        p50 p50Var = this.H;
        if (p50Var != null) {
            this.D.setColorFilter((ColorFilter) p50Var.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.E.set(0, 0, P.getWidth(), P.getHeight());
        if (this.p.R()) {
            this.F.set(0, 0, (int) (this.G.f() * e), (int) (this.G.d() * e));
        } else {
            this.F.set(0, 0, (int) (P.getWidth() * e), (int) (P.getHeight() * e));
        }
        canvas.drawBitmap(P, this.E, this.F, this.D);
        canvas.restore();
    }
}
