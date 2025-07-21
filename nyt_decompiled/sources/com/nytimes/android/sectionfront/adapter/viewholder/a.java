package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SlideshowAsset;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.sectionfront.ui.HomepageGroupHeaderView;
import defpackage.if5;
import defpackage.jf5;
import defpackage.k57;
import defpackage.re7;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class a extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {
    HomepageGroupHeaderView B;
    private if5 H;
    protected Context y;

    public a(View view) {
        super(view);
        this.y = view.getContext();
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    private void g0(int i, View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    protected abstract void W(re7 re7Var);

    public final void X(re7 re7Var, int i) {
        W(re7Var);
    }

    protected String Y(String str) {
        return str.toUpperCase(Locale.getDefault()).replaceAll(" AND ", " and ").replaceAll("^BY ", "By ");
    }

    protected String Z(k57 k57Var, SectionFront sectionFront) {
        Asset a = k57Var.a();
        return a.isColumn() ? a.getColumnDisplayName() : a instanceof VideoAsset ? "VIDEO" : a instanceof SlideshowAsset ? "SLIDE SHOW" : ((a instanceof PromoAsset) || a.getKicker() == null) ? "" : a.getKicker();
    }

    public void a0() {
    }

    public void b0(if5 if5Var, jf5 jf5Var) {
        this.H = if5Var;
    }

    public void c0() {
        this.H = null;
    }

    public abstract void d0();

    protected void e0(View... viewArr) {
        g0(8, viewArr);
    }

    protected void f0(View... viewArr) {
        g0(0, viewArr);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        if5 if5Var = this.H;
        if (if5Var != null) {
            if5Var.N(this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        ViewSwazzledHooks.OnLongClickListener._preOnLongClick(this, view);
        return false;
    }
}
