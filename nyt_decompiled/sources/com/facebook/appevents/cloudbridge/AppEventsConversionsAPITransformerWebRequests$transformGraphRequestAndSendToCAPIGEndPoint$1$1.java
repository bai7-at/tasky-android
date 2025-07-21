package com.facebook.appevents.cloudbridge;

import defpackage.g29;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
final class AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 extends Lambda implements gt2 {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(List list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Integer num, List list) {
        HashSet hashSet;
        zq3.h(list, "$processedEvents");
        hashSet = AppEventsConversionsAPITransformerWebRequests.b;
        if (i.c0(hashSet, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.a.g(num, list, 5);
    }

    public final void c(String str, final Integer num) {
        g29 g29Var = g29.a;
        final List<Map<String, Object>> list = this.$processedEvents;
        g29.y0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.a
            @Override // java.lang.Runnable
            public final void run() {
                AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1.d(num, list);
            }
        });
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        c((String) obj, (Integer) obj2);
        return ww8.a;
    }
}
