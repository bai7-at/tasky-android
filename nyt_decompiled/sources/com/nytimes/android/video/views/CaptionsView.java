package com.nytimes.android.video.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.nytimes.android.media.util.CaptionPrefManager;
import com.nytimes.android.utils.AppPreferences;
import defpackage.c41;
import defpackage.jj8;
import defpackage.lf6;
import defpackage.m07;
import defpackage.mx0;
import defpackage.ny7;
import defpackage.oi6;
import defpackage.qd6;
import defpackage.vd6;
import defpackage.xh0;
import defpackage.y31;
import defpackage.yh0;
import defpackage.zg6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class CaptionsView extends c implements jj8, SharedPreferences.OnSharedPreferenceChangeListener, yh0 {
    AppPreferences appPreferences;
    TextView c;
    CaptionPrefManager captionUtil;
    TextView d;
    private FrameLayout e;
    private FrameLayout f;
    private boolean g;
    private boolean h;
    private final int i;
    private final CaptioningManager j;
    private final CaptioningManager.CaptioningChangeListener k;
    private final Typeface l;

    class a extends CaptioningManager.CaptioningChangeListener {
        a() {
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
            CaptionsView.this.d(captionStyle);
        }
    }

    public CaptionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void e() {
        this.c.setText("");
        this.d.setText("");
    }

    private void h(CaptioningManager.CaptionStyle captionStyle, xh0 xh0Var) {
        int c = captionStyle.hasBackgroundColor() ? xh0Var.b : mx0.c(getContext(), qd6.ds_black_80_percent);
        this.e.setBackgroundColor(c);
        this.f.setBackgroundColor(c);
    }

    private List k(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        String[] split = spannableStringBuilder.toString().split("\n");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(new SpannableStringBuilder(str));
        }
        ny7.b(spannableStringBuilder, arrayList);
        return arrayList;
    }

    private void l(int i, int i2) {
        FrameLayout frameLayout = this.e;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), this.e.getPaddingTop(), this.e.getPaddingRight(), i);
        FrameLayout frameLayout2 = this.f;
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), i2, this.f.getPaddingRight(), this.f.getPaddingBottom());
    }

    private void m(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence.length() > charSequence2.length()) {
            l(this.i, 0);
        } else {
            l(0, this.i);
        }
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
        this.f.setVisibility(i);
    }

    private void n() {
        if (!this.g || this.h || TextUtils.isEmpty(this.c.getText())) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    private void setCaptionTextColor(int i) {
        this.c.setTextColor(i);
        this.d.setTextColor(i);
    }

    private void setCaptionTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
        this.d.setTypeface(typeface);
    }

    void d(CaptioningManager.CaptionStyle captionStyle) {
        xh0 a2 = xh0.a(captionStyle);
        h(captionStyle, a2);
        setCaptionTextColor(a2.a);
        setBackgroundColor(a2.c);
        Typeface typeface = a2.f;
        if (typeface == null) {
            setCaptionTypeface(this.l);
        } else {
            setCaptionTypeface(typeface);
        }
    }

    public void f() {
        this.h = true;
        setVisibility(8);
    }

    public void g() {
        e();
        setVisibility(8);
    }

    public void i() {
        this.h = false;
        n();
    }

    @Override // defpackage.jj8
    public void j(List list) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.appPreferences.o(this);
        this.j.addCaptioningChangeListener(this.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.appPreferences.q(this);
        this.j.removeCaptioningChangeListener(this.k);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (FrameLayout) findViewById(zg6.top_container);
        this.f = (FrameLayout) findViewById(zg6.bottom_container);
        this.c = (TextView) findViewById(zg6.captions_top_text);
        this.d = (TextView) findViewById(zg6.captions_bottom_text);
        d(this.j.getUserStyle());
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.captionUtil.isCaptionsKey(str) || this.captionUtil.isCaptionsOverrideKey(str)) {
            this.g = this.captionUtil.areCaptionsEnabled();
            n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jj8
    public void s(c41 c41Var) {
        if (c41Var.a.isEmpty() || TextUtils.isEmpty(((y31) c41Var.a.get(0)).a)) {
            setVisibility(8);
            e();
            return;
        }
        List k = k(((y31) c41Var.a.get(0)).a);
        if (k.isEmpty()) {
            e();
            setVisibility(8);
        } else {
            if (k.size() > 1) {
                m((CharSequence) k.get(0), (CharSequence) k.get(1), 0);
            } else {
                m((CharSequence) k.get(0), "", 8);
            }
            n();
        }
    }

    public CaptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setVisibility(8);
        View.inflate(getContext(), oi6.captions_content_layout, this);
        this.g = this.captionUtil.areCaptionsEnabled();
        this.i = getResources().getDimensionPixelSize(vd6.caption_layout_internal_padding);
        this.l = m07.g(getContext().getApplicationContext(), lf6.font_franklin_semi_bold);
        this.j = (CaptioningManager) context.getSystemService("captioning");
        this.k = new a();
    }
}
