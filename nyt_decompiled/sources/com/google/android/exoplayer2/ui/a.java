package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import defpackage.xh0;
import defpackage.y31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class a extends View implements SubtitleView.a {
    private final List a;
    private List b;
    private int c;
    private float d;
    private xh0 e;
    private float f;

    public a(Context context) {
        this(context, null);
    }

    private static y31 b(y31 y31Var) {
        y31.b p = y31Var.c().k(-3.4028235E38f).l(RecyclerView.UNDEFINED_DURATION).p(null);
        if (y31Var.f == 0) {
            p.h(1.0f - y31Var.e, 0);
        } else {
            p.h((-y31Var.e) - 1.0f, 1);
        }
        int i = y31Var.g;
        if (i == 0) {
            p.i(2);
        } else if (i == 2) {
            p.i(0);
        }
        return p.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List list, xh0 xh0Var, float f, int i, float f2) {
        this.b = list;
        this.e = xh0Var;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (this.a.size() < list.size()) {
            this.a.add(new f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float h = i.h(this.c, this.d, height, i);
        if (h <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            y31 y31Var = (y31) list.get(i2);
            if (y31Var.s != Integer.MIN_VALUE) {
                y31Var = b(y31Var);
            }
            y31 y31Var2 = y31Var;
            int i3 = paddingBottom;
            ((f) this.a.get(i2)).b(y31Var2, this.e, h, i.h(y31Var2.n, y31Var2.r, height, i), this.f, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = xh0.g;
        this.f = 0.08f;
    }
}
