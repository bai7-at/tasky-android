package com.nytimes.android.features.you.youtab.composable.interests;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.BottomSheetKt;
import com.nytimes.android.interests.InterestPreview;
import com.nytimes.android.interests.InterestType;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cj6;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.f35;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.yk6;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class AddInterestsContentKt {
    public static final void a(final List list, final CoroutineScope coroutineScope, final qs2 qs2Var, final ss2 ss2Var, final SheetState sheetState, final qs2 qs2Var2, final gt2 gt2Var, final gt2 gt2Var2, final qs2 qs2Var3, Modifier modifier, Composer composer, final int i, final int i2) {
        String a;
        zq3.h(list, "list");
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "onDismiss");
        zq3.h(ss2Var, "addInterests");
        zq3.h(sheetState, "sheetState");
        zq3.h(qs2Var2, "sendAddInterestImpression");
        zq3.h(gt2Var, "sendSelectInterestMenuTap");
        zq3.h(gt2Var2, "sendDeSelectInterestMenuTap");
        zq3.h(qs2Var3, "sendOnDismissAddInterestInteraction");
        Composer h = composer.h(-1447734510);
        Modifier modifier2 = (i2 & 512) != 0 ? Modifier.a : modifier;
        if (b.G()) {
            b.S(-1447734510, i, -1, "com.nytimes.android.features.you.youtab.composable.interests.AddInterestContent (AddInterestsContent.kt:49)");
        }
        LazyListState c = LazyListStateKt.c(0, 0, h, 0, 3);
        h.z(-1185361773);
        Object A = h.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = y.f();
            h.q(A);
        }
        final SnapshotStateList snapshotStateList = (SnapshotStateList) A;
        h.R();
        ww8 ww8Var = ww8.a;
        h.z(-1185361689);
        boolean z = (((458752 & i) ^ 196608) > 131072 && h.S(qs2Var2)) || (i & 196608) == 131072;
        Object A2 = h.A();
        if (z || A2 == aVar.a()) {
            A2 = new AddInterestsContentKt$AddInterestContent$1$1(qs2Var2, null);
            h.q(A2);
        }
        h.R();
        py1.d(ww8Var, (gt2) A2, h, 70);
        Alignment.a aVar2 = Alignment.a;
        Alignment.b k = aVar2.k();
        Modifier c2 = SizeKt.c(BackgroundKt.d(modifier2, eb5.Companion.a(h, 8).d(), null, 2, null), 0.9f);
        h.z(-483455358);
        rg4 a2 = d.a(Arrangement.a.g(), k, h, 48);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c3 = LayoutKt.c(c2);
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
        c3.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        BottomSheetKt.b(qs2Var, null, qs2Var3, h, ((i >> 6) & 14) | ((i >> 18) & 896), 2);
        Modifier.a aVar3 = Modifier.a;
        Modifier f = SizeKt.f(aVar3, 0.0f, 1, null);
        h.z(733328855);
        rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a6 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a7 = companion.a();
        it2 c4 = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a7);
        } else {
            h.p();
        }
        Composer a8 = Updater.a(h);
        Updater.c(a8, g, companion.e());
        Updater.c(a8, o2, companion.g());
        gt2 b2 = companion.b();
        if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
            a8.q(Integer.valueOf(a6));
            a8.v(Integer.valueOf(a6), b2);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        LazyDslKt.a(PaddingKt.k(PaddingKt.m(boxScopeInstance.c(a.b(aVar3, f35.h(null, h, 0, 1), null, 2, null), aVar2.m()), 0.0f, 0.0f, 0.0f, bu1.g(118), 7, null), bu1.g(20), 0.0f, 2, null), c, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1
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
                zq3.h(lazyListScope, "$this$LazyColumn");
                ComposableSingletons$AddInterestsContentKt composableSingletons$AddInterestsContentKt = ComposableSingletons$AddInterestsContentKt.a;
                LazyListScope.d(lazyListScope, null, null, composableSingletons$AddInterestsContentKt.a(), 3, null);
                final List<InterestPreview> list2 = list;
                final SnapshotStateList snapshotStateList2 = snapshotStateList;
                final gt2 gt2Var3 = gt2Var2;
                final gt2 gt2Var4 = gt2Var;
                final AddInterestsContentKt$AddInterestContent$2$1$1$invoke$$inlined$items$default$1 addInterestsContentKt$AddInterestContent$2$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1$invoke$$inlined$items$default$1
                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(Object obj) {
                        return null;
                    }
                };
                lazyListScope.b(list2.size(), null, new ss2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        return ss2.this.invoke(list2.get(i3));
                    }
                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1$invoke$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i3, Composer composer2, int i4) {
                        int i5;
                        if ((i4 & 14) == 0) {
                            i5 = (composer2.S(h04Var) ? 4 : 2) | i4;
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
                            b.S(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        final InterestPreview interestPreview = (InterestPreview) list2.get(i3);
                        if (InterestType.Companion.a(interestPreview.f()) != InterestType.UNKNOWN) {
                            int size = snapshotStateList2.size();
                            composer2.z(-261966773);
                            boolean d = composer2.d(size);
                            Object A3 = composer2.A();
                            if (d || A3 == Composer.a.a()) {
                                final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                A3 = y.d(new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1$1$isSelected$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public final Boolean mo865invoke() {
                                        return Boolean.valueOf(SnapshotStateList.this.contains(interestPreview));
                                    }
                                });
                                composer2.q(A3);
                            }
                            final x08 x08Var = (x08) A3;
                            composer2.R();
                            boolean booleanValue = ((Boolean) x08Var.getValue()).booleanValue();
                            final gt2 gt2Var5 = gt2Var3;
                            final SnapshotStateList snapshotStateList4 = snapshotStateList2;
                            final gt2 gt2Var6 = gt2Var4;
                            CommonComponentsKt.b(interestPreview, booleanValue, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m475invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m475invoke() {
                                    if (((Boolean) x08.this.getValue()).booleanValue()) {
                                        gt2 gt2Var7 = gt2Var5;
                                        Integer valueOf = Integer.valueOf(interestPreview.b());
                                        String e = interestPreview.e();
                                        gt2Var7.invoke(valueOf, e != null ? e : "");
                                        snapshotStateList4.remove(interestPreview);
                                        return;
                                    }
                                    gt2 gt2Var8 = gt2Var6;
                                    Integer valueOf2 = Integer.valueOf(interestPreview.b());
                                    String e2 = interestPreview.e();
                                    gt2Var8.invoke(valueOf2, e2 != null ? e2 : "");
                                    snapshotStateList4.add(interestPreview);
                                }
                            }, null, composer2, 8, 8);
                            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(12)), composer2, 6);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                LazyListScope.d(lazyListScope, null, null, composableSingletons$AddInterestsContentKt.b(), 3, null);
            }
        }, h, 0, 252);
        if (snapshotStateList.isEmpty()) {
            h.z(-565568402);
            a = k48.b(yk6.add_0_interests, h, 0);
            h.R();
        } else {
            h.z(-565568311);
            a = k48.a(cj6.add_interests, snapshotStateList.size(), new Object[]{Integer.valueOf(snapshotStateList.size())}, h, 512);
            h.R();
        }
        CommonComponentsKt.a(a, new qs2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$2

            @fc1(c = "com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$2$1", f = "AddInterestsContent.kt", l = {124}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$2$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ qs2 $onDismiss;
                final /* synthetic */ SheetState $sheetState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SheetState sheetState, qs2 qs2Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$sheetState = sheetState;
                    this.$onDismiss = qs2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$sheetState, this.$onDismiss, by0Var);
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
                    this.$onDismiss.mo865invoke();
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
                m476invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m476invoke() {
                ss2.this.invoke(snapshotStateList.u());
                snapshotStateList.clear();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetState, qs2Var, null), 3, null);
            }
        }, boxScopeInstance.c(aVar3, aVar2.b()), !snapshotStateList.isEmpty(), h, 0, 0);
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
            k2.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.composable.interests.AddInterestsContentKt$AddInterestContent$3
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
                    AddInterestsContentKt.a(list, coroutineScope, qs2Var, ss2Var, sheetState, qs2Var2, gt2Var, gt2Var2, qs2Var3, modifier3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
