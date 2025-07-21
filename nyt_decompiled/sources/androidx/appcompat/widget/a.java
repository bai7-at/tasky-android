package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ab9;
import defpackage.cb9;
import defpackage.fo6;
import defpackage.k99;
import defpackage.nc6;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {
    protected final C0014a a;
    protected final Context b;
    protected ActionMenuView c;
    protected c d;
    protected int e;
    protected ab9 f;
    private boolean g;
    private boolean h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0014a implements cb9 {
        private boolean a = false;
        int b;

        protected C0014a() {
        }

        @Override // defpackage.cb9
        public void a(View view) {
            this.a = true;
        }

        @Override // defpackage.cb9
        public void b(View view) {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.f = null;
            a.super.setVisibility(this.b);
        }

        @Override // defpackage.cb9
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0014a d(ab9 ab9Var, int i) {
            a.this.f = ab9Var;
            this.b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new C0014a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(nc6.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public ab9 f(int i, long j) {
        ab9 ab9Var = this.f;
        if (ab9Var != null) {
            ab9Var.c();
        }
        if (i != 0) {
            ab9 b = k99.e(this).b(0.0f);
            b.f(j);
            b.h(this.a.d(b, i));
            return b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ab9 b2 = k99.e(this).b(1.0f);
        b2.f(j);
        b2.h(this.a.d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, fo6.ActionBar, nc6.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(fo6.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ab9 ab9Var = this.f;
            if (ab9Var != null) {
                ab9Var.c();
            }
            super.setVisibility(i);
        }
    }
}
