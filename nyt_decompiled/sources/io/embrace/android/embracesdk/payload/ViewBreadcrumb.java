package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ViewBreadcrumb implements Breadcrumb {
    public static final Companion Companion = new Companion(null);
    private static final String FALLBACK_SCREEN_NAME = "Unknown screen";
    private Long end;
    private String screen;
    private Long start;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ViewBreadcrumb(String str, @bt3(name = "st") Long l, @bt3(name = "en") Long l2) {
        this.start = l;
        this.end = l2;
        this.screen = str == null ? FALLBACK_SCREEN_NAME : str;
    }

    @bt3(name = "vn")
    public static /* synthetic */ void getScreen$annotations() {
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final Long getStart() {
        return this.start;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        Long l = this.start;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void setEnd(Long l) {
        this.end = l;
    }

    public final void setScreen(String str) {
        zq3.h(str, "<set-?>");
        this.screen = str;
    }

    public final void setStart(Long l) {
        this.start = l;
    }

    public /* synthetic */ ViewBreadcrumb(String str, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i & 4) != 0 ? null : l2);
    }
}
