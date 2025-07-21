package com.nytimes.android.abra.sources;

import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import java.util.List;

/* loaded from: classes2.dex */
public interface AbraSource {

    public static final class DefaultImpls {
        public static /* synthetic */ void loadTests$default(AbraSource abraSource, List list, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTests");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            abraSource.loadTests(list, z);
        }
    }

    AbraTest getTest(String str);

    void loadTests(List<? extends TestSpec> list, boolean z);
}
