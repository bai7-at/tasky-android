package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.material.TabKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.k48;
import defpackage.kj8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym2;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class CommentsTabsKt {
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e6, code lost:
    
        if ((r35 & 16) != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004f  */
    /* renamed from: CommentsTabRow-jB83MbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m238CommentsTabRowjB83MbM(final int r25, androidx.compose.ui.Modifier r26, int r27, long r28, long r30, final defpackage.gt2 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt.m238CommentsTabRowjB83MbM(int, androidx.compose.ui.Modifier, int, long, long, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void CommentsTabs(final List<? extends CommentTab> list, Modifier modifier, int i, final ss2 ss2Var, Composer composer, final int i2, final int i3) {
        zq3.h(list, "tabValues");
        zq3.h(ss2Var, "onSelectedTab");
        Composer h = composer.h(1468745249);
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.a : modifier;
        final int i4 = (i3 & 4) != 0 ? 0 : i;
        if (b.G()) {
            b.S(1468745249, i2, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsTabs (CommentsTabs.kt:26)");
        }
        int size = list.size();
        eb5.a aVar = eb5.Companion;
        final int i5 = i4;
        m238CommentsTabRowjB83MbM(size, modifier2, i4, aVar.a(h, 8).a(), aVar.a(h, 8).S(), zr0.b(h, -1059220084, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt$CommentsTabs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(Composer composer2, int i6) {
                if ((i6 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1059220084, i6, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsTabs.<anonymous> (CommentsTabs.kt:34)");
                }
                List<CommentTab> list2 = list;
                int i7 = i4;
                final ss2 ss2Var2 = ss2Var;
                int i8 = 0;
                final int i9 = 0;
                for (Object obj : list2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        i.v();
                    }
                    final String b = k48.b(((CommentTab) obj).getTabName(), composer2, i8);
                    final boolean z = i7 == i9 ? 1 : i8;
                    Modifier d = ModifierUtilsKt.d(Modifier.a, b);
                    long j = eb5.Companion.a(composer2, 8).j();
                    composer2.z(1187576912);
                    boolean S = composer2.S(ss2Var2) | composer2.d(i9);
                    Object A = composer2.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt$CommentsTabs$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m239invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m239invoke() {
                                ss2.this.invoke(Integer.valueOf(i9));
                            }
                        };
                        composer2.q(A);
                    }
                    composer2.R();
                    TabKt.a(z, (qs2) A, d, false, zr0.b(composer2, -1984021293, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt$CommentsTabs$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i11) {
                            long p;
                            if ((i11 & 11) == 2 && composer3.i()) {
                                composer3.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(-1984021293, i11, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsTabs.<anonymous>.<anonymous>.<anonymous> (CommentsTabs.kt:40)");
                            }
                            eb5.a aVar2 = eb5.Companion;
                            j t = aVar2.c(composer3, 8).t();
                            long b2 = ym2.b(14, composer3, 6);
                            int b3 = kj8.a.b();
                            if (z) {
                                composer3.z(-2041942154);
                                p = aVar2.a(composer3, 8).l();
                                composer3.R();
                            } else {
                                composer3.z(-2041942054);
                                p = aVar2.a(composer3, 8).p();
                                composer3.R();
                            }
                            TextKt.c(b, null, p, b2, null, null, null, 0L, null, null, 0L, b3, false, 1, 0, null, t, composer3, 0, 3120, 55282);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), null, null, j, 0L, composer2, 24576, 360);
                    i9 = i10;
                    ss2Var2 = ss2Var2;
                    i8 = i8;
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 196608 | (i2 & 896), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt$CommentsTabs$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    CommentsTabsKt.CommentsTabs(list, modifier3, i5, ss2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void CommentsTabsPreview(Composer composer, final int i) {
        Composer h = composer.h(1125079726);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(1125079726, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsTabsPreview (CommentsTabs.kt:98)");
            }
            NytThemeKt.a(false, null, null, ComposableSingletons$CommentsTabsKt.INSTANCE.m255getLambda1$comments_release(), h, 3072, 7);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsTabsKt$CommentsTabsPreview$1
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
                    CommentsTabsKt.CommentsTabsPreview(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
