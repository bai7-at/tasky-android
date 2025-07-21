package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommentsHeaderKt {
    public static final void CommentsHeader(final boolean z, final boolean z2, final CommentTab commentTab, final List<? extends SortingOption> list, final SortingOption sortingOption, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list, "sortingOptions");
        zq3.h(sortingOption, "selectedSortingOption");
        zq3.h(ss2Var, "onSortingOptionChanged");
        Composer h = composer.h(-1528608174);
        if (b.G()) {
            b.S(-1528608174, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsHeader (CommentsHeader.kt:21)");
        }
        boolean hasSorting = commentTab.getHasSorting();
        h.z(-483455358);
        Modifier.a aVar = Modifier.a;
        rg4 a = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(aVar);
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
        if (hasSorting) {
            h.z(1518255722);
            CommentsSortDropDownKt.CommentsSortDropDown(sortingOption, list, ss2Var, h, ((i >> 12) & 14) | 64 | ((i >> 9) & 896));
            h.R();
        } else {
            h.z(1518255964);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(32)), h, 6);
            h.R();
        }
        if (z2) {
            h.z(1518256050);
            if (z) {
                h.z(1518256084);
                CommentsMessageHeaderKt.CommentMessageHeaderCommentAsStaffTitle(h, 0);
                h.R();
            } else {
                h.z(1518256163);
                CommentsMessageHeaderKt.CommentMessageHeaderYourVoice(h, 0);
                h.R();
            }
            h.R();
        } else {
            h.z(1518256238);
            CommentsMessageHeaderKt.CommentMessageHeaderClosedComments(h, 0);
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
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsHeaderKt$CommentsHeader$2
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

                public final void invoke(Composer composer2, int i2) {
                    CommentsHeaderKt.CommentsHeader(z, z2, commentTab, list, sortingOption, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
