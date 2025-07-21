package defpackage;

import android.app.Application;
import android.text.SpannableStringBuilder;
import com.google.common.collect.ImmutableList;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.sectionfront.adapter.model.b;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class u57 {
    protected final Application a;
    protected final jl9 b;
    protected final cb2 c;

    public u57(Application application, jl9 jl9Var, cb2 cb2Var) {
        this.a = application;
        this.b = jl9Var;
        this.c = cb2Var;
    }

    private void a(b.a aVar, SpannableStringBuilder spannableStringBuilder) {
        aVar.w(this.b.e(spannableStringBuilder));
    }

    private void b(b.a aVar, SectionFront sectionFront, Asset asset, SpannableStringBuilder spannableStringBuilder) {
        aVar.w(yt.m(asset, sectionFront) == null ? this.b.e(spannableStringBuilder) : this.b.h(sectionFront, spannableStringBuilder, h(asset, sectionFront)));
    }

    public void c(b.a aVar, SectionFront sectionFront, Asset asset) {
        if (k(asset, sectionFront)) {
            aVar.s(false);
            return;
        }
        aVar.s(true);
        aVar.u(g(asset, sectionFront, e(asset, sectionFront)));
        SpannableStringBuilder f = f(asset, sectionFront, j(asset, sectionFront));
        if (this.c.C()) {
            b(aVar, sectionFront, asset, f);
        } else {
            a(aVar, f);
        }
    }

    protected void d(Asset asset, SectionFront sectionFront, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        fp2.d(this.a, spannableStringBuilder, i, lf6.font_imperial_regular, i2, i3);
    }

    protected List e(Asset asset, SectionFront sectionFront) {
        return ImmutableList.y(asset.getSummary() == null ? "" : asset.getSummary());
    }

    protected SpannableStringBuilder f(Asset asset, SectionFront sectionFront, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        d(asset, sectionFront, spannableStringBuilder, i(asset, sectionFront), 0, spannableStringBuilder.length());
        return spannableStringBuilder;
    }

    protected ImmutableList g(Asset asset, SectionFront sectionFront, List list) {
        ImmutableList.a p = ImmutableList.p();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            p.a(f(asset, sectionFront, (CharSequence) it2.next()));
        }
        return p.k();
    }

    protected CharSequence h(Asset asset, SectionFront sectionFront) {
        return asset.getDisplayTitle();
    }

    protected int i(Asset asset, SectionFront sectionFront) {
        return um6.TextView_SFSummary;
    }

    protected CharSequence j(Asset asset, SectionFront sectionFront) {
        return asset.getSummary() == null ? "" : asset.getSummary();
    }

    protected boolean k(Asset asset, SectionFront sectionFront) {
        return s48.b(asset.getSummary());
    }
}
