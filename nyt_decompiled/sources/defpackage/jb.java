package defpackage;

import com.nytimes.android.growthui.common.models.ProductType;
import com.nytimes.android.growthui.common.models.config.OffersMessageType;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessUrgencyMessageData;
import defpackage.fy3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class jb {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OffersMessageType.values().length];
            try {
                iArr[OffersMessageType.FreeTrialMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OffersMessageType.SaleMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OffersMessageType.BauMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r7) {
        /*
            java.lang.String r0 = "<this>"
            defpackage.zq3.h(r7, r0)
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r0 = r7.a()
            java.util.List r0 = r0.h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData r3 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData) r3
            r4 = 0
            r6 = 1
            boolean r2 = defpackage.za7.b(r3, r4, r6, r2)
            if (r2 == 0) goto L13
            r2 = r1
        L2b:
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData r2 = (com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessSkuOverrideData) r2
            if (r2 == 0) goto L45
            java.lang.String r0 = r2.a()
            if (r0 == 0) goto L45
            boolean r1 = kotlin.text.h.d0(r0)
            if (r1 == 0) goto L43
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r0 = r7.a()
            java.lang.String r0 = r0.f()
        L43:
            if (r0 != 0) goto L4d
        L45:
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r0 = r7.a()
            java.lang.String r0 = r0.f()
        L4d:
            if (r2 == 0) goto L65
            java.lang.String r1 = r2.b()
            if (r1 == 0) goto L65
            boolean r2 = kotlin.text.h.d0(r1)
            if (r2 == 0) goto L63
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r1 = r7.a()
            java.lang.String r1 = r1.j()
        L63:
            if (r1 != 0) goto L6d
        L65:
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r7 = r7.a()
            java.lang.String r1 = r7.j()
        L6d:
            java.lang.String[] r7 = new java.lang.String[]{r0, r1}
            java.util.List r7 = kotlin.collections.i.o(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L80:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.text.h.d0(r2)
            if (r2 != 0) goto L80
            r0.add(r1)
            goto L80
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.a(com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData):java.util.List");
    }

    public static final dy3 b(AllAccessLandingPageData allAccessLandingPageData, Map map) {
        zq3.h(allAccessLandingPageData, "<this>");
        zq3.h(map, "offers");
        return new dy3(fy3.a.a, new oh3(i.e(f(allAccessLandingPageData, e(allAccessLandingPageData, map)))), false, allAccessLandingPageData.c(), 4, null);
    }

    private static final n73 c(AllAccessLandingPageData allAccessLandingPageData) {
        return new n73(allAccessLandingPageData.a().d(), null, allAccessLandingPageData.a().i());
    }

    private static final n73 d(AllAccessLandingPageData allAccessLandingPageData) {
        String b = allAccessLandingPageData.a().b();
        if (h.d0(b)) {
            b = allAccessLandingPageData.a().d();
        }
        return new n73(b, null, allAccessLandingPageData.a().c());
    }

    private static final bd5 e(AllAccessLandingPageData allAccessLandingPageData, Map map) {
        Object obj;
        Iterator it2 = allAccessLandingPageData.a().h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (za7.b((AllAccessSkuOverrideData) obj, 0L, 1, null)) {
                break;
            }
        }
        AllAccessSkuOverrideData allAccessSkuOverrideData = (AllAccessSkuOverrideData) obj;
        ArrayList arrayList = new ArrayList();
        String b = allAccessSkuOverrideData != null ? allAccessSkuOverrideData.b() : null;
        if (b != null && !h.d0(b)) {
            zc5 zc5Var = (zc5) map.get(allAccessSkuOverrideData != null ? allAccessSkuOverrideData.b() : null);
            if (zc5Var != null) {
                arrayList.add(zc5.b(zc5Var, allAccessLandingPageData.a().k(), null, null, !zq3.c(zc5Var.e(), allAccessLandingPageData.a().j()), ProductType.AllAccess, 6, null));
            }
        }
        String a2 = allAccessSkuOverrideData != null ? allAccessSkuOverrideData.a() : null;
        if (a2 != null && !h.d0(a2)) {
            zc5 zc5Var2 = (zc5) map.get(allAccessSkuOverrideData != null ? allAccessSkuOverrideData.a() : null);
            if (zc5Var2 != null) {
                arrayList.add(zc5.b(zc5Var2, allAccessLandingPageData.a().g(), null, null, !zq3.c(zc5Var2.e(), allAccessLandingPageData.a().f()), ProductType.AllAccess, 6, null));
            }
        }
        if (arrayList.isEmpty()) {
            zc5 zc5Var3 = (zc5) map.get(allAccessLandingPageData.a().j());
            if (zc5Var3 != null) {
                arrayList.add(zc5.b(zc5Var3, allAccessLandingPageData.a().k(), null, null, false, ProductType.AllAccess, 6, null));
            }
            zc5 zc5Var4 = (zc5) map.get(allAccessLandingPageData.a().f());
            if (zc5Var4 != null) {
                arrayList.add(zc5.b(zc5Var4, allAccessLandingPageData.a().g(), null, null, false, ProductType.AllAccess, 6, null));
            }
        }
        return bd5.Companion.a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.d46 f(com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData r9, defpackage.bd5 r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.f(com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData, bd5):d46");
    }

    private static final n73 g(AllAccessLandingPageData allAccessLandingPageData) {
        AllAccessUrgencyMessageData allAccessUrgencyMessageData;
        String d;
        String i;
        Object obj;
        List d2 = allAccessLandingPageData.d();
        if (d2 != null) {
            Iterator it2 = d2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (za7.b((AllAccessUrgencyMessageData) obj, 0L, 1, null)) {
                    break;
                }
            }
            allAccessUrgencyMessageData = (AllAccessUrgencyMessageData) obj;
        } else {
            allAccessUrgencyMessageData = null;
        }
        if (allAccessUrgencyMessageData == null || (d = allAccessUrgencyMessageData.a()) == null) {
            d = allAccessLandingPageData.a().d();
        }
        if (allAccessUrgencyMessageData == null || (i = allAccessUrgencyMessageData.b()) == null) {
            i = allAccessLandingPageData.a().i();
        }
        return new n73(d, null, i);
    }
}
