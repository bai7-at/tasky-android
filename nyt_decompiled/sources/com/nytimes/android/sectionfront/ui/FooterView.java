package com.nytimes.android.sectionfront.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nytimes.android.sectionfront.ui.FooterView;
import defpackage.ee6;
import defpackage.hi6;
import defpackage.oz4;
import defpackage.pg6;
import io.reactivex.disposables.CompositeDisposable;

/* loaded from: classes4.dex */
public class FooterView extends b {
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    private final int g;
    private final int h;
    private ImageView i;
    private LinearLayout j;
    private LinearLayout k;
    private boolean l;
    private boolean m;
    private final CompositeDisposable n;

    public FooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(oz4 oz4Var, oz4 oz4Var2, View view) {
        if (this.i.isActivated()) {
            oz4Var.call();
        } else {
            oz4Var2.call();
        }
    }

    private void s() {
        int paddingStart = getPaddingStart();
        int i = this.h;
        if (paddingStart != i) {
            setPaddingRelative(i, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        }
    }

    public void g(int i) {
        LinearLayout linearLayout = this.j;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), this.j.getPaddingTop(), i, this.j.getPaddingBottom());
    }

    public void h() {
        j(this.e, this.l);
        j(this.f, this.m);
    }

    public void i() {
        setPaddingRelative(getPaddingStart() + this.g, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
    }

    public void k() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        m();
        setShareTextVisiblity(8);
        l();
        setSaveTextVisiblity(8);
    }

    public void l() {
        this.j.setVisibility(8);
        this.j.setOnClickListener(null);
    }

    public void m() {
        this.k.setVisibility(8);
        this.k.setOnClickListener(null);
    }

    public void n() {
        this.c.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.n.clear();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(pg6.timestamp);
        this.d = (TextView) findViewById(pg6.row_sf_comment_number_text);
        this.e = (TextView) findViewById(pg6.sf_footer_save_text);
        this.f = (TextView) findViewById(pg6.sf_footer_share_text);
        this.i = (ImageView) findViewById(pg6.sf_footer_save_icon);
        this.j = (LinearLayout) findViewById(pg6.sf_footer_save_container);
        this.k = (LinearLayout) findViewById(pg6.sf_footer_share_container);
    }

    public void r() {
        this.c.setVisibility(0);
        this.d.setVisibility(8);
        setSaveTextVisiblity(8);
        setShareTextVisiblity(8);
        this.j.setVisibility(0);
        this.k.setVisibility(0);
        s();
        this.m = false;
        this.l = false;
    }

    public void setCommentClickListener(final oz4 oz4Var) {
        this.d.setOnClickListener(new View.OnClickListener() { // from class: on2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oz4.this.call();
            }
        });
    }

    public void setCommentText(String str) {
        this.d.setText(str, TextView.BufferType.SPANNABLE);
    }

    public void setCommentTextVisibility(int i) {
        this.d.setVisibility(i);
    }

    public void setSaveTextVisiblity(int i) {
        this.e.setVisibility(i);
        this.l = i == 0;
    }

    public void setShareListener(final oz4 oz4Var) {
        if (oz4Var == null) {
            this.k.setOnClickListener(null);
        } else {
            this.k.setOnClickListener(new View.OnClickListener() { // from class: nn2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oz4.this.call();
                }
            });
        }
    }

    public void setShareTextVisiblity(int i) {
        this.f.setVisibility(i);
        this.m = i == 0;
    }

    public void setTimestampText(String str) {
        this.c.setText(str);
    }

    public void t(final oz4 oz4Var, final oz4 oz4Var2) {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: pn2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FooterView.this.p(oz4Var2, oz4Var, view);
            }
        });
    }

    public void u(boolean z) {
        this.i.setActivated(z);
        this.i.setSelected(z);
    }

    public FooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new CompositeDisposable();
        View.inflate(getContext(), hi6.sf_footer, this);
        Resources resources = getResources();
        this.g = resources.getDimensionPixelSize(ee6.row_section_front_ordered_number_width);
        this.h = resources.getDimensionPixelSize(ee6.row_search_padding_left_right);
    }
}
