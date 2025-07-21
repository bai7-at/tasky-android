package com.nytimes.abtests;

import com.nytimes.abtests.targeting.EarlyTenuredUsersVariants;
import com.nytimes.abtests.targeting.NonGamePlayerVariants;
import defpackage.dc7;
import defpackage.du8;
import defpackage.ee4;
import defpackage.nr;
import defpackage.vu3;
import defpackage.yn8;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes3.dex */
public abstract class b {
    private static final Map a = t.m(du8.a(DFPToggleGMAVariants.Companion.a(), i.l()), du8.a(DFPDemoVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(DFPOneWebviewHPVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(RtpElectionVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(HybridAdToggleVariants.Companion.a(), i.l()), du8.a(ChartbeatDomainVariants.Companion.a(), i.e(zt6.b(nr.class))), du8.a(AppFakeTestVariants.Companion.a(), i.e(zt6.b(ee4.class))), du8.a(AppFakeTestStickyVariants.Companion.a(), i.e(zt6.b(ee4.class))), du8.a(PushColumnsVariants.Companion.a(), i.l()), du8.a(PushPromoArticleVariants.Companion.a(), i.l()), du8.a(LegalDynamicLibrariesVariants.Companion.a(), i.l()), du8.a(SavedForLaterHoldoutVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(IterateSurveyVariants.Companion.a(), i.e(zt6.b(nr.class))), du8.a(FakeTrafficTestVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(EarlyTenuredUsersVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(NonGamePlayerVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(BarOneVariants.Companion.a(), i.l()), du8.a(ConnectionsVariants.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(RegiAllocHoldout.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(GraceTruncatorVariants.Companion.a(), i.l()), du8.a(SynthVoice.Companion.a(), i.l()), du8.a(UnlimitedGiftShare.Companion.c(), i.e(zt6.b(yn8.class))), du8.a(MessagingOmaMigration.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(XPNTestVariants.Companion.a(), i.e(zt6.b(ee4.class))), du8.a(GrowthUIPostAuthVariants.Companion.a(), i.l()), du8.a(GrowthUIRegibundleVariants.Companion.a(), i.l()), du8.a(GrowthUIPaywallVariants.Companion.a(), i.l()), du8.a(GrowthUIWordlebotPaywallVariants.Companion.a(), i.l()), du8.a(NewInterestsMessaging.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(InterestsUpdatedBadging.Companion.a(), i.e(zt6.b(ee4.class))), du8.a(YouTabNameDisplay.Companion.a(), i.e(zt6.b(yn8.class))), du8.a(SHAAndroidShareSheet0125.Companion.b(), i.e(zt6.b(yn8.class))));

    public static final List a() {
        return i.X0(a.keySet());
    }

    public static final List b(dc7 dc7Var) {
        zq3.h(dc7Var, "screen");
        Map map = a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Iterable iterable = (Iterable) entry.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((vu3) it2.next()).b(dc7Var)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        return i.X0(linkedHashMap.keySet());
    }
}
