package com.nytimes.android.ad;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class AbraKVPs {
    public static final a Companion = new a(null);
    private final AbraManager a;
    private String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbraKVPs(AbraManager abraManager) {
        zq3.h(abraManager, "manager");
        this.a = abraManager;
        this.b = "";
    }

    public final String a() {
        List<AbraTest> allTests = this.a.getAllTests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allTests) {
            if (h.N(((AbraTest) obj).getTestName(), "dfp", true)) {
                arrayList.add(obj);
            }
        }
        return i.u0(arrayList, ",", null, null, 0, null, new ss2() { // from class: com.nytimes.android.ad.AbraKVPs$variantsAndValues$2
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
