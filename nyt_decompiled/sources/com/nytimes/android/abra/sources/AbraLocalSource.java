package com.nytimes.android.abra.sources;

import com.nytimes.android.abra.allocator.AbraAllocator;
import com.nytimes.android.abra.allocator.AllocationResult;
import com.nytimes.android.abra.allocator.AllocatorListener;
import com.nytimes.android.abra.di.AbraModule;
import com.nytimes.android.abra.models.AbraMetaData;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import com.nytimes.android.abra.sources.AbraSource;
import com.nytimes.android.abra.utilities.AbraLogger;
import defpackage.b04;
import defpackage.by0;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class AbraLocalSource implements AbraSource, AllocatorListener {
    private final c04 abraAllocator$delegate;
    private final b04 abraAllocatorLazy;
    private final Map<String, Deferred<AbraTest>> abraCache;
    private final CoroutineScope scope;
    private List<? extends TestSpec> testSpecList;

    public AbraLocalSource(b04 b04Var, @AbraModule.AbraAllocatorScope CoroutineScope coroutineScope) {
        zq3.h(b04Var, "abraAllocatorLazy");
        zq3.h(coroutineScope, "scope");
        this.abraAllocatorLazy = b04Var;
        this.scope = coroutineScope;
        this.abraCache = new LinkedHashMap();
        this.abraAllocator$delegate = c.a(new qs2() { // from class: com.nytimes.android.abra.sources.AbraLocalSource$abraAllocator$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AbraAllocator mo865invoke() {
                b04 b04Var2;
                b04Var2 = AbraLocalSource.this.abraAllocatorLazy;
                AbraAllocator abraAllocator = (AbraAllocator) b04Var2.get();
                abraAllocator.addListener(AbraLocalSource.this);
                return abraAllocator;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitTest(String str, by0<? super AbraTest> by0Var) {
        getAbraAllocator().checkForUpdates();
        Deferred<AbraTest> deferred = this.abraCache.get(str);
        if (deferred == null) {
            return null;
        }
        Object await = deferred.await(by0Var);
        return await == a.h() ? await : (AbraTest) await;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbraTest buildAbraTest(TestSpec testSpec, AllocationResult allocationResult) {
        AbraTest abraTest;
        if (allocationResult instanceof AllocationResult.Success) {
            AllocationResult.Success success = (AllocationResult.Success) allocationResult;
            abraTest = new AbraTest(testSpec.getTestName(), success.getVariant(), new AbraMetaData(success.getVariant(), success.getVariant(), String.valueOf(allocationResult.getRulesVersion()), false, allocationResult.getIntegration(), allocationResult.getInput()));
        } else if (allocationResult instanceof AllocationResult.SuccessNull) {
            abraTest = new AbraTest(testSpec.getTestName(), testSpec.getDefaultVariant(), new AbraMetaData(null, testSpec.getDefaultVariant(), String.valueOf(allocationResult.getRulesVersion()), false, allocationResult.getIntegration(), allocationResult.getInput()));
        } else {
            if (!(allocationResult instanceof AllocationResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            abraTest = new AbraTest(testSpec.getTestName(), testSpec.getDefaultVariant(), new AbraMetaData(null, testSpec.getDefaultVariant(), String.valueOf(allocationResult.getRulesVersion()), true, allocationResult.getIntegration(), allocationResult.getInput()));
        }
        AbraLogger.INSTANCE.d(testSpec + ".testName = " + abraTest, "AbraLocalSource.buildAbraTest");
        return abraTest;
    }

    public static /* synthetic */ void getAbraCache$annotations() {
    }

    public static /* synthetic */ void getTestSpecList$annotations() {
    }

    public final AbraAllocator getAbraAllocator() {
        Object value = this.abraAllocator$delegate.getValue();
        zq3.g(value, "getValue(...)");
        return (AbraAllocator) value;
    }

    public final Map<String, Deferred<AbraTest>> getAbraCache() {
        return this.abraCache;
    }

    @Override // com.nytimes.android.abra.sources.AbraSource
    public AbraTest getTest(String str) {
        Object runBlocking$default;
        zq3.h(str, "testName");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AbraLocalSource$getTest$1(this, str, null), 1, null);
        return (AbraTest) runBlocking$default;
    }

    public final List<TestSpec> getTestSpecList() {
        return this.testSpecList;
    }

    @Override // com.nytimes.android.abra.sources.AbraSource
    public void loadTests(List<? extends TestSpec> list, boolean z) {
        Deferred<AbraTest> async$default;
        zq3.h(list, "testSpecList");
        this.testSpecList = list;
        for (TestSpec testSpec : list) {
            if (this.abraCache.get(testSpec.getTestName()) == null || !testSpec.isLocked() || z) {
                Map<String, Deferred<AbraTest>> map = this.abraCache;
                String testName = testSpec.getTestName();
                async$default = BuildersKt__Builders_commonKt.async$default(this.scope, Dispatchers.getDefault(), null, new AbraLocalSource$loadTests$1$1(this, testSpec, null), 2, null);
                map.put(testName, async$default);
            }
        }
        AbraLogger.INSTANCE.d("abraCache loaded. " + this.abraCache, "AbraLocalSource.loadTests");
    }

    @Override // com.nytimes.android.abra.allocator.AllocatorListener
    public void onAllocatorUpdate() {
        AbraLogger.INSTANCE.d("Updating allocations", "AbraLocalSource.onAllocatorUpdate");
        List<? extends TestSpec> list = this.testSpecList;
        if (list != null) {
            AbraSource.DefaultImpls.loadTests$default(this, list, false, 2, null);
        }
    }

    public final void setTestSpecList(List<? extends TestSpec> list) {
        this.testSpecList = list;
    }
}
