package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.c;
import defpackage.by0;
import defpackage.cc7;
import defpackage.d44;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.u87;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class DialogHostKt {
    public static final void a(final c cVar, Composer composer, final int i) {
        Composer h = composer.h(294589392);
        int i2 = (i & 14) == 0 ? (h.S(cVar) ? 4 : 2) | i : i;
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(294589392, i2, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            final u87 a = SaveableStateHolderKt.a(h, 0);
            by0 by0Var = null;
            boolean z = true;
            x08 b = y.b(cVar.n(), null, h, 8, 1);
            SnapshotStateList<NavBackStackEntry> f = f(b(b), h, 8);
            d(f, b(b), h, 64);
            x08 b2 = y.b(cVar.o(), null, h, 8, 1);
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = y.f();
                h.q(A);
            }
            h.R();
            SnapshotStateList snapshotStateList = (SnapshotStateList) A;
            h.z(875188318);
            for (final NavBackStackEntry navBackStackEntry : f) {
                NavDestination e = navBackStackEntry.e();
                zq3.f(e, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final c.b bVar = (c.b) e;
                final SnapshotStateList snapshotStateList2 = snapshotStateList;
                AndroidDialog_androidKt.a(new qs2() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m120invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m120invoke() {
                        c.this.m(navBackStackEntry);
                    }
                }, bVar.I(), zr0.b(h, 1129586364, z, new gt2() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
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
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1129586364, i3, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
                        }
                        final NavBackStackEntry navBackStackEntry2 = NavBackStackEntry.this;
                        final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                        final c cVar2 = cVar;
                        py1.a(navBackStackEntry2, new ss2() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.1

                            /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$a */
                            public static final class a implements ms1 {
                                final /* synthetic */ c a;
                                final /* synthetic */ NavBackStackEntry b;
                                final /* synthetic */ SnapshotStateList c;

                                public a(c cVar, NavBackStackEntry navBackStackEntry, SnapshotStateList snapshotStateList) {
                                    this.a = cVar;
                                    this.b = navBackStackEntry;
                                    this.c = snapshotStateList;
                                }

                                @Override // defpackage.ms1
                                public void dispose() {
                                    this.a.p(this.b);
                                    this.c.remove(this.b);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            /* renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final ms1 invoke(ns1 ns1Var) {
                                SnapshotStateList.this.add(navBackStackEntry2);
                                return new a(cVar2, navBackStackEntry2, SnapshotStateList.this);
                            }
                        }, composer2, 8);
                        final NavBackStackEntry navBackStackEntry3 = NavBackStackEntry.this;
                        u87 u87Var = a;
                        final c.b bVar2 = bVar;
                        NavBackStackEntryProviderKt.a(navBackStackEntry3, u87Var, zr0.b(composer2, -497631156, true, new gt2() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-497631156, i4, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                                }
                                c.b.this.H().invoke(navBackStackEntry3, composer3, 8);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        }), composer2, 456);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), h, 384, 0);
                b2 = b2;
                by0Var = null;
                snapshotStateList = snapshotStateList;
                z = z;
            }
            SnapshotStateList snapshotStateList3 = snapshotStateList;
            x08 x08Var = b2;
            by0 by0Var2 = by0Var;
            h.R();
            Set c = c(x08Var);
            h.z(1618982084);
            boolean S = h.S(x08Var) | h.S(cVar) | h.S(snapshotStateList3);
            Object A2 = h.A();
            if (S || A2 == Composer.a.a()) {
                A2 = new DialogHostKt$DialogHost$2$1(x08Var, cVar, snapshotStateList3, by0Var2);
                h.q(A2);
            }
            h.R();
            py1.e(c, snapshotStateList3, (gt2) A2, h, 568);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$3
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
                DialogHostKt.a(c.this, composer2, gt6.a(i | 1));
            }
        });
    }

    private static final List b(x08 x08Var) {
        return (List) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set c(x08 x08Var) {
        return (Set) x08Var.getValue();
    }

    public static final void d(final List list, final Collection collection, Composer composer, final int i) {
        Composer h = composer.h(1537894851);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1537894851, i, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:86)");
        }
        final boolean booleanValue = ((Boolean) h.m(InspectionModeKt.a())).booleanValue();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it2.next();
            py1.a(navBackStackEntry.getLifecycle(), new ss2() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1

                public static final class a implements ms1 {
                    final /* synthetic */ NavBackStackEntry a;
                    final /* synthetic */ g b;

                    public a(NavBackStackEntry navBackStackEntry, g gVar) {
                        this.a = navBackStackEntry;
                        this.b = gVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.getLifecycle().d(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    final boolean z = booleanValue;
                    final List<NavBackStackEntry> list2 = list;
                    final NavBackStackEntry navBackStackEntry2 = NavBackStackEntry.this;
                    g gVar = new g() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$observer$1
                        @Override // androidx.lifecycle.g
                        public final void h(d44 d44Var, Lifecycle.Event event) {
                            if (z && !list2.contains(navBackStackEntry2)) {
                                list2.add(navBackStackEntry2);
                            }
                            if (event == Lifecycle.Event.ON_START && !list2.contains(navBackStackEntry2)) {
                                list2.add(navBackStackEntry2);
                            }
                            if (event == Lifecycle.Event.ON_STOP) {
                                list2.remove(navBackStackEntry2);
                            }
                        }
                    };
                    NavBackStackEntry.this.getLifecycle().a(gVar);
                    return new a(NavBackStackEntry.this, gVar);
                }
            }, h, 8);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$2
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
                DialogHostKt.d(list, collection, composer2, gt6.a(i | 1));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.a.a()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList f(java.util.Collection r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r0 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r6.z(r0)
            boolean r1 = androidx.compose.runtime.b.G()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            androidx.compose.runtime.b.S(r0, r7, r1, r2)
        L12:
            m76 r7 = androidx.compose.ui.platform.InspectionModeKt.a()
            java.lang.Object r7 = r6.m(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r6.z(r0)
            boolean r0 = r6.S(r5)
            java.lang.Object r1 = r6.A()
            if (r0 != 0) goto L38
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L72
        L38:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.y.f()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L47:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L58
            r3 = 1
            goto L66
        L58:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r3 = r3.b()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
        L66:
            if (r3 == 0) goto L47
            r0.add(r2)
            goto L47
        L6c:
            r1.addAll(r0)
            r6.q(r1)
        L72:
            r6.R()
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.b.G()
            if (r5 == 0) goto L80
            androidx.compose.runtime.b.R()
        L80:
            r6.R()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.f(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }
}
