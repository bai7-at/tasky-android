package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class kx8 extends RippleDrawable {
    public static final a e = new a(null);
    private final boolean a;
    private nn0 b;
    private Integer c;
    private boolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {
        public static final b a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i) {
            rippleDrawable.setRadius(i);
        }
    }

    public kx8(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.a = z;
    }

    private final long a(long j, float f) {
        return nn0.r(j, uo6.h(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j, float f) {
        long a2 = a(j, f);
        nn0 nn0Var = this.b;
        if (nn0Var == null ? false : nn0.t(nn0Var.B(), a2)) {
            return;
        }
        this.b = nn0.j(a2);
        setColor(ColorStateList.valueOf(wn0.k(a2)));
    }

    public final void c(int i) {
        Integer num = this.c;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.c = Integer.valueOf(i);
        b.a.a(this, i);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.a) {
            this.d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.d;
    }
}
