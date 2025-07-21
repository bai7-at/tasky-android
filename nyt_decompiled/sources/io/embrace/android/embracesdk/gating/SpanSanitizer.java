package io.embrace.android.embracesdk.gating;

import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class SpanSanitizer implements Sanitizable<List<? extends EmbraceSpanData>> {
    private final Set<String> enabledComponents;
    private final List<EmbraceSpanData> spans;

    public SpanSanitizer(List<EmbraceSpanData> list, Set<String> set) {
        zq3.h(set, "enabledComponents");
        this.spans = list;
        this.enabledComponents = set;
    }

    private final boolean sanitizeEvents(EmbraceSpanEvent embraceSpanEvent) {
        return (!EmbraceExtensionsKt.hasFixedAttribute(embraceSpanEvent, EmbType.System.Breadcrumb.INSTANCE) || shouldAddCustomBreadcrumbs()) && (!EmbraceExtensionsKt.hasFixedAttribute(embraceSpanEvent, EmbType.Ux.Tap.INSTANCE) || shouldAddTapBreadcrumbs()) && (!EmbraceExtensionsKt.hasFixedAttribute(embraceSpanEvent, EmbType.Ux.WebView.INSTANCE) || shouldAddWebViewUrls());
    }

    private final boolean sanitizeSpans(EmbraceSpanData embraceSpanData) {
        if (!EmbraceExtensionsKt.hasFixedAttribute(embraceSpanData, EmbType.Ux.View.INSTANCE) || shouldAddViewBreadcrumbs()) {
            return !zq3.c(embraceSpanData.getName(), "emb-thread-blockage") || shouldSendANRs();
        }
        return false;
    }

    private final boolean shouldAddCustomBreadcrumbs() {
        return this.enabledComponents.contains(SessionGatingKeys.BREADCRUMBS_CUSTOM);
    }

    private final boolean shouldAddTapBreadcrumbs() {
        return this.enabledComponents.contains(SessionGatingKeys.BREADCRUMBS_TAPS);
    }

    private final boolean shouldAddViewBreadcrumbs() {
        return this.enabledComponents.contains(SessionGatingKeys.BREADCRUMBS_VIEWS);
    }

    private final boolean shouldAddWebViewUrls() {
        return this.enabledComponents.contains(SessionGatingKeys.BREADCRUMBS_WEB_VIEWS);
    }

    private final boolean shouldSendANRs() {
        return this.enabledComponents.contains(SessionGatingKeys.PERFORMANCE_ANR);
    }

    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public List<? extends EmbraceSpanData> sanitize() {
        List<EmbraceSpanData> list = this.spans;
        Object obj = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (sanitizeSpans((EmbraceSpanData) obj2)) {
                arrayList.add(obj2);
            }
        }
        List<? extends EmbraceSpanData> a1 = i.a1(arrayList);
        Iterator<T> it2 = a1.iterator();
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                if (zq3.c(((EmbraceSpanData) next).getName(), "emb-session")) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj = obj3;
            }
        }
        EmbraceSpanData embraceSpanData = (EmbraceSpanData) obj;
        if (embraceSpanData == null) {
            return this.spans;
        }
        a1.remove(embraceSpanData);
        List<EmbraceSpanEvent> events = embraceSpanData.getEvents();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : events) {
            if (sanitizeEvents((EmbraceSpanEvent) obj4)) {
                arrayList2.add(obj4);
            }
        }
        a1.add(new EmbraceSpanData(embraceSpanData.getTraceId(), embraceSpanData.getSpanId(), embraceSpanData.getParentSpanId(), embraceSpanData.getName(), embraceSpanData.getStartTimeNanos(), embraceSpanData.getEndTimeNanos(), embraceSpanData.getStatus(), arrayList2, embraceSpanData.getAttributes()));
        return a1;
    }
}
