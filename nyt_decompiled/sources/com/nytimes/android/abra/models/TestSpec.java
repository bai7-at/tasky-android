package com.nytimes.android.abra.models;

import com.nytimes.android.abra.AbraVariant;
import java.util.List;

/* loaded from: classes2.dex */
public interface TestSpec {

    public static final class DefaultImpls {
        public static Class<?> getDataType(TestSpec testSpec) {
            return null;
        }

        public static boolean isLocked(TestSpec testSpec) {
            return true;
        }
    }

    Class<?> getDataType();

    String getDefaultVariant();

    String getTestName();

    AbraVariant getTestType(String str);

    List<String> getVariants();

    boolean isLocked();
}
