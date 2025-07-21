package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.ek8;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.iv0;
import defpackage.ju7;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zo0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
public abstract class AlertDialogKt {
    private static final Modifier a;
    private static final Modifier b;
    private static final long c;
    private static final long d;
    private static final long e;

    static {
        Modifier.a aVar = Modifier.a;
        float f = 24;
        a = PaddingKt.m(aVar, bu1.g(f), 0.0f, bu1.g(f), 0.0f, 10, null);
        b = PaddingKt.m(aVar, bu1.g(f), 0.0f, bu1.g(f), bu1.g(28), 2, null);
        c = ek8.g(40);
        d = ek8.g(36);
        e = ek8.g(38);
    }

    public static final void a(final zo0 zo0Var, final gt2 gt2Var, final gt2 gt2Var2, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-555573207);
        if ((i & 14) == 0) {
            i2 = (h.S(zo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(gt2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-555573207, i2, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:97)");
            }
            Modifier a2 = zo0Var.a(Modifier.a, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new rg4() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
                @Override // defpackage.rg4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final defpackage.sg4 d(androidx.compose.ui.layout.f r17, java.util.List r18, long r19) {
                    /*
                        Method dump skipped, instructions count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.d(androidx.compose.ui.layout.f, java.util.List, long):sg4");
                }
            };
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c2 = LayoutKt.c(a2);
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
            Updater.c(a5, alertDialogKt$AlertDialogBaselineLayout$2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(-1160646114);
            if (gt2Var != null) {
                Modifier b3 = androidx.compose.ui.layout.b.b(a, "title");
                Alignment.a aVar = Alignment.a;
                Modifier c3 = zo0Var.c(b3, aVar.k());
                h.z(733328855);
                rg4 g = BoxKt.g(aVar.o(), false, h, 0);
                h.z(-1323940314);
                int a6 = cs0.a(h, 0);
                et0 o2 = h.o();
                qs2 a7 = companion.a();
                it2 c4 = LayoutKt.c(c3);
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
                gt2 b4 = companion.b();
                if (a8.f() || !zq3.c(a8.A(), Integer.valueOf(a6))) {
                    a8.q(Integer.valueOf(a6));
                    a8.v(Integer.valueOf(a6), b4);
                }
                c4.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var.invoke(h, 0);
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.z(-1735756505);
            if (gt2Var2 != null) {
                Modifier b5 = androidx.compose.ui.layout.b.b(b, "text");
                Alignment.a aVar2 = Alignment.a;
                Modifier c5 = zo0Var.c(b5, aVar2.k());
                h.z(733328855);
                rg4 g2 = BoxKt.g(aVar2.o(), false, h, 0);
                h.z(-1323940314);
                int a9 = cs0.a(h, 0);
                et0 o3 = h.o();
                qs2 a10 = companion.a();
                it2 c6 = LayoutKt.c(c5);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a10);
                } else {
                    h.p();
                }
                Composer a11 = Updater.a(h);
                Updater.c(a11, g2, companion.e());
                Updater.c(a11, o3, companion.g());
                gt2 b6 = companion.b();
                if (a11.f() || !zq3.c(a11.A(), Integer.valueOf(a9))) {
                    a11.q(Integer.valueOf(a9));
                    a11.v(Integer.valueOf(a9), b6);
                }
                c6.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                gt2Var2.invoke(h, 0);
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.R();
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
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
                    AlertDialogKt.a(zo0.this, gt2Var, gt2Var2, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.gt2 r25, androidx.compose.ui.Modifier r26, defpackage.gt2 r27, defpackage.gt2 r28, defpackage.no7 r29, long r30, long r32, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.b(gt2, androidx.compose.ui.Modifier, gt2, gt2, no7, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final float f, final float f2, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(73434452);
        if ((i & 14) == 0) {
            i2 = (h.b(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.b(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(73434452, i2, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:193)");
            }
            h.z(941722866);
            boolean b2 = h.b(f) | h.b(f2);
            Object A = h.A();
            if (b2 || A == Composer.a.a()) {
                A = new rg4() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
                    private static final boolean j(List list, Ref$IntRef ref$IntRef, androidx.compose.ui.layout.f fVar, float f3, long j, androidx.compose.ui.layout.l lVar) {
                        return list.isEmpty() || (ref$IntRef.element + fVar.l0(f3)) + lVar.F0() <= fv0.n(j);
                    }

                    private static final void k(List list, Ref$IntRef ref$IntRef, androidx.compose.ui.layout.f fVar, float f3, List list2, List list3, Ref$IntRef ref$IntRef2, List list4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
                        if (!list.isEmpty()) {
                            ref$IntRef.element += fVar.l0(f3);
                        }
                        list.add(0, kotlin.collections.i.X0(list2));
                        list3.add(Integer.valueOf(ref$IntRef2.element));
                        list4.add(Integer.valueOf(ref$IntRef.element));
                        ref$IntRef.element += ref$IntRef2.element;
                        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
                        list2.clear();
                        ref$IntRef4.element = 0;
                        ref$IntRef2.element = 0;
                    }

                    @Override // defpackage.rg4
                    public final sg4 d(final androidx.compose.ui.layout.f fVar, List list, long j) {
                        AlertDialogKt$AlertDialogFlowRow$1$1 alertDialogKt$AlertDialogFlowRow$1$1;
                        Ref$IntRef ref$IntRef;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        Ref$IntRef ref$IntRef2;
                        Ref$IntRef ref$IntRef3;
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        final ArrayList arrayList5 = new ArrayList();
                        Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef5 = new Ref$IntRef();
                        ArrayList arrayList6 = new ArrayList();
                        Ref$IntRef ref$IntRef6 = new Ref$IntRef();
                        Ref$IntRef ref$IntRef7 = new Ref$IntRef();
                        long b3 = iv0.b(0, fv0.n(j), 0, 0, 13, null);
                        float f3 = f;
                        float f4 = f2;
                        int size = list.size();
                        int i3 = 0;
                        while (i3 < size) {
                            androidx.compose.ui.layout.l W = ((qg4) list.get(i3)).W(b3);
                            int i4 = i3;
                            int i5 = size;
                            float f5 = f4;
                            long j2 = b3;
                            float f6 = f3;
                            if (j(arrayList6, ref$IntRef6, fVar, f3, j, W)) {
                                ref$IntRef = ref$IntRef6;
                                arrayList = arrayList6;
                                arrayList2 = arrayList4;
                                ref$IntRef2 = ref$IntRef7;
                            } else {
                                arrayList2 = arrayList4;
                                ref$IntRef2 = ref$IntRef7;
                                ref$IntRef = ref$IntRef6;
                                arrayList = arrayList6;
                                k(arrayList3, ref$IntRef5, fVar, f5, arrayList6, arrayList4, ref$IntRef7, arrayList5, ref$IntRef4, ref$IntRef);
                            }
                            if (arrayList.isEmpty()) {
                                ref$IntRef3 = ref$IntRef;
                            } else {
                                ref$IntRef3 = ref$IntRef;
                                ref$IntRef3.element += fVar.l0(f6);
                            }
                            ArrayList arrayList7 = arrayList;
                            arrayList7.add(W);
                            ref$IntRef3.element += W.F0();
                            ref$IntRef2.element = Math.max(ref$IntRef2.element, W.v0());
                            i3 = i4 + 1;
                            f3 = f6;
                            ref$IntRef6 = ref$IntRef3;
                            ref$IntRef7 = ref$IntRef2;
                            size = i5;
                            f4 = f5;
                            arrayList4 = arrayList2;
                            arrayList6 = arrayList7;
                            b3 = j2;
                        }
                        ArrayList arrayList8 = arrayList6;
                        ArrayList arrayList9 = arrayList4;
                        Ref$IntRef ref$IntRef8 = ref$IntRef7;
                        Ref$IntRef ref$IntRef9 = ref$IntRef6;
                        if (arrayList8.isEmpty()) {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                        } else {
                            alertDialogKt$AlertDialogFlowRow$1$1 = this;
                            k(arrayList3, ref$IntRef5, fVar, f2, arrayList8, arrayList9, ref$IntRef8, arrayList5, ref$IntRef4, ref$IntRef9);
                        }
                        final int n = fv0.n(j) != Integer.MAX_VALUE ? fv0.n(j) : Math.max(ref$IntRef4.element, fv0.p(j));
                        int max = Math.max(ref$IntRef5.element, fv0.o(j));
                        final float f7 = f;
                        return androidx.compose.ui.layout.f.J(fVar, n, max, null, new ss2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(l.a aVar) {
                                List<List<androidx.compose.ui.layout.l>> list2 = arrayList3;
                                androidx.compose.ui.layout.f fVar2 = fVar;
                                float f8 = f7;
                                int i6 = n;
                                List<Integer> list3 = arrayList5;
                                int size2 = list2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    List<androidx.compose.ui.layout.l> list4 = list2.get(i7);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i8 = 0;
                                    while (i8 < size3) {
                                        iArr[i8] = list4.get(i8).F0() + (i8 < kotlin.collections.i.n(list4) ? fVar2.l0(f8) : 0);
                                        i8++;
                                    }
                                    Arrangement.m a2 = Arrangement.a.a();
                                    int[] iArr2 = new int[size3];
                                    for (int i9 = 0; i9 < size3; i9++) {
                                        iArr2[i9] = 0;
                                    }
                                    a2.c(fVar2, i6, iArr, iArr2);
                                    int size4 = list4.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        l.a.f(aVar, list4.get(i10), iArr2[i10], list3.get(i7).intValue(), 0.0f, 4, null);
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
                h.q(A);
            }
            rg4 rg4Var = (rg4) A;
            h.R();
            int i3 = (i2 >> 6) & 14;
            h.z(-1323940314);
            Modifier.a aVar = Modifier.a;
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(aVar);
            int i4 = ((i3 << 9) & 7168) | 6;
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
            Updater.c(a4, rg4Var, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b3 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b3);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            gt2Var.invoke(h, Integer.valueOf((i4 >> 9) & 14));
            h.R();
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                    AlertDialogKt.c(f, f2, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
