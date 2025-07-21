package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
abstract class c {
    final int a;

    class a extends c {
        final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.b.b0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.b.i0();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.b.s0() - this.b.j0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i, int i2) {
            int g = g();
            this.b.E0(view, g, i, g + m(view), i2);
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.b.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }
    }

    class b extends c {
        final /* synthetic */ CarouselLayoutManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.b.b0() - this.b.h0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.b.H2() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.b.s0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.b.H2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.b.k0();
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i, int i2) {
            int j = j();
            this.b.E0(view, i, j, i2, j + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.b.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
    }

    /* synthetic */ c(int i, a aVar) {
        this(i);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return a(carouselLayoutManager);
        }
        if (i == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract float d(RecyclerView.p pVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i, int i2);

    abstract void l(View view, Rect rect, float f, float f2);

    private c(int i) {
        this.a = i;
    }
}
