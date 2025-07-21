package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.f;
import defpackage.h16;
import defpackage.hg4;
import defpackage.hi;
import defpackage.nn6;
import defpackage.qo0;
import defpackage.zd6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.o implements com.google.android.material.carousel.b, RecyclerView.y.b {
    private int A;
    private Map B;
    private com.google.android.material.carousel.c C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;
    int s;
    int t;
    int u;
    private boolean v;
    private final c w;
    private com.google.android.material.carousel.d x;
    private g y;
    private f z;

    class a extends j {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i) {
            return CarouselLayoutManager.this.d(i);
        }

        @Override // androidx.recyclerview.widget.j
        public int t(View view, int i) {
            if (CarouselLayoutManager.this.y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.j
        public int u(View view, int i) {
            if (CarouselLayoutManager.this.y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.i2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {
        final View a;
        final float b;
        final float c;
        final d d;

        b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    private static class c extends RecyclerView.n {
        private final Paint a;
        private List b;

        c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(zd6.m3_carousel_debug_keyline_width));
            for (f.c cVar : this.b) {
                this.a.setColor(qo0.d(-65281, -16776961, cVar.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).C2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), this.a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.b, this.a);
                }
            }
        }

        void j(List list) {
            this.b = Collections.unmodifiableList(list);
        }
    }

    private static class d {
        final f.c a;
        final f.c b;

        d(f.c cVar, f.c cVar2) {
            h16.a(cVar.a <= cVar2.a);
            this.a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A2() {
        return this.C.h();
    }

    private int B2() {
        return this.C.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C2() {
        return this.C.j();
    }

    private int D2() {
        if (R() || !this.x.f()) {
            return 0;
        }
        return w2() == 1 ? h0() : j0();
    }

    private int E2(int i, f fVar) {
        return (int) (H2() ? ((p2() - fVar.h().a) - (i * fVar.f())) - (fVar.f() / 2.0f) : ((i * fVar.f()) - fVar.a().a) + (fVar.f() / 2.0f));
    }

    private int F2(int i, f fVar) {
        int i2 = Integer.MAX_VALUE;
        for (f.c cVar : fVar.e()) {
            float f = (i * fVar.f()) + (fVar.f() / 2.0f);
            int p2 = (H2() ? (int) ((p2() - cVar.a) - f) : (int) (f - cVar.a)) - this.s;
            if (Math.abs(i2) > Math.abs(p2)) {
                i2 = p2;
            }
        }
        return i2;
    }

    private static d G2(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            f.c cVar = (f.c) list.get(i5);
            float f6 = z ? cVar.b : cVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d((f.c) list.get(i), (f.c) list.get(i3));
    }

    private boolean I2(float f, d dVar) {
        float b2 = b2(f, u2(f, dVar) / 2.0f);
        if (H2()) {
            if (b2 >= 0.0f) {
                return false;
            }
        } else if (b2 <= p2()) {
            return false;
        }
        return true;
    }

    private boolean J2(float f, d dVar) {
        float a2 = a2(f, u2(f, dVar) / 2.0f);
        if (H2()) {
            if (a2 <= p2()) {
                return false;
            }
        } else if (a2 >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K2(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: ji0
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.P2();
            }
        });
    }

    private void L2() {
        if (this.v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i = 0; i < O(); i++) {
                View N = N(i);
                Log.d("CarouselLayoutManager", "item position " + l0(N) + ", center:" + q2(N) + ", child index:" + i);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b M2(RecyclerView.v vVar, float f, int i) {
        View o = vVar.o(i);
        F0(o, 0, 0);
        float a2 = a2(f, this.z.f() / 2.0f);
        d G2 = G2(this.z.g(), a2, false);
        return new b(o, a2, f2(o, a2, G2), G2);
    }

    private float N2(View view, float f, float f2, Rect rect) {
        float a2 = a2(f, f2);
        d G2 = G2(this.z.g(), a2, false);
        float f22 = f2(view, a2, G2);
        super.U(view, rect);
        X2(view, a2, G2);
        this.C.l(view, rect, f2, f22);
        return f22;
    }

    private void O2(RecyclerView.v vVar) {
        View o = vVar.o(0);
        F0(o, 0, 0);
        f g = this.x.g(this, o);
        if (H2()) {
            g = f.n(g, p2());
        }
        this.y = g.f(this, g, r2(), t2(), D2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        this.y = null;
        y1();
    }

    private void Q2(RecyclerView.v vVar) {
        while (O() > 0) {
            View N = N(0);
            float q2 = q2(N);
            if (!J2(q2, G2(this.z.g(), q2, true))) {
                break;
            } else {
                r1(N, vVar);
            }
        }
        while (O() - 1 >= 0) {
            View N2 = N(O() - 1);
            float q22 = q2(N2);
            if (!I2(q22, G2(this.z.g(), q22, true))) {
                return;
            } else {
                r1(N2, vVar);
            }
        }
    }

    private int R2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        if (this.y == null) {
            O2(vVar);
        }
        int j2 = j2(i, this.s, this.t, this.u);
        this.s += j2;
        Y2(this.y);
        float f = this.z.f() / 2.0f;
        float g2 = g2(l0(N(0)));
        Rect rect = new Rect();
        float f2 = H2() ? this.z.h().b : this.z.a().b;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < O(); i2++) {
            View N = N(i2);
            float abs = Math.abs(f2 - N2(N, g2, f, rect));
            if (N != null && abs < f3) {
                this.F = l0(N);
                f3 = abs;
            }
            g2 = a2(g2, this.z.f());
        }
        m2(vVar, zVar);
        return j2;
    }

    private void S2(RecyclerView recyclerView, int i) {
        if (f()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    private void U2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.Carousel);
            T2(obtainStyledAttributes.getInt(nn6.Carousel_carousel_alignment, 0));
            W2(obtainStyledAttributes.getInt(nn6.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    private void X2(View view, float f, d dVar) {
    }

    private void Y2(g gVar) {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = H2() ? gVar.h() : gVar.l();
        } else {
            this.z = gVar.j(this.s, i2, i);
        }
        this.w.j(this.z.g());
    }

    private void Z1(View view, int i, b bVar) {
        float f = this.z.f() / 2.0f;
        j(view, i);
        float f2 = bVar.c;
        this.C.k(view, (int) (f2 - f), (int) (f2 + f));
        X2(view, bVar.b, bVar.d);
    }

    private void Z2() {
        int a2 = a();
        int i = this.E;
        if (a2 == i || this.y == null) {
            return;
        }
        if (this.x.h(this, i)) {
            P2();
        }
        this.E = a2;
    }

    private float a2(float f, float f2) {
        return H2() ? f - f2 : f + f2;
    }

    private void a3() {
        if (!this.v || O() < 1) {
            return;
        }
        int i = 0;
        while (i < O() - 1) {
            int l0 = l0(N(i));
            int i2 = i + 1;
            int l02 = l0(N(i2));
            if (l0 > l02) {
                L2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + l0 + "] and child at index [" + i2 + "] had adapter position [" + l02 + "].");
            }
            i = i2;
        }
    }

    private float b2(float f, float f2) {
        return H2() ? f + f2 : f - f2;
    }

    private void c2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0 || i >= a()) {
            return;
        }
        b M2 = M2(vVar, g2(i), i);
        Z1(M2.a, i2, M2);
    }

    private void d2(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        float g2 = g2(i);
        while (i < zVar.b()) {
            b M2 = M2(vVar, g2, i);
            if (I2(M2.c, M2.d)) {
                return;
            }
            g2 = a2(g2, this.z.f());
            if (!J2(M2.c, M2.d)) {
                Z1(M2.a, -1, M2);
            }
            i++;
        }
    }

    private void e2(RecyclerView.v vVar, int i) {
        float g2 = g2(i);
        while (i >= 0) {
            b M2 = M2(vVar, g2, i);
            if (J2(M2.c, M2.d)) {
                return;
            }
            g2 = b2(g2, this.z.f());
            if (!I2(M2.c, M2.d)) {
                Z1(M2.a, 0, M2);
            }
            i--;
        }
    }

    private float f2(View view, float f, d dVar) {
        f.c cVar = dVar.a;
        float f2 = cVar.b;
        f.c cVar2 = dVar.b;
        float b2 = hi.b(f2, cVar2.b, cVar.a, cVar2.a, f);
        if (dVar.b != this.z.c() && dVar.a != this.z.j()) {
            return b2;
        }
        float d2 = this.C.d((RecyclerView.p) view.getLayoutParams()) / this.z.f();
        f.c cVar3 = dVar.b;
        return b2 + ((f - cVar3.a) * ((1.0f - cVar3.c) + d2));
    }

    private float g2(int i) {
        return a2(B2() - this.s, this.z.f() * i);
    }

    private int h2(RecyclerView.z zVar, g gVar) {
        boolean H2 = H2();
        f l = H2 ? gVar.l() : gVar.h();
        f.c a2 = H2 ? l.a() : l.h();
        int b2 = (int) (((((zVar.b() - 1) * l.f()) * (H2 ? -1.0f : 1.0f)) - (a2.a - B2())) + (y2() - a2.a) + (H2 ? -a2.g : a2.h));
        return H2 ? Math.min(0, b2) : Math.max(0, b2);
    }

    private static int j2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int k2(g gVar) {
        boolean H2 = H2();
        f h = H2 ? gVar.h() : gVar.l();
        return (int) (B2() - b2((H2 ? h.h() : h.a()).a, h.f() / 2.0f));
    }

    private int l2(int i) {
        int w2 = w2();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            return w2 == 0 ? H2() ? 1 : -1 : RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 33) {
            if (w2 == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 66) {
            return w2 == 0 ? H2() ? -1 : 1 : RecyclerView.UNDEFINED_DURATION;
        }
        if (i == 130) {
            if (w2 == 1) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
        return RecyclerView.UNDEFINED_DURATION;
    }

    private void m2(RecyclerView.v vVar, RecyclerView.z zVar) {
        Q2(vVar);
        if (O() == 0) {
            e2(vVar, this.A - 1);
            d2(vVar, zVar, this.A);
        } else {
            int l0 = l0(N(0));
            int l02 = l0(N(O() - 1));
            e2(vVar, l0 - 1);
            d2(vVar, zVar, l02 + 1);
        }
        a3();
    }

    private View n2() {
        return N(H2() ? 0 : O() - 1);
    }

    private View o2() {
        return N(H2() ? O() - 1 : 0);
    }

    private int p2() {
        return f() ? b() : c();
    }

    private float q2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    private int r2() {
        int i;
        int i2;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) N(0).getLayoutParams();
        if (this.C.a == 0) {
            i = ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
        return i + i2;
    }

    private f s2(int i) {
        f fVar;
        Map map = this.B;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(hg4.b(i, 0, Math.max(0, a() + (-1)))))) == null) ? this.y.g() : fVar;
    }

    private int t2() {
        if (R() || !this.x.f()) {
            return 0;
        }
        return w2() == 1 ? k0() : i0();
    }

    private float u2(float f, d dVar) {
        f.c cVar = dVar.a;
        float f2 = cVar.d;
        f.c cVar2 = dVar.b;
        return hi.b(f2, cVar2.d, cVar.b, cVar2.b, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.C.e();
    }

    private int y2() {
        return this.C.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z2() {
        return this.C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.u - this.t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (p()) {
            return R2(i, vVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(int i) {
        this.F = i;
        if (this.y == null) {
            return;
        }
        this.s = E2(i, s2(i));
        this.A = hg4.b(i, 0, Math.max(0, a() - 1));
        Y2(this.y);
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (q()) {
            return R2(i, vVar, zVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void F0(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean H2() {
        return f() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.x.e(recyclerView.getContext());
        P2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.N0(recyclerView, vVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View O0(View view, int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int l2;
        if (O() == 0 || (l2 = l2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (l2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            c2(vVar, l0(N(0)) - 1, 0);
            return o2();
        }
        if (l0(view) == a() - 1) {
            return null;
        }
        c2(vVar, l0(N(O() - 1)) + 1, -1);
        return n2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        P1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void T2(int i) {
        this.G = i;
        P2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float centerY = rect.centerY();
        if (f()) {
            centerY = rect.centerX();
        }
        float u2 = u2(centerY, G2(this.z.g(), centerY, true));
        float width = f() ? (rect.width() - u2) / 2.0f : 0.0f;
        float height = f() ? 0.0f : (rect.height() - u2) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public void V2(com.google.android.material.carousel.d dVar) {
        this.x = dVar;
        P2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i, int i2) {
        super.W0(recyclerView, i, i2);
        Z2();
    }

    public void W2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        com.google.android.material.carousel.c cVar = this.C;
        if (cVar == null || i != cVar.a) {
            this.C = com.google.android.material.carousel.c.b(this, i);
            P2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        super.Z0(recyclerView, i, i2);
        Z2();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return s0();
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || p2() <= 0.0f) {
            p1(vVar);
            this.A = 0;
            return;
        }
        boolean H2 = H2();
        boolean z = this.y == null;
        if (z) {
            O2(vVar);
        }
        int k2 = k2(this.y);
        int h2 = h2(zVar, this.y);
        this.t = H2 ? h2 : k2;
        if (H2) {
            h2 = k2;
        }
        this.u = h2;
        if (z) {
            this.s = k2;
            this.B = this.y.i(a(), this.t, this.u, H2());
            int i = this.F;
            if (i != -1) {
                this.s = E2(i, s2(i));
            }
        }
        int i2 = this.s;
        this.s = i2 + j2(0, i2, this.t, this.u);
        this.A = hg4.b(this.A, 0, zVar.b());
        Y2(this.y);
        B(vVar);
        m2(vVar, zVar);
        this.E = a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        if (this.y == null) {
            return null;
        }
        int v2 = v2(i, s2(i));
        return f() ? new PointF(v2, 0.0f) : new PointF(0.0f, v2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView.z zVar) {
        super.d1(zVar);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = l0(N(0));
        }
        a3();
    }

    @Override // com.google.android.material.carousel.b
    public int e() {
        return this.G;
    }

    @Override // com.google.android.material.carousel.b
    public boolean f() {
        return this.C.a == 0;
    }

    int i2(int i) {
        return (int) (this.s - E2(i, s2(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return !f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        if (O() == 0 || this.y == null || a() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.y.g().f() / x(zVar)));
    }

    int v2(int i, f fVar) {
        return E2(i, fVar) - this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    public int w2() {
        return this.C.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.u - this.t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int F2;
        if (this.y == null || (F2 = F2(l0(view), s2(l0(view)))) == 0) {
            return false;
        }
        S2(recyclerView, F2(l0(view), this.y.j(this.s + j2(F2, this.s, this.t, this.u), this.t, this.u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        if (O() == 0 || this.y == null || a() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.y.g().f() / A(zVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: ii0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.this.K2(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        V2(dVar);
        W2(i);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.v = false;
        this.w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: ii0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CarouselLayoutManager.this.K2(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.F = -1;
        this.G = 0;
        V2(new h());
        U2(context, attributeSet);
    }
}
