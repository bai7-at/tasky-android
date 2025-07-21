package com.nytimes.android.features.you.youtab.composable.interests;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.SingletonAsyncImageKt;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.BottomSheetKt;
import com.nytimes.android.designsystem.uicompose.composable.DragDropState;
import com.nytimes.android.designsystem.uicompose.composable.LazyColumnDragAndDropKt;
import com.nytimes.android.interests.InterestType;
import com.nytimes.android.interests.db.a;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d37;
import defpackage.eb5;
import defpackage.ei0;
import defpackage.et0;
import defpackage.ex6;
import defpackage.f35;
import defpackage.fc1;
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
import defpackage.oe3;
import defpackage.py1;
import defpackage.qs2;
import defpackage.re6;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.vg3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zo0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class ReorderInterestContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, androidx.compose.runtime.snapshots.SnapshotStateList] */
    public static final void a(final List list, final qs2 qs2Var, final qs2 qs2Var2, final SheetState sheetState, final CoroutineScope coroutineScope, final ss2 ss2Var, Modifier modifier, final qs2 qs2Var3, Composer composer, final int i, final int i2) {
        zq3.h(list, "interestList");
        zq3.h(qs2Var, "dismiss");
        zq3.h(qs2Var2, "sendReorderingImpression");
        zq3.h(sheetState, "sheetState");
        zq3.h(coroutineScope, "scope");
        zq3.h(ss2Var, "updateList");
        zq3.h(qs2Var3, "sendOnDismissReorderingInteraction");
        Composer h = composer.h(-725542493);
        Modifier modifier2 = (i2 & 64) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-725542493, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContent (ReorderInterestContent.kt:69)");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (InterestType.Companion.a(((a) obj).f()) != InterestType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        ww8 ww8Var = ww8.a;
        h.z(-1618347776);
        boolean z = (((i & 896) ^ 384) > 256 && h.S(qs2Var2)) || (i & 384) == 256;
        Object A = h.A();
        if (z || A == Composer.a.a()) {
            A = new ReorderInterestContentKt$ReorderInterestContent$1$1(qs2Var2, null);
            h.q(A);
        }
        h.R();
        py1.d(ww8Var, (gt2) A, h, 70);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        h.z(-1618347718);
        Object A2 = h.A();
        Object obj2 = A2;
        if (A2 == Composer.a.a()) {
            SnapshotStateList f = y.f();
            f.addAll(arrayList);
            f.add(0, a.Companion.a());
            h.q(f);
            obj2 = f;
        }
        h.R();
        ref$ObjectRef.element = (SnapshotStateList) obj2;
        LazyListState c = LazyListStateKt.c(0, 0, h, 0, 3);
        final DragDropState c2 = LazyColumnDragAndDropKt.c(c, true, 1, ((SnapshotStateList) ref$ObjectRef.element).size(), new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$dragDropState$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T] */
            public final void b(int i3, int i4) {
                Ref$ObjectRef<SnapshotStateList> ref$ObjectRef2 = Ref$ObjectRef.this;
                ?? r0 = ref$ObjectRef2.element;
                SnapshotStateList snapshotStateList = (SnapshotStateList) r0;
                snapshotStateList.add(i4, snapshotStateList.remove(i3));
                ref$ObjectRef2.element = r0;
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                b(((Number) obj3).intValue(), ((Number) obj4).intValue());
                return ww8.a;
            }
        }, h, 432);
        Alignment.a aVar = Alignment.a;
        Alignment.b k = aVar.k();
        Modifier c3 = SizeKt.c(BackgroundKt.d(modifier2, eb5.Companion.a(h, 8).d(), null, 2, null), 0.9f);
        h.z(-483455358);
        rg4 a = d.a(Arrangement.a.g(), k, h, 48);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c4 = LayoutKt.c(c3);
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
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        BottomSheetKt.b(qs2Var, null, qs2Var3, h, ((i >> 3) & 14) | ((i >> 15) & 896), 2);
        Modifier.a aVar2 = Modifier.a;
        Modifier f2 = SizeKt.f(aVar2, 0.0f, 1, null);
        h.z(733328855);
        rg4 g = BoxKt.g(aVar.o(), false, h, 0);
        h.z(-1323940314);
        int a5 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a6 = companion.a();
        it2 c5 = LayoutKt.c(f2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a6);
        } else {
            h.p();
        }
        Composer a7 = Updater.a(h);
        Updater.c(a7, g, companion.e());
        Updater.c(a7, o2, companion.g());
        gt2 b2 = companion.b();
        if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
            a7.q(Integer.valueOf(a5));
            a7.v(Integer.valueOf(a5), b2);
        }
        c5.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        LazyDslKt.a(PaddingKt.m(SizeKt.d(boxScopeInstance.c(androidx.compose.ui.input.nestedscroll.a.b(LazyColumnDragAndDropKt.b(aVar2, c2), f35.h(null, h, 0, 1), null, 2, null), aVar.m()), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bu1.g(118), 7, null), c, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                invoke((LazyListScope) obj3);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                final Ref$ObjectRef<SnapshotStateList> ref$ObjectRef2 = Ref$ObjectRef.this;
                final SnapshotStateList snapshotStateList = ref$ObjectRef2.element;
                final AnonymousClass1 anonymousClass1 = new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1.1
                    public final Object b(int i3, a aVar3) {
                        zq3.h(aVar3, "listItem");
                        return Integer.valueOf(aVar3.hashCode());
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                        return b(((Number) obj3).intValue(), (a) obj4);
                    }
                };
                final DragDropState dragDropState = c2;
                lazyListScope.b(snapshotStateList.size(), anonymousClass1 != null ? new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1$invoke$$inlined$itemsIndexed$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        return invoke(((Number) obj3).intValue());
                    }

                    public final Object invoke(int i3) {
                        return gt2.this.invoke(Integer.valueOf(i3), snapshotStateList.get(i3));
                    }
                } : null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1$invoke$$inlined$itemsIndexed$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        return invoke(((Number) obj3).intValue());
                    }

                    public final Object invoke(int i3) {
                        snapshotStateList.get(i3);
                        return null;
                    }
                }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        invoke((h04) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, final int i3, Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = i4 | (composer2.S(h04Var) ? 4 : 2);
                        } else {
                            i5 = i4;
                        }
                        if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            i5 |= composer2.d(i3) ? 32 : 16;
                        }
                        if ((i5 & 731) == 146 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                        }
                        Object obj3 = snapshotStateList.get(i3);
                        int i6 = i5 & WebSocketProtocol.PAYLOAD_SHORT;
                        final a aVar3 = (a) obj3;
                        if (i3 == 0) {
                            composer2.z(-1144061593);
                            float f3 = 20;
                            TextKt.b(k48.b(yk6.rearrange_interest_title, composer2, 0), PaddingKt.k(PaddingKt.m(Modifier.a, 0.0f, bu1.g(f3), 0.0f, bu1.g(16), 5, null), bu1.g(f3), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, eb5.Companion.c(composer2, 8).r1(), composer2, 48, 0, 65532);
                            composer2.R();
                        } else {
                            composer2.z(-1144061151);
                            DragDropState dragDropState2 = dragDropState;
                            final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                            LazyColumnDragAndDropKt.a(h04Var, dragDropState2, i3, null, zr0.b(composer2, 984901785, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                private static final float c(x08 x08Var) {
                                    return ((bu1) x08Var.getValue()).n();
                                }

                                public final void b(zo0 zo0Var, boolean z2, Composer composer3, int i7) {
                                    zq3.h(zo0Var, "$this$DraggableItem");
                                    if ((i7 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                        i7 |= composer3.a(z2) ? 32 : 16;
                                    }
                                    if ((i7 & 721) == 144 && composer3.i()) {
                                        composer3.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(984901785, i7, -1, "com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderInterestContent.kt:127)");
                                    }
                                    ReorderInterestContentKt.b(aVar3, i3 != ref$ObjectRef3.element.size() - 1, null, c(AnimateAsStateKt.c(bu1.g(z2 ? 4 : 0), null, "elevation", null, composer3, 384, 10)), composer3, 8, 4);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }

                                @Override // defpackage.kt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                    b((zo0) obj4, ((Boolean) obj5).booleanValue(), (Composer) obj6, ((Number) obj7).intValue());
                                    return ww8.a;
                                }
                            }), composer2, (i5 & 14) | 24576 | (DragDropState.m << 3) | ((i6 << 3) & 896), 4);
                            composer2.R();
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                LazyListScope.d(lazyListScope, null, null, ComposableSingletons$ReorderInterestContentKt.a.a(), 3, null);
            }
        }, h, 0, 252);
        CommonComponentsKt.a(k48.b(yk6.rearrange_interest_save_changes, h, 0), new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$2

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$2$1", f = "ReorderInterestContent.kt", l = {149}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$2$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ qs2 $dismiss;
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SheetState sheetState, qs2 qs2Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$sheetState = sheetState;
                    this.$dismiss = qs2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$sheetState, this.$dismiss, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        SheetState sheetState = this.$sheetState;
                        this.label = 1;
                        if (sheetState.k(this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    this.$dismiss.mo865invoke();
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m512invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m512invoke() {
                Ref$ObjectRef.this.element.remove(0);
                ss2Var.invoke(Ref$ObjectRef.this.element);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetState, qs2Var, null), 3, null);
            }
        }, boxScopeInstance.c(aVar2, aVar.b()), false, h, 0, 8);
        h.R();
        h.t();
        h.R();
        h.R();
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
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$ReorderInterestContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                    invoke((Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ReorderInterestContentKt.a(list, qs2Var, qs2Var2, sheetState, coroutineScope, ss2Var, modifier3, qs2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void b(final a aVar, final boolean z, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        zq3.h(aVar, "interest");
        Composer h = composer.h(-1588383372);
        final Modifier modifier2 = (i2 & 4) != 0 ? Modifier.a : modifier;
        final float g = (i2 & 8) != 0 ? bu1.g(0) : f;
        if (b.G()) {
            b.S(-1588383372, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.SmallInterestWithIcon (ReorderInterestContent.kt:164)");
        }
        ei0.a(modifier2, d37.c(bu1.g(0)), 0L, 0L, null, g, zr0.b(h, -2102621545, true, new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$SmallInterestWithIcon$1
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
                if ((i3 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-2102621545, i3, -1, "com.nytimes.android.features.you.youtab.composable.interests.SmallInterestWithIcon.<anonymous> (ReorderInterestContent.kt:170)");
                }
                boolean z2 = z;
                a aVar2 = aVar;
                composer2.z(-483455358);
                Modifier.a aVar3 = Modifier.a;
                Arrangement arrangement = Arrangement.a;
                Arrangement.m g2 = arrangement.g();
                Alignment.a aVar4 = Alignment.a;
                rg4 a = d.a(g2, aVar4.k(), composer2, 0);
                composer2.z(-1323940314);
                int a2 = cs0.a(composer2, 0);
                et0 o = composer2.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(aVar3);
                if (composer2.j() == null) {
                    cs0.c();
                }
                composer2.G();
                if (composer2.f()) {
                    composer2.D(a3);
                } else {
                    composer2.p();
                }
                Composer a4 = Updater.a(composer2);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b);
                }
                c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                ap0 ap0Var = ap0.a;
                float f2 = 12;
                Modifier h2 = SizeKt.h(PaddingKt.k(PaddingKt.m(SizeKt.k(aVar3, bu1.g(64), 0.0f, 2, null), bu1.g(20), 0.0f, bu1.g(18), 0.0f, 10, null), 0.0f, bu1.g(f2), 1, null), 0.0f, 1, null);
                Arrangement.f d = arrangement.d();
                Alignment.c i4 = aVar4.i();
                composer2.z(693286680);
                rg4 a5 = m.a(d, i4, composer2, 54);
                composer2.z(-1323940314);
                int a6 = cs0.a(composer2, 0);
                et0 o2 = composer2.o();
                qs2 a7 = companion.a();
                it2 c2 = LayoutKt.c(h2);
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
                Updater.c(a8, a5, companion.e());
                Updater.c(a8, o2, companion.g());
                gt2 b2 = companion.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b2);
                }
                c2.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                composer2.z(2058660585);
                n37 n37Var = n37.a;
                SingletonAsyncImageKt.a(new vg3.a((Context) composer2.m(AndroidCompositionLocals_androidKt.g())).d(aVar2.h()).g(re6.ic_placeholder).f(re6.ic_placeholder).c(true).a(), null, AspectRatioKt.b(SizeKt.n(aVar3, bu1.g(40)), 1.0f, false, 2, null), null, null, null, ContentScale.a.e(), 0.0f, null, 0, composer2, 1573304, 952);
                String g3 = aVar2.g();
                eb5.a aVar5 = eb5.Companion;
                TextKt.b(g3, PaddingKt.k(m37.b(n37Var, aVar3, 1.0f, false, 2, null), bu1.g(f2), 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, kj8.a.b(), false, 2, 0, null, aVar5.c(composer2, 8).e0(), composer2, 0, 3120, 55292);
                IconKt.a(ex6.a(oe3.a.a()), null, null, aVar5.a(composer2, 8).p(), composer2, 48, 4);
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                composer2.z(970378881);
                if (z2) {
                    DividerKt.a(null, aVar5.a(composer2, 8).U(), bu1.g(1), 0.0f, composer2, 384, 9);
                }
                composer2.R();
                composer2.R();
                composer2.t();
                composer2.R();
                composer2.R();
                if (b.G()) {
                    b.R();
                }
            }
        }), h, ((i >> 6) & 14) | 1572864 | (458752 & (i << 6)), 28);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.ReorderInterestContentKt$SmallInterestWithIcon$2
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
                    ReorderInterestContentKt.b(a.this, z, modifier2, g, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
