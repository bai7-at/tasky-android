package com.nytimes.android.features.you.youtab.composable.interests.books;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import coil.compose.SingletonAsyncImageKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.ui.tpl.TPLTypography;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.navigation.NavigationSource;
import com.nytimes.android.utils.composeutils.LifecycleUtilsKt;
import com.nytimes.android.utils.composeutils.ModifierUtilsKt;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.c37;
import defpackage.cc7;
import defpackage.cj6;
import defpackage.cs0;
import defpackage.d37;
import defpackage.dh8;
import defpackage.do5;
import defpackage.eb5;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kj8;
import defpackage.kt2;
import defpackage.m37;
import defpackage.n37;
import defpackage.nn0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.t5;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.y25;
import defpackage.yk6;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;
import kotlin.text.h;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class BooksInterestKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Interest.BooksInterest booksInterest, final gt2 gt2Var, final int i, final ComponentActivity componentActivity, Modifier modifier, Composer composer, final int i2, final int i3) {
        Composer h = composer.h(1923843819);
        Modifier modifier2 = (i3 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(1923843819, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.BookLists (BooksInterest.kt:292)");
        }
        Arrangement.f n = Arrangement.a.n(bu1.g(10));
        h.z(693286680);
        rg4 a = m.a(n, Alignment.a.l(), h, 6);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
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
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        n37 n37Var = n37.a;
        h.z(-1763230259);
        for (final InterestAsset interestAsset : booksInterest.f()) {
            qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$BookLists$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m516invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m516invoke() {
                    gt2.this.invoke(BooksInterestKt.h(interestAsset, i), componentActivity);
                }
            };
            Modifier b2 = m37.b(n37Var, SizeKt.b(Modifier.a, 0.0f, bu1.g(32), 1, null), 1.0f, false, 2, null);
            c37 c2 = d37.c(bu1.g(3));
            float g = bu1.g(1);
            eb5.a aVar = eb5.Companion;
            ButtonKt.c(qs2Var, b2, false, null, null, c2, fb0.a(g, aVar.b(h, 8).k()), a.a.j(0L, aVar.b(h, 8).k(), nn0.r(aVar.b(h, 8).k(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), h, a.l << 9, 1), null, zr0.b(h, 2049099622, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$BookLists$1$1$2
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i4) {
                    zq3.h(m37Var, "$this$OutlinedButton");
                    if ((i4 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(2049099622, i4, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.BookLists.<anonymous>.<anonymous>.<anonymous> (BooksInterest.kt:313)");
                    }
                    String str = (String) Interest.BooksInterest.Companion.a().get(InterestAsset.this.j());
                    if (str == null) {
                        str = InterestAsset.this.h();
                    }
                    TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TPLTypography.title14.getValue(), composer2, 0, 0, 65534);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 805306368, 284);
        }
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$BookLists$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    BooksInterestKt.a(Interest.BooksInterest.this, gt2Var, i, componentActivity, modifier3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void b(final int i, final Interest.BooksInterest booksInterest, final gt2 gt2Var, final qs2 qs2Var, final qs2 qs2Var2, Modifier modifier, Composer composer, final int i2, final int i3) {
        zq3.h(booksInterest, "interest");
        zq3.h(gt2Var, "onAssetClick");
        zq3.h(qs2Var, "reloadSavedBooks");
        zq3.h(qs2Var2, "sendBookInterestImpression");
        Composer h = composer.h(-1232862933);
        Modifier modifier2 = (i3 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1232862933, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterest (BooksInterest.kt:64)");
        }
        ww8 ww8Var = ww8.a;
        h.z(1568445269);
        boolean z = (((57344 & i2) ^ 24576) > 16384 && h.S(qs2Var2)) || (i2 & 24576) == 16384;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new BooksInterestKt$BooksInterest$1$1(qs2Var2, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        h.z(1568445361);
        boolean z2 = (((i2 & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i2 & 3072) == 2048;
        Object A2 = h.A();
        if (z2 || A2 == Composer.a.a()) {
            A2 = new BooksInterestKt$BooksInterest$2$1(qs2Var, null);
            h.q(A2);
        }
        h.R();
        LifecycleUtilsKt.a(ww8Var, (gt2) A2, h, 70);
        ComponentActivity d = t5.d(h, 0);
        Modifier m = PaddingKt.m(modifier2, 0.0f, 0.0f, 0.0f, bu1.g(16), 7, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(m);
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
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        if (booksInterest.g() == 0) {
            h.z(-129884158);
            c(booksInterest, gt2Var, i, d, null, h, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 4104 | ((i2 << 6) & 896), 16);
            h.R();
        } else {
            h.z(-129883936);
            List a1 = i.a1(booksInterest.e());
            if (booksInterest.e().size() < 5) {
                int size = 5 - booksInterest.e().size();
                for (int i4 = 0; i4 < size; i4++) {
                    a1.add(Interest.Book.Companion.a());
                }
            }
            d(a1, booksInterest, gt2Var, i, d, null, h, (i2 & 896) | 32840 | ((i2 << 9) & 7168), 32);
            h.R();
        }
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$BooksInterest$4
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
                    BooksInterestKt.b(i, booksInterest, gt2Var, qs2Var, qs2Var2, modifier3, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Interest.BooksInterest booksInterest, final gt2 gt2Var, final int i, final ComponentActivity componentActivity, Modifier modifier, Composer composer, final int i2, final int i3) {
        Composer h = composer.h(251174167);
        final Modifier modifier2 = (i3 & 16) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(251174167, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.NoSavesContent (BooksInterest.kt:251)");
        }
        Modifier k = PaddingKt.k(SizeKt.h(modifier2, 0.0f, 1, null), bu1.g(16), 0.0f, 2, null);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(k);
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
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        Painter d = do5.d(re6.books_interest, h, 0);
        ContentScale d2 = ContentScale.a.d();
        Modifier.a aVar = Modifier.a;
        ImageKt.b(d, null, SizeKt.h(aVar, 0.0f, 1, null), null, d2, 0.0f, null, h, 25016, 104);
        SpacerKt.a(SizeKt.n(aVar, bu1.g(20)), h, 6);
        TextKt.c(k48.b(yk6.books_interest_no_saves, h, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(eb5.Companion.b(h, 8).g(), ek8.g(18), new o(ContentFeedType.OTHER), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ek8.e(21.6d), null, null, null, 0, 0, null, 16646104, null), h, 0, 0, 65534);
        SpacerKt.a(SizeKt.n(aVar, bu1.g(12)), h, 6);
        a(booksInterest, gt2Var, i, componentActivity, null, h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 4104 | (i2 & 896), 16);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$NoSavesContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    BooksInterestKt.c(Interest.BooksInterest.this, gt2Var, i, componentActivity, modifier2, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final void d(final List list, final Interest.BooksInterest booksInterest, final gt2 gt2Var, final int i, final ComponentActivity componentActivity, Modifier modifier, Composer composer, final int i2, final int i3) {
        j f;
        zq3.h(list, "displayList");
        zq3.h(booksInterest, "interest");
        zq3.h(gt2Var, "onAssetClick");
        Composer h = composer.h(-27503304);
        Modifier modifier2 = (i3 & 32) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-27503304, i2, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.SavesContent (BooksInterest.kt:110)");
        }
        final float g = bu1.g(133);
        final float g2 = bu1.g(209);
        h.z(-483455358);
        Arrangement arrangement = Arrangement.a;
        Arrangement.m g3 = arrangement.g();
        Alignment.a aVar = Alignment.a;
        rg4 a = d.a(g3, aVar.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(modifier2);
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
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        final ap0 ap0Var = ap0.a;
        Modifier.a aVar2 = Modifier.a;
        float f2 = 16;
        SpacerKt.a(SizeKt.i(aVar2, bu1.g(f2)), h, 6);
        LazyDslKt.b(null, null, null, false, arrangement.n(bu1.g(f2)), aVar.l(), null, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyRow");
                ComposableSingletons$BooksInterestKt composableSingletons$BooksInterestKt = ComposableSingletons$BooksInterestKt.a;
                LazyListScope.d(lazyListScope, null, null, composableSingletons$BooksInterestKt.a(), 3, null);
                final List<Interest.Book> list2 = list;
                final gt2 gt2Var2 = gt2Var;
                final int i4 = i;
                final ComponentActivity componentActivity2 = componentActivity;
                final float f3 = g;
                final float f4 = g2;
                final BooksInterestKt$SavesContent$1$1$invoke$$inlined$items$default$1 booksInterestKt$SavesContent$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i5) {
                        return ss2.this.invoke(list2.get(i5));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i5, Composer composer2, int i6) {
                        int i7;
                        if ((i6 & 14) == 0) {
                            i7 = i6 | (composer2.S(h04Var) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i6 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i7 |= composer2.d(i5) ? 32 : 16;
                        }
                        if ((i7 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-632812321, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final Interest.Book book = (Interest.Book) list2.get(i5);
                        eb5.a aVar3 = eb5.Companion;
                        final long l = aVar3.b(composer2, 8).l();
                        Arrangement.m g4 = Arrangement.a.g();
                        Alignment.b k = Alignment.a.k();
                        Modifier.a aVar4 = Modifier.a;
                        boolean z = !h.d0(book.c());
                        final gt2 gt2Var3 = gt2Var2;
                        final int i8 = i4;
                        final ComponentActivity componentActivity3 = componentActivity2;
                        Modifier a5 = ModifierUtilsKt.a(aVar4, z, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final Modifier invoke(Modifier modifier3) {
                                zq3.h(modifier3, "$this$conditional");
                                final gt2 gt2Var4 = gt2.this;
                                final Interest.Book book2 = book;
                                final int i9 = i8;
                                final ComponentActivity componentActivity4 = componentActivity3;
                                return ClickableKt.e(modifier3, false, null, null, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m517invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m517invoke() {
                                        gt2.this.invoke(BooksInterestKt.g(book2, i9), componentActivity4);
                                    }
                                }, 7, null);
                            }
                        });
                        composer2.z(-483455358);
                        rg4 a6 = d.a(g4, k, composer2, 54);
                        composer2.z(-1323940314);
                        int a7 = cs0.a(composer2, 0);
                        et0 o2 = composer2.o();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                        qs2 a8 = companion2.a();
                        it2 c2 = LayoutKt.c(a5);
                        if (composer2.j() == null) {
                            cs0.c();
                        }
                        composer2.G();
                        if (composer2.f()) {
                            composer2.D(a8);
                        } else {
                            composer2.p();
                        }
                        Composer a9 = Updater.a(composer2);
                        Updater.c(a9, a6, companion2.e());
                        Updater.c(a9, o2, companion2.g());
                        gt2 b2 = companion2.b();
                        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
                            a9.q(Integer.valueOf(a7));
                            a9.v(Integer.valueOf(a7), b2);
                        }
                        c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        ap0 ap0Var2 = ap0.a;
                        vg3 a10 = new vg3.a((Context) composer2.m(AndroidCompositionLocals_androidKt.g())).d(book.c()).g(h.d0(book.c()) ? re6.ic_books_empty : re6.ic_placeholder).f(h.d0(book.c()) ? re6.ic_books_empty : re6.ic_placeholder).c(true).a();
                        Modifier i9 = SizeKt.i(SizeKt.s(aVar4, f3), f4);
                        boolean d0 = h.d0(book.c());
                        composer2.z(-331888505);
                        boolean e = composer2.e(l);
                        Object A = composer2.A();
                        if (e || A == Composer.a.a()) {
                            A = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // defpackage.ss2
                                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                public final Modifier invoke(Modifier modifier3) {
                                    zq3.h(modifier3, "$this$conditional");
                                    return BorderKt.f(modifier3, bu1.g(1), l, d37.c(bu1.g(3)));
                                }
                            };
                            composer2.q(A);
                        }
                        composer2.R();
                        SingletonAsyncImageKt.a(a10, null, ModifierUtilsKt.a(i9, d0, (ss2) A), null, null, null, ContentScale.a.a(), 0.0f, null, 0, composer2, 1572920, 952);
                        SpacerKt.a(SizeKt.i(aVar4, bu1.g(10)), composer2, 6);
                        TextKt.c(book.b(), SizeKt.s(aVar4, f3), aVar3.b(composer2, 8).j(), 0L, null, null, null, 0L, null, null, 0L, kj8.a.b(), false, 2, 0, null, TPLTypography.text12.getValue(), composer2, 48, 3120, 55288);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                if (booksInterest.g() > 30) {
                    final zo0 zo0Var = ap0Var;
                    final float f5 = g2;
                    final float f6 = g;
                    LazyListScope.d(lazyListScope, null, null, zr0.c(1332714431, true, new it2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, Composer composer2, int i5) {
                            zq3.h(h04Var, "$this$item");
                            if ((i5 & 81) == 16 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1332714431, i5, -1, "com.nytimes.android.features.you.youtab.composable.interests.books.SavesContent.<anonymous>.<anonymous>.<anonymous> (BooksInterest.kt:177)");
                            }
                            Arrangement.f b2 = Arrangement.a.b();
                            zo0 zo0Var2 = zo0.this;
                            Modifier k = SizeKt.k(Modifier.a, f5, 0.0f, 2, null);
                            Alignment.a aVar3 = Alignment.a;
                            Modifier s = SizeKt.s(zo0Var2.c(k, aVar3.g()), f6);
                            composer2.z(-483455358);
                            rg4 a5 = d.a(b2, aVar3.k(), composer2, 6);
                            composer2.z(-1323940314);
                            int a6 = cs0.a(composer2, 0);
                            et0 o2 = composer2.o();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                            qs2 a7 = companion2.a();
                            it2 c2 = LayoutKt.c(s);
                            if (composer2.j() == null) {
                                cs0.c();
                            }
                            composer2.G();
                            if (composer2.f()) {
                                composer2.D(a7);
                            } else {
                                composer2.p();
                            }
                            Composer a8 = Updater.a(composer2);
                            Updater.c(a8, a5, companion2.e());
                            Updater.c(a8, o2, companion2.g());
                            gt2 b3 = companion2.b();
                            if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                                a8.q(Integer.valueOf(a6));
                                a8.v(Integer.valueOf(a6), b3);
                            }
                            c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                            composer2.z(2058660585);
                            ap0 ap0Var2 = ap0.a;
                            TextKt.c(k48.b(yk6.books_interest_more_saves, composer2, 0), null, eb5.Companion.b(composer2, 8).g(), 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, TPLTypography.text14.getValue(), composer2, 0, 0, 65018);
                            composer2.R();
                            composer2.t();
                            composer2.R();
                            composer2.R();
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), 3, null);
                }
                LazyListScope.d(lazyListScope, null, null, composableSingletons$BooksInterestKt.b(), 3, null);
            }
        }, h, 221184, 207);
        h.z(-1408012596);
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        h.z(-1408012561);
        TPLTypography tPLTypography = TPLTypography.text14;
        int n = c0064a.n(tPLTypography.getValue().R());
        try {
            c0064a.i(k48.b(yk6.books_interest_have_saved, h, 0));
            ww8 ww8Var = ww8.a;
            c0064a.k(n);
            h.R();
            n = c0064a.n(tPLTypography.getValue().R());
            try {
                c0064a.i(" ");
                c0064a.k(n);
                h.z(-1408012277);
                f = r42.f((r48 & 1) != 0 ? r42.a.i() : 0L, (r48 & 2) != 0 ? r42.a.m() : 0L, (r48 & 4) != 0 ? r42.a.p() : o.b.a(), (r48 & 8) != 0 ? r42.a.n() : null, (r48 & 16) != 0 ? r42.a.o() : null, (r48 & 32) != 0 ? r42.a.k() : null, (r48 & 64) != 0 ? r42.a.l() : null, (r48 & 128) != 0 ? r42.a.q() : 0L, (r48 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r42.a.g() : null, (r48 & 512) != 0 ? r42.a.w() : null, (r48 & 1024) != 0 ? r42.a.r() : null, (r48 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r42.a.f() : 0L, (r48 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r42.a.u() : null, (r48 & 8192) != 0 ? r42.a.t() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r42.a.j() : null, (r48 & 32768) != 0 ? r42.b.h() : 0, (r48 & 65536) != 0 ? r42.b.i() : 0, (r48 & 131072) != 0 ? r42.b.e() : 0L, (r48 & 262144) != 0 ? r42.b.j() : null, (r48 & 524288) != 0 ? r42.c : null, (r48 & Constants.MB) != 0 ? r42.b.f() : null, (r48 & 2097152) != 0 ? r42.b.d() : 0, (r48 & 4194304) != 0 ? r42.b.c() : 0, (r48 & 8388608) != 0 ? tPLTypography.getValue().b.k() : null);
                n = c0064a.n(f.R());
                try {
                    c0064a.i(k48.a(cj6.books_interest_great_book, booksInterest.g(), new Object[]{Integer.valueOf(booksInterest.g())}, h, 512));
                    c0064a.k(n);
                    h.R();
                    n = c0064a.n(tPLTypography.getValue().R());
                    try {
                        c0064a.i(" ");
                        c0064a.k(n);
                        h.z(-1408011777);
                        n = c0064a.n(tPLTypography.getValue().R());
                        try {
                            c0064a.i(k48.b(yk6.books_interest_add_more, h, 0));
                            c0064a.k(n);
                            h.R();
                            androidx.compose.ui.text.a o2 = c0064a.o();
                            h.R();
                            SpacerKt.a(SizeKt.i(aVar2, bu1.g(40)), h, 6);
                            float f3 = 20;
                            TextKt.d(o2, PaddingKt.k(aVar2, bu1.g(f3), 0.0f, 2, null), eb5.Companion.b(h, 8).g(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tPLTypography.getValue(), h, 48, 0, 131064);
                            SpacerKt.a(SizeKt.i(aVar2, bu1.g(10)), h, 6);
                            Modifier k = PaddingKt.k(aVar2, bu1.g(f3), 0.0f, 2, null);
                            int i4 = i2 >> 3;
                            a(booksInterest, gt2Var, i, componentActivity, k, h, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 28680 | (i4 & 896), 0);
                            h.R();
                            h.t();
                            h.R();
                            h.R();
                            if (b.G()) {
                                b.R();
                            }
                            cc7 k2 = h.k();
                            if (k2 != null) {
                                final Modifier modifier3 = modifier2;
                                k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.books.BooksInterestKt$SavesContent$2
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
                                        BooksInterestKt.d(list, booksInterest, gt2Var, i, componentActivity, modifier3, composer2, gt6.a(i2 | 1), i3);
                                    }
                                });
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final y25 g(Interest.Book book, int i) {
        zq3.h(book, "<this>");
        String a = book.a();
        InterestType interestType = InterestType.COLUMN;
        return new y25(a, interestType.getType(), book.a(), interestType.getType(), interestType.getType(), true, false, null, null, NavigationSource.YOU_TAB_BOOKS, null, String.valueOf(i), "you tab", "interests-hub", book.d() + "-book", null, null, null, null, 426240, null);
    }

    public static final y25 h(InterestAsset interestAsset, int i) {
        zq3.h(interestAsset, "<this>");
        String k = interestAsset.k();
        InterestType interestType = InterestType.COLUMN;
        String type2 = interestType.getType();
        String j = interestAsset.j();
        String type3 = interestType.getType();
        String type4 = interestType.getType();
        boolean m = interestAsset.m(interestAsset);
        NavigationSource navigationSource = NavigationSource.YOU_TAB_BOOKS;
        String valueOf = String.valueOf(i);
        String str = (String) Interest.BooksInterest.Companion.a().get(interestAsset.j());
        return new y25(k, type2, j, type3, type4, m, false, null, null, navigationSource, null, valueOf, "you tab", "interests-hub", str == null ? interestAsset.h() : str, null, null, null, null, 426240, null);
    }
}
