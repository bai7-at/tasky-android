package com.nytimes.android.ads.utils;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes2.dex */
public abstract class AdExtensionsKt {
    public static final String a(int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            return "bottom";
        }
        return "mid" + i3;
    }

    public static final String b(AbraManager abraManager) {
        zq3.h(abraManager, "<this>");
        List<AbraTest> allTests = abraManager.getAllTests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allTests) {
            if (h.I(((AbraTest) obj).getTestName(), "dfp_", true)) {
                arrayList.add(obj);
            }
        }
        return i.u0(arrayList, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.ads.utils.AdExtensionsKt$getAbraDfpVariants$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(AbraTest abraTest) {
                zq3.h(abraTest, "it");
                String testName = abraTest.getTestName();
                Locale locale = Locale.ROOT;
                String lowerCase = testName.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                String lowerCase2 = abraTest.getVariant().toLowerCase(locale);
                zq3.g(lowerCase2, "toLowerCase(...)");
                return lowerCase + QueryKeys.END_MARKER + lowerCase2;
            }
        }, 30, null);
    }
}
