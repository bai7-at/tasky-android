package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import defpackage.cd4;
import defpackage.cf4;
import defpackage.gw3;
import defpackage.hw3;
import defpackage.iw1;
import defpackage.j94;
import defpackage.l29;
import defpackage.l90;
import defpackage.p50;
import defpackage.uq8;
import defpackage.xv1;
import defpackage.yx3;
import defpackage.zk2;
import defpackage.zx3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements xv1, p50.b, hw3 {
    private Paint A;
    float B;
    BlurMaskFilter C;
    private final Path a = new Path();
    private final Matrix b = new Matrix();
    private final Matrix c = new Matrix();
    private final Paint d = new zx3(1);
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final RectF i;
    private final RectF j;
    private final RectF k;
    private final RectF l;
    private final RectF m;
    private final String n;
    final Matrix o;
    final LottieDrawable p;
    final Layer q;
    private cf4 r;
    private zk2 s;
    private a t;
    private a u;
    private List v;
    private final List w;
    final uq8 x;
    private boolean y;
    private boolean z;

    /* renamed from: com.airbnb.lottie.model.layer.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0137a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    a(LottieDrawable lottieDrawable, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new zx3(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new zx3(1, mode2);
        zx3 zx3Var = new zx3(1);
        this.g = zx3Var;
        this.h = new zx3(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = lottieDrawable;
        this.q = layer;
        this.n = layer.j() + "#draw";
        if (layer.i() == Layer.MatteType.INVERT) {
            zx3Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            zx3Var.setXfermode(new PorterDuffXfermode(mode));
        }
        uq8 b = layer.x().b();
        this.x = b;
        b.b(this);
        if (layer.h() != null && !layer.h().isEmpty()) {
            cf4 cf4Var = new cf4(layer.h());
            this.r = cf4Var;
            Iterator it2 = cf4Var.a().iterator();
            while (it2.hasNext()) {
                ((p50) it2.next()).a(this);
            }
            for (p50 p50Var : this.r.c()) {
                i(p50Var);
                p50Var.a(this);
            }
        }
        O();
    }

    private void C(RectF rectF, Matrix matrix) {
        this.k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (A()) {
            int size = this.r.b().size();
            for (int i = 0; i < size; i++) {
                Mask mask = (Mask) this.r.b().get(i);
                Path path = (Path) ((p50) this.r.a().get(i)).h();
                if (path != null) {
                    this.a.set(path);
                    this.a.transform(matrix);
                    int i2 = C0137a.b[mask.a().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.d()) {
                        return;
                    }
                    this.a.computeBounds(this.m, false);
                    if (i == 0) {
                        this.k.set(this.m);
                    } else {
                        RectF rectF2 = this.k;
                        rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.k.top, this.m.top), Math.max(this.k.right, this.m.right), Math.max(this.k.bottom, this.m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D(RectF rectF, Matrix matrix) {
        if (B() && this.q.i() != Layer.MatteType.INVERT) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.d(this.l, matrix, true);
            if (rectF.intersect(this.l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E() {
        this.p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        N(this.s.q() == 1.0f);
    }

    private void G(float f) {
        this.p.K().n().a(this.q.j(), f);
    }

    private void N(boolean z) {
        if (z != this.y) {
            this.y = z;
            E();
        }
    }

    private void O() {
        if (this.q.f().isEmpty()) {
            N(true);
            return;
        }
        zk2 zk2Var = new zk2(this.q.f());
        this.s = zk2Var;
        zk2Var.m();
        this.s.a(new p50.b() { // from class: q50
            @Override // p50.b
            public final void a() {
                a.this.F();
            }
        });
        N(((Float) this.s.h()).floatValue() == 1.0f);
        i(this.s);
    }

    private void j(Canvas canvas, Matrix matrix, p50 p50Var, p50 p50Var2) {
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) p50Var2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
    }

    private void k(Canvas canvas, Matrix matrix, p50 p50Var, p50 p50Var2) {
        l29.m(canvas, this.i, this.e);
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) p50Var2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.d);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, p50 p50Var, p50 p50Var2) {
        l29.m(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        this.d.setAlpha((int) (((Integer) p50Var2.h()).intValue() * 2.55f));
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, p50 p50Var, p50 p50Var2) {
        l29.m(canvas, this.i, this.e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (((Integer) p50Var2.h()).intValue() * 2.55f));
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, p50 p50Var, p50 p50Var2) {
        l29.m(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (((Integer) p50Var2.h()).intValue() * 2.55f));
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        yx3.b("Layer#saveLayer");
        l29.n(canvas, this.i, this.e, 19);
        yx3.c("Layer#saveLayer");
        for (int i = 0; i < this.r.b().size(); i++) {
            Mask mask = (Mask) this.r.b().get(i);
            p50 p50Var = (p50) this.r.a().get(i);
            p50 p50Var2 = (p50) this.r.c().get(i);
            int i2 = C0137a.b[mask.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, p50Var, p50Var2);
                    } else {
                        p(canvas, matrix, p50Var);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, p50Var, p50Var2);
                        } else {
                            j(canvas, matrix, p50Var, p50Var2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, p50Var, p50Var2);
                } else {
                    k(canvas, matrix, p50Var, p50Var2);
                }
            } else if (q()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        yx3.b("Layer#restoreLayer");
        canvas.restore();
        yx3.c("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, p50 p50Var) {
        this.a.set((Path) p50Var.h());
        this.a.transform(matrix);
        canvas.drawPath(this.a, this.f);
    }

    private boolean q() {
        if (this.r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.r.b().size(); i++) {
            if (((Mask) this.r.b().get(i)).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.v != null) {
            return;
        }
        if (this.u == null) {
            this.v = Collections.emptyList();
            return;
        }
        this.v = new ArrayList();
        for (a aVar = this.u; aVar != null; aVar = aVar.u) {
            this.v.add(aVar);
        }
    }

    private void s(Canvas canvas) {
        yx3.b("Layer#clearLayer");
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        yx3.c("Layer#clearLayer");
    }

    static a u(b bVar, Layer layer, LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
        switch (C0137a.a[layer.g().ordinal()]) {
            case 1:
                return new e(lottieDrawable, layer, bVar, lottieComposition);
            case 2:
                return new b(lottieDrawable, layer, lottieComposition.o(layer.n()), lottieComposition);
            case 3:
                return new f(lottieDrawable, layer);
            case 4:
                return new c(lottieDrawable, layer);
            case 5:
                return new d(lottieDrawable, layer);
            case 6:
                return new g(lottieDrawable, layer);
            default:
                j94.c("Unknown layer type " + layer.g());
                return null;
        }
    }

    boolean A() {
        cf4 cf4Var = this.r;
        return (cf4Var == null || cf4Var.a().isEmpty()) ? false : true;
    }

    boolean B() {
        return this.t != null;
    }

    public void H(p50 p50Var) {
        this.w.remove(p50Var);
    }

    void I(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
    }

    void J(a aVar) {
        this.t = aVar;
    }

    void K(boolean z) {
        if (z && this.A == null) {
            this.A = new zx3();
        }
        this.z = z;
    }

    void L(a aVar) {
        this.u = aVar;
    }

    void M(float f) {
        yx3.b("BaseLayer#setProgress");
        yx3.b("BaseLayer#setProgress.transform");
        this.x.j(f);
        yx3.c("BaseLayer#setProgress.transform");
        if (this.r != null) {
            yx3.b("BaseLayer#setProgress.mask");
            for (int i = 0; i < this.r.a().size(); i++) {
                ((p50) this.r.a().get(i)).n(f);
            }
            yx3.c("BaseLayer#setProgress.mask");
        }
        if (this.s != null) {
            yx3.b("BaseLayer#setProgress.inout");
            this.s.n(f);
            yx3.c("BaseLayer#setProgress.inout");
        }
        if (this.t != null) {
            yx3.b("BaseLayer#setProgress.matte");
            this.t.M(f);
            yx3.c("BaseLayer#setProgress.matte");
        }
        yx3.b("BaseLayer#setProgress.animations." + this.w.size());
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            ((p50) this.w.get(i2)).n(f);
        }
        yx3.c("BaseLayer#setProgress.animations." + this.w.size());
        yx3.c("BaseLayer#setProgress");
    }

    @Override // p50.b
    public void a() {
        E();
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
    }

    @Override // defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.o.set(matrix);
        if (z) {
            List list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.o.preConcat(((a) this.v.get(size)).x.f());
                }
            } else {
                a aVar = this.u;
                if (aVar != null) {
                    this.o.preConcat(aVar.x.f());
                }
            }
        }
        this.o.preConcat(this.x.f());
    }

    @Override // defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        this.x.c(obj, cd4Var);
    }

    @Override // defpackage.hw3
    public void g(gw3 gw3Var, int i, List list, gw3 gw3Var2) {
        a aVar = this.t;
        if (aVar != null) {
            gw3 a = gw3Var2.a(aVar.getName());
            if (gw3Var.c(this.t.getName(), i)) {
                list.add(a.i(this.t));
            }
            if (gw3Var.h(getName(), i)) {
                this.t.I(gw3Var, gw3Var.e(this.t.getName(), i) + i, list, a);
            }
        }
        if (gw3Var.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                gw3Var2 = gw3Var2.a(getName());
                if (gw3Var.c(getName(), i)) {
                    list.add(gw3Var2.i(this));
                }
            }
            if (gw3Var.h(getName(), i)) {
                I(gw3Var, i + gw3Var.e(getName(), i), list, gw3Var2);
            }
        }
    }

    @Override // defpackage.tv0
    public String getName() {
        return this.q.j();
    }

    @Override // defpackage.xv1
    public void h(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer num;
        yx3.b(this.n);
        if (!this.y || this.q.y()) {
            yx3.c(this.n);
            return;
        }
        r();
        yx3.b("Layer#parentMatrix");
        this.b.reset();
        this.b.set(matrix);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.b.preConcat(((a) this.v.get(size)).x.f());
        }
        yx3.c("Layer#parentMatrix");
        p50 h = this.x.h();
        int intValue = (int) ((((i / 255.0f) * ((h == null || (num = (Integer) h.h()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
        if (!B() && !A()) {
            this.b.preConcat(this.x.f());
            yx3.b("Layer#drawLayer");
            t(canvas, this.b, intValue);
            yx3.c("Layer#drawLayer");
            G(yx3.c(this.n));
            return;
        }
        yx3.b("Layer#computeBounds");
        d(this.i, this.b, false);
        D(this.i, matrix);
        this.b.preConcat(this.x.f());
        C(this.i, this.b);
        this.j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.c);
        if (!this.c.isIdentity()) {
            Matrix matrix2 = this.c;
            matrix2.invert(matrix2);
            this.c.mapRect(this.j);
        }
        if (!this.i.intersect(this.j)) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        yx3.c("Layer#computeBounds");
        if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
            yx3.b("Layer#saveLayer");
            this.d.setAlpha(255);
            l29.m(canvas, this.i, this.d);
            yx3.c("Layer#saveLayer");
            s(canvas);
            yx3.b("Layer#drawLayer");
            t(canvas, this.b, intValue);
            yx3.c("Layer#drawLayer");
            if (A()) {
                o(canvas, this.b);
            }
            if (B()) {
                yx3.b("Layer#drawMatte");
                yx3.b("Layer#saveLayer");
                l29.n(canvas, this.i, this.g, 19);
                yx3.c("Layer#saveLayer");
                s(canvas);
                this.t.h(canvas, matrix, intValue);
                yx3.b("Layer#restoreLayer");
                canvas.restore();
                yx3.c("Layer#restoreLayer");
                yx3.c("Layer#drawMatte");
            }
            yx3.b("Layer#restoreLayer");
            canvas.restore();
            yx3.c("Layer#restoreLayer");
        }
        if (this.z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.i, this.A);
        }
        G(yx3.c(this.n));
    }

    public void i(p50 p50Var) {
        if (p50Var == null) {
            return;
        }
        this.w.add(p50Var);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i);

    public LBlendMode v() {
        return this.q.a();
    }

    public l90 w() {
        return this.q.b();
    }

    public BlurMaskFilter x(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public iw1 y() {
        return this.q.d();
    }

    Layer z() {
        return this.q;
    }
}
