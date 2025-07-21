package com.nytimes.android.abra;

import com.nytimes.android.abra.allocator.AbraAllocator;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import com.nytimes.android.abra.sources.AbraSource;
import com.nytimes.android.abra.utilities.AbraLogger;
import com.nytimes.android.abra.utilities.JsonExtensionsKt;
import com.nytimes.android.abra.utilities.TestReporter;
import defpackage.b04;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes2.dex */
public final class AbraManagerImpl implements AbraManager {
    private final b04 abraAllocator;
    private final AbraNetworkUpdater abraNetworkUpdater;
    private final AbraSource abraSource;
    private final TestReporter reporter;
    private final ResourceProvider resourceProvider;
    private final Map<String, TestSpec> specMap;

    public AbraManagerImpl(TestReporter testReporter, AbraSource abraSource, AbraNetworkUpdater abraNetworkUpdater, b04 b04Var, ResourceProvider resourceProvider) {
        zq3.h(testReporter, "reporter");
        zq3.h(abraSource, "abraSource");
        zq3.h(abraNetworkUpdater, "abraNetworkUpdater");
        zq3.h(b04Var, "abraAllocator");
        zq3.h(resourceProvider, "resourceProvider");
        this.reporter = testReporter;
        this.abraSource = abraSource;
        this.abraNetworkUpdater = abraNetworkUpdater;
        this.abraAllocator = b04Var;
        this.resourceProvider = resourceProvider;
        this.specMap = new LinkedHashMap();
    }

    @Override // com.nytimes.android.abra.AbraManager
    public void allocateTest(String str) {
        ww8 ww8Var;
        zq3.h(str, "testName");
        AbraTest test = this.abraSource.getTest(str);
        if (test != null) {
            this.reporter.allocateTest(test.getTestName(), test.getVariant());
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            AbraLogger.INSTANCE.e(str + " not found", "AbraManager.allocateTest");
        }
    }

    @Override // com.nytimes.android.abra.AbraManager
    public void exposeTest(String str, Map<String, ? extends Object> map) {
        ww8 ww8Var;
        zq3.h(str, "testName");
        zq3.h(map, "extra");
        AbraTest test = this.abraSource.getTest(str);
        if (test != null) {
            this.reporter.exposeTest(test, map);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            AbraLogger.INSTANCE.e(str + " not found", "AbraManager.exposeTest");
        }
    }

    @Override // com.nytimes.android.abra.AbraManager
    public Object forceRefresh(by0<? super ww8> by0Var) {
        Object updateAbra = this.abraNetworkUpdater.updateAbra(by0Var);
        return updateAbra == a.h() ? updateAbra : ww8.a;
    }

    @Override // com.nytimes.android.abra.AbraManager
    public List<AbraTest> getAllTests() {
        Set<String> keySet = this.specMap.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            AbraTest test = this.abraSource.getTest((String) it2.next());
            if (test != null) {
                arrayList.add(test);
            }
        }
        return arrayList;
    }

    @Override // com.nytimes.android.abra.AbraManager
    public String getBundledRulesVersion() {
        return String.valueOf(JsonExtensionsKt.getAbraVersion(this.resourceProvider.getAbraRules()));
    }

    @Override // com.nytimes.android.abra.AbraManager
    public String getRulesVersion() {
        return String.valueOf(((AbraAllocator) this.abraAllocator.get()).getRulesVersion());
    }

    @Override // com.nytimes.android.abra.AbraManager
    public AbraTest getTest(String str) {
        zq3.h(str, "testName");
        AbraTest test = this.abraSource.getTest(str);
        AbraLogger.INSTANCE.i(str + " = " + test, "AbraManager.getTest");
        return test;
    }

    @Override // com.nytimes.android.abra.AbraManager
    public AbraVariant getTestType(String str) {
        zq3.h(str, "testName");
        AbraTest test = this.abraSource.getTest(str);
        if (test != null) {
            TestSpec testSpec = this.specMap.get(test.getTestName());
            if (testSpec != null) {
                return testSpec.getTestType(test.getVariant());
            }
            return null;
        }
        AbraLogger.INSTANCE.e("Test does not exist for " + str, "AbraManager.getTestType");
        return null;
    }

    @Override // com.nytimes.android.abra.AbraManager
    public void initializeManager() {
        this.abraSource.loadTests(i.X0(this.specMap.values()), true);
    }

    @Override // com.nytimes.android.abra.AbraManager
    public void registerSpec(TestSpec testSpec) {
        zq3.h(testSpec, "spec");
        this.specMap.put(testSpec.getTestName(), testSpec);
    }

    @Override // com.nytimes.android.abra.AbraManager
    public void registerTestSpecs(List<? extends TestSpec> list) {
        zq3.h(list, "specList");
        for (TestSpec testSpec : list) {
            this.specMap.put(testSpec.getTestName(), testSpec);
        }
    }
}
