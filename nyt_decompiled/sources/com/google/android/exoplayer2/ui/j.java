package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import defpackage.xh0;
import defpackage.y31;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class j extends FrameLayout implements SubtitleView.a {
    private final com.google.android.exoplayer2.ui.a a;
    private final WebView b;
    private List c;
    private xh0 d;
    private float e;
    private int f;
    private float g;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(Context context) {
        this(context, null);
    }

    private static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = b.a[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    private static String d(xh0 xh0Var) {
        int i = xh0Var.d;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unset" : z19.D("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.b.b(xh0Var.e)) : z19.D("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.b.b(xh0Var.e)) : z19.D("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.b.b(xh0Var.e)) : z19.D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.b.b(xh0Var.e));
    }

    private String e(int i, float f) {
        float h = i.h(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return h == -3.4028235E38f ? "unset" : z19.D("%.2fpx", Float.valueOf(h / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(y31 y31Var) {
        float f = y31Var.t;
        if (f == 0.0f) {
            return "";
        }
        int i = y31Var.s;
        return z19.D("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
    
        if (r8 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013e, code lost:
    
        r10 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013f, code lost:
    
        r19 = r10;
        r17 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        if (r8 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.j.i():void");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, xh0 xh0Var, float f, int i, float f2) {
        this.d = xh0Var;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            y31 y31Var = (y31) list.get(i2);
            if (y31Var.d != null) {
                arrayList.add(y31Var);
            } else {
                arrayList2.add(y31Var);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            i();
        }
        this.a.a(arrayList, xh0Var, f, i, f2);
        invalidate();
    }

    public void g() {
        this.b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        i();
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.emptyList();
        this.d = xh0.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
