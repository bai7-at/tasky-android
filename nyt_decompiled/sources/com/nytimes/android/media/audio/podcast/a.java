package com.nytimes.android.media.audio.podcast;

import defpackage.aw5;
import defpackage.d31;
import defpackage.du8;
import defpackage.m56;
import defpackage.mb8;
import defpackage.zq3;
import defpackage.zv5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {
    public static final C0358a Companion = new C0358a(null);
    private final String a;

    /* renamed from: com.nytimes.android.media.audio.podcast.a$a, reason: collision with other inner class name */
    public static final class C0358a {
        public /* synthetic */ C0358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0358a() {
        }
    }

    public a(boolean z) {
        this.a = z ? "largeHorizontalJumbo" : "videoFifteenBySeven2610";
    }

    private final Pair a(aw5.e eVar) {
        aw5.g c = eVar.c();
        zq3.e(c);
        m56.b a = c.a().a();
        zq3.e(a);
        List h0 = i.h0(a.a());
        ArrayList<m56.c> arrayList = new ArrayList();
        Iterator it2 = h0.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, ((m56.a) it2.next()).b());
        }
        ArrayList<d31> arrayList2 = new ArrayList();
        for (m56.c cVar : arrayList) {
            d31 c2 = cVar != null ? c(cVar) : null;
            if (c2 != null) {
                arrayList2.add(c2);
            }
        }
        for (d31 d31Var : arrayList2) {
            if (zq3.c(d31Var.a(), "smallSquare252")) {
                String b = d31Var.b();
                for (d31 d31Var2 : arrayList2) {
                    if (zq3.c(d31Var2.a(), this.a)) {
                        return du8.a(b, d31Var2.b());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final d31 c(m56.c cVar) {
        return new d31(cVar.b(), cVar.c());
    }

    private final zv5 d(aw5.e eVar) {
        aw5.c a = eVar.a();
        zq3.e(a);
        String a2 = a.a();
        Pair a3 = a(eVar);
        String str = (String) a3.a();
        String str2 = (String) a3.b();
        String b = eVar.b();
        String e = eVar.e();
        String f = eVar.f();
        PodcastTypeInfo a4 = PodcastTypeInfo.Companion.a(a2);
        List d = eVar.d();
        ArrayList arrayList = new ArrayList(i.w(d, 10));
        Iterator it2 = d.iterator();
        while (it2.hasNext()) {
            arrayList.add(mb8.a((aw5.h) it2.next()));
        }
        return new PodcastOverview(b, a2, e, f, str, str2, a4, arrayList);
    }

    public final List b(aw5.b bVar) {
        aw5.e a;
        zq3.h(bVar, "data");
        aw5.f a2 = bVar.a();
        zq3.e(a2);
        List<aw5.d> a3 = a2.a();
        ArrayList arrayList = new ArrayList();
        for (aw5.d dVar : a3) {
            zv5 d = (dVar == null || (a = dVar.a()) == null) ? null : d(a);
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }
}
