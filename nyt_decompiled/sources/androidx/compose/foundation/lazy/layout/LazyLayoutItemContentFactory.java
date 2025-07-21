package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import defpackage.gt2;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.o04;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u87;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    private final u87 a;
    private final qs2 b;
    private final Map c = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    final class CachedItemContent {
        private final Object a;
        private final Object b;
        private int c;
        private gt2 d;

        public CachedItemContent(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }

        private final gt2 c() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return zr0.c(1403994769, true, new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer, int i) {
                    u87 u87Var;
                    if ((i & 11) == 2 && composer.i()) {
                        composer.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                    }
                    o04 o04Var = (o04) LazyLayoutItemContentFactory.this.d().mo865invoke();
                    int f = this.f();
                    if ((f >= o04Var.a() || !zq3.c(o04Var.c(f), this.g())) && (f = o04Var.b(this.g())) != -1) {
                        this.c = f;
                    }
                    int i2 = f;
                    boolean z = i2 != -1;
                    LazyLayoutItemContentFactory lazyLayoutItemContentFactory2 = LazyLayoutItemContentFactory.this;
                    LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this;
                    composer.J(207, Boolean.valueOf(z));
                    boolean a = composer.a(z);
                    if (z) {
                        u87Var = lazyLayoutItemContentFactory2.a;
                        LazyLayoutItemContentFactoryKt.a(o04Var, i.a(u87Var), i2, i.a(cachedItemContent.g()), composer, 0);
                    } else {
                        composer.g(a);
                    }
                    composer.y();
                    Object g = this.g();
                    final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent2 = this;
                    py1.a(g, new ss2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1.2

                        /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a */
                        public static final class a implements ms1 {
                            final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent a;

                            public a(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
                                this.a = cachedItemContent;
                            }

                            @Override // defpackage.ms1
                            public void dispose() {
                                this.a.d = null;
                            }
                        }

                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final ms1 invoke(ns1 ns1Var) {
                            return new a(LazyLayoutItemContentFactory.CachedItemContent.this);
                        }
                    }, composer, 8);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            });
        }

        public final gt2 d() {
            gt2 gt2Var = this.d;
            if (gt2Var != null) {
                return gt2Var;
            }
            gt2 c = c();
            this.d = c;
            return c;
        }

        public final Object e() {
            return this.b;
        }

        public final int f() {
            return this.c;
        }

        public final Object g() {
            return this.a;
        }
    }

    public LazyLayoutItemContentFactory(u87 u87Var, qs2 qs2Var) {
        this.a = u87Var;
        this.b = qs2Var;
    }

    public final gt2 b(int i, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = (CachedItemContent) this.c.get(obj);
        if (cachedItemContent != null && cachedItemContent.f() == i && zq3.c(cachedItemContent.e(), obj2)) {
            return cachedItemContent.d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i, obj, obj2);
        this.c.put(obj, cachedItemContent2);
        return cachedItemContent2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.e();
        }
        o04 o04Var = (o04) this.b.mo865invoke();
        int b = o04Var.b(obj);
        if (b != -1) {
            return o04Var.d(b);
        }
        return null;
    }

    public final qs2 d() {
        return this.b;
    }
}
