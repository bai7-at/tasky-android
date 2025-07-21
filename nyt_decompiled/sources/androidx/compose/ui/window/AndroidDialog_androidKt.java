package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.qs2 r19, defpackage.eq1 r20, final defpackage.gt2 r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.a(qs2, eq1, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 b(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new rg4() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v15 */
                /* JADX WARN: Type inference failed for: r12v17 */
                /* JADX WARN: Type inference failed for: r12v18 */
                /* JADX WARN: Type inference failed for: r12v23 */
                @Override // defpackage.rg4
                public final sg4 d(f fVar, List list, long j) {
                    Object obj;
                    final ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(((qg4) list.get(i5)).W(j));
                    }
                    l lVar = null;
                    int i6 = 1;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList.get(0);
                        int F0 = ((l) obj).F0();
                        int n = i.n(arrayList);
                        if (1 <= n) {
                            int i7 = 1;
                            while (true) {
                                Object obj2 = arrayList.get(i7);
                                int F02 = ((l) obj2).F0();
                                if (F0 < F02) {
                                    obj = obj2;
                                    F0 = F02;
                                }
                                if (i7 == n) {
                                    break;
                                }
                                i7++;
                            }
                        }
                    }
                    l lVar2 = (l) obj;
                    int F03 = lVar2 != null ? lVar2.F0() : fv0.p(j);
                    if (!arrayList.isEmpty()) {
                        ?? r12 = arrayList.get(0);
                        int v0 = ((l) r12).v0();
                        int n2 = i.n(arrayList);
                        boolean z = r12;
                        if (1 <= n2) {
                            while (true) {
                                Object obj3 = arrayList.get(i6);
                                int v02 = ((l) obj3).v0();
                                r12 = z;
                                if (v0 < v02) {
                                    r12 = obj3;
                                    v0 = v02;
                                }
                                if (i6 == n2) {
                                    break;
                                }
                                i6++;
                                z = r12;
                            }
                        }
                        lVar = r12;
                    }
                    l lVar3 = lVar;
                    return f.J(fVar, F03, lVar3 != null ? lVar3.v0() : fv0.o(j), null, new ss2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar) {
                            List<l> list2 = arrayList;
                            int size2 = list2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                l.a.j(aVar, list2.get(i8), 0, 0, 0.0f, 4, null);
                            }
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                            b((l.a) obj4);
                            return ww8.a;
                        }
                    }, 4, null);
                }
            };
            int i5 = ((i3 >> 3) & 14) | 384 | ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND);
            h.z(-1323940314);
            int a = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a2 = companion.a();
            it2 c = LayoutKt.c(modifier);
            int i6 = ((i5 << 9) & 7168) | 6;
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a2);
            } else {
                h.p();
            }
            Composer a3 = Updater.a(h);
            Updater.c(a3, androidDialog_androidKt$DialogLayout$1, companion.e());
            Updater.c(a3, o, companion.g());
            gt2 b = companion.b();
            if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
                a3.q(Integer.valueOf(a));
                a3.v(Integer.valueOf(a), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            gt2Var.invoke(h, Integer.valueOf((i6 >> 9) & 14));
            h.R();
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    AndroidDialog_androidKt.c(Modifier.this, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
