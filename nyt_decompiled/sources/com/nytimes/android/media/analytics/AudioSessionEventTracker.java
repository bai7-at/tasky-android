package com.nytimes.android.media.analytics;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.b22;
import defpackage.e52;
import defpackage.qs2;
import defpackage.ue4;
import defpackage.zq3;
import defpackage.zw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AudioSessionEventTracker {
    public static final a Companion = new a(null);
    private final ET2Scope a;
    private final NetworkStatus b;
    private final HashSet c;
    private final HashSet d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PercentConsumption {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PercentConsumption[] $VALUES;
        public static final a Companion;
        private final String eventName;
        private final float value;
        public static final PercentConsumption TWENTY_FIVE_PERCENT = new PercentConsumption("TWENTY_FIVE_PERCENT", 0, "percent-25-consumed", 0.25f);
        public static final PercentConsumption FIFTY_PERCENT = new PercentConsumption("FIFTY_PERCENT", 1, "percent-50-consumed", 0.5f);
        public static final PercentConsumption SEVENTY_FIVE_PERCENT = new PercentConsumption("SEVENTY_FIVE_PERCENT", 2, "percent-75-consumed", 0.75f);
        public static final PercentConsumption NINETY_PERCENT = new PercentConsumption("NINETY_PERCENT", 3, "percent-90-consumed", 0.9f);
        public static final PercentConsumption NINETY_FIVE_PERCENT = new PercentConsumption("NINETY_FIVE_PERCENT", 4, "percent-95-consumed", 0.95f);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(double d) {
                PercentConsumption[] values = PercentConsumption.values();
                ArrayList arrayList = new ArrayList();
                for (PercentConsumption percentConsumption : values) {
                    if (((float) d) >= percentConsumption.getValue()) {
                        arrayList.add(percentConsumption);
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        private static final /* synthetic */ PercentConsumption[] $values() {
            return new PercentConsumption[]{TWENTY_FIVE_PERCENT, FIFTY_PERCENT, SEVENTY_FIVE_PERCENT, NINETY_PERCENT, NINETY_FIVE_PERCENT};
        }

        static {
            PercentConsumption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private PercentConsumption(String str, int i, String str2, float f) {
            this.eventName = str2;
            this.value = f;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PercentConsumption valueOf(String str) {
            return (PercentConsumption) Enum.valueOf(PercentConsumption.class, str);
        }

        public static PercentConsumption[] values() {
            return (PercentConsumption[]) $VALUES.clone();
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final float getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimeConsumption {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ TimeConsumption[] $VALUES;
        public static final a Companion;
        public static final TimeConsumption FIVE_MINUTES_IN_MILLIS;
        public static final TimeConsumption FOUR_MINUTES_IN_MILLIS;
        public static final TimeConsumption ONE_MINUTE_IN_MILLIS;
        public static final TimeConsumption THIRTY_SECONDS_IN_MILLIS;
        public static final TimeConsumption THREE_MINUTES_IN_MILLIS;
        public static final TimeConsumption THREE_SECONDS_IN_MILLIS;
        public static final TimeConsumption TWO_MINUTES_IN_MILLIS;
        private final long duration;
        private final String eventName;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(long j) {
                TimeConsumption[] values = TimeConsumption.values();
                ArrayList arrayList = new ArrayList();
                for (TimeConsumption timeConsumption : values) {
                    if (j >= timeConsumption.getDuration()) {
                        arrayList.add(timeConsumption);
                    }
                }
                return arrayList;
            }

            private a() {
            }
        }

        private static final /* synthetic */ TimeConsumption[] $values() {
            return new TimeConsumption[]{THREE_SECONDS_IN_MILLIS, THIRTY_SECONDS_IN_MILLIS, ONE_MINUTE_IN_MILLIS, TWO_MINUTES_IN_MILLIS, THREE_MINUTES_IN_MILLIS, FOUR_MINUTES_IN_MILLIS, FIVE_MINUTES_IN_MILLIS};
        }

        static {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            THREE_SECONDS_IN_MILLIS = new TimeConsumption("THREE_SECONDS_IN_MILLIS", 0, "3-seconds-consumed", timeUnit.convert(3L, timeUnit2));
            THIRTY_SECONDS_IN_MILLIS = new TimeConsumption("THIRTY_SECONDS_IN_MILLIS", 1, "30-seconds-consumed", timeUnit.convert(30L, timeUnit2));
            TimeUnit timeUnit3 = TimeUnit.MINUTES;
            ONE_MINUTE_IN_MILLIS = new TimeConsumption("ONE_MINUTE_IN_MILLIS", 2, "1-minute-consumed", timeUnit.convert(1L, timeUnit3));
            TWO_MINUTES_IN_MILLIS = new TimeConsumption("TWO_MINUTES_IN_MILLIS", 3, "2-minutes-consumed", timeUnit.convert(2L, timeUnit3));
            THREE_MINUTES_IN_MILLIS = new TimeConsumption("THREE_MINUTES_IN_MILLIS", 4, "3-minutes-consumed", timeUnit.convert(3L, timeUnit3));
            FOUR_MINUTES_IN_MILLIS = new TimeConsumption("FOUR_MINUTES_IN_MILLIS", 5, "4-minutes-consumed", timeUnit.convert(4L, timeUnit3));
            FIVE_MINUTES_IN_MILLIS = new TimeConsumption("FIVE_MINUTES_IN_MILLIS", 6, "5-minutes-consumed", timeUnit.convert(5L, timeUnit3));
            TimeConsumption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private TimeConsumption(String str, int i, String str2, long j) {
            this.eventName = str2;
            this.duration = j;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static TimeConsumption valueOf(String str) {
            return (TimeConsumption) Enum.valueOf(TimeConsumption.class, str);
        }

        public static TimeConsumption[] values() {
            return (TimeConsumption[]) $VALUES.clone();
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AudioSessionEventTracker(ET2Scope eT2Scope, NetworkStatus networkStatus) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(networkStatus, "networkStatus");
        this.a = eT2Scope;
        this.b = networkStatus;
        this.c = new HashSet();
        this.d = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ue4 c(NYTMediaItem nYTMediaItem, String str, String str2, boolean z, String str3) {
        return new zw(nYTMediaItem, str, str2, z, str3);
    }

    private final void e(NYTMediaItem nYTMediaItem, String str, long j, long j2, String str2) {
        List a2 = PercentConsumption.Companion.a(j / j2);
        if (a2.isEmpty()) {
            return;
        }
        ArrayList<PercentConsumption> arrayList = new ArrayList();
        for (Object obj : a2) {
            if (!this.d.contains((PercentConsumption) obj)) {
                arrayList.add(obj);
            }
        }
        for (PercentConsumption percentConsumption : arrayList) {
            h(percentConsumption.getEventName(), nYTMediaItem, str, str2);
            this.d.add(percentConsumption);
        }
    }

    private final void f(NYTMediaItem nYTMediaItem, String str, long j, String str2) {
        List a2 = TimeConsumption.Companion.a(j);
        if (a2.isEmpty()) {
            return;
        }
        ArrayList<TimeConsumption> arrayList = new ArrayList();
        for (Object obj : a2) {
            if (!this.c.contains((TimeConsumption) obj)) {
                arrayList.add(obj);
            }
        }
        for (TimeConsumption timeConsumption : arrayList) {
            h(timeConsumption.getEventName(), nYTMediaItem, str, str2);
            this.c.add(timeConsumption);
        }
    }

    private final void h(final String str, final NYTMediaItem nYTMediaItem, final String str2, final String str3) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.f(), null, null, new qs2() { // from class: com.nytimes.android.media.analytics.AudioSessionEventTracker$sendAudioTrackingEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                NetworkStatus networkStatus;
                ue4 c;
                AudioSessionEventTracker audioSessionEventTracker = AudioSessionEventTracker.this;
                NYTMediaItem nYTMediaItem2 = nYTMediaItem;
                String str4 = str;
                String str5 = str3;
                networkStatus = audioSessionEventTracker.b;
                c = audioSessionEventTracker.c(nYTMediaItem2, str4, str5, !networkStatus.i(), str2);
                return c;
            }
        }, 6, null);
    }

    public final void d(NYTMediaItem nYTMediaItem, String str, long j, long j2, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        e(nYTMediaItem, str, j, j2, str2);
        f(nYTMediaItem, str, j, str2);
    }

    public final void g() {
        this.c.clear();
        this.d.clear();
    }
}
