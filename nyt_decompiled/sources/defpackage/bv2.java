package defpackage;

import com.google.accompanist.pager.PagerState;
import com.nytimes.android.growthui.R;
import com.nytimes.android.growthui.common.models.ProductType;
import com.nytimes.android.growthui.common.models.config.OffersMessageType;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.BadgeDetailsData;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.UrgencyMessageData;
import defpackage.fy3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class bv2 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.AllAccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.StandAlone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[OffersMessageType.values().length];
            try {
                iArr2[OffersMessageType.FreeTrialMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OffersMessageType.SaleMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OffersMessageType.BauMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    private static final n73 a(GamesLandingPageData gamesLandingPageData) {
        return new n73(gamesLandingPageData.c(), Integer.valueOf(R.drawable.games_logo), gamesLandingPageData.d());
    }

    private static final n73 b(GamesLandingPageData gamesLandingPageData) {
        return new n73(gamesLandingPageData.a(), Integer.valueOf(R.drawable.games_logo), gamesLandingPageData.b());
    }

    private static final bd5 c(GamesLandingPageData gamesLandingPageData, Map map) {
        Object obj;
        String a2;
        String a3;
        String a4;
        String a5;
        Iterator it2 = gamesLandingPageData.u().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (za7.b((SkuOverrideData) obj, 0L, 1, null)) {
                break;
            }
        }
        SkuOverrideData skuOverrideData = (SkuOverrideData) obj;
        ArrayList arrayList = new ArrayList();
        String c = skuOverrideData != null ? skuOverrideData.c() : null;
        if (c != null && !h.d0(c)) {
            zc5 zc5Var = (zc5) map.get(skuOverrideData != null ? skuOverrideData.c() : null);
            if (zc5Var != null) {
                BadgeDetailsData w = gamesLandingPageData.w();
                arrayList.add(zc5.b(zc5Var, (w == null || (a5 = w.a()) == null) ? "" : a5, null, null, !zq3.c(zc5Var.e(), gamesLandingPageData.x()), ProductType.AllAccess, 6, null));
            }
        }
        String a6 = skuOverrideData != null ? skuOverrideData.a() : null;
        if (a6 != null && !h.d0(a6)) {
            zc5 zc5Var2 = (zc5) map.get(skuOverrideData != null ? skuOverrideData.a() : null);
            if (zc5Var2 != null) {
                BadgeDetailsData q = gamesLandingPageData.q();
                arrayList.add(zc5.b(zc5Var2, (q == null || (a4 = q.a()) == null) ? "" : a4, null, null, !zq3.c(zc5Var2.e(), gamesLandingPageData.r()), ProductType.AllAccess, 6, null));
            }
        }
        if (arrayList.isEmpty()) {
            zc5 zc5Var3 = (zc5) map.get(gamesLandingPageData.x());
            if (zc5Var3 != null) {
                BadgeDetailsData w2 = gamesLandingPageData.w();
                arrayList.add(zc5.b(zc5Var3, (w2 == null || (a3 = w2.a()) == null) ? "" : a3, null, null, false, ProductType.AllAccess, 6, null));
            }
            zc5 zc5Var4 = (zc5) map.get(gamesLandingPageData.r());
            if (zc5Var4 != null) {
                BadgeDetailsData q2 = gamesLandingPageData.q();
                arrayList.add(zc5.b(zc5Var4, (q2 == null || (a2 = q2.a()) == null) ? "" : a2, null, null, false, ProductType.AllAccess, 6, null));
            }
        }
        return bd5.Companion.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.d46 d(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData r11, defpackage.bd5 r12) {
        /*
            boolean r0 = r12 instanceof bd5.c
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r12
            bd5$c r0 = (bd5.c) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L11
            com.nytimes.android.growthui.common.models.config.OffersMessageType r0 = r0.a()
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = -1
            if (r0 != 0) goto L17
            r0 = r2
            goto L1f
        L17:
            int[] r3 = bv2.a.b
            int r0 = r0.ordinal()
            r0 = r3[r0]
        L1f:
            if (r0 == r2) goto L3c
            r2 = 1
            if (r0 == r2) goto L37
            r2 = 2
            if (r0 == r2) goto L31
            r2 = 3
            if (r0 != r2) goto L2b
            goto L3c
        L2b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L31:
            n73 r0 = e(r11)
        L35:
            r4 = r0
            goto L41
        L37:
            n73 r0 = b(r11)
            goto L35
        L3c:
            n73 r0 = a(r11)
            goto L35
        L41:
            java.util.List r0 = r11.o()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r5 = defpackage.me3.a()
            java.lang.Object r5 = r5.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L72
            int r5 = r5.intValue()
            he3 r6 = new he3
            r6.<init>(r3, r5)
            goto L73
        L72:
            r6 = r1
        L73:
            if (r6 == 0) goto L50
            r2.add(r6)
            goto L50
        L79:
            oh3 r3 = new oh3
            r3.<init>(r2)
            java.util.List r11 = r11.g()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i.w(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L93:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r11.next()
            com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData r1 = (com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData) r1
            java.util.Map r2 = defpackage.me3.a()
            java.lang.String r5 = r1.a()
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lb4
            int r2 = r2.intValue()
            goto Lb6
        Lb4:
            int r2 = com.nytimes.android.growthui.R.drawable.ic_bullet_point
        Lb6:
            w39 r5 = new w39
            he3 r6 = new he3
            java.lang.String r7 = r1.b()
            r6.<init>(r7, r2)
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.b()
            r5.<init>(r6, r2, r1)
            r0.add(r5)
            goto L93
        Ld0:
            oh3 r5 = new oh3
            r5.<init>(r0)
            com.nytimes.android.growthui.common.models.ProductType r8 = com.nytimes.android.growthui.common.models.ProductType.AllAccess
            d46 r11 = new d46
            r6 = 0
            r9 = 8
            r10 = 0
            r2 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv2.d(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData, bd5):d46");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final n73 e(GamesLandingPageData gamesLandingPageData) {
        String c;
        String d;
        List f = gamesLandingPageData.f();
        UrgencyMessageData urgencyMessageData = null;
        if (f != null) {
            Iterator it2 = f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (za7.b((UrgencyMessageData) next, 0L, 1, null)) {
                    urgencyMessageData = next;
                    break;
                }
            }
            urgencyMessageData = urgencyMessageData;
        }
        if (urgencyMessageData == null || (c = urgencyMessageData.a()) == null) {
            c = gamesLandingPageData.c();
        }
        if (urgencyMessageData == null || (d = urgencyMessageData.b()) == null) {
            d = gamesLandingPageData.d();
        }
        return new n73(c, Integer.valueOf(R.drawable.games_logo), d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if (r2 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List f(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData r7) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.zq3.h(r7, r0)
            java.util.List r0 = r7.u()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData r3 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData) r3
            r4 = 0
            r6 = 1
            boolean r2 = defpackage.za7.b(r3, r4, r6, r2)
            if (r2 == 0) goto Lf
            r2 = r1
        L27:
            com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData r2 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.SkuOverrideData) r2
            if (r2 == 0) goto L3d
            java.lang.String r0 = r2.b()
            if (r0 == 0) goto L3d
            boolean r1 = kotlin.text.h.d0(r0)
            if (r1 == 0) goto L3b
            java.lang.String r0 = r7.t()
        L3b:
            if (r0 != 0) goto L41
        L3d:
            java.lang.String r0 = r7.t()
        L41:
            if (r2 == 0) goto L55
            java.lang.String r1 = r2.d()
            if (r1 == 0) goto L55
            boolean r3 = kotlin.text.h.d0(r1)
            if (r3 == 0) goto L53
            java.lang.String r1 = r7.z()
        L53:
            if (r1 != 0) goto L59
        L55:
            java.lang.String r1 = r7.z()
        L59:
            if (r2 == 0) goto L6d
            java.lang.String r3 = r2.a()
            if (r3 == 0) goto L6d
            boolean r4 = kotlin.text.h.d0(r3)
            if (r4 == 0) goto L6b
            java.lang.String r3 = r7.r()
        L6b:
            if (r3 != 0) goto L71
        L6d:
            java.lang.String r3 = r7.r()
        L71:
            if (r2 == 0) goto L85
            java.lang.String r2 = r2.c()
            if (r2 == 0) goto L85
            boolean r4 = kotlin.text.h.d0(r2)
            if (r4 == 0) goto L83
            java.lang.String r2 = r7.x()
        L83:
            if (r2 != 0) goto L89
        L85:
            java.lang.String r2 = r7.x()
        L89:
            java.lang.String[] r7 = new java.lang.String[]{r0, r1, r3, r2}
            java.util.List r7 = kotlin.collections.i.o(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb3
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.text.h.d0(r2)
            if (r2 != 0) goto L9c
            r0.add(r1)
            goto L9c
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv2.f(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData):java.util.List");
    }

    public static final dy3 g(GamesLandingPageData gamesLandingPageData, Map map) {
        d46 d;
        zq3.h(gamesLandingPageData, "<this>");
        zq3.h(map, "offers");
        PagerState pagerState = new PagerState(0, 1, null);
        List<String> v = gamesLandingPageData.v();
        ArrayList arrayList = new ArrayList(i.w(v, 10));
        for (String str : v) {
            arrayList.add(new f46(m(gamesLandingPageData, str), str));
        }
        g46 g46Var = new g46(pagerState, arrayList);
        fy3.c cVar = new fy3.c(g46Var);
        List b = g46Var.b();
        ArrayList arrayList2 = new ArrayList(i.w(b, 10));
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            int i = a.a[((f46) it2.next()).b().ordinal()];
            if (i == 1) {
                d = d(gamesLandingPageData, c(gamesLandingPageData, map));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                d = k(gamesLandingPageData, j(gamesLandingPageData, map));
            }
            arrayList2.add(d);
        }
        return new dy3(cVar, new oh3(arrayList2), false, gamesLandingPageData.p(), 4, null);
    }

    private static final n73 h(GamesLandingPageData gamesLandingPageData) {
        return new n73(gamesLandingPageData.j(), Integer.valueOf(R.drawable.games_logo), gamesLandingPageData.k());
    }

    private static final n73 i(GamesLandingPageData gamesLandingPageData) {
        String h = gamesLandingPageData.h();
        if (h.d0(h)) {
            h = gamesLandingPageData.j();
        }
        return new n73(h, Integer.valueOf(R.drawable.games_logo), gamesLandingPageData.i());
    }

    private static final bd5 j(GamesLandingPageData gamesLandingPageData, Map map) {
        Object obj;
        String a2;
        String a3;
        String a4;
        String a5;
        Iterator it2 = gamesLandingPageData.u().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (za7.b((SkuOverrideData) obj, 0L, 1, null)) {
                break;
            }
        }
        SkuOverrideData skuOverrideData = (SkuOverrideData) obj;
        ArrayList arrayList = new ArrayList();
        String d = skuOverrideData != null ? skuOverrideData.d() : null;
        if (d != null && !h.d0(d)) {
            zc5 zc5Var = (zc5) map.get(skuOverrideData != null ? skuOverrideData.d() : null);
            if (zc5Var != null) {
                BadgeDetailsData y = gamesLandingPageData.y();
                arrayList.add(zc5.b(zc5Var, (y == null || (a5 = y.a()) == null) ? "" : a5, null, null, !zq3.c(zc5Var.e(), gamesLandingPageData.z()), ProductType.StandAlone, 6, null));
            }
        }
        String b = skuOverrideData != null ? skuOverrideData.b() : null;
        if (b != null && !h.d0(b)) {
            zc5 zc5Var2 = (zc5) map.get(skuOverrideData != null ? skuOverrideData.b() : null);
            if (zc5Var2 != null) {
                BadgeDetailsData s = gamesLandingPageData.s();
                arrayList.add(zc5.b(zc5Var2, (s == null || (a4 = s.a()) == null) ? "" : a4, null, null, !zq3.c(zc5Var2.e(), gamesLandingPageData.t()), ProductType.StandAlone, 6, null));
            }
        }
        if (arrayList.isEmpty()) {
            zc5 zc5Var3 = (zc5) map.get(gamesLandingPageData.z());
            if (zc5Var3 != null) {
                BadgeDetailsData y2 = gamesLandingPageData.y();
                arrayList.add(zc5.b(zc5Var3, (y2 == null || (a3 = y2.a()) == null) ? "" : a3, null, null, false, ProductType.StandAlone, 6, null));
            }
            zc5 zc5Var4 = (zc5) map.get(gamesLandingPageData.t());
            if (zc5Var4 != null) {
                BadgeDetailsData s2 = gamesLandingPageData.s();
                arrayList.add(zc5.b(zc5Var4, (s2 == null || (a2 = s2.a()) == null) ? "" : a2, null, null, false, ProductType.StandAlone, 6, null));
            }
        }
        return bd5.Companion.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.d46 k(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData r11, defpackage.bd5 r12) {
        /*
            boolean r0 = r12 instanceof bd5.c
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r12
            bd5$c r0 = (bd5.c) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L11
            com.nytimes.android.growthui.common.models.config.OffersMessageType r0 = r0.a()
            goto L12
        L11:
            r0 = r1
        L12:
            r2 = -1
            if (r0 != 0) goto L17
            r0 = r2
            goto L1f
        L17:
            int[] r3 = bv2.a.b
            int r0 = r0.ordinal()
            r0 = r3[r0]
        L1f:
            if (r0 == r2) goto L3c
            r2 = 1
            if (r0 == r2) goto L37
            r2 = 2
            if (r0 == r2) goto L31
            r2 = 3
            if (r0 != r2) goto L2b
            goto L3c
        L2b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L31:
            n73 r0 = l(r11)
        L35:
            r4 = r0
            goto L41
        L37:
            n73 r0 = i(r11)
            goto L35
        L3c:
            n73 r0 = h(r11)
            goto L35
        L41:
            java.util.List r0 = r11.o()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r5 = defpackage.me3.a()
            java.lang.Object r5 = r5.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L72
            int r5 = r5.intValue()
            he3 r6 = new he3
            r6.<init>(r3, r5)
            goto L73
        L72:
            r6 = r1
        L73:
            if (r6 == 0) goto L50
            r2.add(r6)
            goto L50
        L79:
            oh3 r3 = new oh3
            r3.<init>(r2)
            java.util.List r11 = r11.n()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.i.w(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L93:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r11.next()
            com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData r1 = (com.nytimes.android.growthui.common.models.remoteconfig.ValuePropData) r1
            java.util.Map r2 = defpackage.me3.a()
            java.lang.String r5 = r1.a()
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto Lb4
            int r2 = r2.intValue()
            goto Lb6
        Lb4:
            int r2 = com.nytimes.android.growthui.R.drawable.ic_bullet_point
        Lb6:
            w39 r5 = new w39
            he3 r6 = new he3
            java.lang.String r7 = r1.c()
            r6.<init>(r7, r2)
            java.lang.String r2 = r1.c()
            java.lang.String r1 = r1.b()
            r5.<init>(r6, r2, r1)
            r0.add(r5)
            goto L93
        Ld0:
            oh3 r5 = new oh3
            r5.<init>(r0)
            com.nytimes.android.growthui.common.models.ProductType r8 = com.nytimes.android.growthui.common.models.ProductType.StandAlone
            d46 r11 = new d46
            r6 = 0
            r9 = 8
            r10 = 0
            r2 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv2.k(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData, bd5):d46");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final n73 l(GamesLandingPageData gamesLandingPageData) {
        String j;
        String k;
        List m = gamesLandingPageData.m();
        UrgencyMessageData urgencyMessageData = null;
        if (m != null) {
            Iterator it2 = m.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (za7.b((UrgencyMessageData) next, 0L, 1, null)) {
                    urgencyMessageData = next;
                    break;
                }
            }
            urgencyMessageData = urgencyMessageData;
        }
        if (urgencyMessageData == null || (j = urgencyMessageData.a()) == null) {
            j = gamesLandingPageData.j();
        }
        if (urgencyMessageData == null || (k = urgencyMessageData.b()) == null) {
            k = gamesLandingPageData.k();
        }
        return new n73(j, Integer.valueOf(R.drawable.games_logo), k);
    }

    private static final ProductType m(GamesLandingPageData gamesLandingPageData, String str) {
        return zq3.c(str, gamesLandingPageData.e()) ? ProductType.AllAccess : ProductType.StandAlone;
    }
}
