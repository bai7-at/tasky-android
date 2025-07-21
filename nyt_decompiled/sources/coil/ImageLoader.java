package coil;

import android.content.Context;
import coil.ImageLoader;
import coil.memory.MemoryCache;
import defpackage.by0;
import defpackage.c04;
import defpackage.d42;
import defpackage.dj1;
import defpackage.ks1;
import defpackage.n;
import defpackage.or0;
import defpackage.qr1;
import defpackage.qs2;
import defpackage.rg3;
import defpackage.vg3;
import defpackage.xt7;
import kotlin.c;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public interface ImageLoader {

    public static final class Builder {
        private final Context a;
        private dj1 b = n.b();
        private c04 c = null;
        private c04 d = null;
        private c04 e = null;
        private d42.d f = null;
        private or0 g = null;
        private rg3 h = new rg3(false, false, false, 0, null, 31, null);

        public Builder(Context context) {
            this.a = context.getApplicationContext();
        }

        public final ImageLoader b() {
            Context context = this.a;
            dj1 dj1Var = this.b;
            c04 c04Var = this.c;
            if (c04Var == null) {
                c04Var = c.a(new qs2() { // from class: coil.ImageLoader$Builder$build$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final MemoryCache mo865invoke() {
                        Context context2;
                        context2 = ImageLoader.Builder.this.a;
                        return new MemoryCache.a(context2).a();
                    }
                });
            }
            c04 c04Var2 = c04Var;
            c04 c04Var3 = this.d;
            if (c04Var3 == null) {
                c04Var3 = c.a(new qs2() { // from class: coil.ImageLoader$Builder$build$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final qr1 mo865invoke() {
                        Context context2;
                        xt7 xt7Var = xt7.a;
                        context2 = ImageLoader.Builder.this.a;
                        return xt7Var.a(context2);
                    }
                });
            }
            c04 c04Var4 = c04Var3;
            c04 c04Var5 = this.e;
            if (c04Var5 == null) {
                c04Var5 = c.a(new qs2() { // from class: coil.ImageLoader$Builder$build$3
                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final OkHttpClient mo865invoke() {
                        return new OkHttpClient();
                    }
                });
            }
            c04 c04Var6 = c04Var5;
            d42.d dVar = this.f;
            if (dVar == null) {
                dVar = d42.d.b;
            }
            d42.d dVar2 = dVar;
            or0 or0Var = this.g;
            if (or0Var == null) {
                or0Var = new or0();
            }
            return new RealImageLoader(context, dj1Var, c04Var2, c04Var4, c04Var6, dVar2, or0Var, this.h, null);
        }

        public final Builder c(or0 or0Var) {
            this.g = or0Var;
            return this;
        }
    }

    dj1 a();

    ks1 b(vg3 vg3Var);

    Object c(vg3 vg3Var, by0 by0Var);

    MemoryCache d();

    or0 getComponents();
}
