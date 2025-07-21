package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;
import com.nytimes.android.sectionfront.adapter.viewholder.j;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.cropping.ImageCropper;
import defpackage.al4;
import defpackage.gy6;
import defpackage.jg3;
import defpackage.k57;
import defpackage.pf7;
import defpackage.yt;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class j {
    final Context a;
    final NetworkStatus b;
    final AspectRatioImageView c;
    final al4 d;
    final f e;
    private final CompositeDisposable f = new CompositeDisposable();

    class a implements gy6 {
        final /* synthetic */ Optional a;
        final /* synthetic */ k57 b;
        final /* synthetic */ SectionFront c;

        a(Optional optional, k57 k57Var, SectionFront sectionFront) {
            this.a = optional;
            this.b = k57Var;
            this.c = sectionFront;
        }

        @Override // defpackage.gy6
        public void a(Exception exc) {
        }

        @Override // defpackage.gy6
        public void b() {
            j.this.c.setTag(((ImageDimension) this.a.c()).getUrl());
            j.this.l(this.b, this.c);
        }
    }

    class b implements View.OnLayoutChangeListener {
        final /* synthetic */ Optional a;
        final /* synthetic */ gy6 b;

        b(Optional optional, gy6 gy6Var) {
            this.a = optional;
            this.b = gy6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Optional optional, gy6 gy6Var) {
            j.this.m((ImageDimension) optional.c(), j.this.c, gy6Var);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (j.this.c.getWidth() > 0) {
                j.this.c.removeOnLayoutChangeListener(this);
                AspectRatioImageView aspectRatioImageView = j.this.c;
                final Optional optional = this.a;
                final gy6 gy6Var = this.b;
                aspectRatioImageView.post(new Runnable() { // from class: com.nytimes.android.sectionfront.adapter.viewholder.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.this.b(optional, gy6Var);
                    }
                });
            }
        }
    }

    public j(Context context, NetworkStatus networkStatus, al4 al4Var, AspectRatioImageView aspectRatioImageView, f fVar) {
        this.a = context;
        this.c = aspectRatioImageView;
        aspectRatioImageView.setAdjustViewBounds(true);
        aspectRatioImageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.b = networkStatus;
        this.d = al4Var;
        this.e = fVar;
    }

    private void c() {
        this.c.setVisibility(8);
        this.c.setTag(null);
        this.c.setImageDrawable(null);
        this.e.a();
    }

    public static Single g(Asset asset, SectionFront sectionFront, ImageCropper imageCropper) {
        return h(asset, sectionFront, true, imageCropper);
    }

    private static Single h(Asset asset, SectionFront sectionFront, final boolean z, ImageCropper imageCropper) {
        ImageAsset m = yt.m(asset, sectionFront);
        if (m == null || m.getImage() == null) {
            return Single.just(new jg3(null));
        }
        return imageCropper.c(ImageCropConfig.SF_LEDE_HORIZONTAL_IMAGE, m.getImage()).map(new Function() { // from class: eo7
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                jg3 j;
                j = j.j(z, (jg3) obj);
                return j;
            }
        });
    }

    private boolean i(String str) {
        return (this.c.getTag() != null && this.c.getTag().equals(str) && (this.c.getDrawable() instanceof BitmapDrawable)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jg3 j(boolean z, jg3 jg3Var) {
        ImageDimension a2 = jg3Var.a();
        return (a2 == null || !n(z, a2)) ? new jg3(null) : jg3Var;
    }

    public static boolean n(boolean z, ImageDimension imageDimension) {
        if (imageDimension.isPortrait()) {
            return z && ((double) imageDimension.getWidth()) / ((double) imageDimension.getHeight()) >= 0.6d;
        }
        return true;
    }

    void b(Asset asset, SectionFront sectionFront) {
        this.d.a(asset, sectionFront);
    }

    public void d() {
        this.f.clear();
    }

    int e(double d, int i) {
        return (int) (i * d);
    }

    int f() {
        return this.c.getWidth();
    }

    public void k(k57 k57Var, SectionFront sectionFront, Optional optional) {
        if (!optional.d()) {
            c();
            return;
        }
        if (!i(((ImageDimension) optional.c()).getUrl())) {
            l(k57Var, sectionFront);
            return;
        }
        a aVar = new a(optional, k57Var, sectionFront);
        pf7.c(this.c, ((ImageDimension) optional.c()).getWidth(), ((ImageDimension) optional.c()).getHeight());
        if (this.c.getWidth() > 0) {
            m((ImageDimension) optional.c(), this.c, aVar);
        } else {
            this.c.addOnLayoutChangeListener(new b(optional, aVar));
        }
    }

    void l(k57 k57Var, SectionFront sectionFront) {
        Asset a2 = k57Var.a();
        b(a2, sectionFront);
        this.e.e(a2, sectionFront);
    }

    protected void m(ImageDimension imageDimension, AspectRatioImageView aspectRatioImageView, gy6 gy6Var) {
        int f = f();
        pf7.a(aspectRatioImageView, e(imageDimension.getHeight() / imageDimension.getWidth(), f), f, gy6Var, imageDimension.getUrl());
    }
}
