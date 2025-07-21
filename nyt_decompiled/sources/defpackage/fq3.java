package defpackage;

import com.nytimes.android.interests.InterestPreview;
import com.nytimes.android.interests.InterestsPreferencesStore;
import com.nytimes.android.interests.db.Interest;
import com.nytimes.android.interests.db.InterestAsset;
import com.nytimes.android.interests.db.PromotionalMedia;
import com.nytimes.android.interests.db.TrackingParam;
import defpackage.by2;
import defpackage.bz2;
import defpackage.e24;
import defpackage.fy2;
import defpackage.jk2;
import defpackage.kr7;
import defpackage.ma0;
import defpackage.mp3;
import defpackage.u24;
import defpackage.u55;
import defpackage.wo0;
import defpackage.x55;
import defpackage.yf2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.InterestType;
import type.Tone;

/* loaded from: classes4.dex */
public final class fq3 {
    private final cq3 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterestType.values().length];
            try {
                iArr[InterestType.COLUMN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterestType.SHUFFLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterestType.NEWSLETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterestType.FLASHBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterestType.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterestType.BOOKS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InterestType.NEWSQUIZ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public fq3(cq3 cq3Var) {
        zq3.h(cq3Var, "interestsAssetParser");
        this.a = cq3Var;
    }

    private final com.nytimes.android.interests.db.a a(bz2.f fVar) {
        Integer c;
        Instant d;
        bz2.b b = fVar.b();
        InterestAsset interestAsset = null;
        ma0 a2 = b != null ? b.a() : null;
        int d2 = fVar.d();
        String name = fVar.f().name();
        String e = fVar.e();
        String g = fVar.g();
        if (g == null) {
            return null;
        }
        String c2 = fVar.c();
        String str = c2 == null ? "" : c2;
        String h = fVar.h();
        String str2 = h == null ? "" : h;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        long epochSecond = (a2 == null || (d = a2.d()) == null) ? 0L : d.getEpochSecond();
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a3 = fVar.a();
        Long valueOf = a3 != null ? Long.valueOf(a3.getEpochSecond()) : null;
        if (a2 == null || (c = a2.c()) == null) {
            return null;
        }
        int intValue = c.intValue();
        List<ma0.a> a4 = a2.a();
        ArrayList arrayList = new ArrayList();
        for (ma0.a aVar : a4) {
            Interest.Book k2 = aVar != null ? k(aVar) : null;
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        List<ma0.b> b2 = a2.b();
        ArrayList arrayList2 = new ArrayList();
        for (ma0.b bVar : b2) {
            if (bVar != null) {
                interestAsset = this.a.a(bVar.a());
            }
            if (interestAsset != null) {
                arrayList2.add(interestAsset);
            }
            interestAsset = null;
        }
        return new com.nytimes.android.interests.db.a(d2, name, e, g, epochSecond, str, str2, new Interest.BooksInterest(intValue, arrayList, arrayList2), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a b(bz2.f fVar) {
        mp3.a f;
        wp3 a2;
        Tone h;
        u24 b;
        u24.c a3;
        Instant b2;
        wo0.a a4;
        bz2.b b3 = fVar.b();
        wo0 b4 = b3 != null ? b3.b() : null;
        mp3 a5 = (b4 == null || (a4 = b4.a()) == null) ? null : a4.a();
        long epochSecond = (b4 == null || (b2 = b4.b()) == null) ? 0L : b2.getEpochSecond();
        List<u24.a> a6 = (a5 == null || (b = a5.b()) == null || (a3 = b.a()) == null) ? null : a3.a();
        if (a6 == null) {
            a6 = i.l();
        }
        ArrayList<u24.b> arrayList = new ArrayList();
        for (u24.a aVar : a6) {
            u24.b a7 = aVar != null ? aVar.a() : null;
            if (a7 != null) {
                arrayList.add(a7);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (u24.b bVar : arrayList) {
            rp2 a8 = bVar.a();
            if (a8 == null) {
                a8 = bVar.b();
            }
            if (a8 != null) {
                arrayList2.add(a8);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        int d = fVar.d();
        String name = fVar.f().name();
        String e = fVar.e();
        String g = fVar.g();
        if (g == null) {
            return null;
        }
        String c = fVar.c();
        String str = c == null ? "" : c;
        String h2 = fVar.h();
        String str2 = h2 == null ? "" : h2;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a9 = fVar.a();
        Long valueOf = a9 != null ? Long.valueOf(a9.getEpochSecond()) : null;
        String a10 = a5 != null ? a5.a() : null;
        String str3 = a10 == null ? "" : a10;
        String name2 = (a5 == null || (h = a5.h()) == null) ? null : h.name();
        String str4 = name2 == null ? "" : name2;
        String k2 = a5 != null ? a5.k() : null;
        String str5 = k2 == null ? "" : k2;
        String k3 = a5 != null ? a5.k() : null;
        String str6 = k3 == null ? "" : k3;
        String i = a5 != null ? a5.i() : null;
        String str7 = i == null ? "" : i;
        String c2 = a5 != null ? a5.c() : null;
        String str8 = c2 == null ? "" : c2;
        boolean g2 = a5 != null ? a5.g() : false;
        PromotionalMedia g3 = (a5 == null || (f = a5.f()) == null || (a2 = f.a()) == null) ? null : dq3.g(a2);
        String e2 = a5 != null ? a5.e() : null;
        String str9 = e2 == null ? "" : e2;
        String d2 = a5 != null ? a5.d() : null;
        String str10 = d2 == null ? "" : d2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            InterestAsset a11 = this.a.a((rp2) it2.next());
            if (a11 != null) {
                arrayList3.add(a11);
            }
        }
        return new com.nytimes.android.interests.db.a(d, name, e, g, epochSecond, str, str2, new Interest.ColumnInterest(str3, str4, str6, str5, str7, str8, g2, g3, str9, str10, arrayList3), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a c(bz2.f fVar) {
        yf2.l c;
        List a2;
        List h0;
        Instant d;
        yf2.e a3;
        yf2.e a4;
        bz2.b b = fVar.b();
        yf2 c2 = b != null ? b.c() : null;
        List a5 = (c2 == null || (a4 = c2.a()) == null) ? null : a4.a();
        if (a5 == null) {
            a5 = i.l();
        }
        Interest.Filter l = l((yf2.a) i.k0(a5));
        List b2 = (c2 == null || (a3 = c2.a()) == null) ? null : a3.b();
        if (b2 == null) {
            b2 = i.l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = b2.iterator();
        while (it2.hasNext()) {
            Interest.Filter m = m((yf2.d) it2.next());
            if (m != null) {
                arrayList.add(m);
            }
        }
        Set h = b0.h(l);
        h.addAll(arrayList);
        Set c1 = i.c1(i.h0(h));
        if (c1.isEmpty()) {
            return null;
        }
        int d2 = fVar.d();
        String name = fVar.f().name();
        String e = fVar.e();
        String g = fVar.g();
        if (g == null) {
            return null;
        }
        String c3 = fVar.c();
        String str = c3 == null ? "" : c3;
        String h2 = fVar.h();
        String str2 = h2 == null ? "" : h2;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        long epochSecond = (c2 == null || (d = c2.d()) == null) ? 0L : d.getEpochSecond();
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a6 = fVar.a();
        Long valueOf = a6 != null ? Long.valueOf(a6.getEpochSecond()) : null;
        if (c2 == null || (c = c2.c()) == null || (a2 = c.a()) == null || (h0 = i.h0(a2)) == null) {
            return null;
        }
        return new com.nytimes.android.interests.db.a(d2, name, e, g, epochSecond, str, str2, new Interest.FilterInterest(h0, c1), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a d(bz2.f fVar) {
        u24.b a2;
        ip3 b;
        List l;
        List h0;
        u24 b2;
        u24.c a3;
        List a4;
        jk2.a b3;
        bz2.b b4 = fVar.b();
        jk2 d = b4 != null ? b4.d() : null;
        mp3 a5 = (d == null || (b3 = d.b()) == null) ? null : b3.a();
        u24.a aVar = (a5 == null || (b2 = a5.b()) == null || (a3 = b2.a()) == null || (a4 = a3.a()) == null) ? null : (u24.a) i.m0(a4);
        if (aVar == null || (a2 = aVar.a()) == null || (b = a2.b()) == null) {
            return null;
        }
        int d2 = fVar.d();
        String name = fVar.f().name();
        String e = fVar.e();
        String g = fVar.g();
        if (g == null) {
            return null;
        }
        String c = fVar.c();
        String str = c == null ? "" : c;
        String h = fVar.h();
        String str2 = h == null ? "" : h;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        Instant f = d.f();
        long epochSecond = f != null ? f.getEpochSecond() : 0L;
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a6 = fVar.a();
        Long valueOf = a6 != null ? Long.valueOf(a6.getEpochSecond()) : null;
        String c2 = d.c();
        Double e2 = d.e();
        Integer valueOf2 = e2 != null ? Integer.valueOf((int) e2.doubleValue()) : null;
        String n = b.n();
        String d3 = d.d();
        Instant b5 = b.b();
        long epochMilli = b5 != null ? b5.toEpochMilli() : 0L;
        List a7 = d.a();
        if (a7 == null || (h0 = i.h0(a7)) == null || (l = i.X0(h0)) == null) {
            l = i.l();
        }
        List list = l;
        InterestAsset a8 = this.a.a(b);
        if (a8 == null) {
            return null;
        }
        return new com.nytimes.android.interests.db.a(d2, name, e, g, epochSecond, str, str2, new Interest.FlashbackQuizInterest(c2, d3, valueOf2, list, epochMilli, n, a8), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a f(bz2.f fVar) {
        String str;
        x55.b e;
        pp3 a2;
        Instant b;
        List b2;
        Double i;
        Instant l;
        x55.b e2;
        pp3 a3;
        e24 b3;
        e24.c a4;
        List a5;
        e24.a aVar;
        e24.b a6;
        bz2.b b4 = fVar.b();
        x55 f = b4 != null ? b4.f() : null;
        ip3 b5 = (f == null || (e2 = f.e()) == null || (a3 = e2.a()) == null || (b3 = a3.b()) == null || (a4 = b3.a()) == null || (a5 = a4.a()) == null || (aVar = (e24.a) i.m0(a5)) == null || (a6 = aVar.a()) == null) ? null : a6.b();
        InterestAsset a7 = b5 != null ? this.a.a(b5) : null;
        String g = fVar.g();
        String h = f != null ? f.h() : null;
        List d = f != null ? f.d() : null;
        String a8 = f != null ? f.a() : null;
        if (g == null || a7 == null || h == null || d == null || a8 == null) {
            return null;
        }
        int d2 = fVar.d();
        String name = fVar.f().name();
        String e3 = fVar.e();
        String c = fVar.c();
        String str2 = c == null ? "" : c;
        String h2 = fVar.h();
        String str3 = h2 == null ? "" : h2;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        long epochSecond = (f == null || (l = f.l()) == null) ? 0L : l.getEpochSecond();
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a9 = fVar.a();
        Long valueOf = a9 != null ? Long.valueOf(a9.getEpochSecond()) : null;
        Interest.CompletedNewsQuizData completedNewsQuizData = new Interest.CompletedNewsQuizData((f == null || (i = f.i()) == null) ? null : Float.valueOf((float) i.doubleValue()), f != null ? f.c() : null, f != null ? f.j() : null, (f == null || (b2 = f.b()) == null) ? null : i.h0(b2));
        List<x55.a> list = d;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (x55.a aVar2 : list) {
            arrayList.add(new Interest.Choice(aVar2.a(), aVar2.b()));
        }
        Interest.InitialNewsQuizData initialNewsQuizData = new Interest.InitialNewsQuizData(a7, h, arrayList, a8, f != null ? f.f() : null, f != null ? f.k() : null, (b5 == null || (b = b5.b()) == null) ? 0L : b.toEpochMilli());
        if (f == null || (e = f.e()) == null || (a2 = e.a()) == null || (str = a2.k()) == null) {
            str = "";
        }
        return new com.nytimes.android.interests.db.a(d2, name, e3, g, epochSecond, str2, str3, new Interest.NewsQuizInterest(completedNewsQuizData, initialNewsQuizData, str), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a g(bz2.f fVar) {
        mp3.a f;
        wp3 a2;
        Tone h;
        u24 b;
        u24.c a3;
        Instant b2;
        u55.a a4;
        bz2.b b3 = fVar.b();
        u55 e = b3 != null ? b3.e() : null;
        mp3 a5 = (e == null || (a4 = e.a()) == null) ? null : a4.a();
        long epochSecond = (e == null || (b2 = e.b()) == null) ? 0L : b2.getEpochSecond();
        List<u24.a> a6 = (a5 == null || (b = a5.b()) == null || (a3 = b.a()) == null) ? null : a3.a();
        if (a6 == null) {
            a6 = i.l();
        }
        ArrayList<u24.b> arrayList = new ArrayList();
        for (u24.a aVar : a6) {
            u24.b a7 = aVar != null ? aVar.a() : null;
            if (a7 != null) {
                arrayList.add(a7);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (u24.b bVar : arrayList) {
            rp2 a8 = bVar.a();
            if (a8 == null) {
                a8 = bVar.b();
            }
            if (a8 != null) {
                arrayList2.add(a8);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        int d = fVar.d();
        String name = fVar.f().name();
        String e2 = fVar.e();
        String g = fVar.g();
        if (g == null) {
            return null;
        }
        String c = fVar.c();
        String str = c == null ? "" : c;
        String h2 = fVar.h();
        String str2 = h2 == null ? "" : h2;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a9 = fVar.a();
        Long valueOf = a9 != null ? Long.valueOf(a9.getEpochSecond()) : null;
        String a10 = a5 != null ? a5.a() : null;
        String str3 = a10 == null ? "" : a10;
        String name2 = (a5 == null || (h = a5.h()) == null) ? null : h.name();
        String str4 = name2 == null ? "" : name2;
        String k2 = a5 != null ? a5.k() : null;
        String str5 = k2 == null ? "" : k2;
        String k3 = a5 != null ? a5.k() : null;
        String str6 = k3 == null ? "" : k3;
        String i = a5 != null ? a5.i() : null;
        String str7 = i == null ? "" : i;
        String c2 = a5 != null ? a5.c() : null;
        String str8 = c2 == null ? "" : c2;
        boolean g2 = a5 != null ? a5.g() : false;
        PromotionalMedia g3 = (a5 == null || (f = a5.f()) == null || (a2 = f.a()) == null) ? null : dq3.g(a2);
        String e3 = a5 != null ? a5.e() : null;
        String str9 = e3 == null ? "" : e3;
        String d2 = a5 != null ? a5.d() : null;
        String str10 = d2 == null ? "" : d2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            InterestAsset a11 = this.a.a((rp2) it2.next());
            if (a11 != null) {
                arrayList3.add(a11);
            }
        }
        return new com.nytimes.android.interests.db.a(d, name, e2, g, epochSecond, str, str2, new Interest.NewsletterInterest(str3, str4, str6, str5, str7, str8, g2, g3, str9, str10, arrayList3), booleanValue, booleanValue2, valueOf);
    }

    private final com.nytimes.android.interests.db.a i(bz2.f fVar) {
        ArrayList arrayList;
        List<kr7.b> a2;
        rp2 b;
        List list;
        List b2;
        Instant b3;
        bz2.b b4 = fVar.b();
        kr7 g = b4 != null ? b4.g() : null;
        kr7.a a3 = g != null ? g.a() : null;
        long epochSecond = (g == null || (b3 = g.b()) == null) ? 0L : b3.getEpochSecond();
        if (a3 != null && (a2 = a3.a()) != null) {
            ArrayList<Pair> arrayList2 = new ArrayList();
            for (kr7.b bVar : a2) {
                arrayList2.add(new Pair(bVar != null ? bVar.a() : null, (bVar == null || (b2 = bVar.b()) == null) ? null : i.h0(b2)));
            }
            arrayList = new ArrayList(i.w(arrayList2, 10));
            for (Pair pair : arrayList2) {
                kr7.c cVar = (kr7.c) pair.c();
                if (cVar == null || (b = cVar.a()) == null) {
                    kr7.c cVar2 = (kr7.c) pair.c();
                    b = cVar2 != null ? cVar2.b() : null;
                    if (b == null) {
                        return null;
                    }
                }
                InterestAsset a4 = this.a.a(b);
                if (a4 != null && (list = (List) pair.d()) != null) {
                    List<kr7.d> list2 = list;
                    ArrayList arrayList3 = new ArrayList(i.w(list2, 10));
                    for (kr7.d dVar : list2) {
                        arrayList3.add(new TrackingParam(dVar.a(), dVar.b()));
                    }
                    arrayList.add(new Interest.PersonalizedItem(a4, arrayList3));
                }
                return null;
            }
        }
        arrayList = null;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int d = fVar.d();
        String name = fVar.f().name();
        String e = fVar.e();
        String g2 = fVar.g();
        if (g2 == null) {
            return null;
        }
        String c = fVar.c();
        String str = c == null ? "" : c;
        String h = fVar.h();
        String str2 = h == null ? "" : h;
        Boolean k = fVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        Boolean j = fVar.j();
        boolean booleanValue2 = j != null ? j.booleanValue() : false;
        Instant a5 = fVar.a();
        return new com.nytimes.android.interests.db.a(d, name, e, g2, epochSecond, str, str2, new Interest.ShuffleInterest(arrayList), booleanValue, booleanValue2, a5 != null ? Long.valueOf(a5.getEpochSecond()) : null);
    }

    private final Interest.Book k(ma0.a aVar) {
        return new Interest.Book(aVar.d(), aVar.b(), aVar.c(), aVar.a());
    }

    private final Interest.Filter l(yf2.a aVar) {
        ArrayList arrayList;
        List l;
        yf2.k a2;
        List<yf2.g> a3;
        yf2.c a4 = aVar.a();
        if (a4 == null || (a2 = a4.a()) == null || (a3 = a2.a()) == null) {
            arrayList = null;
        } else {
            ArrayList<yf2.n> arrayList2 = new ArrayList();
            for (yf2.g gVar : a3) {
                yf2.n a5 = gVar != null ? gVar.a() : null;
                if (a5 != null) {
                    arrayList2.add(a5);
                }
            }
            arrayList = new ArrayList();
            for (yf2.n nVar : arrayList2) {
                rp2 a6 = nVar.a();
                if (a6 == null) {
                    a6 = nVar.b();
                }
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
        }
        yf2.i b = aVar.b();
        if (b == null) {
            return null;
        }
        String b2 = b.b();
        int a7 = b.a();
        if (arrayList != null) {
            l = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterestAsset a8 = this.a.a((rp2) it2.next());
                if (a8 != null) {
                    l.add(a8);
                }
            }
        } else {
            l = i.l();
        }
        return new Interest.Filter(b2, a7, l);
    }

    private final Interest.Filter m(yf2.d dVar) {
        ArrayList arrayList;
        List l;
        yf2.j a2;
        List<yf2.f> a3;
        yf2.b a4 = dVar.a();
        if (a4 == null || (a2 = a4.a()) == null || (a3 = a2.a()) == null) {
            arrayList = null;
        } else {
            ArrayList<yf2.m> arrayList2 = new ArrayList();
            for (yf2.f fVar : a3) {
                yf2.m a5 = fVar != null ? fVar.a() : null;
                if (a5 != null) {
                    arrayList2.add(a5);
                }
            }
            arrayList = new ArrayList();
            for (yf2.m mVar : arrayList2) {
                rp2 a6 = mVar.a();
                if (a6 == null) {
                    a6 = mVar.b();
                }
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
        }
        yf2.h b = dVar.b();
        if (b == null) {
            return null;
        }
        String b2 = b.b();
        int a7 = b.a();
        if (arrayList != null) {
            l = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterestAsset a8 = this.a.a((rp2) it2.next());
                if (a8 != null) {
                    l.add(a8);
                }
            }
        } else {
            l = i.l();
        }
        return new Interest.Filter(b2, a7, l);
    }

    private final InterestPreview n(up3 up3Var) {
        int b = up3Var.b();
        String e = up3Var.e();
        if (e == null) {
            return null;
        }
        String name = up3Var.d().name();
        String c = up3Var.c();
        String a2 = up3Var.a();
        if (a2 == null) {
            return null;
        }
        String f = up3Var.f();
        if (f == null) {
            f = "";
        }
        String str = f;
        Boolean i = up3Var.i();
        boolean booleanValue = i != null ? i.booleanValue() : false;
        Boolean h = up3Var.h();
        return new InterestPreview(b, e, name, c, a2, str, booleanValue, h != null ? h.booleanValue() : false);
    }

    public final List e(by2.b bVar) {
        zq3.h(bVar, "data");
        List a2 = bVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a2.iterator();
        while (it2.hasNext()) {
            InterestPreview n = n(((by2.c) it2.next()).a());
            if (n != null) {
                arrayList.add(n);
            }
        }
        return arrayList;
    }

    public final sp3 h(fy2.b bVar) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        List a2;
        List c;
        List b;
        fy2.g a3;
        sp3 sp3Var = null;
        fy2.e a4 = (bVar == null || (a3 = bVar.a()) == null) ? null : a3.a();
        if (a4 == null || (b = a4.b()) == null) {
            arrayList = null;
        } else {
            List<fy2.f> list2 = b;
            arrayList = new ArrayList(i.w(list2, 10));
            for (fy2.f fVar : list2) {
                int b2 = fVar.b();
                String d = fVar.d();
                String e = fVar.e();
                String a5 = fVar.a();
                List c2 = fVar.c();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = c2.iterator();
                while (it2.hasNext()) {
                    InterestPreview n = n(((fy2.d) it2.next()).a());
                    if (n != null) {
                        arrayList3.add(n);
                    }
                }
                arrayList.add(new bh5(b2, d, e, a5, arrayList3));
            }
        }
        if (a4 == null || (c = a4.c()) == null) {
            list = null;
        } else {
            list = new ArrayList();
            Iterator it3 = c.iterator();
            while (it3.hasNext()) {
                InterestPreview n2 = n(((fy2.h) it3.next()).a());
                if (n2 != null) {
                    list.add(n2);
                }
            }
        }
        if (a4 == null || (a2 = a4.a()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList();
            Iterator it4 = a2.iterator();
            while (it4.hasNext()) {
                InterestPreview n3 = n(((fy2.c) it4.next()).a());
                if (n3 != null) {
                    arrayList2.add(n3);
                }
            }
        }
        if (arrayList != null && arrayList2 != null) {
            if (list == null) {
                list = i.l();
            }
            sp3Var = new sp3(arrayList, list, arrayList2);
        }
        return sp3Var;
    }

    public final fp3 j(bz2.c cVar) {
        List l;
        List<bz2.f> b;
        com.nytimes.android.interests.db.a b2;
        Instant a2;
        List b3;
        bz2.e a3;
        List list = null;
        bz2.g a4 = (cVar == null || (a3 = cVar.a()) == null) ? null : a3.a();
        bz2.d a5 = a4 != null ? a4.a() : null;
        if (a5 == null || (b3 = a5.b()) == null || (l = i.h0(b3)) == null) {
            l = i.l();
        }
        long a6 = (a5 == null || (a2 = a5.a()) == null) ? InterestsPreferencesStore.Companion.a() : a2.getEpochSecond();
        if (a4 != null && (b = a4.b()) != null) {
            ArrayList arrayList = new ArrayList();
            for (bz2.f fVar : b) {
                switch (a.a[fVar.f().ordinal()]) {
                    case 1:
                        b2 = b(fVar);
                        break;
                    case 2:
                        b2 = i(fVar);
                        break;
                    case 3:
                        b2 = g(fVar);
                        break;
                    case 4:
                        b2 = d(fVar);
                        break;
                    case 5:
                        b2 = c(fVar);
                        break;
                    case 6:
                        b2 = a(fVar);
                        break;
                    case 7:
                        b2 = f(fVar);
                        break;
                    default:
                        b2 = null;
                        break;
                }
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            list = arrayList;
        }
        if (list == null) {
            list = i.l();
        }
        return new fp3(list, l, a6);
    }
}
