package com.nytimes.android.text;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.nytimes.android.designsystem.text.NytFontSize;
import defpackage.hi6;
import defpackage.k57;
import defpackage.pg6;
import defpackage.y57;
import defpackage.z57;

/* loaded from: classes4.dex */
public class WrappedSummaryView extends a {
    private TextView c;
    private TextView d;
    private z57 e;

    public WrappedSummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private y57 h(Float f) {
        if (this.e == null) {
            return null;
        }
        return f.floatValue() == NytFontSize.SMALL.getScale() ? this.e.e() : f.floatValue() == NytFontSize.LARGE.getScale() ? this.e.a() : f.floatValue() == NytFontSize.EXTRA_LARGE.getScale() ? this.e.d() : f.floatValue() == NytFontSize.JUMBO.getScale() ? this.e.c() : this.e.b();
    }

    private void setBottomSummaryText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.d.setVisibility(8);
        } else {
            this.d.setText(charSequence);
            this.d.setVisibility(0);
        }
    }

    private void setThumbnailSummaryText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    @Override // defpackage.a1
    public void a() {
        i();
    }

    @Override // defpackage.a1
    public void b() {
        this.c.setVisibility(0);
        this.d.setVisibility(0);
    }

    @Override // defpackage.a1
    public void c() {
        b();
    }

    @Override // defpackage.a1
    public boolean d() {
        return this.c.getVisibility() == 0 || this.d.getVisibility() == 0;
    }

    public void i() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    void j() {
        y57 h = h(Float.valueOf(getResources().getConfiguration().fontScale));
        if (h == null) {
            return;
        }
        if (!h.a().d() && !h.b().d()) {
            i();
            return;
        }
        if (h.a().d()) {
            setThumbnailSummaryText((CharSequence) h.a().c());
        } else {
            this.c.setVisibility(8);
        }
        if (h.b().d()) {
            setBottomSummaryText((CharSequence) h.b().c());
        } else {
            this.d.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(pg6.thumbnail_summary_block);
        this.d = (TextView) findViewById(pg6.bottom_summary_block);
    }

    @Override // defpackage.a1
    public void setData(k57 k57Var) {
        if (k57Var.g().d()) {
            this.e = (z57) k57Var.g().c();
            j();
        }
    }

    @Override // defpackage.a1
    public void setMaxWidth(int i) {
    }

    @Override // defpackage.a1
    public void setTextColor(int i) {
        if (this.c.getVisibility() != 8) {
            this.c.setTextColor(i);
        }
        if (this.d.getVisibility() != 8) {
            this.d.setTextColor(i);
        }
    }

    public WrappedSummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), hi6.sf_wrapped_summary_text_view, this);
    }
}
