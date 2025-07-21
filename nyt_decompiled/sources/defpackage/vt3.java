package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.gson.JsonElement;
import com.nytimes.android.api.config.model.AbTest;
import com.nytimes.android.api.config.model.JsonMessage;
import com.nytimes.android.api.config.model.MessageTargets;
import com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage;
import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import com.nytimes.android.logging.NYTLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class vt3 {
    private static final List a(Map.Entry entry, String str) {
        String str2;
        if (str != null) {
            str2 = str + InstructionFileId.DOT + entry.getKey();
        } else {
            str2 = (String) entry.getKey();
        }
        if (!((JsonElement) entry.getValue()).isJsonObject()) {
            return i.e(du8.a(str2, ((JsonElement) entry.getValue()).getAsString()));
        }
        Set<Map.Entry<String, JsonElement>> entrySet = ((JsonElement) entry.getValue()).getAsJsonObject().entrySet();
        zq3.g(entrySet, "entrySet(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            zq3.e(entry2);
            i.B(arrayList, a(entry2, str2));
        }
        return arrayList;
    }

    static /* synthetic */ List b(Map.Entry entry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return a(entry, str);
    }

    public static final LegacyMessage c(JsonMessage jsonMessage, int i, int i2) {
        zq3.h(jsonMessage, "<this>");
        String str = jsonMessage.getId() + "--" + i;
        String id = jsonMessage.getId();
        String historyID = jsonMessage.getHistoryID();
        String context = jsonMessage.getContext();
        JsonElement presentationRule = jsonMessage.getPresentationRule();
        MessageProperties d = presentationRule != null ? d(presentationRule) : null;
        MessageProperties d2 = d(jsonMessage.getPlacement());
        JsonElement action = jsonMessage.getAction();
        MessageProperties d3 = action != null ? d(action) : null;
        boolean cancelable = jsonMessage.getCancelable();
        List e = s29.e(jsonMessage.getBody());
        String kicker = jsonMessage.getKicker();
        JsonElement mediaResource = jsonMessage.getMediaResource();
        MessageProperties d4 = mediaResource != null ? d(mediaResource) : null;
        boolean subscriptionRequired = jsonMessage.getSubscriptionRequired();
        AbTest abTest = jsonMessage.getAbTest();
        String name = abTest != null ? abTest.getName() : null;
        AbTest abTest2 = jsonMessage.getAbTest();
        String variant = abTest2 != null ? abTest2.getVariant() : null;
        String moduleName = jsonMessage.getAnalyticsValues().getModuleName();
        String label = jsonMessage.getAnalyticsValues().getLabel();
        MessageTargets targeting = jsonMessage.getTargeting();
        return new LegacyMessage(str, id, historyID, i, context, d, i2, d2, d3, cancelable, e, kicker, d4, subscriptionRequired, name, variant, moduleName, label, targeting != null ? s29.c(targeting) : null);
    }

    public static final MessageProperties d(JsonElement jsonElement) {
        zq3.h(jsonElement, "<this>");
        try {
            Set<Map.Entry<String, JsonElement>> entrySet = jsonElement.getAsJsonObject().entrySet();
            if (entrySet.size() == 1) {
                zq3.e(entrySet);
                Map.Entry entry = (Map.Entry) i.j0(entrySet);
                zq3.e(entry);
                String str = (String) entry.getKey();
                Set<Map.Entry<String, JsonElement>> entrySet2 = ((JsonElement) entry.getValue()).getAsJsonObject().entrySet();
                zq3.e(str);
                zq3.e(entrySet2);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = entrySet2.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    zq3.e(entry2);
                    i.B(arrayList, b(entry2, null, 1, null));
                }
                return new MessageProperties(str, t.t(arrayList));
            }
        } catch (Exception e) {
            NYTLogger.s(new Exception("GMAX: message deserialization error", e));
        }
        NYTLogger.A("Cannot deserialize " + jsonElement, new Object[0]);
        return null;
    }
}
