package com.nytimes.android.abra.utilities;

import com.nytimes.android.abra.models.AbraTest;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes2.dex */
public interface TestReporter {

    public static final class DefaultImpls {
        public static void allocateTest(TestReporter testReporter, String str, String str2) {
            zq3.h(str, "testName");
            zq3.h(str2, "variantName");
        }

        public static void exposeTest(TestReporter testReporter, String str, String str2) {
            zq3.h(str, "testName");
            zq3.h(str2, "variantName");
        }
    }

    void allocateTest(String str, String str2);

    void exposeTest(AbraTest abraTest, Map<String, ? extends Object> map);

    void exposeTest(String str, String str2);
}
