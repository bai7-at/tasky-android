package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentMediaFormat;

/* loaded from: classes.dex */
public class b64 implements er7 {
    private AdapterView.OnItemSelectedListener B;
    final i H;
    private final h L;
    private final g M;
    private final e N;
    private Runnable Q;
    final Handler S;
    private final Rect X;
    private Rect Y;
    private boolean Z;
    private Context a;
    private ListAdapter b;
    gw1 c;
    private int d;
    private int e;
    PopupWindow e0;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    int r;
    private View s;
    private int t;
    private DataSetObserver u;
    private View w;
    private Drawable x;
    private AdapterView.OnItemClickListener y;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t = b64.this.t();
            if (t == null || t.getWindowToken() == null) {
                return;
            }
            b64.this.a();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            gw1 gw1Var;
            if (i == -1 || (gw1Var = b64.this.c) == null) {
                return;
            }
            gw1Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b64.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (b64.this.b()) {
                b64.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            b64.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || b64.this.A() || b64.this.e0.getContentView() == null) {
                return;
            }
            b64 b64Var = b64.this;
            b64Var.S.removeCallbacks(b64Var.H);
            b64.this.H.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = b64.this.e0) != null && popupWindow.isShowing() && x >= 0 && x < b64.this.e0.getWidth() && y >= 0 && y < b64.this.e0.getHeight()) {
                b64 b64Var = b64.this;
                b64Var.S.postDelayed(b64Var.H, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            b64 b64Var2 = b64.this;
            b64Var2.S.removeCallbacks(b64Var2.H);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gw1 gw1Var = b64.this.c;
            if (gw1Var == null || !k99.O(gw1Var) || b64.this.c.getCount() <= b64.this.c.getChildCount()) {
                return;
            }
            int childCount = b64.this.c.getChildCount();
            b64 b64Var = b64.this;
            if (childCount <= b64Var.r) {
                b64Var.e0.setInputMethodMode(2);
                b64.this.a();
            }
        }
    }

    public b64(Context context) {
        this(context, null, nc6.listPopupWindowStyle);
    }

    private void C() {
        View view = this.s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.s);
            }
        }
    }

    private void O(boolean z) {
        d.b(this.e0, z);
    }

    private int q() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        if (this.c == null) {
            Context context = this.a;
            this.Q = new a();
            gw1 s = s(context, !this.Z);
            this.c = s;
            Drawable drawable = this.x;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.y);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.B;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.c;
            View view2 = this.s;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.t;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.t);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.e;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i2 = 0;
            }
            this.e0.setContentView(view);
        } else {
            View view3 = this.s;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i2 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.e0.getBackground();
        if (background != null) {
            background.getPadding(this.X);
            Rect rect = this.X;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            this.X.setEmpty();
            i3 = 0;
        }
        int u = u(t(), this.g, this.e0.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return u + i3;
        }
        int i8 = this.e;
        if (i8 == -2) {
            int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.X;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
        } else if (i8 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.X;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d2 = this.c.d(makeMeasureSpec, 0, -1, u - i2, -1);
        if (d2 > 0) {
            i2 += i3 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return d2 + i2;
    }

    private int u(View view, int i2, boolean z) {
        return c.a(this.e0, view, i2, z);
    }

    public boolean A() {
        return this.e0.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.Z;
    }

    public void D(View view) {
        this.w = view;
    }

    public void E(int i2) {
        this.e0.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.e0.getBackground();
        if (background == null) {
            R(i2);
            return;
        }
        background.getPadding(this.X);
        Rect rect = this.X;
        this.e = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.l = i2;
    }

    public void H(Rect rect) {
        this.Y = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.e0.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.Z = z;
        this.e0.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.e0.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.B = onItemSelectedListener;
    }

    public void N(boolean z) {
        this.k = true;
        this.j = z;
    }

    public void P(int i2) {
        this.t = i2;
    }

    public void Q(int i2) {
        gw1 gw1Var = this.c;
        if (!b() || gw1Var == null) {
            return;
        }
        gw1Var.setListSelectionHidden(false);
        gw1Var.setSelection(i2);
        if (gw1Var.getChoiceMode() != 0) {
            gw1Var.setItemChecked(i2, true);
        }
    }

    public void R(int i2) {
        this.e = i2;
    }

    @Override // defpackage.er7
    public void a() {
        int q = q();
        boolean A = A();
        zz5.b(this.e0, this.h);
        if (this.e0.isShowing()) {
            if (k99.O(t())) {
                int i2 = this.e;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = t().getWidth();
                }
                int i3 = this.d;
                if (i3 == -1) {
                    if (!A) {
                        q = -1;
                    }
                    if (A) {
                        this.e0.setWidth(this.e == -1 ? -1 : 0);
                        this.e0.setHeight(0);
                    } else {
                        this.e0.setWidth(this.e == -1 ? -1 : 0);
                        this.e0.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    q = i3;
                }
                this.e0.setOutsideTouchable((this.n || this.m) ? false : true);
                this.e0.update(t(), this.f, this.g, i2 < 0 ? -1 : i2, q < 0 ? -1 : q);
                return;
            }
            return;
        }
        int i4 = this.e;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = t().getWidth();
        }
        int i5 = this.d;
        if (i5 == -1) {
            q = -1;
        } else if (i5 != -2) {
            q = i5;
        }
        this.e0.setWidth(i4);
        this.e0.setHeight(q);
        O(true);
        this.e0.setOutsideTouchable((this.n || this.m) ? false : true);
        this.e0.setTouchInterceptor(this.L);
        if (this.k) {
            zz5.a(this.e0, this.j);
        }
        d.a(this.e0, this.Y);
        zz5.c(this.e0, t(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.Z || this.c.isInTouchMode()) {
            r();
        }
        if (this.Z) {
            return;
        }
        this.S.post(this.N);
    }

    @Override // defpackage.er7
    public boolean b() {
        return this.e0.isShowing();
    }

    public int c() {
        return this.f;
    }

    @Override // defpackage.er7
    public void dismiss() {
        this.e0.dismiss();
        C();
        this.e0.setContentView(null);
        this.c = null;
        this.S.removeCallbacks(this.H);
    }

    public void e(int i2) {
        this.f = i2;
    }

    public void g(Drawable drawable) {
        this.e0.setBackgroundDrawable(drawable);
    }

    public Drawable h() {
        return this.e0.getBackground();
    }

    public void j(int i2) {
        this.g = i2;
        this.i = true;
    }

    public int m() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        gw1 gw1Var = this.c;
        if (gw1Var != null) {
            gw1Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.er7
    public ListView p() {
        return this.c;
    }

    public void r() {
        gw1 gw1Var = this.c;
        if (gw1Var != null) {
            gw1Var.setListSelectionHidden(true);
            gw1Var.requestLayout();
        }
    }

    gw1 s(Context context, boolean z) {
        return new gw1(context, z);
    }

    public View t() {
        return this.w;
    }

    public Object v() {
        if (b()) {
            return this.c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.e;
    }

    public b64(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public b64(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = ContentMediaFormat.FULL_CONTENT_EPISODE;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.r = Integer.MAX_VALUE;
        this.t = 0;
        this.H = new i();
        this.L = new h();
        this.M = new g();
        this.N = new e();
        this.X = new Rect();
        this.a = context;
        this.S = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fo6.ListPopupWindow, i2, i3);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(fo6.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(fo6.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        xk xkVar = new xk(context, attributeSet, i2, i3);
        this.e0 = xkVar;
        xkVar.setInputMethodMode(1);
    }
}
