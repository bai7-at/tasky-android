package com.nytimes.android.ribbon.composable;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.di;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.jn5;
import defpackage.kt2;
import defpackage.qn5;
import defpackage.r99;
import defpackage.ww8;
import defpackage.xx1;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class DestinationPagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final float f, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1452991992);
        if ((i & 14) == 0) {
            i2 = (h.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1452991992, i2, -1, "com.nytimes.android.ribbon.composable.CustomTouchSlopProvider (DestinationPager.kt:47)");
            }
            CompositionLocalKt.a(CompositionLocalsKt.p().c(new a(f, (r99) h.m(CompositionLocalsKt.p()))), zr0.b(h, -392388920, true, new gt2() { // from class: com.nytimes.android.ribbon.composable.DestinationPagerKt$CustomTouchSlopProvider$1
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-392388920, i3, -1, "com.nytimes.android.ribbon.composable.CustomTouchSlopProvider.<anonymous> (DestinationPager.kt:54)");
                    }
                    gt2.this.invoke(composer2, 0);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 56);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.DestinationPagerKt$CustomTouchSlopProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DestinationPagerKt.a(f, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void b(final PagerState pagerState, final int i, final Modifier modifier, final it2 it2Var, Composer composer, final int i2, final int i3) {
        int i4;
        zq3.h(pagerState, "pagerState");
        zq3.h(it2Var, "content");
        Composer h = composer.h(1057434871);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (h.S(pagerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= h.S(modifier) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i4 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i5 != 0) {
                modifier = Modifier.a;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1057434871, i4, -1, "com.nytimes.android.ribbon.composable.DestinationPager (DestinationPager.kt:24)");
            }
            a(((r99) h.m(CompositionLocalsKt.p())).f() * 4, zr0.b(h, 1878105962, true, new gt2() { // from class: com.nytimes.android.ribbon.composable.DestinationPagerKt$DestinationPager$1
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
                    if ((i6 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(1878105962, i6, -1, "com.nytimes.android.ribbon.composable.DestinationPager.<anonymous> (DestinationPager.kt:27)");
                    }
                    SnapFlingBehavior a = jn5.a.a(PagerState.this, null, di.k(ContentFeedType.OTHER, 0, xx1.d(), 2, null), null, di.i(0.0f, 1500.0f, null, 5, null), 0.4f, composer2, (jn5.c << 18) | 221184, 10);
                    PagerState pagerState2 = PagerState.this;
                    Modifier modifier2 = modifier;
                    int i7 = i;
                    final it2 it2Var2 = it2Var;
                    PagerKt.a(pagerState2, modifier2, null, null, i7, 0.0f, null, a, false, false, null, null, zr0.b(composer2, -666102035, true, new kt2() { // from class: com.nytimes.android.ribbon.composable.DestinationPagerKt$DestinationPager$1.1
                        {
                            super(4);
                        }

                        @Override // defpackage.kt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((qn5) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return ww8.a;
                        }

                        public final void invoke(qn5 qn5Var, int i8, Composer composer3, int i9) {
                            zq3.h(qn5Var, "$this$HorizontalPager");
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-666102035, i9, -1, "com.nytimes.android.ribbon.composable.DestinationPager.<anonymous>.<anonymous> (DestinationPager.kt:38)");
                            }
                            it2.this.invoke(Integer.valueOf(i8), composer3, Integer.valueOf((i9 >> 3) & 14));
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    }), composer2, 0, 384, 3948);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 48);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.ribbon.composable.DestinationPagerKt$DestinationPager$2
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
                    DestinationPagerKt.b(PagerState.this, i, modifier2, it2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }
}
