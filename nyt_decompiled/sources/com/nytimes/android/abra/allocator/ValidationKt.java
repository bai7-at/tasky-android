package com.nytimes.android.abra.allocator;

import com.nytimes.android.abra.utilities.AbraLogger;
import com.squareup.duktape.Duktape;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class ValidationKt {
    public static final boolean isValidJs(String str, String str2, ResourceProvider resourceProvider, DuktapeClient duktapeClient) {
        zq3.h(str, "jsCode");
        zq3.h(str2, "rules");
        zq3.h(resourceProvider, "resourceProvider");
        zq3.h(duktapeClient, "duktapeClient");
        try {
            if (!h.d0(str)) {
                String str3 = str + "\n" + resourceProvider.getAbraGlobal();
                zq3.g(str3, "toString(...)");
                duktapeClient.evaluate(str3);
                duktapeClient.get("AbraInterface", AbraInterface.class).getVariant(str2, "{}", "{}", false, "");
                duktapeClient.close();
                return true;
            }
        } catch (Exception e) {
            AbraLogger.e$default(AbraLogger.INSTANCE, "Validation Failure: " + e.getMessage(), null, 2, null);
        }
        return false;
    }

    public static /* synthetic */ boolean isValidJs$default(String str, String str2, ResourceProvider resourceProvider, DuktapeClient duktapeClient, int i, Object obj) {
        if ((i & 8) != 0) {
            duktapeClient = new DuktapeClient(new qs2() { // from class: com.nytimes.android.abra.allocator.ValidationKt$isValidJs$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Duktape mo865invoke() {
                    Duktape create = Duktape.create();
                    zq3.g(create, "create(...)");
                    return create;
                }
            });
        }
        return isValidJs(str, str2, resourceProvider, duktapeClient);
    }
}
