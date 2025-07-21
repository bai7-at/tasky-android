package defpackage;

import com.amazonaws.util.DateUtils;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.database.userdata.regi.RegiData;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscription;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionOwnershipStatus;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionStatus;
import com.nytimes.android.subauth.core.database.userdata.subscription.b;
import defpackage.yz8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class wz8 {
    public static final a Companion = new a(null);
    private final SubauthListenerManager a;
    private final SimpleDateFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public wz8(SubauthListenerManager subauthListenerManager) {
        zq3.h(subauthListenerManager, "subauthListenerManager");
        this.a = subauthListenerManager;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
        TimeZone.getTimeZone("GMT");
        this.b = simpleDateFormat;
    }

    private final Date a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        try {
            return this.b.parse(str);
        } catch (ParseException unused) {
            ul8.a.z("SUBAUTH").d("Unable to parse date from UserDetails: " + str, new Object[0]);
            this.a.n(str2, str3, str);
            return null;
        }
    }

    private final UserSubscription b(yz8.h hVar) {
        String r = hVar.r();
        UserSubscriptionStatus.a aVar = UserSubscriptionStatus.Companion;
        com.nytimes.android.subauth.core.type.UserSubscriptionStatus p = hVar.p();
        UserSubscriptionStatus a2 = aVar.a(p != null ? p.getRawValue() : null);
        UserSubscriptionOwnershipStatus a3 = UserSubscriptionOwnershipStatus.Companion.a(hVar.m().getRawValue());
        String d = hVar.d();
        Object o = hVar.o();
        Date a4 = a(o != null ? o.toString() : null, r, "startDate");
        Object f = hVar.f();
        Date a5 = a(f != null ? f.toString() : null, r, "endDate");
        Object i = hVar.i();
        Date a6 = a(i != null ? i.toString() : null, r, "gracePeriodStartDate");
        Object h = hVar.h();
        Date a7 = a(h != null ? h.toString() : null, r, "gracePeriodEndDate");
        Object e = hVar.e();
        Date a8 = a(e != null ? e.toString() : null, r, "cancellationDate");
        boolean t = hVar.t();
        Boolean k = hVar.k();
        boolean booleanValue = k != null ? k.booleanValue() : false;
        Boolean l = hVar.l();
        boolean booleanValue2 = l != null ? l.booleanValue() : false;
        String c = hVar.c();
        String n = hVar.n();
        List d2 = d(hVar.s());
        List q = hVar.q();
        Boolean j = hVar.j();
        return new UserSubscription(r, a2, a3, d, a4, a5, a6, a7, a8, t, booleanValue, booleanValue2, c, n, d2, q, j != null ? j.booleanValue() : false, c(hVar.g()));
    }

    private final Set c(List list) {
        List h0 = i.h0(list);
        ArrayList arrayList = new ArrayList(i.w(h0, 10));
        Iterator it2 = h0.iterator();
        while (it2.hasNext()) {
            arrayList.add(com.nytimes.android.subauth.core.database.userdata.subscription.a.b((String) it2.next()));
        }
        return i.c1(arrayList);
    }

    private final List d(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(b.a((String) it2.next()));
        }
        return arrayList;
    }

    public final RegiData e(yz8.i iVar) {
        List l;
        yz8.e a2;
        yz8.a a3;
        zq3.h(iVar, "user");
        yz8.f b = iVar.b();
        String c = iVar.c();
        yz8.d a4 = iVar.a();
        String a5 = a4 != null ? a4.a() : null;
        String a6 = b != null ? b.a() : null;
        String e = b != null ? b.e() : null;
        String d = b != null ? b.d() : null;
        String b2 = b != null ? b.b() : null;
        String f = b != null ? b.f() : null;
        String c2 = b != null ? b.c() : null;
        yz8.g d2 = iVar.d();
        mz8 mz8Var = new mz8(c, a5, a6, e, d, b2, f, c2, (d2 == null || (a2 = d2.a()) == null || (a3 = a2.a()) == null) ? null : a3.a());
        List e2 = iVar.e();
        if (e2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : e2) {
                if (zq3.c(((yz8.h) obj).j(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
            l = new ArrayList(i.w(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                l.add(b((yz8.h) it2.next()));
            }
        } else {
            l = i.l();
        }
        return new RegiData(mz8Var, l);
    }
}
