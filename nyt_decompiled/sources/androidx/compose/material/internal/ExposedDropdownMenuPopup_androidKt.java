package androidx.compose.material.internal;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cn3;
import defpackage.cs0;
import defpackage.cz3;
import defpackage.dg4;
import defpackage.dj7;
import defpackage.et0;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.lj7;
import defpackage.m76;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.pb;
import defpackage.py1;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xz5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuPopup_androidKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final String mo865invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    public static final void a(qs2 qs2Var, final xz5 xz5Var, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        qs2 qs2Var2;
        int i3;
        String str;
        boolean z;
        final String str2;
        final qs2 qs2Var3;
        Composer h = composer.h(-707851182);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qs2Var2 = qs2Var;
        } else if ((i & 14) == 0) {
            qs2Var2 = qs2Var;
            i3 = (h.C(qs2Var2) ? 4 : 2) | i;
        } else {
            qs2Var2 = qs2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(xz5Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i5 = i3;
        if ((i5 & 731) == 146 && h.i()) {
            h.K();
            qs2Var3 = qs2Var2;
        } else {
            final qs2 qs2Var4 = i4 != 0 ? null : qs2Var2;
            if (b.G()) {
                b.S(-707851182, i5, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:85)");
            }
            View view = (View) h.m(AndroidCompositionLocals_androidKt.k());
            fm1 fm1Var = (fm1) h.m(CompositionLocalsKt.e());
            String str3 = (String) h.m(a);
            final LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            Object systemService = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            c d = cs0.d(h, 0);
            final x08 o = y.o(gt2Var, h, (i5 >> 6) & 14);
            UUID uuid = (UUID) RememberSaveableKt.b(new Object[0], null, null, new qs2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UUID mo865invoke() {
                    return UUID.randomUUID();
                }
            }, h, 3080, 6);
            h.z(1157296644);
            boolean S = h.S(accessibilityManager);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    str = str3;
                    z = false;
                } else {
                    str = str3;
                    z = true;
                }
                str2 = str;
                final PopupLayout popupLayout = new PopupLayout(qs2Var4, str, view, z, fm1Var, xz5Var, uuid);
                popupLayout.n(d, zr0.c(-1115941656, true, new gt2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1115941656, i6, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:108)");
                        }
                        Modifier d2 = dj7.d(Modifier.a, false, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                            public final void b(lj7 lj7Var) {
                                jj7.E(lj7Var);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((lj7) obj);
                                return ww8.a;
                            }
                        }, 1, null);
                        final PopupLayout popupLayout2 = PopupLayout.this;
                        Modifier a2 = pb.a(OnRemeasuredModifierKt.a(d2, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.2
                            {
                                super(1);
                            }

                            public final void b(long j) {
                                PopupLayout.this.m44setPopupContentSizefhxjrPA(hn3.b(j));
                                PopupLayout.this.s();
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b(((hn3) obj).j());
                                return ww8.a;
                            }
                        }), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                        final x08 x08Var = o;
                        yr0 b = zr0.b(composer2, -348416302, true, new gt2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.3
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                gt2 b2;
                                if ((i7 & 11) == 2 && composer3.i()) {
                                    composer3.K();
                                    return;
                                }
                                if (b.G()) {
                                    b.S(-348416302, i7, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:119)");
                                }
                                b2 = ExposedDropdownMenuPopup_androidKt.b(x08.this);
                                b2.invoke(composer3, 0);
                                if (b.G()) {
                                    b.R();
                                }
                            }
                        });
                        composer2.z(-1085885553);
                        ExposedDropdownMenuPopup_androidKt$SimpleStack$1 exposedDropdownMenuPopup_androidKt$SimpleStack$1 = new rg4() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1
                            @Override // defpackage.rg4
                            public final sg4 d(f fVar, List list, long j) {
                                int i7;
                                int i8;
                                int size = list.size();
                                if (size == 0) {
                                    return f.J(fVar, 0, 0, null, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.1
                                        public final void b(l.a aVar) {
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            b((l.a) obj);
                                            return ww8.a;
                                        }
                                    }, 4, null);
                                }
                                int i9 = 0;
                                if (size == 1) {
                                    final l W = ((qg4) list.get(0)).W(j);
                                    return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.2
                                        {
                                            super(1);
                                        }

                                        public final void b(l.a aVar) {
                                            l.a.j(aVar, l.this, 0, 0, 0.0f, 4, null);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            b((l.a) obj);
                                            return ww8.a;
                                        }
                                    }, 4, null);
                                }
                                final ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    arrayList.add(((qg4) list.get(i10)).W(j));
                                }
                                int n = i.n(arrayList);
                                if (n >= 0) {
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        l lVar = (l) arrayList.get(i9);
                                        i11 = Math.max(i11, lVar.F0());
                                        i12 = Math.max(i12, lVar.v0());
                                        if (i9 == n) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    i7 = i11;
                                    i8 = i12;
                                } else {
                                    i7 = 0;
                                    i8 = 0;
                                }
                                return f.J(fVar, i7, i8, null, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public final void b(l.a aVar) {
                                        int n2 = i.n(arrayList);
                                        if (n2 < 0) {
                                            return;
                                        }
                                        int i13 = 0;
                                        while (true) {
                                            l.a.j(aVar, arrayList.get(i13), 0, 0, 0.0f, 4, null);
                                            if (i13 == n2) {
                                                return;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        b((l.a) obj);
                                        return ww8.a;
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.z(-1323940314);
                        int a3 = cs0.a(composer2, 0);
                        et0 o2 = composer2.o();
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a4 = companion.a();
                        it2 c = LayoutKt.c(a2);
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
                        Updater.c(a5, exposedDropdownMenuPopup_androidKt$SimpleStack$1, companion.e());
                        Updater.c(a5, o2, companion.g());
                        gt2 b2 = companion.b();
                        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                            a5.q(Integer.valueOf(a3));
                            a5.v(Integer.valueOf(a3), b2);
                        }
                        c.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        b.invoke(composer2, 6);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (b.G()) {
                            b.R();
                        }
                    }
                }));
                h.q(popupLayout);
                A = popupLayout;
            } else {
                str2 = str3;
            }
            h.R();
            final PopupLayout popupLayout2 = (PopupLayout) A;
            py1.a(popupLayout2, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1

                public static final class a implements ms1 {
                    final /* synthetic */ PopupLayout a;

                    public a(PopupLayout popupLayout) {
                        this.a = popupLayout;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.f();
                        this.a.dismiss();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    PopupLayout.this.p();
                    PopupLayout.this.r(qs2Var4, str2, layoutDirection);
                    return new a(PopupLayout.this);
                }
            }, h, 8);
            py1.h(new qs2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m42invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m42invoke() {
                    PopupLayout.this.r(qs2Var4, str2, layoutDirection);
                }
            }, h, 0);
            py1.a(xz5Var, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3

                public static final class a implements ms1 {
                    @Override // defpackage.ms1
                    public void dispose() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    PopupLayout.this.setPositionProvider(xz5Var);
                    PopupLayout.this.s();
                    return new a();
                }
            }, h, (i5 >> 3) & 14);
            Modifier a2 = h.a(Modifier.a, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5
                {
                    super(1);
                }

                public final void b(cz3 cz3Var) {
                    cz3 Y = cz3Var.Y();
                    zq3.e(Y);
                    long a3 = Y.a();
                    long f = ez3.f(Y);
                    PopupLayout.this.o(cn3.a(wm3.a(dg4.d(fd5.o(f)), dg4.d(fd5.p(f))), a3));
                    PopupLayout.this.s();
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((cz3) obj);
                    return ww8.a;
                }
            });
            rg4 rg4Var = new rg4() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6
                @Override // defpackage.rg4
                public final sg4 d(f fVar, List list, long j) {
                    PopupLayout.this.setParentLayoutDirection(layoutDirection);
                    return f.J(fVar, 0, 0, null, new ss2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6.1
                        public final void b(l.a aVar) {
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                }
            };
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o2 = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c = LayoutKt.c(a2);
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
            Updater.c(a5, rg4Var, companion.e());
            Updater.c(a5, o2, companion.g());
            gt2 b = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.R();
            h.t();
            h.R();
            if (b.G()) {
                b.R();
            }
            qs2Var3 = qs2Var4;
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    ExposedDropdownMenuPopup_androidKt.a(qs2.this, xz5Var, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 b(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }
}
