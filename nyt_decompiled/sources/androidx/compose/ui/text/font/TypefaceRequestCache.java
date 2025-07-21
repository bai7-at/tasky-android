package androidx.compose.ui.text.font;

import defpackage.fd4;
import defpackage.nd8;
import defpackage.od8;
import defpackage.ss2;
import defpackage.uu8;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public final class TypefaceRequestCache {
    private final od8 a = nd8.a();
    private final fd4 b = new fd4(16);

    public final od8 b() {
        return this.a;
    }

    public final x08 c(final uu8 uu8Var, ss2 ss2Var) {
        synchronized (this.a) {
            w wVar = (w) this.b.d(uu8Var);
            if (wVar != null) {
                if (wVar.e()) {
                    return wVar;
                }
            }
            try {
                w wVar2 = (w) ss2Var.invoke(new ss2() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(w wVar3) {
                        fd4 fd4Var;
                        fd4 fd4Var2;
                        od8 b = TypefaceRequestCache.this.b();
                        TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this;
                        uu8 uu8Var2 = uu8Var;
                        synchronized (b) {
                            try {
                                if (wVar3.e()) {
                                    fd4Var2 = typefaceRequestCache.b;
                                    fd4Var2.e(uu8Var2, wVar3);
                                } else {
                                    fd4Var = typefaceRequestCache.b;
                                    fd4Var.f(uu8Var2);
                                }
                                ww8 ww8Var = ww8.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((w) obj);
                        return ww8.a;
                    }
                });
                synchronized (this.a) {
                    try {
                        if (this.b.d(uu8Var) == null && wVar2.e()) {
                            this.b.e(uu8Var, wVar2);
                        }
                        ww8 ww8Var = ww8.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return wVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
