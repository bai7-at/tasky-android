package androidx.compose.animation;

import androidx.compose.animation.core.VectorConvertersKt;
import defpackage.hu8;
import defpackage.li;
import defpackage.nn0;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.wn0;

/* loaded from: classes.dex */
public abstract class ColorVectorConverterKt {
    private static final ss2 a = new ss2() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final hu8 invoke(final androidx.compose.ui.graphics.colorspace.c cVar) {
            return VectorConvertersKt.a(new ss2() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                public final li b(long j) {
                    long p = nn0.p(j, androidx.compose.ui.graphics.colorspace.e.a.t());
                    return new li(nn0.n(p), nn0.k(p), nn0.l(p), nn0.m(p));
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((nn0) obj).B());
                }
            }, new ss2() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                public final long b(li liVar) {
                    return nn0.p(wn0.a(uo6.l(liVar.g(), 0.0f, 1.0f), uo6.l(liVar.h(), -0.5f, 0.5f), uo6.l(liVar.i(), -0.5f, 0.5f), uo6.l(liVar.f(), 0.0f, 1.0f), androidx.compose.ui.graphics.colorspace.e.a.t()), androidx.compose.ui.graphics.colorspace.c.this);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return nn0.j(b((li) obj));
                }
            });
        }
    };

    public static final ss2 a(nn0.a aVar) {
        return a;
    }
}
