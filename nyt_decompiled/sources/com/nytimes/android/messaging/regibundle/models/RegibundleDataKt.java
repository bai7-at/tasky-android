package com.nytimes.android.messaging.regibundle.models;

import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class RegibundleDataKt {
    public static final SubscriptionData currentSubscriptionValues(RegibundleData regibundleData) {
        Object obj;
        zq3.h(regibundleData, "<this>");
        String header = regibundleData.getSubscription().getHeader();
        String text = regibundleData.getSubscription().getText();
        String buttonText = regibundleData.getSubscription().getButtonText();
        Iterator<T> it2 = regibundleData.getSubscriptionUrgencyMessages().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (isActive$default((UrgencyMessage) next, 0L, 1, null)) {
                obj = next;
                break;
            }
        }
        UrgencyMessage urgencyMessage = (UrgencyMessage) obj;
        if (urgencyMessage != null) {
            String header2 = urgencyMessage.getHeader();
            if (header2 != null) {
                header = header2;
            }
            String text2 = urgencyMessage.getText();
            if (text2 != null) {
                text = text2;
            }
            String buttonText2 = urgencyMessage.getButtonText();
            if (buttonText2 != null) {
                buttonText = buttonText2;
            }
        }
        return new SubscriptionData(header, text, buttonText, regibundleData.getSubscription().getHoursBetweenRecurrence(), regibundleData.getSubscription().getSku());
    }

    public static final RegibundleData defaultRegibundleData() {
        return new RegibundleData("Log in", new RegistrationData("FREE", "Get limited article access with a free account.", "Create a free account"), new SubscriptionData("Starting at", "Subscribe for unlimited article access.", "View subscription offer", 24, "and.all.access.bau.mo.oc.20000274520"), i.l());
    }

    public static final boolean isActive(UrgencyMessage urgencyMessage, long j) {
        zq3.h(urgencyMessage, "<this>");
        return j <= urgencyMessage.getEndTimeInterval() && urgencyMessage.getStartTimeInterval() <= j;
    }

    public static /* synthetic */ boolean isActive$default(UrgencyMessage urgencyMessage, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Instant.now().getEpochSecond();
        }
        return isActive(urgencyMessage, j);
    }
}
