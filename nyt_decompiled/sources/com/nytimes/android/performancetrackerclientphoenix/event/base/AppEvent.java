package com.nytimes.android.performancetrackerclientphoenix.event.base;

import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.c04;
import defpackage.du8;
import defpackage.j32;
import defpackage.k32;
import defpackage.ku8;
import defpackage.qs2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public abstract class AppEvent {
    private final String clazzName;
    private final c04 key$delegate;
    private final String kind;
    private final Map<String, Object> params;
    private final Throwable throwable;

    public static abstract class Ads extends AppEvent {
        private final String regiId;

        public static final class AdFetchNoFill extends Ads {
            private final String id;
            private final String pageType;
            private final String position;
            private final String regiId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdFetchNoFill(String str, String str2, String str3, String str4) {
                super(str4, null);
                zq3.h(str, "id");
                this.id = str;
                this.position = str2;
                this.pageType = str3;
                this.regiId = str4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdFetchNoFill)) {
                    return false;
                }
                AdFetchNoFill adFetchNoFill = (AdFetchNoFill) obj;
                return zq3.c(this.id, adFetchNoFill.id) && zq3.c(this.position, adFetchNoFill.position) && zq3.c(this.pageType, adFetchNoFill.pageType) && zq3.c(this.regiId, adFetchNoFill.regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                Pair a = du8.a("id", this.id);
                String str = this.position;
                if (str == null) {
                    str = "missing";
                }
                Pair a2 = du8.a("adPosition", str);
                String str2 = this.pageType;
                if (str2 == null) {
                    str2 = "other";
                }
                x.putAll(t.m(a, a2, du8.a("pageType", str2)));
                return x;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                String str = this.position;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.pageType;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.regiId;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "AdFetchNoFill(id=" + this.id + ", position=" + this.position + ", pageType=" + this.pageType + ", regiId=" + this.regiId + ")";
            }
        }

        public static final class AdFetchSuccess extends Ads {
            private final String id;
            private final String pageType;
            private final String position;
            private final String regiId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdFetchSuccess(String str, String str2, String str3, String str4) {
                super(str4, null);
                zq3.h(str, "id");
                this.id = str;
                this.position = str2;
                this.pageType = str3;
                this.regiId = str4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdFetchSuccess)) {
                    return false;
                }
                AdFetchSuccess adFetchSuccess = (AdFetchSuccess) obj;
                return zq3.c(this.id, adFetchSuccess.id) && zq3.c(this.position, adFetchSuccess.position) && zq3.c(this.pageType, adFetchSuccess.pageType) && zq3.c(this.regiId, adFetchSuccess.regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                Pair a = du8.a("id", this.id);
                String str = this.position;
                if (str == null) {
                    str = "missing";
                }
                Pair a2 = du8.a("adPosition", str);
                String str2 = this.pageType;
                if (str2 == null) {
                    str2 = "other";
                }
                x.putAll(t.m(a, a2, du8.a("pageType", str2)));
                return x;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                String str = this.position;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.pageType;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.regiId;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "AdFetchSuccess(id=" + this.id + ", position=" + this.position + ", pageType=" + this.pageType + ", regiId=" + this.regiId + ")";
            }
        }

        public static final class AdRequest extends Ads {
            private final String adPosition;
            private final boolean btEmpty;
            private final boolean btNull;
            private final boolean hasAlsTestClientSide;
            private final Boolean hasCriticalTargeting;
            private final String id;
            private final String pageType;
            private final String regiId;

            public AdRequest(String str, Boolean bool, boolean z, boolean z2, boolean z3, String str2, String str3, String str4) {
                super(str4, null);
                this.id = str;
                this.hasCriticalTargeting = bool;
                this.hasAlsTestClientSide = z;
                this.btEmpty = z2;
                this.btNull = z3;
                this.pageType = str2;
                this.adPosition = str3;
                this.regiId = str4;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdRequest)) {
                    return false;
                }
                AdRequest adRequest = (AdRequest) obj;
                return zq3.c(this.id, adRequest.id) && zq3.c(this.hasCriticalTargeting, adRequest.hasCriticalTargeting) && this.hasAlsTestClientSide == adRequest.hasAlsTestClientSide && this.btEmpty == adRequest.btEmpty && this.btNull == adRequest.btNull && zq3.c(this.pageType, adRequest.pageType) && zq3.c(this.adPosition, adRequest.adPosition) && zq3.c(this.regiId, adRequest.regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                String str = this.id;
                if (str == null) {
                    str = "missing";
                }
                Pair a = du8.a("id", str);
                Object obj = this.hasCriticalTargeting;
                if (obj == null) {
                    obj = "missing";
                }
                Pair a2 = du8.a("hasCriticalTargeting", obj);
                Pair a3 = du8.a("hasAlsTestClientSide", Boolean.valueOf(this.hasAlsTestClientSide));
                Pair a4 = du8.a("bt_empty", Boolean.valueOf(this.btEmpty));
                Pair a5 = du8.a("bt_null", Boolean.valueOf(this.btNull));
                String str2 = this.pageType;
                if (str2 == null) {
                    str2 = "other";
                }
                Pair a6 = du8.a("pageType", str2);
                String str3 = this.adPosition;
                x.putAll(t.m(a, a2, a3, a4, a5, a6, du8.a("adPosition", str3 != null ? str3 : "missing")));
                return x;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.hasCriticalTargeting;
                int hashCode2 = (((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.hasAlsTestClientSide)) * 31) + Boolean.hashCode(this.btEmpty)) * 31) + Boolean.hashCode(this.btNull)) * 31;
                String str2 = this.pageType;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.adPosition;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.regiId;
                return hashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "AdRequest(id=" + this.id + ", hasCriticalTargeting=" + this.hasCriticalTargeting + ", hasAlsTestClientSide=" + this.hasAlsTestClientSide + ", btEmpty=" + this.btEmpty + ", btNull=" + this.btNull + ", pageType=" + this.pageType + ", adPosition=" + this.adPosition + ", regiId=" + this.regiId + ")";
            }
        }

        public static final class AliceCall extends Ads {
            private final String regiId;

            public AliceCall(String str) {
                super(str, null);
                this.regiId = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AliceCall) && zq3.c(this.regiId, ((AliceCall) obj).regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                String str = this.regiId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "AliceCall(regiId=" + this.regiId + ")";
            }
        }

        public static final class AliceRequest extends Ads {
            private final String pageType;
            private final String regiId;

            public AliceRequest(String str, String str2) {
                super(str2, null);
                this.pageType = str;
                this.regiId = str2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AliceRequest)) {
                    return false;
                }
                AliceRequest aliceRequest = (AliceRequest) obj;
                return zq3.c(this.pageType, aliceRequest.pageType) && zq3.c(this.regiId, aliceRequest.regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                String str = this.pageType;
                if (str != null) {
                    x.put("pageType", str);
                }
                return x;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                String str = this.pageType;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.regiId;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AliceRequest(pageType=" + this.pageType + ", regiId=" + this.regiId + ")";
            }
        }

        public static final class AliceResponse extends Ads {
            private final String pageType;
            private final String regiId;
            private final String responseType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AliceResponse(String str, String str2, String str3) {
                super(str3, null);
                zq3.h(str, "responseType");
                this.responseType = str;
                this.pageType = str2;
                this.regiId = str3;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AliceResponse)) {
                    return false;
                }
                AliceResponse aliceResponse = (AliceResponse) obj;
                return zq3.c(this.responseType, aliceResponse.responseType) && zq3.c(this.pageType, aliceResponse.pageType) && zq3.c(this.regiId, aliceResponse.regiId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                x.put("responseType", this.responseType);
                String str = this.pageType;
                if (str != null) {
                    x.put("pageType", str);
                }
                return x;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
            public String getRegiId() {
                return this.regiId;
            }

            public int hashCode() {
                int hashCode = this.responseType.hashCode() * 31;
                String str = this.pageType;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.regiId;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AliceResponse(responseType=" + this.responseType + ", pageType=" + this.pageType + ", regiId=" + this.regiId + ")";
            }
        }

        public static abstract class Error extends Ads {
            private final String kind;
            private final String regiId;

            public static final class FetchError extends Error {
                private final String id;
                private final String pageType;
                private final String position;
                private final String regiId;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FetchError(String str, String str2, String str3, String str4) {
                    super(str4, null);
                    zq3.h(str, "id");
                    this.id = str;
                    this.position = str2;
                    this.pageType = str3;
                    this.regiId = str4;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FetchError)) {
                        return false;
                    }
                    FetchError fetchError = (FetchError) obj;
                    return zq3.c(this.id, fetchError.id) && zq3.c(this.position, fetchError.position) && zq3.c(this.pageType, fetchError.pageType) && zq3.c(this.regiId, fetchError.regiId);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    Map<String, Object> x = t.x(super.getParams());
                    Pair a = du8.a("id", this.id);
                    String str = this.position;
                    if (str == null) {
                        str = "missing";
                    }
                    Pair a2 = du8.a("adPosition", str);
                    String str2 = this.pageType;
                    if (str2 == null) {
                        str2 = "other";
                    }
                    x.putAll(t.m(a, a2, du8.a("pageType", str2)));
                    return x;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Ads
                public String getRegiId() {
                    return this.regiId;
                }

                public int hashCode() {
                    int hashCode = this.id.hashCode() * 31;
                    String str = this.position;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.pageType;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.regiId;
                    return hashCode3 + (str3 != null ? str3.hashCode() : 0);
                }

                public String toString() {
                    return "FetchError(id=" + this.id + ", position=" + this.position + ", pageType=" + this.pageType + ", regiId=" + this.regiId + ")";
                }
            }

            public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getKind() {
                return this.kind;
            }

            private Error(String str) {
                super(str, null);
                this.regiId = str;
                this.kind = "error";
            }
        }

        public /* synthetic */ Ads(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public Map<String, Object> getParams() {
            String regiId = getRegiId();
            boolean z = false;
            if (regiId != null && regiId.length() > 0) {
                z = true;
            }
            Map<String, Object> n = t.n(du8.a("hasRegiID", Boolean.valueOf(z)));
            String regiId2 = getRegiId();
            if (regiId2 != null) {
                n.put("regi_id", regiId2);
            }
            return n;
        }

        public abstract String getRegiId();

        private Ads(String str) {
            super(null);
            this.regiId = str;
        }
    }

    public static final class Aggregate extends AppEvent {
        private final String aggregatePramamsKey;
        private final String[] eventClass;
        private final String key;
        private final String kind;
        private final Map<String, Object> params;
        private final String property;
        private final ArrayList<Long> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Aggregate(String[] strArr, String str) {
            super(null);
            zq3.h(strArr, "eventClass");
            zq3.h(str, "property");
            this.eventClass = strArr;
            this.property = str;
            this.aggregatePramamsKey = "totalTime";
            this.key = "AppEvent.Aggregate." + d.r0(strArr, InstructionFileId.DOT, null, null, 0, null, null, 62, null);
            this.kind = "aggregate";
            this.params = t.n(du8.a("totalTime", 0));
            this.values = new ArrayList<>();
        }

        public final void add(long j) {
            this.values.add(Long.valueOf(j));
        }

        public final void computeMean() {
            Map<String, Object> params = getParams();
            zq3.f(params, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
            ku8.d(params).put(this.aggregatePramamsKey, this.values.size() == 0 ? 0 : Float.valueOf((float) i.a0(this.values)));
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKey() {
            return this.key;
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKind() {
            return this.kind;
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public Map<String, Object> getParams() {
            return this.params;
        }

        public final String getProperty() {
            return this.property;
        }

        public final void reset() {
            Map<String, Object> params = getParams();
            zq3.f(params, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
            ku8.d(params).put(this.aggregatePramamsKey, 0);
            this.values.clear();
        }
    }

    public static abstract class AppLaunchArticlePerformanceEvent extends AppEvent {

        public static final class ApplicationOnCreate extends AppLaunchArticlePerformanceEvent {
            private final boolean cachedStart;
            private final boolean coldStart;
            private final Map<String, Long> extraParams;
            private final Map<String, Object> params;
            private final long totalTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationOnCreate(long j, boolean z, boolean z2, Map<String, Long> map) {
                super(null);
                zq3.h(map, "extraParams");
                this.totalTime = j;
                this.coldStart = z;
                this.cachedStart = z2;
                this.extraParams = map;
                this.params = t.p(t.m(du8.a("timeToInteractive", Long.valueOf(j)), du8.a("coldStart", Boolean.valueOf(z)), du8.a("cachedStart", Boolean.valueOf(z2))), map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApplicationOnCreate)) {
                    return false;
                }
                ApplicationOnCreate applicationOnCreate = (ApplicationOnCreate) obj;
                return this.totalTime == applicationOnCreate.totalTime && this.coldStart == applicationOnCreate.coldStart && this.cachedStart == applicationOnCreate.cachedStart && zq3.c(this.extraParams, applicationOnCreate.extraParams);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((((Long.hashCode(this.totalTime) * 31) + Boolean.hashCode(this.coldStart)) * 31) + Boolean.hashCode(this.cachedStart)) * 31) + this.extraParams.hashCode();
            }

            public String toString() {
                return "ApplicationOnCreate(totalTime=" + this.totalTime + ", coldStart=" + this.coldStart + ", cachedStart=" + this.cachedStart + ", extraParams=" + this.extraParams + ")";
            }
        }

        public /* synthetic */ AppLaunchArticlePerformanceEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AppLaunchArticlePerformanceEvent() {
            super(null);
        }
    }

    public static abstract class AppLaunchOneWebviewPerformanceEvent extends AppEvent {

        public static final class ApplicationOnCreate extends AppLaunchOneWebviewPerformanceEvent {
            private final boolean cachedStart;
            private final boolean coldStart;
            private final Map<String, Long> extraParams;
            private final Map<String, Object> params;
            private final long totalTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationOnCreate(long j, boolean z, boolean z2, Map<String, Long> map) {
                super(null);
                zq3.h(map, "extraParams");
                this.totalTime = j;
                this.coldStart = z;
                this.cachedStart = z2;
                this.extraParams = map;
                this.params = t.p(t.m(du8.a("timeToInteractive", Long.valueOf(j)), du8.a("coldStart", Boolean.valueOf(z)), du8.a("cachedStart", Boolean.valueOf(z2))), map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApplicationOnCreate)) {
                    return false;
                }
                ApplicationOnCreate applicationOnCreate = (ApplicationOnCreate) obj;
                return this.totalTime == applicationOnCreate.totalTime && this.coldStart == applicationOnCreate.coldStart && this.cachedStart == applicationOnCreate.cachedStart && zq3.c(this.extraParams, applicationOnCreate.extraParams);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((((Long.hashCode(this.totalTime) * 31) + Boolean.hashCode(this.coldStart)) * 31) + Boolean.hashCode(this.cachedStart)) * 31) + this.extraParams.hashCode();
            }

            public String toString() {
                return "ApplicationOnCreate(totalTime=" + this.totalTime + ", coldStart=" + this.coldStart + ", cachedStart=" + this.cachedStart + ", extraParams=" + this.extraParams + ")";
            }
        }

        public /* synthetic */ AppLaunchOneWebviewPerformanceEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AppLaunchOneWebviewPerformanceEvent() {
            super(null);
        }
    }

    public static abstract class AppLaunchPerformanceEvent extends AppEvent {

        public static final class ApplicationOnCreate extends AppLaunchPerformanceEvent {
            private final boolean cachedStart;
            private final boolean coldStart;
            private final Map<String, Long> extraParams;
            private final Map<String, Object> params;
            private final long totalTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationOnCreate(long j, boolean z, boolean z2, Map<String, Long> map) {
                super(null);
                zq3.h(map, "extraParams");
                this.totalTime = j;
                this.coldStart = z;
                this.cachedStart = z2;
                this.extraParams = map;
                this.params = t.p(t.m(du8.a("timeToInteractive", Long.valueOf(j)), du8.a("coldStart", Boolean.valueOf(z)), du8.a("cachedStart", Boolean.valueOf(z2))), map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApplicationOnCreate)) {
                    return false;
                }
                ApplicationOnCreate applicationOnCreate = (ApplicationOnCreate) obj;
                return this.totalTime == applicationOnCreate.totalTime && this.coldStart == applicationOnCreate.coldStart && this.cachedStart == applicationOnCreate.cachedStart && zq3.c(this.extraParams, applicationOnCreate.extraParams);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((((Long.hashCode(this.totalTime) * 31) + Boolean.hashCode(this.coldStart)) * 31) + Boolean.hashCode(this.cachedStart)) * 31) + this.extraParams.hashCode();
            }

            public String toString() {
                return "ApplicationOnCreate(totalTime=" + this.totalTime + ", coldStart=" + this.coldStart + ", cachedStart=" + this.cachedStart + ", extraParams=" + this.extraParams + ")";
            }
        }

        public static final class TimeToInteractive extends AppLaunchPerformanceEvent {
            private final String feedId;
            private final Map<String, Object> params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimeToInteractive(String str) {
                super(null);
                zq3.h(str, "feedId");
                this.feedId = str;
                this.params = t.f(du8.a("feedID", str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeToInteractive) && zq3.c(this.feedId, ((TimeToInteractive) obj).feedId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.feedId.hashCode();
            }

            public String toString() {
                return "TimeToInteractive(feedId=" + this.feedId + ")";
            }
        }

        public /* synthetic */ AppLaunchPerformanceEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AppLaunchPerformanceEvent() {
            super(null);
        }
    }

    public static abstract class AppLaunchXpnPerformanceEvent extends AppEvent {

        public static final class ApplicationOnCreate extends AppLaunchXpnPerformanceEvent {
            private final boolean cachedStart;
            private final boolean coldStart;
            private final Map<String, Long> extraParams;
            private final Map<String, Object> params;
            private final long totalTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationOnCreate(long j, boolean z, boolean z2, Map<String, Long> map) {
                super(null);
                zq3.h(map, "extraParams");
                this.totalTime = j;
                this.coldStart = z;
                this.cachedStart = z2;
                this.extraParams = map;
                this.params = t.p(t.m(du8.a("timeToInteractive", Long.valueOf(j)), du8.a("coldStart", Boolean.valueOf(z)), du8.a("cachedStart", Boolean.valueOf(z2))), map);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ApplicationOnCreate)) {
                    return false;
                }
                ApplicationOnCreate applicationOnCreate = (ApplicationOnCreate) obj;
                return this.totalTime == applicationOnCreate.totalTime && this.coldStart == applicationOnCreate.coldStart && this.cachedStart == applicationOnCreate.cachedStart && zq3.c(this.extraParams, applicationOnCreate.extraParams);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((((Long.hashCode(this.totalTime) * 31) + Boolean.hashCode(this.coldStart)) * 31) + Boolean.hashCode(this.cachedStart)) * 31) + this.extraParams.hashCode();
            }

            public String toString() {
                return "ApplicationOnCreate(totalTime=" + this.totalTime + ", coldStart=" + this.coldStart + ", cachedStart=" + this.cachedStart + ", extraParams=" + this.extraParams + ")";
            }
        }

        public /* synthetic */ AppLaunchXpnPerformanceEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AppLaunchXpnPerformanceEvent() {
            super(null);
        }
    }

    public static abstract class Article extends AppEvent {
        private final String kind;

        public static abstract class Error extends Article {
            private final String kind;

            public static final class CouldNotFetchPerformanceData extends Error {
                public CouldNotFetchPerformanceData() {
                    super(null);
                }
            }

            public static final class UnableToLoadArticle extends Error {
                private final String clazzName;
                private final Map<String, Object> params;
                private final Throwable throwable;
                private final Uri url;

                /* JADX WARN: Multi-variable type inference failed */
                public UnableToLoadArticle(Throwable th, String str, Uri uri) {
                    super(0 == true ? 1 : 0);
                    this.throwable = th;
                    this.clazzName = str;
                    this.url = uri;
                    this.params = uri != null ? t.f(du8.a("url", uri.toString())) : null;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UnableToLoadArticle)) {
                        return false;
                    }
                    UnableToLoadArticle unableToLoadArticle = (UnableToLoadArticle) obj;
                    return zq3.c(this.throwable, unableToLoadArticle.throwable) && zq3.c(this.clazzName, unableToLoadArticle.clazzName) && zq3.c(this.url, unableToLoadArticle.url);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public String getClazzName() {
                    return this.clazzName;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    return this.params;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Throwable getThrowable() {
                    return this.throwable;
                }

                public int hashCode() {
                    Throwable th = this.throwable;
                    int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                    String str = this.clazzName;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Uri uri = this.url;
                    return hashCode2 + (uri != null ? uri.hashCode() : 0);
                }

                public String toString() {
                    return "UnableToLoadArticle(throwable=" + this.throwable + ", clazzName=" + this.clazzName + ", url=" + this.url + ")";
                }
            }

            public static final class UnableToLoadInteractive extends Error {
                private final String clazzName;
                private final Throwable throwable;

                public UnableToLoadInteractive(Throwable th, String str) {
                    super(null);
                    this.throwable = th;
                    this.clazzName = str;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UnableToLoadInteractive)) {
                        return false;
                    }
                    UnableToLoadInteractive unableToLoadInteractive = (UnableToLoadInteractive) obj;
                    return zq3.c(this.throwable, unableToLoadInteractive.throwable) && zq3.c(this.clazzName, unableToLoadInteractive.clazzName);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public String getClazzName() {
                    return this.clazzName;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Throwable getThrowable() {
                    return this.throwable;
                }

                public int hashCode() {
                    Throwable th = this.throwable;
                    int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                    String str = this.clazzName;
                    return hashCode + (str != null ? str.hashCode() : 0);
                }

                public String toString() {
                    return "UnableToLoadInteractive(throwable=" + this.throwable + ", clazzName=" + this.clazzName + ")";
                }
            }

            public static final class WebViewFroze extends Error {
                private final Map<String, Object> params;
                private final Uri targetUrl;

                /* JADX WARN: Multi-variable type inference failed */
                public WebViewFroze(Uri uri) {
                    super(0 == true ? 1 : 0);
                    this.targetUrl = uri;
                    this.params = uri != null ? t.f(du8.a("targetUrl", uri.toString())) : null;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof WebViewFroze) && zq3.c(this.targetUrl, ((WebViewFroze) obj).targetUrl);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    return this.params;
                }

                public int hashCode() {
                    Uri uri = this.targetUrl;
                    if (uri == null) {
                        return 0;
                    }
                    return uri.hashCode();
                }

                public String toString() {
                    return "WebViewFroze(targetUrl=" + this.targetUrl + ")";
                }
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Article, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getKind() {
                return this.kind;
            }

            private Error() {
                super(null);
                this.kind = "error";
            }
        }

        public static final class InteractiveLoad extends Article {
            private final Map<String, Object> params;

            public InteractiveLoad(Map<String, ? extends Object> map) {
                super(null);
                this.params = map;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InteractiveLoad) && zq3.c(this.params, ((InteractiveLoad) obj).params);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                Map<String, Object> map = this.params;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "InteractiveLoad(params=" + this.params + ")";
            }
        }

        public static final class Load extends Article {
            private final Map<String, Object> params;

            public Load(Map<String, ? extends Object> map) {
                super(null);
                this.params = map;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Load) && zq3.c(this.params, ((Load) obj).params);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                Map<String, Object> map = this.params;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "Load(params=" + this.params + ")";
            }
        }

        public static final class PerformanceData extends Article {
            private final String targetUrl;
            private final double timeToInteractive;
            private final Double timeToPaint;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformanceData(String str, double d, Double d2) {
                super(null);
                zq3.h(str, "targetUrl");
                this.targetUrl = str;
                this.timeToInteractive = d;
                this.timeToPaint = d2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PerformanceData)) {
                    return false;
                }
                PerformanceData performanceData = (PerformanceData) obj;
                return zq3.c(this.targetUrl, performanceData.targetUrl) && Double.compare(this.timeToInteractive, performanceData.timeToInteractive) == 0 && zq3.c(this.timeToPaint, performanceData.timeToPaint);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> n = t.n(du8.a("timeToInteractive", Double.valueOf(this.timeToInteractive)));
                Double d = this.timeToPaint;
                if (d != null) {
                    n.put("timeToPaint", Double.valueOf(d.doubleValue()));
                }
                return n;
            }

            public int hashCode() {
                int hashCode = ((this.targetUrl.hashCode() * 31) + Double.hashCode(this.timeToInteractive)) * 31;
                Double d = this.timeToPaint;
                return hashCode + (d == null ? 0 : d.hashCode());
            }

            public String toString() {
                return "PerformanceData(targetUrl=" + this.targetUrl + ", timeToInteractive=" + this.timeToInteractive + ", timeToPaint=" + this.timeToPaint + ")";
            }
        }

        public /* synthetic */ Article(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKind() {
            return this.kind;
        }

        private Article() {
            super(null);
            this.kind = "normal";
        }
    }

    public static abstract class Auth extends AppEvent {

        public static abstract class Error extends Auth {
            private final String kind;

            public static final class UnableToCreateAccount extends Error {
                private final String error;
                private final Map<String, String> params;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnableToCreateAccount(String str) {
                    super(null);
                    zq3.h(str, "error");
                    this.error = str;
                    this.params = t.f(du8.a("error", str));
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UnableToCreateAccount) && zq3.c(this.error, ((UnableToCreateAccount) obj).error);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, String> getParams() {
                    return this.params;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "UnableToCreateAccount(error=" + this.error + ")";
                }
            }

            public static final class UnableToSignIn extends Error {
                private final String error;
                private final Map<String, String> params;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnableToSignIn(String str) {
                    super(null);
                    zq3.h(str, "error");
                    this.error = str;
                    this.params = t.f(du8.a("error", str));
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UnableToSignIn) && zq3.c(this.error, ((UnableToSignIn) obj).error);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, String> getParams() {
                    return this.params;
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "UnableToSignIn(error=" + this.error + ")";
                }
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getKind() {
                return this.kind;
            }

            private Error() {
                super(null);
                this.kind = "error";
            }
        }

        public /* synthetic */ Auth(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Auth() {
            super(null);
        }
    }

    public static abstract class CrossProduct extends AppEvent {

        public static final class TimeToInteractive extends CrossProduct {
            private final String destination;
            private final Map<String, Object> params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimeToInteractive(String str) {
                super(null);
                zq3.h(str, "destination");
                this.destination = str;
                this.params = t.f(du8.a("destinationID", str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeToInteractive) && zq3.c(this.destination, ((TimeToInteractive) obj).destination);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "TimeToInteractive(destination=" + this.destination + ")";
            }
        }

        public /* synthetic */ CrossProduct(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CrossProduct() {
            super(null);
        }
    }

    public static abstract class DaggerPerformanceEvent extends AppEvent {

        public static final class ApplicationOnCreate extends DaggerPerformanceEvent {
            private final Map<String, Object> params;
            private final long totalTime;

            public ApplicationOnCreate(long j) {
                super(null);
                this.totalTime = j;
                this.params = t.f(du8.a("timeToInteractive", Long.valueOf(j)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ApplicationOnCreate) && this.totalTime == ((ApplicationOnCreate) obj).totalTime;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return Long.hashCode(this.totalTime);
            }

            public String toString() {
                return "ApplicationOnCreate(totalTime=" + this.totalTime + ")";
            }
        }

        public /* synthetic */ DaggerPerformanceEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DaggerPerformanceEvent() {
            super(null);
        }
    }

    public static abstract class Error extends AppEvent {
        private final String kind;

        public static final class ContentRefreshFailed extends Error {
            private final String clazzName;
            private final Throwable throwable;

            public ContentRefreshFailed(Throwable th, String str) {
                super(null);
                this.throwable = th;
                this.clazzName = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentRefreshFailed)) {
                    return false;
                }
                ContentRefreshFailed contentRefreshFailed = (ContentRefreshFailed) obj;
                return zq3.c(this.throwable, contentRefreshFailed.throwable) && zq3.c(this.clazzName, contentRefreshFailed.clazzName);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getClazzName() {
                return this.clazzName;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                Throwable th = this.throwable;
                int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                String str = this.clazzName;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "ContentRefreshFailed(throwable=" + this.throwable + ", clazzName=" + this.clazzName + ")";
            }
        }

        public static final class MainThreadBlocked extends Error {
            private final String clazzName;
            private final Throwable throwable;

            public /* synthetic */ MainThreadBlocked(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : th, (i & 2) != 0 ? null : str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MainThreadBlocked)) {
                    return false;
                }
                MainThreadBlocked mainThreadBlocked = (MainThreadBlocked) obj;
                return zq3.c(this.throwable, mainThreadBlocked.throwable) && zq3.c(this.clazzName, mainThreadBlocked.clazzName);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getClazzName() {
                return this.clazzName;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                Throwable th = this.throwable;
                int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                String str = this.clazzName;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "MainThreadBlocked(throwable=" + this.throwable + ", clazzName=" + this.clazzName + ")";
            }

            public MainThreadBlocked(Throwable th, String str) {
                super(null);
                this.throwable = th;
                this.clazzName = str;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKind() {
            return this.kind;
        }

        private Error() {
            super(null);
            this.kind = "error";
        }
    }

    public static abstract class Hybrid extends AppEvent {
        private final HybridType hybridType;
        private final String kind;

        public static abstract class Error extends Hybrid {
            private final String kind;

            public static final class CouldNotFetchPerformanceData extends Error {
                private final HybridType hybridType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CouldNotFetchPerformanceData(HybridType hybridType) {
                    super(hybridType, null);
                    zq3.h(hybridType, "hybridType");
                    this.hybridType = hybridType;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid
                public HybridType getHybridType() {
                    return this.hybridType;
                }
            }

            public static final class UnableToLoadData extends Error {
                private final String clazzName;
                private final HybridType hybridType;
                private final Throwable throwable;
                private final Uri url;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnableToLoadData(HybridType hybridType, Throwable th, String str, Uri uri) {
                    super(hybridType, null);
                    zq3.h(hybridType, "hybridType");
                    this.hybridType = hybridType;
                    this.throwable = th;
                    this.clazzName = str;
                    this.url = uri;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof UnableToLoadData)) {
                        return false;
                    }
                    UnableToLoadData unableToLoadData = (UnableToLoadData) obj;
                    return this.hybridType == unableToLoadData.hybridType && zq3.c(this.throwable, unableToLoadData.throwable) && zq3.c(this.clazzName, unableToLoadData.clazzName) && zq3.c(this.url, unableToLoadData.url);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public String getClazzName() {
                    return this.clazzName;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid
                public HybridType getHybridType() {
                    return this.hybridType;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    Map<String, Object> x = t.x(super.getParams());
                    Uri uri = this.url;
                    if (uri != null) {
                        String uri2 = uri.toString();
                        zq3.g(uri2, "toString(...)");
                        x.put("url", uri2);
                    }
                    return x;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Throwable getThrowable() {
                    return this.throwable;
                }

                public int hashCode() {
                    int hashCode = this.hybridType.hashCode() * 31;
                    Throwable th = this.throwable;
                    int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
                    String str = this.clazzName;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Uri uri = this.url;
                    return hashCode3 + (uri != null ? uri.hashCode() : 0);
                }

                public String toString() {
                    return "UnableToLoadData(hybridType=" + this.hybridType + ", throwable=" + this.throwable + ", clazzName=" + this.clazzName + ", url=" + this.url + ")";
                }
            }

            public static final class WebViewFroze extends Error {
                private final HybridType hybridType;
                private final Uri targetUrl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WebViewFroze(HybridType hybridType, Uri uri) {
                    super(hybridType, null);
                    zq3.h(hybridType, "hybridType");
                    this.hybridType = hybridType;
                    this.targetUrl = uri;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WebViewFroze)) {
                        return false;
                    }
                    WebViewFroze webViewFroze = (WebViewFroze) obj;
                    return this.hybridType == webViewFroze.hybridType && zq3.c(this.targetUrl, webViewFroze.targetUrl);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid
                public HybridType getHybridType() {
                    return this.hybridType;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    Map<String, Object> x = t.x(super.getParams());
                    Uri uri = this.targetUrl;
                    if (uri != null) {
                        String uri2 = uri.toString();
                        zq3.g(uri2, "toString(...)");
                        x.put("targetUrl", uri2);
                    }
                    return x;
                }

                public int hashCode() {
                    int hashCode = this.hybridType.hashCode() * 31;
                    Uri uri = this.targetUrl;
                    return hashCode + (uri == null ? 0 : uri.hashCode());
                }

                public String toString() {
                    return "WebViewFroze(hybridType=" + this.hybridType + ", targetUrl=" + this.targetUrl + ")";
                }
            }

            public /* synthetic */ Error(HybridType hybridType, DefaultConstructorMarker defaultConstructorMarker) {
                this(hybridType);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getKind() {
                return this.kind;
            }

            private Error(HybridType hybridType) {
                super(hybridType, null);
                this.kind = "error";
            }
        }

        public static final class Load extends Hybrid {
            private final Long assetLastModified;
            private final String assetType;
            private final HybridType hybridType;
            private final int senderHash;
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Load(Long l, int i, String str, String str2, HybridType hybridType) {
                super(hybridType, null);
                zq3.h(hybridType, "hybridType");
                this.assetLastModified = l;
                this.senderHash = i;
                this.url = str;
                this.assetType = str2;
                this.hybridType = hybridType;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Load)) {
                    return false;
                }
                Load load = (Load) obj;
                return zq3.c(this.assetLastModified, load.assetLastModified) && this.senderHash == load.senderHash && zq3.c(this.url, load.url) && zq3.c(this.assetType, load.assetType) && this.hybridType == load.hybridType;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid
            public HybridType getHybridType() {
                return this.hybridType;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                x.put("sender", Integer.valueOf(this.senderHash));
                String str = this.url;
                if (str != null) {
                    x.put("url", str);
                }
                String str2 = this.assetType;
                if (str2 != null) {
                    x.put("assetType", str2);
                }
                Long l = this.assetLastModified;
                if (l != null) {
                    long longValue = l.longValue();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(longValue);
                    String date = calendar.getTime().toString();
                    zq3.g(date, "toString(...)");
                    x.put("lastModified", date);
                }
                return x;
            }

            public int hashCode() {
                Long l = this.assetLastModified;
                int hashCode = (((l == null ? 0 : l.hashCode()) * 31) + Integer.hashCode(this.senderHash)) * 31;
                String str = this.url;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.assetType;
                return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.hybridType.hashCode();
            }

            public String toString() {
                return "Load(assetLastModified=" + this.assetLastModified + ", senderHash=" + this.senderHash + ", url=" + this.url + ", assetType=" + this.assetType + ", hybridType=" + this.hybridType + ")";
            }
        }

        public static final class PerformanceData extends Hybrid {
            private final HybridType hybridType;
            private final String targetUrl;
            private final double timeToInteractive;
            private final Double timeToPaint;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformanceData(HybridType hybridType, String str, double d, Double d2) {
                super(hybridType, null);
                zq3.h(hybridType, "hybridType");
                zq3.h(str, "targetUrl");
                this.hybridType = hybridType;
                this.targetUrl = str;
                this.timeToInteractive = d;
                this.timeToPaint = d2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PerformanceData)) {
                    return false;
                }
                PerformanceData performanceData = (PerformanceData) obj;
                return this.hybridType == performanceData.hybridType && zq3.c(this.targetUrl, performanceData.targetUrl) && Double.compare(this.timeToInteractive, performanceData.timeToInteractive) == 0 && zq3.c(this.timeToPaint, performanceData.timeToPaint);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid
            public HybridType getHybridType() {
                return this.hybridType;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent.Hybrid, com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                Map<String, Object> x = t.x(super.getParams());
                x.put("timeToInteractive", Double.valueOf(this.timeToInteractive));
                Double d = this.timeToPaint;
                if (d != null) {
                    x.put("timeToPaint", Double.valueOf(d.doubleValue()));
                }
                return x;
            }

            public int hashCode() {
                int hashCode = ((((this.hybridType.hashCode() * 31) + this.targetUrl.hashCode()) * 31) + Double.hashCode(this.timeToInteractive)) * 31;
                Double d = this.timeToPaint;
                return hashCode + (d == null ? 0 : d.hashCode());
            }

            public String toString() {
                return "PerformanceData(hybridType=" + this.hybridType + ", targetUrl=" + this.targetUrl + ", timeToInteractive=" + this.timeToInteractive + ", timeToPaint=" + this.timeToPaint + ")";
            }
        }

        public /* synthetic */ Hybrid(HybridType hybridType, DefaultConstructorMarker defaultConstructorMarker) {
            this(hybridType);
        }

        public abstract HybridType getHybridType();

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKind() {
            return this.kind;
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public Map<String, Object> getParams() {
            return t.n(du8.a("hybridType", getHybridType()));
        }

        private Hybrid(HybridType hybridType) {
            super(null);
            this.hybridType = hybridType;
            this.kind = "normal";
        }
    }

    public static class Metric extends AppEvent {
        private final String kind;

        public static final class BatteryLevel extends Metric {
            private final boolean isCharging;
            private final float lastPct;
            private final Map<String, Object> params;

            public BatteryLevel(boolean z, float f) {
                this.isCharging = z;
                this.lastPct = f;
                this.params = t.m(du8.a("batteryIsCharging", Boolean.valueOf(z)), du8.a("batteryLastPct", Float.valueOf(f)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BatteryLevel)) {
                    return false;
                }
                BatteryLevel batteryLevel = (BatteryLevel) obj;
                return this.isCharging == batteryLevel.isCharging && Float.compare(this.lastPct, batteryLevel.lastPct) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isCharging) * 31) + Float.hashCode(this.lastPct);
            }

            public String toString() {
                return "BatteryLevel(isCharging=" + this.isCharging + ", lastPct=" + this.lastPct + ")";
            }
        }

        public static final class DeltaBatteryLevel extends Metric {
            private final float fromLastForeground;
            private final float fromLaunch;
            private final boolean isCharging;
            private final Map<String, Object> params;

            public DeltaBatteryLevel(float f, float f2, boolean z) {
                this.fromLastForeground = f;
                this.fromLaunch = f2;
                this.isCharging = z;
                this.params = t.m(du8.a("fromLastForeground", Float.valueOf(f)), du8.a("fromLaunch", Float.valueOf(f2)), du8.a("batteryIsCharging", Boolean.valueOf(z)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeltaBatteryLevel)) {
                    return false;
                }
                DeltaBatteryLevel deltaBatteryLevel = (DeltaBatteryLevel) obj;
                return Float.compare(this.fromLastForeground, deltaBatteryLevel.fromLastForeground) == 0 && Float.compare(this.fromLaunch, deltaBatteryLevel.fromLaunch) == 0 && this.isCharging == deltaBatteryLevel.isCharging;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((Float.hashCode(this.fromLastForeground) * 31) + Float.hashCode(this.fromLaunch)) * 31) + Boolean.hashCode(this.isCharging);
            }

            public String toString() {
                return "DeltaBatteryLevel(fromLastForeground=" + this.fromLastForeground + ", fromLaunch=" + this.fromLaunch + ", isCharging=" + this.isCharging + ")";
            }
        }

        public static final class DeltaDiskUsage extends Metric {
            private final float fromLastForeground;
            private final float fromLaunch;
            private final Map<String, Object> params;

            public DeltaDiskUsage(float f, float f2) {
                this.fromLastForeground = f;
                this.fromLaunch = f2;
                this.params = t.m(du8.a("fromLastForeground", Float.valueOf(f)), du8.a("fromLaunch", Float.valueOf(f2)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeltaDiskUsage)) {
                    return false;
                }
                DeltaDiskUsage deltaDiskUsage = (DeltaDiskUsage) obj;
                return Float.compare(this.fromLastForeground, deltaDiskUsage.fromLastForeground) == 0 && Float.compare(this.fromLaunch, deltaDiskUsage.fromLaunch) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (Float.hashCode(this.fromLastForeground) * 31) + Float.hashCode(this.fromLaunch);
            }

            public String toString() {
                return "DeltaDiskUsage(fromLastForeground=" + this.fromLastForeground + ", fromLaunch=" + this.fromLaunch + ")";
            }
        }

        public static final class DeltaMemoryUsage extends Metric {
            private final float fromLastForeground;
            private final float fromLaunch;
            private final Map<String, Object> params;

            public DeltaMemoryUsage(float f, float f2) {
                this.fromLastForeground = f;
                this.fromLaunch = f2;
                this.params = t.m(du8.a("fromLastForeground", Float.valueOf(f)), du8.a("fromLaunch", Float.valueOf(f2)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DeltaMemoryUsage)) {
                    return false;
                }
                DeltaMemoryUsage deltaMemoryUsage = (DeltaMemoryUsage) obj;
                return Float.compare(this.fromLastForeground, deltaMemoryUsage.fromLastForeground) == 0 && Float.compare(this.fromLaunch, deltaMemoryUsage.fromLaunch) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (Float.hashCode(this.fromLastForeground) * 31) + Float.hashCode(this.fromLaunch);
            }

            public String toString() {
                return "DeltaMemoryUsage(fromLastForeground=" + this.fromLastForeground + ", fromLaunch=" + this.fromLaunch + ")";
            }
        }

        public static final class DeltaNetworkDataUsage extends Metric {
            private final float fromLaunch;
            private final Map<String, Object> params;

            public DeltaNetworkDataUsage(float f) {
                this.fromLaunch = f;
                this.params = t.f(du8.a("fromLaunch", Float.valueOf(f)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeltaNetworkDataUsage) && Float.compare(this.fromLaunch, ((DeltaNetworkDataUsage) obj).fromLaunch) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return Float.hashCode(this.fromLaunch);
            }

            public String toString() {
                return "DeltaNetworkDataUsage(fromLaunch=" + this.fromLaunch + ")";
            }
        }

        public static final class DiskUsage extends Metric {
            private final Float availableDiskSpace;
            private final Map<String, Object> params;
            private final float totalDiskSpace;

            public DiskUsage(Float f, float f2) {
                this.availableDiskSpace = f;
                this.totalDiskSpace = f2;
                Map<String, Object> n = t.n(du8.a("diskSpaceTotal", Float.valueOf(f2)));
                if (f != null) {
                    n.put("diskSpaceUsed", Float.valueOf(f2 - f.floatValue()));
                    n.put("diskSpaceAvailable", f);
                }
                this.params = n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DiskUsage)) {
                    return false;
                }
                DiskUsage diskUsage = (DiskUsage) obj;
                return zq3.c(this.availableDiskSpace, diskUsage.availableDiskSpace) && Float.compare(this.totalDiskSpace, diskUsage.totalDiskSpace) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                Float f = this.availableDiskSpace;
                return ((f == null ? 0 : f.hashCode()) * 31) + Float.hashCode(this.totalDiskSpace);
            }

            public String toString() {
                return "DiskUsage(availableDiskSpace=" + this.availableDiskSpace + ", totalDiskSpace=" + this.totalDiskSpace + ")";
            }
        }

        public static final class MemoryUsage extends Metric {
            private final float availableMemory;
            private final boolean isTriggeredByLowMemory;
            private final Map<String, Object> params;
            private final float totalMemory;

            public MemoryUsage(float f, float f2, boolean z) {
                this.availableMemory = f;
                this.totalMemory = f2;
                this.isTriggeredByLowMemory = z;
                this.params = t.m(du8.a("used", Float.valueOf(f2 - f)), du8.a("memoryAvailable", Float.valueOf(f)), du8.a("memoryTotal", Float.valueOf(f2)), du8.a("isLowMemory", Boolean.valueOf(z)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MemoryUsage)) {
                    return false;
                }
                MemoryUsage memoryUsage = (MemoryUsage) obj;
                return Float.compare(this.availableMemory, memoryUsage.availableMemory) == 0 && Float.compare(this.totalMemory, memoryUsage.totalMemory) == 0 && this.isTriggeredByLowMemory == memoryUsage.isTriggeredByLowMemory;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return (((Float.hashCode(this.availableMemory) * 31) + Float.hashCode(this.totalMemory)) * 31) + Boolean.hashCode(this.isTriggeredByLowMemory);
            }

            public String toString() {
                return "MemoryUsage(availableMemory=" + this.availableMemory + ", totalMemory=" + this.totalMemory + ", isTriggeredByLowMemory=" + this.isTriggeredByLowMemory + ")";
            }
        }

        public static final class NetworkDataUsage extends Metric {
            private final Map<String, Object> params;
            private final float usage;

            public NetworkDataUsage(float f) {
                this.usage = f;
                this.params = t.n(du8.a("used", Float.valueOf(f)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NetworkDataUsage) && Float.compare(this.usage, ((NetworkDataUsage) obj).usage) == 0;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return Float.hashCode(this.usage);
            }

            public String toString() {
                return "NetworkDataUsage(usage=" + this.usage + ")";
            }
        }

        public static final class ThermalState extends Metric {
            private final Map<String, Object> params;
            private final String thermalState;

            public ThermalState(String str) {
                zq3.h(str, "thermalState");
                this.thermalState = str;
                this.params = t.f(du8.a(TransferTable.COLUMN_STATE, str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThermalState) && zq3.c(this.thermalState, ((ThermalState) obj).thermalState);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.thermalState.hashCode();
            }

            public String toString() {
                return "ThermalState(thermalState=" + this.thermalState + ")";
            }
        }

        public Metric() {
            super(null);
            this.kind = "metric";
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public String getKind() {
            return this.kind;
        }
    }

    public static abstract class OneWebviewHome extends AppEvent {

        public static final class Load extends OneWebviewHome {
            public static final Load INSTANCE = new Load();

            private Load() {
                super(null);
            }
        }

        public /* synthetic */ OneWebviewHome(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private OneWebviewHome() {
            super(null);
        }
    }

    public static abstract class Page extends AppEvent {

        public static final class View extends Page {
            private final String pageType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public View(String str) {
                super(null);
                zq3.h(str, "pageType");
                this.pageType = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof View) && zq3.c(this.pageType, ((View) obj).pageType);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return t.n(du8.a("pageType", this.pageType));
            }

            public int hashCode() {
                return this.pageType.hashCode();
            }

            public String toString() {
                return "View(pageType=" + this.pageType + ")";
            }
        }

        public /* synthetic */ Page(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Page() {
            super(null);
        }
    }

    public static abstract class PlayTab extends AppEvent {

        public static final class Load extends PlayTab {
            public static final Load INSTANCE = new Load();

            private Load() {
                super(null);
            }
        }

        public static final class TimeToInteractive extends PlayTab {
            private final String feedId;
            private final Map<String, Object> params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimeToInteractive(String str) {
                super(null);
                zq3.h(str, "feedId");
                this.feedId = str;
                this.params = t.f(du8.a("feedID", str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeToInteractive) && zq3.c(this.feedId, ((TimeToInteractive) obj).feedId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.feedId.hashCode();
            }

            public String toString() {
                return "TimeToInteractive(feedId=" + this.feedId + ")";
            }
        }

        public /* synthetic */ PlayTab(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PlayTab() {
            super(null);
        }
    }

    public static abstract class ProductDetail extends AppEvent {

        public static final class ProductDetailStatus extends ProductDetail {
            private final boolean isProductDetailAvailable;
            private final Map<String, Object> params;

            public ProductDetailStatus(boolean z) {
                super(null);
                this.isProductDetailAvailable = z;
                this.params = t.f(du8.a("isProductDetailAvailable", Boolean.valueOf(z)));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductDetailStatus) && this.isProductDetailAvailable == ((ProductDetailStatus) obj).isProductDetailAvailable;
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isProductDetailAvailable);
            }

            public String toString() {
                return "ProductDetailStatus(isProductDetailAvailable=" + this.isProductDetailAvailable + ")";
            }
        }

        public /* synthetic */ ProductDetail(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProductDetail() {
            super(null);
        }
    }

    public static abstract class SectionFront extends AppEvent {

        public static abstract class Error extends SectionFront {
            private final String kind;

            public static final class CriticalLoadFailure extends Error {
                private final String clazzName;
                private final String feedId;
                private final Map<String, Object> params;
                private final Throwable throwable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CriticalLoadFailure(Throwable th, String str, String str2) {
                    super(null);
                    zq3.h(str2, "feedId");
                    this.throwable = th;
                    this.clazzName = str;
                    this.feedId = str2;
                    this.params = t.f(du8.a("feedID", str2));
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CriticalLoadFailure)) {
                        return false;
                    }
                    CriticalLoadFailure criticalLoadFailure = (CriticalLoadFailure) obj;
                    return zq3.c(this.throwable, criticalLoadFailure.throwable) && zq3.c(this.clazzName, criticalLoadFailure.clazzName) && zq3.c(this.feedId, criticalLoadFailure.feedId);
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public String getClazzName() {
                    return this.clazzName;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Map<String, Object> getParams() {
                    return this.params;
                }

                @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
                public Throwable getThrowable() {
                    return this.throwable;
                }

                public int hashCode() {
                    Throwable th = this.throwable;
                    int hashCode = (th == null ? 0 : th.hashCode()) * 31;
                    String str = this.clazzName;
                    return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.feedId.hashCode();
                }

                public String toString() {
                    return "CriticalLoadFailure(throwable=" + this.throwable + ", clazzName=" + this.clazzName + ", feedId=" + this.feedId + ")";
                }
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public String getKind() {
                return this.kind;
            }

            private Error() {
                super(null);
                this.kind = "error";
            }
        }

        public static final class PullToRefresh extends SectionFront {
            private final String feedId;
            private final Map<String, Object> params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PullToRefresh(String str) {
                super(null);
                zq3.h(str, "feedId");
                this.feedId = str;
                this.params = t.f(du8.a("feedID", str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PullToRefresh) && zq3.c(this.feedId, ((PullToRefresh) obj).feedId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.feedId.hashCode();
            }

            public String toString() {
                return "PullToRefresh(feedId=" + this.feedId + ")";
            }
        }

        public static final class TimeToInteractive extends SectionFront {
            private final String feedId;
            private final Map<String, Object> params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimeToInteractive(String str) {
                super(null);
                zq3.h(str, "feedId");
                this.feedId = str;
                this.params = t.f(du8.a("feedID", str));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeToInteractive) && zq3.c(this.feedId, ((TimeToInteractive) obj).feedId);
            }

            @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
            public Map<String, Object> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.feedId.hashCode();
            }

            public String toString() {
                return "TimeToInteractive(feedId=" + this.feedId + ")";
            }
        }

        public /* synthetic */ SectionFront(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SectionFront() {
            super(null);
        }
    }

    public static final class Sentry extends AppEvent {
        private final String eventId;
        private final String level;
        private final String message;
        private final String platform;
        private final String request;
        private final String sentryUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sentry(String str, String str2, String str3, String str4, String str5, String str6) {
            super(null);
            zq3.h(str, "eventId");
            zq3.h(str2, "message");
            zq3.h(str3, "level");
            zq3.h(str4, "platform");
            zq3.h(str5, "request");
            zq3.h(str6, "sentryUrl");
            this.eventId = str;
            this.message = str2;
            this.level = str3;
            this.platform = str4;
            this.request = str5;
            this.sentryUrl = str6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sentry)) {
                return false;
            }
            Sentry sentry = (Sentry) obj;
            return zq3.c(this.eventId, sentry.eventId) && zq3.c(this.message, sentry.message) && zq3.c(this.level, sentry.level) && zq3.c(this.platform, sentry.platform) && zq3.c(this.request, sentry.request) && zq3.c(this.sentryUrl, sentry.sentryUrl);
        }

        @Override // com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent
        public Map<String, Object> getParams() {
            return t.n(du8.a("eventId", this.eventId), du8.a("message", this.message), du8.a("level", this.level), du8.a("platform", this.platform), du8.a("request", this.request), du8.a("sentryUrl", this.sentryUrl));
        }

        public int hashCode() {
            return (((((((((this.eventId.hashCode() * 31) + this.message.hashCode()) * 31) + this.level.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.request.hashCode()) * 31) + this.sentryUrl.hashCode();
        }

        public String toString() {
            return "Sentry(eventId=" + this.eventId + ", message=" + this.message + ", level=" + this.level + ", platform=" + this.platform + ", request=" + this.request + ", sentryUrl=" + this.sentryUrl + ")";
        }
    }

    public /* synthetic */ AppEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> addParameters(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        if (map != null && map2 != null) {
            map = t.x(map);
            map.putAll(map2);
        } else if (map == null) {
            map = map2 == null ? null : map2;
        }
        if (map != null) {
            return t.v(map);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> createThrowableInfoMap(Throwable th, String str) {
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        zq3.g(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) d.s0(stackTrace);
        String str2 = stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber();
        Pair a = du8.a("error", th.getLocalizedMessage());
        Pair a2 = du8.a("location", str2);
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        zq3.g(stackTrace2, "getStackTrace(...)");
        Map n = t.n(a, a2, du8.a("stackTrace", d.r0(stackTrace2, "\n", "", "", 10, null, null, 48, null)));
        if (str != null) {
            n.put("className", str);
        }
        return t.v(n);
    }

    public static /* synthetic */ j32 toEventConvertible$default(AppEvent appEvent, qs2 qs2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toEventConvertible");
        }
        if ((i & 1) != 0) {
            qs2Var = null;
        }
        return appEvent.toEventConvertible(qs2Var);
    }

    public final String classEventKey() {
        return classEventKey(getClass());
    }

    public String getClazzName() {
        return this.clazzName;
    }

    public String getKey() {
        return (String) this.key$delegate.getValue();
    }

    public String getKind() {
        return this.kind;
    }

    public Map<String, Object> getParams() {
        return this.params;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public final j32 toEventConvertible(final qs2 qs2Var) {
        return new k32(getKey(), new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent$toEventConvertible$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map<String, Object> mo865invoke() {
                Map addParameters;
                Map addParameters2;
                Map createThrowableInfoMap;
                Map<String, Object> addParameters3;
                AppEvent appEvent = AppEvent.this;
                Map<String, Object> params = appEvent.getParams();
                if (params == null) {
                    params = t.i();
                }
                addParameters = appEvent.addParameters(params, t.f(du8.a("metadata.kind", AppEvent.this.getKind())));
                if (addParameters == null) {
                    return null;
                }
                AppEvent appEvent2 = AppEvent.this;
                qs2 qs2Var2 = qs2Var;
                addParameters2 = appEvent2.addParameters(addParameters, qs2Var2 != null ? (Map) qs2Var2.mo865invoke() : null);
                if (addParameters2 == null) {
                    return null;
                }
                AppEvent appEvent3 = AppEvent.this;
                createThrowableInfoMap = appEvent3.createThrowableInfoMap(appEvent3.getThrowable(), AppEvent.this.getClazzName());
                addParameters3 = appEvent3.addParameters(addParameters2, createThrowableInfoMap);
                return addParameters3;
            }
        });
    }

    private AppEvent() {
        this.key$delegate = c.a(new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent$key$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return AppEvent.this.classEventKey();
            }
        });
        this.kind = "normal";
    }

    public final <T> String classEventKey(Class<T> cls) {
        zq3.h(cls, "clazz");
        String cls2 = cls.toString();
        zq3.g(cls2, "toString(...)");
        String F = h.F(h.U0(cls2, InstructionFileId.DOT, null, 2, null), "$", InstructionFileId.DOT, false, 4, null);
        int h0 = h.h0(F, InstructionFileId.DOT, 0, false, 6, null);
        int i = h0 + 1;
        String substring = F.substring(0, i);
        zq3.g(substring, "substring(...)");
        int i2 = h0 + 2;
        String substring2 = F.substring(i, i2);
        zq3.g(substring2, "substring(...)");
        Locale locale = Locale.getDefault();
        zq3.g(locale, "getDefault(...)");
        String lowerCase = substring2.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        String substring3 = F.substring(i2);
        zq3.g(substring3, "substring(...)");
        return substring + lowerCase + substring3;
    }
}
