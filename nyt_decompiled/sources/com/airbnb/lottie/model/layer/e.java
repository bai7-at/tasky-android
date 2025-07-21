package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import defpackage.gw3;
import defpackage.iw1;
import defpackage.l90;
import defpackage.xo7;
import defpackage.zv0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class e extends a {
    private final zv0 D;
    private final b E;

    e(LottieDrawable lottieDrawable, Layer layer, b bVar, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        this.E = bVar;
        zv0 zv0Var = new zv0(lottieDrawable, this, new xo7("__container", layer.o(), false), lottieComposition);
        this.D = zv0Var;
        zv0Var.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void I(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        this.D.g(gw3Var, i, list, gw3Var2);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.o, z);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i) {
        this.D.h(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public l90 w() {
        l90 w = super.w();
        return w != null ? w : this.E.w();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public iw1 y() {
        iw1 y = super.y();
        return y != null ? y : this.E.y();
    }
}
