package com.chartbeat.androidsdk;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
enum PingMode {
    FIRST_PING,
    STANDARD_PING,
    FULL_PING,
    REPEAT_PING_AFTER_CODE_500;

    private static final Set<String> MANDATORY_PARAMETERS;

    /* renamed from: com.chartbeat.androidsdk.PingMode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$chartbeat$androidsdk$PingMode;

        static {
            int[] iArr = new int[PingMode.values().length];
            $SwitchMap$com$chartbeat$androidsdk$PingMode = iArr;
            try {
                iArr[PingMode.FIRST_PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.FULL_PING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.STANDARD_PING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$chartbeat$androidsdk$PingMode[PingMode.REPEAT_PING_AFTER_CODE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        MANDATORY_PARAMETERS = hashSet;
        hashSet.add(QueryKeys.HOST);
        hashSet.add(QueryKeys.SUBDOMAIN);
        hashSet.add("p");
        hashSet.add(QueryKeys.TOKEN);
        hashSet.add(QueryKeys.USER_ID);
        hashSet.add(QueryKeys.ACCOUNT_ID);
        hashSet.add(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        hashSet.add(QueryKeys.DECAY);
        hashSet.add(QueryKeys.ENGAGED_SECONDS);
        hashSet.add(QueryKeys.READING);
        hashSet.add(QueryKeys.WRITING);
        hashSet.add(QueryKeys.IDLING);
        hashSet.add(QueryKeys.SCROLL_POSITION_TOP);
        hashSet.add(QueryKeys.MAX_SCROLL_DEPTH);
        hashSet.add(QueryKeys.CONTENT_HEIGHT);
        hashSet.add(QueryKeys.SCROLL_WINDOW_HEIGHT);
        hashSet.add(QueryKeys.DOCUMENT_WIDTH);
        hashSet.add(QueryKeys.SITE_VISIT_DEPTH);
        hashSet.add(QueryKeys.SITE_VISIT_REFERRER);
        hashSet.add(QueryKeys.SITE_VISIT_UID);
        hashSet.add(QueryKeys.SUBSCRIPTION_INFO);
        hashSet.add(QueryKeys.END_MARKER);
    }

    boolean includeParameter(String str) {
        int i = AnonymousClass1.$SwitchMap$com$chartbeat$androidsdk$PingMode[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return MANDATORY_PARAMETERS.contains(str);
        }
        if (i == 4) {
            return !str.equals(QueryKeys.FORCE_DECAY);
        }
        throw new RuntimeException("Invalid Ping Mode.");
    }

    PingMode next() {
        int i = AnonymousClass1.$SwitchMap$com$chartbeat$androidsdk$PingMode[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return STANDARD_PING;
        }
        if (i == 4) {
            return STANDARD_PING;
        }
        throw new RuntimeException("Invalid Ping Mode.");
    }
}
