package com.nytimes.android.libs.messagingarchitecture.betasettings.composable;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.kt2;
import defpackage.kx6;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import org.burnoutcrew.reorderable.ReorderableState;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MessageQueueScreenKt {
    public static final ComposableSingletons$MessageQueueScreenKt a = new ComposableSingletons$MessageQueueScreenKt();
    public static it2 b = zr0.c(-826454660, false, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1
        public final void b(List list, Composer composer, int i) {
            zq3.h(list, "queue");
            if (b.G()) {
                b.S(-826454660, i, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt.lambda-1.<anonymous> (MessageQueueScreen.kt:77)");
            }
            final ReorderableState a2 = kx6.a(null, composer, 0, 1);
            composer.z(211585828);
            boolean S = composer.S(list);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                A = y.r(list);
                composer.q(A);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) A;
            composer.R();
            NytScaffoldKt.a(null, null, null, 0.0f, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, null, zr0.b(composer, -35836069, true, new it2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(ym5 ym5Var, Composer composer2, int i2) {
                    zq3.h(ym5Var, "it");
                    if ((i2 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-35836069, i2, -1, "com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt.lambda-1.<anonymous>.<anonymous> (MessageQueueScreen.kt:82)");
                    }
                    Modifier i3 = PaddingKt.i(SizeKt.h(Modifier.a, 0.0f, 1, null), bu1.g(8));
                    ReorderableState reorderableState = ReorderableState.this;
                    final SnapshotStateList snapshotStateList2 = snapshotStateList;
                    composer2.z(733328855);
                    rg4 g = BoxKt.g(Alignment.a.o(), false, composer2, 0);
                    composer2.z(-1323940314);
                    int a3 = cs0.a(composer2, 0);
                    et0 o = composer2.o();
                    ComposeUiNode.Companion companion = ComposeUiNode.F;
                    qs2 a4 = companion.a();
                    it2 c = LayoutKt.c(i3);
                    if (composer2.j() == null) {
                        cs0.c();
                    }
                    composer2.G();
                    if (composer2.f()) {
                        composer2.D(a4);
                    } else {
                        composer2.p();
                    }
                    Composer a5 = Updater.a(composer2);
                    Updater.c(a5, g, companion.e());
                    Updater.c(a5, o, companion.g());
                    gt2 b2 = companion.b();
                    if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                        a5.q(Integer.valueOf(a3));
                        a5.v(Integer.valueOf(a3), b2);
                    }
                    c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                    composer2.z(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                    LazyListState b3 = reorderableState.b();
                    composer2.z(-1620533390);
                    boolean S2 = composer2.S(snapshotStateList2);
                    Object A2 = composer2.A();
                    if (S2 || A2 == Composer.a.a()) {
                        A2 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1
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
                                final SnapshotStateList snapshotStateList3 = SnapshotStateList.this;
                                final AnonymousClass1 anonymousClass1 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1.1
                                    @Override // defpackage.ss2
                                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                    public final Object invoke(Message message) {
                                        zq3.h(message, "it");
                                        return message.q();
                                    }
                                };
                                final ComposableSingletons$MessageQueueScreenKt$lambda1$1$1$1$1$1$invoke$$inlined$items$default$1 composableSingletons$MessageQueueScreenKt$lambda1$1$1$1$1$1$invoke$$inlined$items$default$1 = new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1$invoke$$inlined$items$default$1
                                    @Override // defpackage.ss2
                                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                                    public final Void invoke(Object obj) {
                                        return null;
                                    }
                                };
                                lazyListScope.b(snapshotStateList3.size(), anonymousClass1 != null ? new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1$invoke$$inlined$items$default$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Number) obj).intValue());
                                    }

                                    public final Object invoke(int i4) {
                                        return ss2.this.invoke(snapshotStateList3.get(i4));
                                    }
                                } : null, new ss2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1$invoke$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Number) obj).intValue());
                                    }

                                    public final Object invoke(int i4) {
                                        return ss2.this.invoke(snapshotStateList3.get(i4));
                                    }
                                }, zr0.c(-632812321, true, new kt2() { // from class: com.nytimes.android.libs.messagingarchitecture.betasettings.composable.ComposableSingletons$MessageQueueScreenKt$lambda-1$1$1$1$1$1$invoke$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // defpackage.kt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(h04 h04Var, int i4, Composer composer3, int i5) {
                                        int i6;
                                        if ((i5 & 14) == 0) {
                                            i6 = (composer3.S(h04Var) ? 4 : 2) | i5;
                                        } else {
                                            i6 = i5;
                                        }
                                        if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                            i6 |= composer3.d(i4) ? 32 : 16;
                                        }
                                        if ((i6 & 731) == 146 && composer3.i()) {
                                            composer3.K();
                                            return;
                                        }
                                        if (b.G()) {
                                            b.S(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                        }
                                        Message message = (Message) snapshotStateList3.get(i4);
                                        Modifier d = BackgroundKt.d(Modifier.a, eb5.Companion.a(composer3, 8).d(), null, 2, null);
                                        composer3.z(-483455358);
                                        rg4 a6 = d.a(Arrangement.a.g(), Alignment.a.k(), composer3, 0);
                                        composer3.z(-1323940314);
                                        int a7 = cs0.a(composer3, 0);
                                        et0 o2 = composer3.o();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.F;
                                        qs2 a8 = companion2.a();
                                        it2 c2 = LayoutKt.c(d);
                                        if (composer3.j() == null) {
                                            cs0.c();
                                        }
                                        composer3.G();
                                        if (composer3.f()) {
                                            composer3.D(a8);
                                        } else {
                                            composer3.p();
                                        }
                                        Composer a9 = Updater.a(composer3);
                                        Updater.c(a9, a6, companion2.e());
                                        Updater.c(a9, o2, companion2.g());
                                        gt2 b4 = companion2.b();
                                        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
                                            a9.q(Integer.valueOf(a7));
                                            a9.v(Integer.valueOf(a7), b4);
                                        }
                                        c2.invoke(ju7.a(ju7.b(composer3)), composer3, 0);
                                        composer3.z(2058660585);
                                        ap0 ap0Var = ap0.a;
                                        ItemLayoutsKt.d(message, String.valueOf(message.u()), composer3, 8);
                                        composer3.R();
                                        composer3.t();
                                        composer3.R();
                                        composer3.R();
                                        if (b.G()) {
                                            b.R();
                                        }
                                    }
                                }));
                            }
                        };
                        composer2.q(A2);
                    }
                    composer2.R();
                    LazyDslKt.a(null, b3, null, false, null, null, null, false, (ss2) A2, composer2, 0, 253);
                    composer2.R();
                    composer2.t();
                    composer2.R();
                    composer2.R();
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer, 0, 0, 6, 1048575);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((List) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }
    });

    public final it2 a() {
        return b;
    }
}
