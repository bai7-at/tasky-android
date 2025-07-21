package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import defpackage.cd4;
import defpackage.dh;
import defpackage.gw3;
import defpackage.l29;
import defpackage.lb4;
import defpackage.p50;
import defpackage.r39;
import defpackage.wc4;
import defpackage.yx3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b extends com.airbnb.lottie.model.layer.a {
    private p50 D;
    private final List E;
    private final RectF F;
    private final RectF G;
    private final Paint H;
    private float I;
    private boolean J;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(LottieDrawable lottieDrawable, Layer layer, List list, LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        int i;
        com.airbnb.lottie.model.layer.a aVar;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.J = true;
        dh v = layer.v();
        if (v != null) {
            p50 a2 = v.a();
            this.D = a2;
            i(a2);
            this.D.a(this);
        } else {
            this.D = null;
        }
        lb4 lb4Var = new lb4(lottieComposition.k().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = (Layer) list.get(size);
            com.airbnb.lottie.model.layer.a u = com.airbnb.lottie.model.layer.a.u(this, layer2, lottieDrawable, lottieComposition);
            if (u != null) {
                lb4Var.h(u.z().e(), u);
                if (aVar2 != null) {
                    aVar2.J(u);
                    aVar2 = null;
                } else {
                    this.E.add(0, u);
                    int i2 = a.a[layer2.i().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = u;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < lb4Var.l(); i++) {
            com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) lb4Var.d(lb4Var.g(i));
            if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) lb4Var.d(aVar3.z().k())) != null) {
                aVar3.L(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    protected void I(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            ((com.airbnb.lottie.model.layer.a) this.E.get(i2)).g(gw3Var, i, list, gw3Var2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void K(boolean z) {
        super.K(z);
        Iterator it2 = this.E.iterator();
        while (it2.hasNext()) {
            ((com.airbnb.lottie.model.layer.a) it2.next()).K(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void M(float f) {
        yx3.b("CompositionLayer#setProgress");
        this.I = f;
        super.M(f);
        if (this.D != null) {
            f = ((((Float) this.D.h()).floatValue() * this.q.c().i()) - this.q.c().p()) / (this.p.K().e() + 0.01f);
        }
        if (this.D == null) {
            f -= this.q.s();
        }
        if (this.q.w() != 0.0f && !"__container".equals(this.q.j())) {
            f /= this.q.w();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            ((com.airbnb.lottie.model.layer.a) this.E.get(size)).M(f);
        }
        yx3.c("CompositionLayer#setProgress");
    }

    public float P() {
        return this.I;
    }

    public void Q(boolean z) {
        this.J = z;
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((com.airbnb.lottie.model.layer.a) this.E.get(size)).d(this.F, this.o, true);
            rectF.union(this.F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.E) {
            if (cd4Var == null) {
                p50 p50Var = this.D;
                if (p50Var != null) {
                    p50Var.o(null);
                    return;
                }
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.D = r39Var;
            r39Var.a(this);
            i(this.D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i) {
        yx3.b("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.q.m(), this.q.l());
        matrix.mapRect(this.G);
        boolean z = this.p.g0() && this.E.size() > 1 && i != 255;
        if (z) {
            this.H.setAlpha(i);
            l29.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if (((this.J || !"__container".equals(this.q.j())) && !this.G.isEmpty()) ? canvas.clipRect(this.G) : true) {
                ((com.airbnb.lottie.model.layer.a) this.E.get(size)).h(canvas, matrix, i);
            }
        }
        canvas.restore();
        yx3.c("CompositionLayer#draw");
    }
}
