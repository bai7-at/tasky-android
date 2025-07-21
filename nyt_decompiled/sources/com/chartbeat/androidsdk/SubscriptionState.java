package com.chartbeat.androidsdk;

/* loaded from: classes2.dex */
public enum SubscriptionState {
    LOGGED_IN { // from class: com.chartbeat.androidsdk.SubscriptionState.1
        @Override // java.lang.Enum
        public String toString() {
            return "lgdin";
        }
    },
    PAID { // from class: com.chartbeat.androidsdk.SubscriptionState.2
        @Override // java.lang.Enum
        public String toString() {
            return "paid";
        }
    },
    ANONYMOUS { // from class: com.chartbeat.androidsdk.SubscriptionState.3
        @Override // java.lang.Enum
        public String toString() {
            return "anon";
        }
    }
}
