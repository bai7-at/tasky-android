package defpackage;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class rh8 {
    public static final a l = new a(null);
    private final androidx.compose.ui.text.a a;
    private final j b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private final fm1 g;
    private final e.b h;
    private final List i;
    private MultiParagraphIntrinsics j;
    private LayoutDirection k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ rh8(androidx.compose.ui.text.a aVar, j jVar, int i, int i2, boolean z, int i3, fm1 fm1Var, e.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, i, i2, z, i3, fm1Var, bVar, list);
    }

    private final MultiParagraphIntrinsics f() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.j;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final MultiParagraph n(long j, LayoutDirection layoutDirection) {
        m(layoutDirection);
        int p = fv0.p(j);
        int n = ((this.e || kj8.e(this.f, kj8.a.b())) && fv0.j(j)) ? fv0.n(j) : Integer.MAX_VALUE;
        int i = (this.e || !kj8.e(this.f, kj8.a.b())) ? this.c : 1;
        if (p != n) {
            n = uo6.m(c(), p, n);
        }
        return new MultiParagraph(f(), iv0.b(0, n, 0, fv0.m(j), 5, null), i, kj8.e(this.f, kj8.a.b()), null);
    }

    public final fm1 a() {
        return this.g;
    }

    public final e.b b() {
        return this.h;
    }

    public final int c() {
        return th8.a(f().a());
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final int g() {
        return this.f;
    }

    public final List h() {
        return this.i;
    }

    public final boolean i() {
        return this.e;
    }

    public final j j() {
        return this.b;
    }

    public final androidx.compose.ui.text.a k() {
        return this.a;
    }

    public final aj8 l(long j, LayoutDirection layoutDirection, aj8 aj8Var) {
        if (aj8Var != null && yi8.a(aj8Var, this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection, this.h, j)) {
            return aj8Var.a(new g(aj8Var.l().j(), this.b, aj8Var.l().g(), aj8Var.l().e(), aj8Var.l().h(), aj8Var.l().f(), aj8Var.l().b(), aj8Var.l().d(), aj8Var.l().c(), j, (DefaultConstructorMarker) null), iv0.d(j, in3.a(th8.a(aj8Var.w().z()), th8.a(aj8Var.w().h()))));
        }
        MultiParagraph n = n(j, layoutDirection);
        return new aj8(new g(this.a, this.b, this.i, this.c, this.e, this.f, this.g, layoutDirection, this.h, j, (DefaultConstructorMarker) null), n, iv0.d(j, in3.a(th8.a(n.z()), th8.a(n.h()))), null);
    }

    public final void m(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.k || multiParagraphIntrinsics.c()) {
            this.k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.a, ak8.d(this.b, layoutDirection), this.i, this.g, this.h);
        }
        this.j = multiParagraphIntrinsics;
    }

    private rh8(androidx.compose.ui.text.a aVar, j jVar, int i, int i2, boolean z, int i3, fm1 fm1Var, e.b bVar, List list) {
        this.a = aVar;
        this.b = jVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = fm1Var;
        this.h = bVar;
        this.i = list;
        if (i <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i2 > i) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ rh8(androidx.compose.ui.text.a aVar, j jVar, int i, int i2, boolean z, int i3, fm1 fm1Var, e.b bVar, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, (i4 & 4) != 0 ? Integer.MAX_VALUE : i, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? kj8.a.a() : i3, fm1Var, bVar, (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? i.l() : list, null);
    }
}
