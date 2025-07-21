package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
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
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SimpleLayoutKt {
    public static final void a(final Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-2105228848);
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
                androidx.compose.runtime.b.S(-2105228848, i3, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:31)");
            }
            SimpleLayoutKt$SimpleLayout$1 simpleLayoutKt$SimpleLayout$1 = new rg4() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1
                @Override // defpackage.rg4
                public final sg4 d(androidx.compose.ui.layout.f fVar, List list, long j) {
                    final ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    Integer num = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        arrayList.add(((qg4) list.get(i5)).W(j));
                    }
                    int size2 = arrayList.size();
                    Integer num2 = num;
                    for (int i6 = 0; i6 < size2; i6++) {
                        num2 = Integer.valueOf(Math.max(num2.intValue(), ((l) arrayList.get(i6)).F0()));
                    }
                    int intValue = num2.intValue();
                    int size3 = arrayList.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        num = Integer.valueOf(Math.max(num.intValue(), ((l) arrayList.get(i7)).v0()));
                    }
                    return androidx.compose.ui.layout.f.J(fVar, intValue, num.intValue(), null, new ss2() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar) {
                            List<l> list2 = arrayList;
                            int size4 = list2.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                l.a.f(aVar, list2.get(i8), 0, 0, 0.0f, 4, null);
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
            Updater.c(a3, simpleLayoutKt$SimpleLayout$1, companion.e());
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
            k.a(new gt2() { // from class: androidx.compose.foundation.text.selection.SimpleLayoutKt$SimpleLayout$2
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
                    SimpleLayoutKt.a(Modifier.this, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
