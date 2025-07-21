package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class TapBreadcrumb implements Breadcrumb {
    private String location;
    private final String tappedElementName;
    private final long timestamp;

    /* renamed from: type, reason: collision with root package name */
    private final TapBreadcrumbType f88type;

    public enum TapBreadcrumbType {
        TAP("tap"),
        LONG_PRESS("long_press");

        private final String value;

        TapBreadcrumbType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public TapBreadcrumb(Pair<Float, Float> pair, @bt3(name = "tt") String str, @bt3(name = "ts") long j, @bt3(name = "t") TapBreadcrumbType tapBreadcrumbType) {
        String str2;
        this.tappedElementName = str;
        this.timestamp = j;
        this.f88type = tapBreadcrumbType;
        if (pair != null) {
            str2 = String.valueOf((int) (((Float) pair.c()) != null ? (int) r2.floatValue() : 0.0f)) + "," + ((int) (((Float) pair.d()) != null ? (int) r1.floatValue() : 0.0f));
        } else {
            str2 = "0,0";
        }
        this.location = str2;
    }

    @bt3(name = "tl")
    public static /* synthetic */ void getLocation$annotations() {
    }

    public final String getLocation() {
        return this.location;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.timestamp;
    }

    public final String getTappedElementName() {
        return this.tappedElementName;
    }

    public final long getTimestamp$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final TapBreadcrumbType getType() {
        return this.f88type;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public /* synthetic */ TapBreadcrumb(Pair pair, String str, long j, TapBreadcrumbType tapBreadcrumbType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pair, str, j, tapBreadcrumbType);
    }
}
