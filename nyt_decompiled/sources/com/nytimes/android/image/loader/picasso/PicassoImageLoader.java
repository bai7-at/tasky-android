package com.nytimes.android.image.loader.picasso;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.m;
import defpackage.b04;
import defpackage.c04;
import defpackage.gu0;
import defpackage.pt5;
import defpackage.qs2;
import defpackage.tg3;
import defpackage.zq3;
import kotlin.c;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class PicassoImageLoader implements tg3 {
    private Context a;
    private b04 b;
    private gu0 c;
    private final c04 d = c.a(new qs2() { // from class: com.nytimes.android.image.loader.picasso.PicassoImageLoader$picasso$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Picasso mo865invoke() {
            Context context;
            b04 b04Var;
            gu0 gu0Var;
            gu0 gu0Var2;
            context = PicassoImageLoader.this.a;
            gu0 gu0Var3 = null;
            if (context == null) {
                zq3.z("context");
                context = null;
            }
            Picasso.b bVar = new Picasso.b(context);
            b04Var = PicassoImageLoader.this.b;
            if (b04Var == null) {
                zq3.z("client");
                b04Var = null;
            }
            Picasso.b b = bVar.b(new m((OkHttpClient) b04Var.get()));
            gu0Var = PicassoImageLoader.this.c;
            if (gu0Var == null) {
                zq3.z("configuration");
                gu0Var = null;
            }
            Picasso.b c = b.c(gu0Var.a());
            gu0Var2 = PicassoImageLoader.this.c;
            if (gu0Var2 == null) {
                zq3.z("configuration");
            } else {
                gu0Var3 = gu0Var2;
            }
            Picasso a = c.d(gu0Var3.b()).a();
            Picasso.n(a);
            return a;
        }
    });

    private final Picasso g() {
        Object value = this.d.getValue();
        zq3.g(value, "getValue(...)");
        return (Picasso) value;
    }

    @Override // defpackage.tg3
    public void a(Context context, b04 b04Var) {
        zq3.h(context, "context");
        zq3.h(b04Var, "client");
        this.a = context;
        this.b = b04Var;
        this.c = new gu0();
    }

    @Override // defpackage.tg3
    public void b(ImageView imageView) {
        zq3.h(imageView, "imageView");
        g().b(imageView);
    }

    @Override // defpackage.tg3
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public pt5 get() {
        return new pt5(g());
    }
}
