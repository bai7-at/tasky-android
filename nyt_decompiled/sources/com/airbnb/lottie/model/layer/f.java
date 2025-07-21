package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import defpackage.cd4;
import defpackage.p50;
import defpackage.r39;
import defpackage.wc4;
import defpackage.zx3;

/* loaded from: classes.dex */
public class f extends a {
    private final RectF D;
    private final Paint E;
    private final float[] F;
    private final Path G;
    private final Layer H;
    private p50 I;
    private p50 J;

    f(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.D = new RectF();
        zx3 zx3Var = new zx3();
        this.E = zx3Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = layer;
        zx3Var.setAlpha(0);
        zx3Var.setStyle(Paint.Style.FILL);
        zx3Var.setColor(layer.p());
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.set(0.0f, 0.0f, this.H.r(), this.H.q());
        this.o.mapRect(this.D);
        rectF.set(this.D);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.K) {
            if (cd4Var == null) {
                this.I = null;
                return;
            } else {
                this.I = new r39(cd4Var);
                return;
            }
        }
        if (obj == wc4.a) {
            if (cd4Var != null) {
                this.J = new r39(cd4Var);
            } else {
                this.J = null;
                this.E.setColor(this.H.p());
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.H.p());
        if (alpha == 0) {
            return;
        }
        p50 p50Var = this.J;
        Integer num = p50Var == null ? null : (Integer) p50Var.h();
        if (num != null) {
            this.E.setColor(num.intValue());
        } else {
            this.E.setColor(this.H.p());
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.x.h() == null ? 100 : ((Integer) this.x.h().h()).intValue())) / 100.0f) * 255.0f);
        this.E.setAlpha(intValue);
        p50 p50Var2 = this.I;
        if (p50Var2 != null) {
            this.E.setColorFilter((ColorFilter) p50Var2.h());
        }
        if (intValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.H.r();
            float[] fArr2 = this.F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.H.r();
            this.F[5] = this.H.q();
            float[] fArr3 = this.F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.H.q();
            matrix.mapPoints(this.F);
            this.G.reset();
            Path path = this.G;
            float[] fArr4 = this.F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.G;
            float[] fArr5 = this.F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.G;
            float[] fArr6 = this.F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.G;
            float[] fArr7 = this.F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.G;
            float[] fArr8 = this.F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.G.close();
            canvas.drawPath(this.G, this.E);
        }
    }
}
