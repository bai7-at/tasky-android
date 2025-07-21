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
import kotlin.enums.a;

/* loaded from: classes4.dex */
public final class AudioPlaybackEventTracker {
    private final ET2Scope a;
    private final NetworkStatus b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PlaybackEvents {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PlaybackEvents[] $VALUES;
        private final String eventName;
        public static final PlaybackEvents USER_PLAY = new PlaybackEvents("USER_PLAY", 0, "user-play");
        public static final PlaybackEvents MEDIA_COMPLETE = new PlaybackEvents("MEDIA_COMPLETE", 1, "media-complete");
        public static final PlaybackEvents MEDIA_ERROR = new PlaybackEvents("MEDIA_ERROR", 2, "media-error");
        public static final PlaybackEvents PAUSE = new PlaybackEvents("PAUSE", 3, "pause");
        public static final PlaybackEvents RESUME = new PlaybackEvents("RESUME", 4, "resume");
        public static final PlaybackEvents SCROLL_BACK = new PlaybackEvents("SCROLL_BACK", 5, "scroll-back");
        public static final PlaybackEvents SCROLL_FORWARD = new PlaybackEvents("SCROLL_FORWARD", 6, "scroll-forward");
        public static final PlaybackEvents SKIP_BACK = new PlaybackEvents("SKIP_BACK", 7, "skip-back-10-seconds");
        public static final PlaybackEvents SKIP_FORWARD = new PlaybackEvents("SKIP_FORWARD", 8, "skip-forward-10-seconds");

        private static final /* synthetic */ PlaybackEvents[] $values() {
            return new PlaybackEvents[]{USER_PLAY, MEDIA_COMPLETE, MEDIA_ERROR, PAUSE, RESUME, SCROLL_BACK, SCROLL_FORWARD, SKIP_BACK, SKIP_FORWARD};
        }

        static {
            PlaybackEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PlaybackEvents(String str, int i, String str2) {
            this.eventName = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PlaybackEvents valueOf(String str) {
            return (PlaybackEvents) Enum.valueOf(PlaybackEvents.class, str);
        }

        public static PlaybackEvents[] values() {
            return (PlaybackEvents[]) $VALUES.clone();
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    public AudioPlaybackEventTracker(ET2Scope eT2Scope, NetworkStatus networkStatus) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(networkStatus, "networkStatus");
        this.a = eT2Scope;
        this.b = networkStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ue4 c(NYTMediaItem nYTMediaItem, String str, String str2, boolean z, String str3) {
        return new zw(nYTMediaItem, str, str2, z, str3);
    }

    private final void k(final String str, final NYTMediaItem nYTMediaItem, final String str2, final String str3) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.f(), null, null, new qs2() { // from class: com.nytimes.android.media.analytics.AudioPlaybackEventTracker$sendPlaybackEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                NetworkStatus networkStatus;
                ue4 c;
                networkStatus = AudioPlaybackEventTracker.this.b;
                c = AudioPlaybackEventTracker.this.c(nYTMediaItem, str, str3, !networkStatus.i(), str2);
                return c;
            }
        }, 6, null);
    }

    public final void d(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.MEDIA_COMPLETE.getEventName(), nYTMediaItem, str, str2);
    }

    public final void e(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.MEDIA_ERROR.getEventName(), nYTMediaItem, str, str2);
    }

    public final void f(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.USER_PLAY.getEventName(), nYTMediaItem, str, str2);
    }

    public final void g(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.PAUSE.getEventName(), nYTMediaItem, str, str2);
    }

    public final void h(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.RESUME.getEventName(), nYTMediaItem, str, str2);
    }

    public final void i(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.SCROLL_BACK.getEventName(), nYTMediaItem, str, str2);
    }

    public final void j(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.SCROLL_FORWARD.getEventName(), nYTMediaItem, str, str2);
    }

    public final void l(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.SKIP_BACK.getEventName(), nYTMediaItem, str, str2);
    }

    public final void m(NYTMediaItem nYTMediaItem, String str, String str2) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(str, "streamId");
        zq3.h(str2, "deviceType");
        k(PlaybackEvents.SKIP_FORWARD.getEventName(), nYTMediaItem, str, str2);
    }
}
