package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.dailyfive.domain.DailyFiveArticle;
import com.nytimes.android.dailyfive.domain.DailyFiveAsset;
import com.nytimes.android.dailyfive.domain.DailyFiveChannel;
import com.nytimes.android.dailyfive.domain.DailyFiveCompletion;
import com.nytimes.android.dailyfive.domain.DailyFiveGames;
import com.nytimes.android.dailyfive.domain.DailyFivePack;
import com.nytimes.android.dailyfive.domain.DailyFiveSalutation;
import com.nytimes.android.dailyfive.domain.DailyFiveTrending;
import com.nytimes.android.dailyfive.domain.GamesAsset;
import com.nytimes.android.dailyfive.domain.GamesNode;
import com.nytimes.android.dailyfive.domain.Image;
import com.nytimes.android.dailyfive.domain.ImageCrop;
import com.nytimes.android.dailyfive.domain.NumberedArticleTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedGuideTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedInteractiveTrendingNode;
import com.nytimes.android.dailyfive.domain.TrackingParam;
import com.nytimes.android.dailyfive.domain.b;
import com.nytimes.android.dailyfive.domain.c;
import com.nytimes.android.dailyfive.ui.feed.DailyFiveParsingException;
import com.nytimes.android.logging.NYTLogger;
import defpackage.d63;
import defpackage.e31;
import defpackage.hj3;
import defpackage.ko2;
import defpackage.kq;
import defpackage.s56;
import defpackage.tn2;
import defpackage.to3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;
import org.threeten.bp.Instant;
import type.Tone;

/* loaded from: classes4.dex */
public final class k81 {
    private final b a(kq kqVar) {
        String a;
        Instant f;
        s56 a2;
        kq.b d = kqVar.d();
        Image image = null;
        if (d == null || (a = d.a()) == null) {
            return null;
        }
        String k = kqVar.k();
        String l = kqVar.l();
        String i = kqVar.i();
        kq.d h = kqVar.h();
        if (h != null && (a2 = h.a()) != null) {
            image = v(a2);
        }
        Image image2 = image;
        boolean z = kqVar.j() == Tone.OPINION;
        kq.c e = kqVar.e();
        if ((e == null || (f = e.a()) == null) && (f = kqVar.f()) == null) {
            f = Instant.now();
        }
        Instant instant = f;
        zq3.e(instant);
        return new NumberedArticleTrendingNode(k, l, a, i, image2, instant, z);
    }

    private final b b(d63 d63Var) {
        String a;
        s56 a2;
        d63.a a3 = d63Var.a();
        Image image = null;
        if (a3 == null || (a = a3.a()) == null) {
            return null;
        }
        String f = d63Var.f();
        String g = d63Var.g();
        String d = d63Var.d();
        d63.b c = d63Var.c();
        if (c != null && (a2 = c.a()) != null) {
            image = v(a2);
        }
        Image image2 = image;
        boolean z = d63Var.e() == Tone.OPINION;
        Instant b = d63Var.b();
        if (b == null) {
            b = Instant.now();
        }
        Instant instant = b;
        zq3.e(instant);
        return new NumberedGuideTrendingNode(f, g, a, d, image2, instant, z);
    }

    private final b c(to3 to3Var) {
        String a;
        s56 a2;
        to3.b d = to3Var.d();
        Image image = null;
        if (d == null || (a = d.a()) == null) {
            return null;
        }
        String j = to3Var.j();
        String k = to3Var.k();
        String h = to3Var.h();
        to3.c g = to3Var.g();
        if (g != null && (a2 = g.a()) != null) {
            image = v(a2);
        }
        Image image2 = image;
        boolean z = to3Var.i() == Tone.OPINION;
        Instant e = to3Var.e();
        if (e == null) {
            e = Instant.now();
        }
        Instant instant = e;
        zq3.e(instant);
        return new NumberedInteractiveTrendingNode(j, k, a, h, image2, instant, z);
    }

    private final DailyFiveArticle e(tn2.j jVar) {
        try {
            List l = l(jVar);
            if (l.isEmpty()) {
                throw new DailyFiveParsingException("Article numbered item with no assets");
            }
            if (l.size() <= 1) {
                return new DailyFiveArticle(jVar.d(), jVar.h(), jVar.e(), jVar.f(), m(jVar), (DailyFiveAsset) l.get(0));
            }
            throw new DailyFiveParsingException("Article numbered item with more than one asset");
        } catch (DailyFiveParsingException e) {
            NYTLogger.h(e);
            return null;
        }
    }

    private final DailyFiveCompletion f(tn2.h hVar) {
        return new DailyFiveCompletion(hVar != null ? hVar.a() : null);
    }

    private final List g(ko2 ko2Var) {
        e31 a;
        List a2 = ko2Var != null ? ko2Var.a() : null;
        if (a2 == null) {
            a2 = i.l();
        }
        List<ko2.a> list = a2;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (ko2.a aVar : list) {
            String c = aVar.c();
            String str = c.length() > 0 ? c : null;
            if (str == null) {
                throw new DailyFiveParsingException("channel name cannot be null " + aVar);
            }
            String e = aVar.e();
            String str2 = e.length() > 0 ? e : null;
            if (str2 == null) {
                throw new DailyFiveParsingException("channel uri cannot be null " + aVar);
            }
            String a3 = aVar.a();
            String d = aVar.d();
            ko2.b b = aVar.b();
            arrayList.add(new DailyFiveChannel(str2, str, a3, d, (b == null || (a = b.a()) == null) ? null : u(a)));
        }
        return arrayList;
    }

    private final List h(tn2.i iVar, List list) {
        qv2 a;
        ov2 a2;
        List a3 = iVar.a();
        ArrayList arrayList = new ArrayList(i.w(a3, 10));
        int i = 0;
        for (Object obj : a3) {
            int i2 = i + 1;
            if (i < 0) {
                i.v();
            }
            tn2.g b = ((tn2.b) obj).b();
            arrayList.add((b == null || (a = b.a()) == null || (a2 = a.a()) == null) ? null : new GamesAsset(k(a2), (DailyFiveChannel) list.get(i)));
            i = i2;
        }
        return i.h0(arrayList);
    }

    private final List i(tn2.i iVar) {
        return g(iVar.b());
    }

    private final DailyFiveGames j(tn2.i iVar) {
        try {
            return new DailyFiveGames(iVar.c(), h(iVar, i(iVar)));
        } catch (DailyFiveParsingException e) {
            NYTLogger.h(e);
            return null;
        }
    }

    private final GamesNode k(ov2 ov2Var) {
        return new GamesNode(ov2Var.f(), ov2Var.e(), ov2Var.b(), ov2Var.c(), ov2Var.a(), h.n(ov2Var.d()));
    }

    private final List l(tn2.j jVar) {
        List a = jVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            DailyFiveAsset t = t(((tn2.c) it2.next()).a());
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private final List m(tn2.j jVar) {
        return g(jVar.b());
    }

    private final c n(tn2.j jVar) {
        String c = jVar.c();
        if (zq3.c(c, AssetConstants.ARTICLE_TYPE)) {
            return e(jVar);
        }
        if (zq3.c(c, "pack")) {
            return o(jVar);
        }
        NYTLogger.h(new DailyFiveParsingException("Unknown item identifier " + jVar.c()));
        return null;
    }

    private final DailyFivePack o(tn2.j jVar) {
        try {
            return new DailyFivePack(jVar.d(), jVar.h(), jVar.e(), jVar.f(), m(jVar), l(jVar));
        } catch (DailyFiveParsingException e) {
            NYTLogger.h(e);
            return null;
        }
    }

    private final DailyFiveSalutation p(tn2.k kVar) {
        return new DailyFiveSalutation(kVar != null ? kVar.a() : null, kVar != null ? kVar.b() : null);
    }

    private final List q(tn2.l lVar) {
        List a = lVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            DailyFiveAsset t = t(((tn2.a) it2.next()).a());
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private final List r(tn2.l lVar) {
        return g(lVar.b());
    }

    private final DailyFiveTrending s(tn2.l lVar) {
        try {
            return new DailyFiveTrending(r(lVar), q(lVar));
        } catch (DailyFiveParsingException e) {
            NYTLogger.h(e);
            return null;
        }
    }

    private final DailyFiveAsset t(hj3 hj3Var) {
        b c;
        d63 b;
        to3 c2;
        kq a;
        hj3.a b2 = hj3Var.b();
        if (b2 == null || (a = b2.a()) == null || (c = a(a)) == null) {
            c = (b2 == null || (c2 = b2.c()) == null) ? null : c(c2);
            if (c == null) {
                c = (b2 == null || (b = b2.b()) == null) ? null : b(b);
            }
        }
        if (c != null) {
            return new DailyFiveAsset(hj3Var.a(), c, x(hj3Var.c()));
        }
        return null;
    }

    private final Image u(e31 e31Var) {
        String a = e31Var.a();
        List h0 = i.h0(e31Var.b());
        ArrayList<e31.b> arrayList = new ArrayList();
        Iterator it2 = h0.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, i.h0(((e31.a) it2.next()).a()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (e31.b bVar : arrayList) {
            Pair a2 = du8.a(bVar.b(), w(bVar));
            linkedHashMap.put(a2.c(), a2.d());
        }
        return new Image(a, linkedHashMap);
    }

    private final Image v(s56 s56Var) {
        e31 a;
        e31 a2;
        if (s56Var.c() != null) {
            s56.d c = s56Var.c();
            zq3.e(c);
            return u(c.a());
        }
        if (s56Var.b() != null) {
            s56.c b = s56Var.b();
            zq3.e(b);
            s56.k a3 = b.a();
            if (a3 != null && (a2 = a3.a()) != null) {
                return u(a2);
            }
        } else if (s56Var.e() != null) {
            s56.g e = s56Var.e();
            zq3.e(e);
            s56.l c2 = e.c();
            if (c2 != null && (a = c2.a()) != null) {
                return u(a);
            }
        }
        return null;
    }

    private final ImageCrop w(e31.b bVar) {
        return new ImageCrop(bVar.d(), bVar.a(), bVar.c());
    }

    private final List x(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hj3.b bVar = (hj3.b) it2.next();
            TrackingParam trackingParam = bVar == null ? null : new TrackingParam(bVar.a(), bVar.b());
            if (trackingParam != null) {
                arrayList.add(trackingParam);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(tn2.f r5) {
        /*
            r4 = this;
            java.lang.String r0 = "data"
            defpackage.zq3.h(r5, r0)
            java.util.List r5 = r5.a()
            r0 = 0
            if (r5 == 0) goto L81
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r5.next()
            tn2$e r2 = (tn2.e) r2
            if (r2 != 0) goto L27
        L25:
            r2 = r0
            goto L7a
        L27:
            tn2$k r3 = r2.d()
            if (r3 == 0) goto L36
            tn2$k r2 = r2.d()
            com.nytimes.android.dailyfive.domain.DailyFiveSalutation r2 = r4.p(r2)
            goto L7a
        L36:
            tn2$h r3 = r2.a()
            if (r3 == 0) goto L45
            tn2$h r2 = r2.a()
            com.nytimes.android.dailyfive.domain.DailyFiveCompletion r2 = r4.f(r2)
            goto L7a
        L45:
            tn2$j r3 = r2.c()
            if (r3 == 0) goto L57
            tn2$j r2 = r2.c()
            defpackage.zq3.e(r2)
            com.nytimes.android.dailyfive.domain.c r2 = r4.n(r2)
            goto L7a
        L57:
            tn2$i r3 = r2.b()
            if (r3 == 0) goto L69
            tn2$i r2 = r2.b()
            defpackage.zq3.e(r2)
            com.nytimes.android.dailyfive.domain.DailyFiveGames r2 = r4.j(r2)
            goto L7a
        L69:
            tn2$l r3 = r2.e()
            if (r3 == 0) goto L25
            tn2$l r2 = r2.e()
            defpackage.zq3.e(r2)
            com.nytimes.android.dailyfive.domain.DailyFiveTrending r2 = r4.s(r2)
        L7a:
            if (r2 == 0) goto L17
            r1.add(r2)
            goto L17
        L80:
            r0 = r1
        L81:
            if (r0 != 0) goto L87
            java.util.List r0 = kotlin.collections.i.l()
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k81.d(tn2$f):java.util.List");
    }
}
