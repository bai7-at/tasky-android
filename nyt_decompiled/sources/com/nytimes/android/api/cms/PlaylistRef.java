package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class PlaylistRef {
    private final String headline;
    private final long id;
    private final String uri;

    public PlaylistRef(long j, String str, String str2) {
        zq3.h(str, "uri");
        this.id = j;
        this.uri = str;
        this.headline = str2;
    }

    public static /* synthetic */ PlaylistRef copy$default(PlaylistRef playlistRef, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = playlistRef.id;
        }
        if ((i & 2) != 0) {
            str = playlistRef.uri;
        }
        if ((i & 4) != 0) {
            str2 = playlistRef.headline;
        }
        return playlistRef.copy(j, str, str2);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.headline;
    }

    public final PlaylistRef copy(long j, String str, String str2) {
        zq3.h(str, "uri");
        return new PlaylistRef(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistRef)) {
            return false;
        }
        PlaylistRef playlistRef = (PlaylistRef) obj;
        return this.id == playlistRef.id && zq3.c(this.uri, playlistRef.uri) && zq3.c(this.headline, playlistRef.headline);
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final long getId() {
        return this.id;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + this.uri.hashCode()) * 31;
        String str = this.headline;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PlaylistRef(id=" + this.id + ", uri=" + this.uri + ", headline=" + this.headline + ")";
    }

    public /* synthetic */ PlaylistRef(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, str2);
    }
}
