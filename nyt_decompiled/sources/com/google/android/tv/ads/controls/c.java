package com.google.android.tv.ads.controls;

import android.R;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.kr8;
import defpackage.m51;

/* loaded from: classes3.dex */
final class c extends m51 {
    final /* synthetic */ WhyThisAdFragment g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(WhyThisAdFragment whyThisAdFragment, ImageView imageView) {
        super(imageView);
        this.g = whyThisAdFragment;
    }

    @Override // defpackage.eg8
    public final /* bridge */ /* synthetic */ void f(Object obj, kr8 kr8Var) {
        ImageView imageView;
        imageView = this.g.a;
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.eg8
    public final void j(Drawable drawable) {
        this.g.getParentFragmentManager().p().v(true).s(R.id.content, ErrorMessageFragment.class, null).h();
    }

    @Override // defpackage.m51
    protected final void n(Drawable drawable) {
        ImageView imageView;
        imageView = this.g.a;
        imageView.setImageDrawable(drawable);
    }
}
