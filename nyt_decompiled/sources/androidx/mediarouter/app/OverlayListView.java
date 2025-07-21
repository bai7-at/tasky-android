package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class OverlayListView extends ListView {
    private final List a;

    public static class a {
        private BitmapDrawable a;
        private Rect c;
        private Interpolator d;
        private long e;
        private Rect f;
        private int g;
        private long j;
        private boolean k;
        private boolean l;
        private InterfaceC0089a m;
        private float b = 1.0f;
        private float h = 1.0f;
        private float i = 1.0f;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a, reason: collision with other inner class name */
        public interface InterfaceC0089a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            this.c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
        }

        public BitmapDrawable a() {
            return this.a;
        }

        public boolean b() {
            return this.k;
        }

        public a c(float f, float f2) {
            this.h = f;
            this.i = f2;
            return this;
        }

        public a d(InterfaceC0089a interfaceC0089a) {
            this.m = interfaceC0089a;
            return this;
        }

        public a e(long j) {
            this.e = j;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public a g(int i) {
            this.g = i;
            return this;
        }

        public void h(long j) {
            this.j = j;
            this.k = true;
        }

        public void i() {
            this.k = true;
            this.l = true;
            InterfaceC0089a interfaceC0089a = this.m;
            if (interfaceC0089a != null) {
                interfaceC0089a.a();
            }
        }

        public boolean j(long j) {
            if (this.l) {
                return false;
            }
            float max = this.k ? Math.max(0.0f, Math.min(1.0f, (j - this.j) / this.e)) : 0.0f;
            Interpolator interpolator = this.d;
            float interpolation = interpolator == null ? max : interpolator.getInterpolation(max);
            int i = (int) (this.g * interpolation);
            Rect rect = this.c;
            Rect rect2 = this.f;
            rect.top = rect2.top + i;
            rect.bottom = rect2.bottom + i;
            float f = this.h;
            float f2 = f + ((this.i - f) * interpolation);
            this.b = f2;
            BitmapDrawable bitmapDrawable = this.a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f2 * 255.0f));
                this.a.setBounds(this.c);
            }
            if (this.k && max >= 1.0f) {
                this.l = true;
                InterfaceC0089a interfaceC0089a = this.m;
                if (interfaceC0089a != null) {
                    interfaceC0089a.a();
                }
            }
            return !this.l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b() {
        for (a aVar : this.a) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                BitmapDrawable a2 = aVar.a();
                if (a2 != null) {
                    a2.draw(canvas);
                }
                if (!aVar.j(getDrawingTime())) {
                    it2.remove();
                }
            }
        }
    }
}
