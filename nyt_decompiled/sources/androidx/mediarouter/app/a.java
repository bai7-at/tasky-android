package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import defpackage.bo6;
import defpackage.hc6;
import defpackage.k99;
import defpackage.kv1;
import defpackage.sn8;
import defpackage.tm4;
import defpackage.ym4;
import defpackage.zk6;
import defpackage.zm4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a extends View {
    private static C0090a t;
    static final SparseArray u = new SparseArray(2);
    private static final int[] w = {R.attr.state_checked};
    private static final int[] x = {R.attr.state_checkable};
    private final zm4 a;
    private final b b;
    private ym4 c;
    private tm4 d;
    private boolean e;
    private int f;
    c g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private ColorStateList l;
    private int m;
    private int n;
    private boolean r;
    private boolean s;

    /* renamed from: androidx.mediarouter.app.a$a, reason: collision with other inner class name */
    private static final class C0090a extends BroadcastReceiver {
        private final Context a;
        private boolean b = true;
        private List c = new ArrayList();

        C0090a(Context context) {
            this.a = context;
        }

        public boolean a() {
            return this.b;
        }

        public void b(a aVar) {
            if (this.c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.a.registerReceiver(this, intentFilter);
            }
            this.c.add(aVar);
        }

        public void c(a aVar) {
            this.c.remove(aVar);
            if (this.c.size() == 0) {
                this.a.unregisterReceiver(this);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z;
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.b == (!intent.getBooleanExtra("noConnectivity", false))) {
                return;
            }
            this.b = z;
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).c();
            }
        }
    }

    private final class b extends zm4.b {
        b() {
        }

        @Override // zm4.b
        public void a(zm4 zm4Var, zm4.g gVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void b(zm4 zm4Var, zm4.g gVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void c(zm4 zm4Var, zm4.g gVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void d(zm4 zm4Var, zm4.h hVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void g(zm4 zm4Var, zm4.h hVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void h(zm4 zm4Var, zm4.h hVar) {
            a.this.b();
        }

        @Override // zm4.b
        public void k(zm4 zm4Var, zm4.h hVar) {
            a.this.b();
        }
    }

    private final class c extends AsyncTask {
        private final int a;
        private final Context b;

        c(int i, Context context) {
            this.a = i;
            this.b = context;
        }

        private void a(Drawable drawable) {
            if (drawable != null) {
                a.u.put(this.a, drawable.getConstantState());
            }
            a.this.g = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            if (((Drawable.ConstantState) a.u.get(this.a)) == null) {
                return this.b.getResources().getDrawable(this.a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Drawable drawable) {
            a(drawable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                a(drawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) a.u.get(this.a);
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                a.this.g = null;
            }
            a.this.setRemoteIndicatorDrawableInternal(drawable);
        }
    }

    public a(Context context) {
        this(context, null);
    }

    private void a() {
        if (this.i > 0) {
            c cVar = this.g;
            if (cVar != null) {
                cVar.cancel(false);
            }
            c cVar2 = new c(this.i, getContext());
            this.g = cVar2;
            this.i = 0;
            cVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private boolean e(int i) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (this.a.k().v()) {
            if (fragmentManager.k0("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            androidx.mediarouter.app.c b2 = this.d.b();
            b2.h1(this.c);
            if (i == 2) {
                b2.i1(true);
            }
            r p = fragmentManager.p();
            p.e(b2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            p.i();
        } else {
            if (fragmentManager.k0("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            e c2 = this.d.c();
            c2.g1(this.c);
            if (i == 2) {
                c2.h1(true);
            }
            r p2 = fragmentManager.p();
            p2.e(c2, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
            p2.i();
        }
        return true;
    }

    private void f() {
        int i = this.k;
        String string = getContext().getString(i != 1 ? i != 2 ? zk6.mr_cast_button_disconnected : zk6.mr_cast_button_connected : zk6.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.s || TextUtils.isEmpty(string)) {
            string = null;
        }
        sn8.a(this, string);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof androidx.fragment.app.f) {
            return ((androidx.fragment.app.f) activity).getSupportFragmentManager();
        }
        return null;
    }

    void b() {
        zm4.h k = this.a.k();
        boolean v = k.v();
        int c2 = !v ? k.c() : 0;
        if (this.k != c2) {
            this.k = c2;
            f();
            refreshDrawableState();
        }
        if (c2 == 1) {
            a();
        }
        if (this.e) {
            setEnabled(this.r || !v || this.a.m(this.c, 1));
        }
    }

    void c() {
        super.setVisibility((this.f != 0 || this.r || t.a()) ? this.f : 4);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean d() {
        if (!this.e) {
            return false;
        }
        this.a.i();
        return e(1);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.setState(getDrawableState());
            if (this.h.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.h.getCurrent();
                int i = this.k;
                if (i == 1 || this.j != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.j = this.k;
    }

    public tm4 getDialogFactory() {
        return this.d;
    }

    public ym4 getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e = true;
        if (!this.c.f()) {
            this.a.a(this.c, this.b);
        }
        b();
        t.b(this);
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        zm4 zm4Var = this.a;
        if (zm4Var == null) {
            return onCreateDrawableState;
        }
        zm4Var.i();
        int i2 = this.k;
        if (i2 == 1) {
            View.mergeDrawableStates(onCreateDrawableState, x);
        } else if (i2 == 2) {
            View.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e = false;
            if (!this.c.f()) {
                this.a.o(this.b);
            }
            t.c(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.h.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + (((height - paddingTop) - intrinsicHeight) / 2);
            this.h.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.h.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.m;
        Drawable drawable = this.h;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.n;
        Drawable drawable2 = this.h;
        int max2 = Math.max(i4, drawable2 != null ? drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom() : 0);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        a();
        return d() || performClick;
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.r) {
            this.r = z;
            c();
            b();
        }
    }

    void setCheatSheetEnabled(boolean z) {
        if (z != this.s) {
            this.s = z;
            f();
        }
    }

    public void setDialogFactory(tm4 tm4Var) {
        if (tm4Var == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.d = tm4Var;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.i = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        c cVar = this.g;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        if (drawable != null) {
            if (this.l != null) {
                drawable = kv1.r(drawable.mutate());
                kv1.o(drawable, this.l);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.h = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(ym4 ym4Var) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.c.equals(ym4Var)) {
            return;
        }
        if (this.e) {
            if (!this.c.f()) {
                this.a.o(this.b);
            }
            if (!ym4Var.f()) {
                this.a.a(ym4Var, this.b);
            }
        }
        this.c = ym4Var;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f = i;
        c();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc6.mediaRouteButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(i.a(context), attributeSet, i);
        Drawable.ConstantState constantState;
        this.c = ym4.c;
        this.d = tm4.a();
        this.f = 0;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bo6.MediaRouteButton, i, 0);
        k99.j0(this, context2, bo6.MediaRouteButton, attributeSet, obtainStyledAttributes, i, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.h = getResources().getDrawable(obtainStyledAttributes.getResourceId(bo6.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        zm4 g = zm4.g(context2);
        this.a = g;
        this.b = new b();
        zm4.h k = g.k();
        int c2 = !k.v() ? k.c() : 0;
        this.k = c2;
        this.j = c2;
        if (t == null) {
            t = new C0090a(context2.getApplicationContext());
        }
        this.l = obtainStyledAttributes.getColorStateList(bo6.MediaRouteButton_mediaRouteButtonTint);
        this.m = obtainStyledAttributes.getDimensionPixelSize(bo6.MediaRouteButton_android_minWidth, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(bo6.MediaRouteButton_android_minHeight, 0);
        int resourceId = obtainStyledAttributes.getResourceId(bo6.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.i = obtainStyledAttributes.getResourceId(bo6.MediaRouteButton_externalRouteEnabledDrawable, 0);
        obtainStyledAttributes.recycle();
        int i2 = this.i;
        if (i2 != 0 && (constantState = (Drawable.ConstantState) u.get(i2)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.h == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) u.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    c cVar = new c(resourceId, getContext());
                    this.g = cVar;
                    cVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        f();
        setClickable(true);
    }
}
