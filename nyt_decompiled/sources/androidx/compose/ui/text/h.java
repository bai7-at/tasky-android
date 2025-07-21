package androidx.compose.ui.text;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.aj8;
import defpackage.ak8;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.in3;
import defpackage.iv0;
import defpackage.kj8;
import defpackage.uo6;
import defpackage.xi8;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h {
    public static final a f = new a(null);
    private final e.b a;
    private final fm1 b;
    private final LayoutDirection c;
    private final int d;
    private final xi8 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final aj8 b(g gVar) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(gVar.j(), ak8.d(gVar.i(), gVar.d()), gVar.g(), gVar.b(), gVar.c());
            int p = fv0.p(gVar.a());
            int n = ((gVar.h() || kj8.e(gVar.f(), kj8.a.b())) && fv0.j(gVar.a())) ? fv0.n(gVar.a()) : Integer.MAX_VALUE;
            int e = (gVar.h() || !kj8.e(gVar.f(), kj8.a.b())) ? gVar.e() : 1;
            if (p != n) {
                n = uo6.m(e.d(multiParagraphIntrinsics.a()), p, n);
            }
            return new aj8(gVar, new MultiParagraph(multiParagraphIntrinsics, iv0.b(0, n, 0, fv0.m(gVar.a()), 5, null), e, kj8.e(gVar.f(), kj8.a.b()), null), iv0.d(gVar.a(), in3.a((int) Math.ceil(r2.z()), (int) Math.ceil(r2.h()))), null);
        }

        private a() {
        }
    }

    public h(e.b bVar, fm1 fm1Var, LayoutDirection layoutDirection, int i) {
        this.a = bVar;
        this.b = fm1Var;
        this.c = layoutDirection;
        this.d = i;
        this.e = i > 0 ? new xi8(i) : null;
    }

    public static /* synthetic */ aj8 d(h hVar, androidx.compose.ui.text.a aVar, j jVar, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, fm1 fm1Var, e.b bVar, boolean z2, int i3, Object obj) {
        return hVar.c(aVar, (i3 & 2) != 0 ? j.d.a() : jVar, (i3 & 4) != 0 ? kj8.a.a() : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? Integer.MAX_VALUE : i2, (i3 & 32) != 0 ? kotlin.collections.i.l() : list, (i3 & 64) != 0 ? iv0.b(0, 0, 0, 0, 15, null) : j, (i3 & 128) != 0 ? hVar.c : layoutDirection, (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? hVar.b : fm1Var, (i3 & 512) != 0 ? hVar.a : bVar, (i3 & 1024) != 0 ? false : z2);
    }

    public final aj8 a(String str, j jVar, int i, boolean z, int i2, long j, LayoutDirection layoutDirection, fm1 fm1Var, e.b bVar, boolean z2) {
        return d(this, new androidx.compose.ui.text.a(str, null, null, 6, null), jVar, i, z, i2, null, j, layoutDirection, fm1Var, bVar, z2, 32, null);
    }

    public final aj8 c(androidx.compose.ui.text.a aVar, j jVar, int i, boolean z, int i2, List list, long j, LayoutDirection layoutDirection, fm1 fm1Var, e.b bVar, boolean z2) {
        xi8 xi8Var;
        g gVar = new g(aVar, jVar, list, i2, z, i, fm1Var, layoutDirection, bVar, j, (DefaultConstructorMarker) null);
        aj8 a2 = (z2 || (xi8Var = this.e) == null) ? null : xi8Var.a(gVar);
        if (a2 != null) {
            return a2.a(gVar, iv0.d(j, in3.a(e.d(a2.w().z()), e.d(a2.w().h()))));
        }
        aj8 b = f.b(gVar);
        xi8 xi8Var2 = this.e;
        if (xi8Var2 != null) {
            xi8Var2.b(gVar, b);
        }
        return b;
    }
}
