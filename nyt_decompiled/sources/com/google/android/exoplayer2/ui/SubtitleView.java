package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.xh0;
import defpackage.y31;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    private List a;
    private xh0 b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h;
    private a i;
    private View j;

    interface a {
        void a(List list, xh0 xh0Var, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.emptyList();
        this.b = xh0.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.i = aVar;
        this.j = aVar;
        addView(aVar);
        this.h = 1;
    }

    private y31 a(y31 y31Var) {
        y31.b c = y31Var.c();
        if (!this.f) {
            i.e(c);
        } else if (!this.g) {
            i.f(c);
        }
        return c.a();
    }

    private void c(int i, float f) {
        this.c = i;
        this.d = f;
        d();
    }

    private void d() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List<y31> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add(a((y31) this.a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (z19.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private xh0 getUserCaptionStyle() {
        if (z19.a < 19 || isInEditMode()) {
            return xh0.g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? xh0.g : xh0.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof j) {
            ((j) view).g();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public void b(float f, boolean z) {
        c(z ? 1 : 0, f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        d();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        d();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        d();
    }

    public void setCues(List<y31> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        d();
    }

    public void setFractionalTextSize(float f) {
        b(f, false);
    }

    public void setStyle(xh0 xh0Var) {
        this.b = xh0Var;
        d();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new com.google.android.exoplayer2.ui.a(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new j(getContext()));
        }
        this.h = i;
    }
}
