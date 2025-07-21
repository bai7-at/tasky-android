package com.nytimes.android.libs.messagingarchitecture.network;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.libs.messagingarchitecture.betasettings.EntitlementOption;
import defpackage.at3;
import defpackage.cb2;
import defpackage.u0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {
    private final u0 a;
    private final AbraManager b;
    private final cb2 c;

    public a(u0 u0Var, AbraManager abraManager, cb2 cb2Var) {
        zq3.h(u0Var, "abraParamProvider");
        zq3.h(abraManager, "abraManager");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = u0Var;
        this.b = abraManager;
        this.c = cb2Var;
    }

    public final String a() {
        Map overrides;
        if (!this.c.J() || (overrides = this.a.getOverrides()) == null || overrides.isEmpty()) {
            return null;
        }
        String integration = this.a.getIntegration();
        List<AbraTest> allTests = this.b.getAllTests();
        ArrayList arrayList = new ArrayList(i.w(allTests, 10));
        for (AbraTest abraTest : allTests) {
            arrayList.add(new TestOverride(integration, abraTest.getTestName(), abraTest.getVariant()));
        }
        AbraOverrides abraOverrides = new AbraOverrides(arrayList);
        at3.a aVar = at3.d;
        aVar.a();
        return aVar.b(AbraOverrides.Companion.serializer(), abraOverrides);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b() {
        String str = null;
        Object[] objArr = 0;
        if (!this.c.K()) {
            return null;
        }
        EntitlementOption[] values = EntitlementOption.values();
        ArrayList arrayList = new ArrayList();
        for (EntitlementOption entitlementOption : values) {
            if (this.c.d(entitlementOption.name())) {
                arrayList.add(entitlementOption);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EntitlementOption) it2.next()).getSummary());
        }
        SubInfoOverrides subInfoOverrides = new SubInfoOverrides(new SubInfoData(str, i.d0(arrayList2), 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0)));
        at3.a aVar = at3.d;
        aVar.a();
        return aVar.b(SubInfoOverrides.Companion.serializer(), subInfoOverrides);
    }
}
