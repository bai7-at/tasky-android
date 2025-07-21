package defpackage;

import com.nytimes.android.interests.db.PromotionalMedia;
import defpackage.r56;
import defpackage.sg2;
import defpackage.wp3;
import defpackage.xg2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class dq3 {
    public static final Map a(List list) {
        zq3.h(list, "<this>");
        ArrayList<wp3.c> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, i.h0(((wp3.b) it2.next()).a()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (wp3.c cVar : arrayList) {
            linkedHashMap.put(cVar.b(), new PromotionalMedia.ImageDimension(cVar.d(), cVar.a(), cVar.c()));
        }
        return linkedHashMap;
    }

    public static final Map b(List list) {
        zq3.h(list, "<this>");
        ArrayList<sg2.c> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i.B(arrayList, i.h0(((sg2.b) it2.next()).a()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (sg2.c cVar : arrayList) {
            linkedHashMap.put(cVar.b(), new PromotionalMedia.ImageDimension(cVar.d(), cVar.a(), cVar.c()));
        }
        return linkedHashMap;
    }

    public static final PromotionalMedia.ImageCrop c(List list) {
        zq3.h(list, "<this>");
        Map a = a(list);
        return new PromotionalMedia.ImageCrop((PromotionalMedia.ImageDimension) a.get("thumbLarge"), (PromotionalMedia.ImageDimension) a.get("mediumThreeByTwo440"), (PromotionalMedia.ImageDimension) a.get("square320"), (PromotionalMedia.ImageDimension) a.get("square640"), (PromotionalMedia.ImageDimension) null, (PromotionalMedia.ImageDimension) null, 48, (DefaultConstructorMarker) null);
    }

    public static final PromotionalMedia.ImageCrop d(List list) {
        zq3.h(list, "<this>");
        return new PromotionalMedia.ImageCrop((PromotionalMedia.ImageDimension) null, (PromotionalMedia.ImageDimension) null, (PromotionalMedia.ImageDimension) null, (PromotionalMedia.ImageDimension) null, (PromotionalMedia.ImageDimension) b(list).get("verticalTwoByThree735"), (PromotionalMedia.ImageDimension) null, 47, (DefaultConstructorMarker) null);
    }

    public static final PromotionalMedia e(sg2 sg2Var) {
        zq3.h(sg2Var, "<this>");
        sg2.a a = sg2Var.a();
        String a2 = a != null ? a.a() : null;
        if (a2 == null) {
            a2 = "";
        }
        return new PromotionalMedia(new PromotionalMedia.Caption(a2, false), d(i.h0(sg2Var.b())), sg2Var.f());
    }

    public static final PromotionalMedia f(xg2 xg2Var) {
        xg2.a a;
        xg2.f a2;
        xg2.h a3;
        sg2 a4;
        xg2.i a5;
        sg2 a6;
        xg2.g a7;
        sg2 a8;
        xg2.j a9;
        sg2 a10;
        sg2 a11;
        zq3.h(xg2Var, "<this>");
        if (xg2Var.c() != null) {
            xg2.c c = xg2Var.c();
            if (c == null || (a11 = c.a()) == null) {
                return null;
            }
            return e(a11);
        }
        if (xg2Var.e() != null) {
            xg2.e e = xg2Var.e();
            if (e == null || (a9 = e.a()) == null || (a10 = a9.a()) == null) {
                return null;
            }
            return e(a10);
        }
        if (xg2Var.d() != null) {
            xg2.d d = xg2Var.d();
            if (d == null || (a7 = d.a()) == null || (a8 = a7.a()) == null) {
                return null;
            }
            return e(a8);
        }
        if (xg2Var.b() != null) {
            xg2.b b = xg2Var.b();
            if (b == null || (a5 = b.a()) == null || (a6 = a5.a()) == null) {
                return null;
            }
            return e(a6);
        }
        if (xg2Var.a() == null || (a = xg2Var.a()) == null || (a2 = a.a()) == null || (a3 = a2.a()) == null || (a4 = a3.a()) == null) {
            return null;
        }
        return e(a4);
    }

    public static final PromotionalMedia g(wp3 wp3Var) {
        zq3.h(wp3Var, "<this>");
        wp3.a a = wp3Var.a();
        String a2 = a != null ? a.a() : null;
        if (a2 == null) {
            a2 = "";
        }
        return new PromotionalMedia(new PromotionalMedia.Caption(a2, false), c(i.h0(wp3Var.b())), wp3Var.f());
    }

    public static final PromotionalMedia h(r56 r56Var) {
        r56.a a;
        r56.f a2;
        r56.h a3;
        wp3 a4;
        r56.i a5;
        wp3 a6;
        r56.g a7;
        wp3 a8;
        r56.j a9;
        wp3 a10;
        wp3 a11;
        zq3.h(r56Var, "<this>");
        if (r56Var.c() != null) {
            r56.c c = r56Var.c();
            if (c == null || (a11 = c.a()) == null) {
                return null;
            }
            return g(a11);
        }
        if (r56Var.e() != null) {
            r56.e e = r56Var.e();
            if (e == null || (a9 = e.a()) == null || (a10 = a9.a()) == null) {
                return null;
            }
            return g(a10);
        }
        if (r56Var.d() != null) {
            r56.d d = r56Var.d();
            if (d == null || (a7 = d.a()) == null || (a8 = a7.a()) == null) {
                return null;
            }
            return g(a8);
        }
        if (r56Var.b() != null) {
            r56.b b = r56Var.b();
            if (b == null || (a5 = b.a()) == null || (a6 = a5.a()) == null) {
                return null;
            }
            return g(a6);
        }
        if (r56Var.a() == null || (a = r56Var.a()) == null || (a2 = a.a()) == null || (a3 = a2.a()) == null || (a4 = a3.a()) == null) {
            return null;
        }
        return g(a4);
    }
}
