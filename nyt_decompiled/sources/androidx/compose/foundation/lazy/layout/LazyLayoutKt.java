package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.o04;
import defpackage.qs2;
import defpackage.ra8;
import defpackage.s04;
import defpackage.sg4;
import defpackage.u04;
import defpackage.u87;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zr0;

/* loaded from: classes.dex */
public abstract class LazyLayoutKt {
    public static final void a(final qs2 qs2Var, final Modifier modifier, final u04 u04Var, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(u04Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.C(gt2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                u04Var = null;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:77)");
            }
            final x08 o = y.o(qs2Var, h, i3 & 14);
            LazySaveableStateHolderKt.a(zr0.b(h, -1488997347, true, new it2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(u87 u87Var, Composer composer2, int i6) {
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-1488997347, i6, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
                    }
                    final x08 x08Var = o;
                    composer2.z(-492369756);
                    Object A = composer2.A();
                    Composer.a aVar = Composer.a;
                    if (A == aVar.a()) {
                        A = new LazyLayoutItemContentFactory(u87Var, new qs2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final o04 mo865invoke() {
                                return (o04) ((qs2) x08.this.getValue()).mo865invoke();
                            }
                        });
                        composer2.q(A);
                    }
                    composer2.R();
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) A;
                    composer2.z(-492369756);
                    Object A2 = composer2.A();
                    if (A2 == aVar.a()) {
                        A2 = new SubcomposeLayoutState(new d(lazyLayoutItemContentFactory));
                        composer2.q(A2);
                    }
                    composer2.R();
                    SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) A2;
                    u04 u04Var2 = u04.this;
                    composer2.z(-1523807258);
                    if (u04Var2 != null) {
                        LazyLayoutPrefetcher_androidKt.a(u04.this, lazyLayoutItemContentFactory, subcomposeLayoutState, composer2, (SubcomposeLayoutState.f << 6) | 64);
                        ww8 ww8Var = ww8.a;
                    }
                    composer2.R();
                    Modifier modifier2 = modifier;
                    final gt2 gt2Var2 = gt2Var;
                    composer2.z(511388516);
                    boolean S = composer2.S(lazyLayoutItemContentFactory) | composer2.S(gt2Var2);
                    Object A3 = composer2.A();
                    if (S || A3 == aVar.a()) {
                        A3 = new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final sg4 b(ra8 ra8Var, long j) {
                                return (sg4) gt2Var2.invoke(new s04(LazyLayoutItemContentFactory.this, ra8Var), fv0.b(j));
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return b((ra8) obj, ((fv0) obj2).t());
                            }
                        };
                        composer2.q(A3);
                    }
                    composer2.R();
                    SubcomposeLayoutKt.b(subcomposeLayoutState, modifier2, (gt2) A3, composer2, SubcomposeLayoutState.f, 0);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((u87) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }
            }), h, 6);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final u04 u04Var2 = u04Var;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    LazyLayoutKt.a(qs2.this, modifier2, u04Var2, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
