package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.o;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.n37;
import defpackage.pl0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CommentViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarPlaceholderWithLetter(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(915189611);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(915189611, i2, -1, "com.nytimes.android.comments.comments.mvi.view.AvatarPlaceholderWithLetter (CommentView.kt:399)");
            }
            Modifier a = pl0.a(SizeKt.n(Modifier.a, bu1.g(32)), d37.f());
            eb5.a aVar = eb5.Companion;
            Modifier d = BackgroundKt.d(a, aVar.a(h, 8).p(), null, 2, null);
            Alignment e = Alignment.a.e();
            h.z(733328855);
            rg4 g = BoxKt.g(e, false, h, 6);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(d);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, g, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            composer2 = h;
            TextKt.c(str, null, aVar.a(h, 8).R(), ek8.g(16), null, o.b.e(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i2 & 14) | 199680, 0, 131026);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$AvatarPlaceholderWithLetter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.AvatarPlaceholderWithLetter(str, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x090d, code lost:
    
        if (r12.S(r5) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x096b, code lost:
    
        if (r12.S(r8) == false) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x09fc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0998  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommentView(final java.lang.String r54, final java.lang.String r55, final java.lang.String r56, final java.lang.String r57, final java.util.List<? extends com.nytimes.android.comments.comments.mvi.FlagType> r58, final defpackage.ss2 r59, final defpackage.qs2 r60, final defpackage.qs2 r61, int r62, boolean r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68, boolean r69, defpackage.gt2 r70, final defpackage.qs2 r71, androidx.compose.runtime.Composer r72, final int r73, final int r74, final int r75) {
        /*
            Method dump skipped, instructions count: 2820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.view.CommentViewKt.CommentView(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, ss2, qs2, qs2, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, gt2, qs2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CommentView$lambda$1(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CommentView$lambda$2(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    public static final void CommentViewPreview1(Composer composer, final int i) {
        Composer h = composer.h(-361632397);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-361632397, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentViewPreview1 (CommentView.kt:419)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$CommentViewKt.INSTANCE.m242getLambda1$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$CommentViewPreview1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    CommentViewKt.CommentViewPreview1(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void CommentViewPreview2(Composer composer, final int i) {
        Composer h = composer.h(57884434);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(57884434, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentViewPreview2 (CommentView.kt:446)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$CommentViewKt.INSTANCE.m243getLambda2$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$CommentViewPreview2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    CommentViewKt.CommentViewPreview2(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlagButton(final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-964365310);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-964365310, i2, -1, "com.nytimes.android.comments.comments.mvi.view.FlagButton (CommentView.kt:355)");
            }
            if (z) {
                h.z(279989916);
                TextKt.c(k48.b(R.string.comments_screen_flaged_label, h, 0), ModifierUtilsKt.d(Modifier.a, "Flagged Text"), 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).m(), h, 0, 0, 65020);
                h.R();
                composer2 = h;
            } else {
                h.z(279990245);
                composer2 = h;
                TextKt.c(k48.b(R.string.comments_screen_flag_button, h, 0), ModifierUtilsKt.d(ClickableKt.e(Modifier.a, false, null, null, qs2Var, 7, null), "Flag Button"), 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).n(), composer2, 0, 0, 65020);
                composer2.R();
            }
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$FlagButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.FlagButton(z, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecommendButton(final String str, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(888677935);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(888677935, i2, -1, "com.nytimes.android.comments.comments.mvi.view.RecommendButton (CommentView.kt:291)");
            }
            final long j = 1000;
            composer2 = h;
            TextKt.c(str, ModifierUtilsKt.d(ComposedModifierKt.b(Modifier.a, null, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RecommendButton$$inlined$throttleClickable$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-1, reason: not valid java name */
                public static final long m210invoke$lambda1(sy4 sy4Var) {
                    return ((Number) sy4Var.getValue()).longValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-2, reason: not valid java name */
                public static final void m211invoke$lambda2(sy4 sy4Var, long j2) {
                    sy4Var.setValue(Long.valueOf(j2));
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                public final Modifier invoke(Modifier modifier, Composer composer3, int i3) {
                    zq3.h(modifier, "$this$composed");
                    composer3.z(621316227);
                    if (b.G()) {
                        b.S(621316227, i3, -1, "com.nytimes.android.utils.composeutils.throttleClickable.<anonymous> (ModifierUtils.kt:58)");
                    }
                    composer3.z(-1478949441);
                    Object A = composer3.A();
                    if (A == Composer.a.a()) {
                        A = b0.e(0L, null, 2, null);
                        composer3.q(A);
                    }
                    final sy4 sy4Var = (sy4) A;
                    composer3.R();
                    final long j2 = j;
                    final qs2 qs2Var2 = qs2Var;
                    Modifier e = ClickableKt.e(modifier, false, null, null, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RecommendButton$$inlined$throttleClickable$default$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m212invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m212invoke() {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - CommentViewKt$RecommendButton$$inlined$throttleClickable$default$1.m210invoke$lambda1(sy4Var) < j2) {
                                return;
                            }
                            CommentViewKt$RecommendButton$$inlined$throttleClickable$default$1.m211invoke$lambda2(sy4Var, currentTimeMillis);
                            qs2Var2.mo865invoke();
                        }
                    }, 7, null);
                    if (b.G()) {
                        b.R();
                    }
                    composer3.R();
                    return e;
                }
            }, 1, null), "Recommend Button"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).n(), composer2, i2 & 14, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RecommendButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.RecommendButton(str, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RightButton(final String str, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-1790640177);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1790640177, i2, -1, "com.nytimes.android.comments.comments.mvi.view.RightButton (CommentView.kt:271)");
            }
            eb5.a aVar = eb5.Companion;
            TextKt.c("|", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.c(h, 8).n(), h, 6, 0, 65534);
            final long j = 1000;
            composer2 = h;
            TextKt.c(str, ModifierUtilsKt.d(ComposedModifierKt.b(Modifier.a, null, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RightButton$$inlined$throttleClickable$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-1, reason: not valid java name */
                public static final long m215invoke$lambda1(sy4 sy4Var) {
                    return ((Number) sy4Var.getValue()).longValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-2, reason: not valid java name */
                public static final void m216invoke$lambda2(sy4 sy4Var, long j2) {
                    sy4Var.setValue(Long.valueOf(j2));
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                public final Modifier invoke(Modifier modifier, Composer composer3, int i3) {
                    zq3.h(modifier, "$this$composed");
                    composer3.z(621316227);
                    if (b.G()) {
                        b.S(621316227, i3, -1, "com.nytimes.android.utils.composeutils.throttleClickable.<anonymous> (ModifierUtils.kt:58)");
                    }
                    composer3.z(-1478949441);
                    Object A = composer3.A();
                    if (A == Composer.a.a()) {
                        A = b0.e(0L, null, 2, null);
                        composer3.q(A);
                    }
                    final sy4 sy4Var = (sy4) A;
                    composer3.R();
                    final long j2 = j;
                    final qs2 qs2Var2 = qs2Var;
                    Modifier e = ClickableKt.e(modifier, false, null, null, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RightButton$$inlined$throttleClickable$default$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m217invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m217invoke() {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - CommentViewKt$RightButton$$inlined$throttleClickable$default$1.m215invoke$lambda1(sy4Var) < j2) {
                                return;
                            }
                            CommentViewKt$RightButton$$inlined$throttleClickable$default$1.m216invoke$lambda2(sy4Var, currentTimeMillis);
                            qs2Var2.mo865invoke();
                        }
                    }, 7, null);
                    if (b.G()) {
                        b.R();
                    }
                    composer3.R();
                    return e;
                }
            }, 1, null), "Reply Button"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.c(h, 8).n(), composer2, i2 & 14, 0, 65532);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$RightButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.RightButton(str, qs2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShareButton(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-2131186435);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-2131186435, i2, -1, "com.nytimes.android.comments.comments.mvi.view.ShareButton (CommentView.kt:385)");
            }
            final long j = 1000;
            composer2 = h;
            TextKt.c(k48.b(R.string.comments_screen_share_button, h, 0), ComposedModifierKt.b(Modifier.a, null, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$ShareButton$$inlined$throttleClickable$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-1, reason: not valid java name */
                public static final long m220invoke$lambda1(sy4 sy4Var) {
                    return ((Number) sy4Var.getValue()).longValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-2, reason: not valid java name */
                public static final void m221invoke$lambda2(sy4 sy4Var, long j2) {
                    sy4Var.setValue(Long.valueOf(j2));
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                public final Modifier invoke(Modifier modifier, Composer composer3, int i3) {
                    zq3.h(modifier, "$this$composed");
                    composer3.z(621316227);
                    if (b.G()) {
                        b.S(621316227, i3, -1, "com.nytimes.android.utils.composeutils.throttleClickable.<anonymous> (ModifierUtils.kt:58)");
                    }
                    composer3.z(-1478949441);
                    Object A = composer3.A();
                    if (A == Composer.a.a()) {
                        A = b0.e(0L, null, 2, null);
                        composer3.q(A);
                    }
                    final sy4 sy4Var = (sy4) A;
                    composer3.R();
                    final long j2 = j;
                    final qs2 qs2Var2 = qs2Var;
                    Modifier e = ClickableKt.e(modifier, false, null, null, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$ShareButton$$inlined$throttleClickable$default$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m222invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m222invoke() {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (currentTimeMillis - CommentViewKt$ShareButton$$inlined$throttleClickable$default$1.m220invoke$lambda1(sy4Var) < j2) {
                                return;
                            }
                            CommentViewKt$ShareButton$$inlined$throttleClickable$default$1.m221invoke$lambda2(sy4Var, currentTimeMillis);
                            qs2Var2.mo865invoke();
                        }
                    }, 7, null);
                    if (b.G()) {
                        b.R();
                    }
                    composer3.R();
                    return e;
                }
            }, 1, null), 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).n(), composer2, 0, 0, 65020);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$ShareButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.ShareButton(qs2.this, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimesPickView(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(1477192116);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(1477192116, i, -1, "com.nytimes.android.comments.comments.mvi.view.TimesPickView (CommentView.kt:326)");
            }
            Arrangement arrangement = Arrangement.a;
            float g = bu1.g(4);
            Alignment.a aVar = Alignment.a;
            Arrangement.e o = arrangement.o(g, aVar.j());
            Alignment.c i2 = aVar.i();
            h.z(693286680);
            Modifier.a aVar2 = Modifier.a;
            rg4 a = m.a(o, i2, h, 54);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o2 = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o2, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            n37 n37Var = n37.a;
            ImageKt.b(do5.d(R.drawable.ic_times_logo_yellow, h, 0), "times logo yellow", null, null, null, 0.0f, null, h, 56, 124);
            Modifier d = ModifierUtilsKt.d(aVar2, "Times Pick Text");
            composer2 = h;
            TextKt.c(k48.b(R.string.comments_screen_times_pick_label, h, 0), d, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, eb5.Companion.c(h, 8).q(), composer2, 0, 0, 65020);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentViewKt$TimesPickView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CommentViewKt.TimesPickView(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    private static final String getRecommendedText(boolean z, int i, Composer composer, int i2) {
        String b;
        composer.z(-72218496);
        if (b.G()) {
            b.S(-72218496, i2, -1, "com.nytimes.android.comments.comments.mvi.view.getRecommendedText (CommentView.kt:307)");
        }
        if (z) {
            composer.z(1654559270);
            b = k48.b(R.string.comments_screen_recommended_button, composer, 0);
            composer.R();
        } else {
            composer.z(1654559394);
            b = k48.b(R.string.comments_screen_recommend_button, composer, 0);
            composer.R();
        }
        if (i > 0) {
            b = b + " (" + i + ")";
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b;
    }
}
