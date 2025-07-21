package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AnrInterval {
    public static final int CODE_DEFAULT = 0;
    public static final int CODE_SAMPLES_CLEARED = 1;
    public static final Companion Companion = new Companion(null);
    private final AnrSampleList anrSampleList;
    private final Integer code;
    private final Long endTime;
    private final Long lastKnownTime;
    private final long startTime;

    /* renamed from: type, reason: collision with root package name */
    private final Type f82type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum Type {
        UI
    }

    public AnrInterval(@bt3(name = "st") long j) {
        this(j, null, null, null, null, null, 62, null);
    }

    public final long component1() {
        return this.startTime;
    }

    public final Long component2() {
        return this.lastKnownTime;
    }

    public final Long component3() {
        return this.endTime;
    }

    public final Type component4() {
        return this.f82type;
    }

    public final AnrSampleList component5() {
        return this.anrSampleList;
    }

    public final Integer component6() {
        return this.code;
    }

    public final AnrInterval copy(@bt3(name = "st") long j, @bt3(name = "lk") Long l, @bt3(name = "en") Long l2, @bt3(name = "v") Type type2, @bt3(name = "se") AnrSampleList anrSampleList, @bt3(name = "c") Integer num) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        return new AnrInterval(j, l, l2, type2, anrSampleList, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnrInterval)) {
            return false;
        }
        AnrInterval anrInterval = (AnrInterval) obj;
        return this.startTime == anrInterval.startTime && zq3.c(this.lastKnownTime, anrInterval.lastKnownTime) && zq3.c(this.endTime, anrInterval.endTime) && zq3.c(this.f82type, anrInterval.f82type) && zq3.c(this.anrSampleList, anrInterval.anrSampleList) && zq3.c(this.code, anrInterval.code);
    }

    public final AnrSampleList getAnrSampleList() {
        return this.anrSampleList;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final Long getLastKnownTime() {
        return this.lastKnownTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final Type getType() {
        return this.f82type;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.startTime) * 31;
        Long l = this.lastKnownTime;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.endTime;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Type type2 = this.f82type;
        int hashCode4 = (hashCode3 + (type2 != null ? type2.hashCode() : 0)) * 31;
        AnrSampleList anrSampleList = this.anrSampleList;
        int hashCode5 = (hashCode4 + (anrSampleList != null ? anrSampleList.hashCode() : 0)) * 31;
        Integer num = this.code;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AnrInterval(startTime=" + this.startTime + ", lastKnownTime=" + this.lastKnownTime + ", endTime=" + this.endTime + ", type=" + this.f82type + ", anrSampleList=" + this.anrSampleList + ", code=" + this.code + ")";
    }

    public AnrInterval(@bt3(name = "st") long j, @bt3(name = "lk") Long l) {
        this(j, l, null, null, null, null, 60, null);
    }

    public AnrInterval(@bt3(name = "st") long j, @bt3(name = "lk") Long l, @bt3(name = "en") Long l2) {
        this(j, l, l2, null, null, null, 56, null);
    }

    public AnrInterval(@bt3(name = "st") long j, @bt3(name = "lk") Long l, @bt3(name = "en") Long l2, @bt3(name = "v") Type type2) {
        this(j, l, l2, type2, null, null, 48, null);
    }

    public AnrInterval(@bt3(name = "st") long j, @bt3(name = "lk") Long l, @bt3(name = "en") Long l2, @bt3(name = "v") Type type2, @bt3(name = "se") AnrSampleList anrSampleList) {
        this(j, l, l2, type2, anrSampleList, null, 32, null);
    }

    public AnrInterval(@bt3(name = "st") long j, @bt3(name = "lk") Long l, @bt3(name = "en") Long l2, @bt3(name = "v") Type type2, @bt3(name = "se") AnrSampleList anrSampleList, @bt3(name = "c") Integer num) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        this.startTime = j;
        this.lastKnownTime = l;
        this.endTime = l2;
        this.f82type = type2;
        this.anrSampleList = anrSampleList;
        this.code = num;
    }

    public /* synthetic */ AnrInterval(long j, Long l, Long l2, Type type2, AnrSampleList anrSampleList, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? Type.UI : type2, (i & 16) != 0 ? null : anrSampleList, (i & 32) != 0 ? 0 : num);
    }
}
