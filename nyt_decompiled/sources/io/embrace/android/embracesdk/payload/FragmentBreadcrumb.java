package io.embrace.android.embracesdk.payload;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class FragmentBreadcrumb implements Breadcrumb {
    private Long endTime;
    private final String name;
    private long start;

    public FragmentBreadcrumb(@bt3(name = "n") String str, @bt3(name = "st") long j, @bt3(name = "en") Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.name = str;
        this.start = j;
        this.endTime = l;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getName() {
        return this.name;
    }

    public final long getStart() {
        return this.start;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.start;
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public final void setStartTime(long j) {
        this.start = j;
    }

    public /* synthetic */ FragmentBreadcrumb(String str, long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : l);
    }
}
