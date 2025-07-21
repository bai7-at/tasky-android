package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.ui.Alignment;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.e14;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.h14;
import defpackage.hk0;
import defpackage.it2;
import defpackage.iv0;
import defpackage.k14;
import defpackage.l14;
import defpackage.m14;
import defpackage.qs2;
import defpackage.r04;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.ym5;
import java.util.List;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.ui.Modifier r34, final androidx.compose.foundation.lazy.LazyListState r35, final defpackage.ym5 r36, final boolean r37, final boolean r38, final defpackage.qk2 r39, final boolean r40, int r41, androidx.compose.ui.Alignment.b r42, androidx.compose.foundation.layout.Arrangement.m r43, androidx.compose.ui.Alignment.c r44, androidx.compose.foundation.layout.Arrangement.e r45, final defpackage.ss2 r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.a(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, ym5, boolean, boolean, qk2, boolean, int, androidx.compose.ui.Alignment$b, androidx.compose.foundation.layout.Arrangement$m, androidx.compose.ui.Alignment$c, androidx.compose.foundation.layout.Arrangement$e, ss2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final gt2 b(final qs2 qs2Var, final LazyListState lazyListState, final ym5 ym5Var, final boolean z, final boolean z2, final int i, Alignment.b bVar, Alignment.c cVar, Arrangement.e eVar, Arrangement.m mVar, Composer composer, int i2, int i3) {
        composer.z(183156450);
        final Alignment.b bVar2 = (i3 & 64) != 0 ? null : bVar;
        final Alignment.c cVar2 = (i3 & 128) != 0 ? null : cVar;
        Arrangement.e eVar2 = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : eVar;
        Arrangement.m mVar2 = (i3 & 512) == 0 ? mVar : null;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        Object[] objArr = {lazyListState, ym5Var, Boolean.valueOf(z), Boolean.valueOf(z2), bVar2, cVar2, eVar2, mVar2};
        composer.z(-568225417);
        boolean z3 = false;
        for (int i4 = 0; i4 < 8; i4++) {
            z3 |= composer.S(objArr[i4]);
        }
        Object A = composer.A();
        if (z3 || A == Composer.a.a()) {
            final Arrangement.m mVar3 = mVar2;
            final Arrangement.e eVar3 = eVar2;
            A = new gt2() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1

                public static final class a extends m14 {
                    final /* synthetic */ boolean d;
                    final /* synthetic */ r04 e;
                    final /* synthetic */ int f;
                    final /* synthetic */ int g;
                    final /* synthetic */ Alignment.b h;
                    final /* synthetic */ Alignment.c i;
                    final /* synthetic */ boolean j;
                    final /* synthetic */ int k;
                    final /* synthetic */ int l;
                    final /* synthetic */ long m;
                    final /* synthetic */ LazyListState n;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(long j, boolean z, h14 h14Var, r04 r04Var, int i, int i2, Alignment.b bVar, Alignment.c cVar, boolean z2, int i3, int i4, long j2, LazyListState lazyListState) {
                        super(j, z, h14Var, r04Var, null);
                        this.d = z;
                        this.e = r04Var;
                        this.f = i;
                        this.g = i2;
                        this.h = bVar;
                        this.i = cVar;
                        this.j = z2;
                        this.k = i3;
                        this.l = i4;
                        this.m = j2;
                        this.n = lazyListState;
                    }

                    @Override // defpackage.m14
                    public l14 a(int i, Object obj, Object obj2, List list) {
                        return new l14(i, list, this.d, this.h, this.i, this.e.getLayoutDirection(), this.j, this.k, this.l, i == this.f + (-1) ? 0 : this.g, this.m, obj, obj2, this.n.w(), null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final k14 b(final r04 r04Var, final long j) {
                    float a2;
                    long a3;
                    boolean z4 = LazyListState.this.u() || r04Var.Z();
                    hk0.a(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    int l0 = z2 ? r04Var.l0(ym5Var.b(r04Var.getLayoutDirection())) : r04Var.l0(PaddingKt.g(ym5Var, r04Var.getLayoutDirection()));
                    int l02 = z2 ? r04Var.l0(ym5Var.c(r04Var.getLayoutDirection())) : r04Var.l0(PaddingKt.f(ym5Var, r04Var.getLayoutDirection()));
                    int l03 = r04Var.l0(ym5Var.d());
                    int l04 = r04Var.l0(ym5Var.a());
                    final int i5 = l03 + l04;
                    final int i6 = l0 + l02;
                    boolean z5 = z2;
                    int i7 = z5 ? i5 : i6;
                    int i8 = (!z5 || z) ? (z5 && z) ? l04 : (z5 || z) ? l02 : l0 : l03;
                    int i9 = i7 - i8;
                    long i10 = iv0.i(j, -i6, -i5);
                    LazyListState.this.P(r04Var);
                    h14 h14Var = (h14) qs2Var.mo865invoke();
                    h14Var.e().g(fv0.n(i10), fv0.m(i10));
                    if (z2) {
                        Arrangement.m mVar4 = mVar3;
                        if (mVar4 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                        }
                        a2 = mVar4.a();
                    } else {
                        Arrangement.e eVar4 = eVar3;
                        if (eVar4 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
                        }
                        a2 = eVar4.a();
                    }
                    int l05 = r04Var.l0(a2);
                    int a4 = h14Var.a();
                    int m = z2 ? fv0.m(j) - i5 : fv0.n(j) - i6;
                    if (!z || m > 0) {
                        a3 = wm3.a(l0, l03);
                    } else {
                        boolean z6 = z2;
                        if (!z6) {
                            l0 += m;
                        }
                        if (z6) {
                            l03 += m;
                        }
                        a3 = wm3.a(l0, l03);
                    }
                    a aVar = new a(i10, z2, h14Var, r04Var, a4, l05, bVar2, cVar2, z, i8, i9, a3, LazyListState.this);
                    LazyListState.this.Q(aVar.c());
                    e.a aVar2 = e.e;
                    LazyListState lazyListState2 = LazyListState.this;
                    e c = aVar2.c();
                    try {
                        e l = c.l();
                        try {
                            int T = lazyListState2.T(h14Var, lazyListState2.s());
                            int t = lazyListState2.t();
                            ww8 ww8Var = ww8.a;
                            c.d();
                            List a5 = c.a(h14Var, LazyListState.this.z(), LazyListState.this.p());
                            float G = (r04Var.Z() || !z4) ? LazyListState.this.G() : LazyListState.this.F();
                            boolean z7 = z2;
                            List g = h14Var.g();
                            Arrangement.m mVar5 = mVar3;
                            Arrangement.e eVar5 = eVar3;
                            boolean z8 = z;
                            e14 w = LazyListState.this.w();
                            int i11 = i;
                            boolean Z = r04Var.Z();
                            k14 B = LazyListState.this.B();
                            CoroutineScope q = LazyListState.this.q();
                            if (q == null) {
                                throw new IllegalArgumentException("coroutineScope should be not null");
                            }
                            k14 e = LazyListMeasureKt.e(a4, aVar, m, i8, i9, l05, T, t, G, i10, z7, g, mVar5, eVar5, z8, r04Var, w, i11, a5, z4, Z, B, q, LazyListState.this.A(), new it2() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public final sg4 b(int i12, int i13, ss2 ss2Var) {
                                    return r04.this.P(iv0.g(j, i12 + i6), iv0.f(j, i13 + i5), t.i(), ss2Var);
                                }

                                @Override // defpackage.it2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    return b(((Number) obj).intValue(), ((Number) obj2).intValue(), (ss2) obj3);
                                }
                            });
                            LazyListState.m(LazyListState.this, e, r04Var.Z(), false, 4, null);
                            return e;
                        } finally {
                            c.s(l);
                        }
                    } catch (Throwable th) {
                        c.d();
                        throw th;
                    }
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return b((r04) obj, ((fv0) obj2).t());
                }
            };
            composer.q(A);
        }
        composer.R();
        gt2 gt2Var = (gt2) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return gt2Var;
    }
}
