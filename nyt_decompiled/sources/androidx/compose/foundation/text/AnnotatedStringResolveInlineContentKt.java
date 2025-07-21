package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a;
import defpackage.cc7;
import defpackage.ck3;
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
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class AnnotatedStringResolveInlineContentKt {
    private static final Pair a = new Pair(i.l(), i.l());

    public static final void a(final androidx.compose.ui.text.a aVar, final List list, Composer composer, final int i) {
        Composer h = composer.h(-1794596951);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1794596951, i, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            a.b bVar = (a.b) list.get(i3);
            it2 it2Var = (it2) bVar.a();
            int b = bVar.b();
            int c = bVar.c();
            AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new rg4() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                @Override // defpackage.rg4
                public final sg4 d(f fVar, List list2, long j) {
                    final ArrayList arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        arrayList.add(((qg4) list2.get(i4)).W(j));
                    }
                    return f.J(fVar, fv0.n(j), fv0.m(j), null, new ss2() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar2) {
                            List<l> list3 = arrayList;
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                l.a.j(aVar2, list3.get(i5), 0, 0, 0.0f, 4, null);
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
            h.z(-1323940314);
            Modifier.a aVar2 = Modifier.a;
            int a2 = cs0.a(h, i2);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(aVar2);
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
            Updater.c(a4, annotatedStringResolveInlineContentKt$InlineChildren$1$2, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            it2Var.invoke(aVar.subSequence(b, c).j(), h, 0);
            h.R();
            h.t();
            h.R();
            i3++;
            i2 = 0;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
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
                    AnnotatedStringResolveInlineContentKt.a(androidx.compose.ui.text.a.this, list, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final boolean b(androidx.compose.ui.text.a aVar) {
        return aVar.m("androidx.compose.foundation.text.inlineContent", 0, aVar.j().length());
    }

    public static final Pair c(androidx.compose.ui.text.a aVar, Map map) {
        if (map == null || map.isEmpty()) {
            return a;
        }
        List i = aVar.i("androidx.compose.foundation.text.inlineContent", 0, aVar.j().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = (a.b) i.get(i2);
            ck3 ck3Var = (ck3) map.get(bVar.e());
            if (ck3Var != null) {
                arrayList.add(new a.b(ck3Var.b(), bVar.f(), bVar.d()));
                arrayList2.add(new a.b(ck3Var.a(), bVar.f(), bVar.d()));
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
