package com.nytimes.android.abra;

import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import defpackage.by0;
import defpackage.ww8;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public interface AbraManager {

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void exposeTest$default(AbraManager abraManager, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposeTest");
            }
            if ((i & 2) != 0) {
                map = t.i();
            }
            abraManager.exposeTest(str, map);
        }
    }

    void allocateTest(String str);

    void exposeTest(String str, Map<String, ? extends Object> map);

    Object forceRefresh(by0<? super ww8> by0Var);

    List<AbraTest> getAllTests();

    String getBundledRulesVersion();

    String getRulesVersion();

    AbraTest getTest(String str);

    AbraVariant getTestType(String str);

    void initializeManager();

    void registerSpec(TestSpec testSpec);

    void registerTestSpecs(List<? extends TestSpec> list);
}
