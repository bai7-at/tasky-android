package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.bg6;
import defpackage.hv6;
import defpackage.k99;
import defpackage.nn6;
import defpackage.uf4;
import defpackage.xi6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class d extends ConstraintLayout {
    private final Runnable a;
    private int b;
    private uf4 c;

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(xi6.material_radial_view_group, this);
        k99.p0(this, F());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.RadialViewGroup, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(nn6.RadialViewGroup_materialCircleRadius, 0);
        this.a = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.W();
            }
        };
        obtainStyledAttributes.recycle();
    }

    private void C(List list, androidx.constraintlayout.widget.c cVar, int i) {
        Iterator it2 = list.iterator();
        float f = 0.0f;
        while (it2.hasNext()) {
            cVar.g(((View) it2.next()).getId(), bg6.circle_center, i, f);
            f += 360.0f / list.size();
        }
    }

    private Drawable F() {
        uf4 uf4Var = new uf4();
        this.c = uf4Var;
        uf4Var.U(new hv6(0.5f));
        this.c.W(ColorStateList.valueOf(-1));
        return this.c;
    }

    private static boolean U(View view) {
        return "skip".equals(view.getTag());
    }

    private void X() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.a);
            handler.post(this.a);
        }
    }

    int N(int i) {
        int i2 = this.b;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }

    public int O() {
        return this.b;
    }

    public void R(int i) {
        this.b = i;
        W();
    }

    protected void W() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != bg6.circle_center && !U(childAt)) {
                int i2 = (Integer) childAt.getTag(bg6.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C((List) entry.getValue(), cVar, N(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(k99.j());
        }
        X();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        W();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        X();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c.W(ColorStateList.valueOf(i));
    }
}
