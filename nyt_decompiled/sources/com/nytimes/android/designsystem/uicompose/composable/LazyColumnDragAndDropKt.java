package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.ap0;
import defpackage.bd8;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sm9;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class LazyColumnDragAndDropKt {
    public static final void a(final h04 h04Var, final DragDropState dragDropState, final int i, Modifier modifier, final kt2 kt2Var, Composer composer, final int i2, final int i3) {
        Modifier a;
        zq3.h(h04Var, "<this>");
        zq3.h(dragDropState, "dragDropState");
        zq3.h(kt2Var, "content");
        Composer h = composer.h(-305948106);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-305948106, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.DraggableItem (LazyColumnDragAndDrop.kt:210)");
        }
        Integer e = dragDropState.e();
        boolean z = e != null && i == e.intValue();
        if (z) {
            a = androidx.compose.ui.graphics.b.a(sm9.a(Modifier.a, 1.0f), new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$DraggableItem$draggingModifier$1
                {
                    super(1);
                }

                public final void b(c cVar) {
                    zq3.h(cVar, "$this$graphicsLayer");
                    cVar.g(DragDropState.this.h());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((c) obj);
                    return ww8.a;
                }
            });
        } else {
            Integer j = dragDropState.j();
            a = (j != null && i == j.intValue()) ? androidx.compose.ui.graphics.b.a(sm9.a(Modifier.a, 1.0f), new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$DraggableItem$draggingModifier$2
                {
                    super(1);
                }

                public final void b(c cVar) {
                    zq3.h(cVar, "$this$graphicsLayer");
                    cVar.g(((Number) DragDropState.this.k().m()).floatValue());
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((c) obj);
                    return ww8.a;
                }
            }) : h04.f(h04Var, Modifier.a, null, 1, null);
        }
        Modifier h2 = modifier2.h(a);
        h.z(-483455358);
        rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, a2, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        kt2Var.invoke(ap0.a, Boolean.valueOf(z), h, Integer.valueOf(((i2 >> 6) & 896) | 6));
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
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt$DraggableItem$2
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
                    LazyColumnDragAndDropKt.a(h04.this, dragDropState, i, modifier3, kt2Var, composer2, gt6.a(i2 | 1), i3);
                }
            });
        }
    }

    public static final Modifier b(Modifier modifier, DragDropState dragDropState) {
        zq3.h(modifier, "<this>");
        zq3.h(dragDropState, "dragDropState");
        return bd8.c(modifier, dragDropState, new LazyColumnDragAndDropKt$dragContainer$1(dragDropState, null));
    }

    public static final DragDropState c(LazyListState lazyListState, boolean z, int i, int i2, gt2 gt2Var, Composer composer, int i3) {
        zq3.h(lazyListState, "lazyListState");
        zq3.h(gt2Var, "onMove");
        composer.z(-1980635553);
        if (b.G()) {
            b.S(-1980635553, i3, -1, "com.nytimes.android.designsystem.uicompose.composable.rememberDragDropState (LazyColumnDragAndDrop.kt:42)");
        }
        composer.z(773894976);
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, composer));
            composer.q(eVar);
            A = eVar;
        }
        composer.R();
        CoroutineScope a = ((e) A).a();
        composer.R();
        composer.z(-1679356326);
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && composer.S(lazyListState)) || (i3 & 6) == 4) | ((((i3 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && composer.a(z)) || (i3 & 48) == 32);
        Object A2 = composer.A();
        if (z2 || A2 == aVar.a()) {
            A2 = new DragDropState(z, lazyListState, i, i2, a, gt2Var);
            composer.q(A2);
        }
        DragDropState dragDropState = (DragDropState) A2;
        composer.R();
        py1.d(dragDropState, new LazyColumnDragAndDropKt$rememberDragDropState$1(dragDropState, lazyListState, null), composer, 72);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return dragDropState;
    }
}
