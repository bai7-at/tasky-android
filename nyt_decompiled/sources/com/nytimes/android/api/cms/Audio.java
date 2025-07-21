package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Audio {
    private final String credit;

    @SerializedName("file_name")
    private final String fileName;

    @SerializedName("file_url")
    private final String fileUrl;
    private final long length;

    @SerializedName("podcast_series")
    private final PodcastSeries podcastSeries;

    public Audio(String str, String str2, String str3, long j, PodcastSeries podcastSeries) {
        this.credit = str;
        this.fileName = str2;
        this.fileUrl = str3;
        this.length = j;
        this.podcastSeries = podcastSeries;
    }

    public static /* synthetic */ Audio copy$default(Audio audio, String str, String str2, String str3, long j, PodcastSeries podcastSeries, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audio.credit;
        }
        if ((i & 2) != 0) {
            str2 = audio.fileName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = audio.fileUrl;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = audio.length;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            podcastSeries = audio.podcastSeries;
        }
        return audio.copy(str, str4, str5, j2, podcastSeries);
    }

    public final String component1() {
        return this.credit;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final long component4() {
        return this.length;
    }

    public final PodcastSeries component5() {
        return this.podcastSeries;
    }

    public final Audio copy(String str, String str2, String str3, long j, PodcastSeries podcastSeries) {
        return new Audio(str, str2, str3, j, podcastSeries);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) obj;
        return zq3.c(this.credit, audio.credit) && zq3.c(this.fileName, audio.fileName) && zq3.c(this.fileUrl, audio.fileUrl) && this.length == audio.length && zq3.c(this.podcastSeries, audio.podcastSeries);
    }

    public final String getCredit() {
        return this.credit;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final long getLength() {
        return this.length;
    }

    public final PodcastSeries getPodcastSeries() {
        return this.podcastSeries;
    }

    public int hashCode() {
        String str = this.credit;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileUrl;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.length)) * 31;
        PodcastSeries podcastSeries = this.podcastSeries;
        return hashCode3 + (podcastSeries != null ? podcastSeries.hashCode() : 0);
    }

    public String toString() {
        return "Audio(credit=" + this.credit + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", length=" + this.length + ", podcastSeries=" + this.podcastSeries + ")";
    }

    public /* synthetic */ Audio(String str, String str2, String str3, long j, PodcastSeries podcastSeries, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? 0L : j, podcastSeries);
    }
}
