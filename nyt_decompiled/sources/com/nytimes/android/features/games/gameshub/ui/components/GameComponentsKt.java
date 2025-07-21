package com.nytimes.android.features.games.gameshub.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.m37;
import defpackage.nn0;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.v74;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class GameComponentsKt {
    public static final void a(Modifier modifier, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        Modifier modifier3;
        final Modifier modifier4;
        final long j3;
        Composer h = composer.h(-620156691);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (h.S(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && h.e(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
            modifier4 = modifier2;
            j3 = j2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                Modifier modifier5 = i4 != 0 ? Modifier.a : modifier2;
                if ((i2 & 2) != 0) {
                    j2 = nn0.r(((nn0) h.m(ContentColorKt.a())).B(), ((Number) h.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -113;
                }
                modifier3 = modifier5;
            } else {
                h.K();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                modifier3 = modifier2;
            }
            long j4 = j2;
            h.u();
            if (b.G()) {
                b.S(-620156691, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameLockIcon (GameComponents.kt:87)");
            }
            float f = 16;
            IconKt.a(v74.a(oe3.a.a()), null, SizeKt.a(modifier3, bu1.g(f), bu1.g(f)), j4, h, ((i3 << 6) & 7168) | 48, 0);
            if (b.G()) {
                b.R();
            }
            modifier4 = modifier3;
            j3 = j4;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GameLockIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    GameComponentsKt.a(Modifier.this, j3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final qs2 qs2Var, Modifier modifier, float f, final String str, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(936171853);
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
            i3 |= h.b(f) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(str) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                f = bu1.g(100);
            }
            if (i6 != 0) {
                str = "Play";
            }
            if (b.G()) {
                b.S(936171853, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.GamePlayButton (GameComponents.kt:31)");
            }
            GameButtonGenericKt.a(qs2Var, SizeKt.b(modifier, 0.0f, bu1.g(36), 1, null), f, zr0.b(h, -389031243, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GamePlayButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i7) {
                    zq3.h(m37Var, "$this$GameButtonPrimary");
                    if ((i7 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-389031243, i7, -1, "com.nytimes.android.features.games.gameshub.ui.components.GamePlayButton.<anonymous> (GameComponents.kt:37)");
                    }
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, (i3 & 14) | 3072 | (i3 & 896), 0);
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final String str2 = str;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GamePlayButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    GameComponentsKt.b(qs2.this, modifier2, f2, str2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void c(final qs2 qs2Var, Modifier modifier, float f, final String str, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(-1846567396);
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
            i3 |= h.b(f) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(str) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                f = bu1.g(ContentType.SHORT_FORM_ON_DEMAND);
            }
            if (i6 != 0) {
                str = "Solved";
            }
            if (b.G()) {
                b.S(-1846567396, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameSolvedButton (GameComponents.kt:48)");
            }
            GameButtonGenericKt.b(qs2Var, SizeKt.b(modifier, 0.0f, bu1.g(36), 1, null), f, zr0.b(h, -194878282, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GameSolvedButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i7) {
                    zq3.h(m37Var, "$this$GameButtonSecondary");
                    if ((i7 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-194878282, i7, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameSolvedButton.<anonymous> (GameComponents.kt:54)");
                    }
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, (i3 & 14) | 3072 | (i3 & 896), 0);
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final String str2 = str;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GameSolvedButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    GameComponentsKt.c(qs2.this, modifier2, f2, str2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void d(final qs2 qs2Var, Modifier modifier, float f, final String str, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onClick");
        Composer h = composer.h(889857655);
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
            i3 |= h.b(f) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(str) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                f = bu1.g(ContentType.SHORT_FORM_ON_DEMAND);
            }
            if (i6 != 0) {
                str = "Subscribe";
            }
            if (b.G()) {
                b.S(889857655, i3, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameSubscribeButton (GameComponents.kt:65)");
            }
            GameButtonGenericKt.b(qs2Var, SizeKt.b(modifier, 0.0f, bu1.g(36), 1, null), f, zr0.b(h, -1080057443, true, new it2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GameSubscribeButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i7) {
                    int i8;
                    zq3.h(m37Var, "$this$GameButtonSecondary");
                    if ((i7 & 14) == 0) {
                        i8 = i7 | (composer2.S(m37Var) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 91) == 18 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-1080057443, i8, -1, "com.nytimes.android.features.games.gameshub.ui.components.GameSubscribeButton.<anonymous> (GameComponents.kt:71)");
                    }
                    GameComponentsKt.a(SizeKt.n(PaddingKt.m(m37Var.c(Modifier.a, Alignment.a.i()), 0.0f, 0.0f, bu1.g(4), 0.0f, 11, null), bu1.g(16)), eb5.Companion.a(composer2, 8).l(), composer2, 0, 0);
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, (i3 & 14) | 3072 | (i3 & 896), 0);
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final String str2 = str;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.games.gameshub.ui.components.GameComponentsKt$GameSubscribeButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    GameComponentsKt.d(qs2.this, modifier2, f2, str2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
