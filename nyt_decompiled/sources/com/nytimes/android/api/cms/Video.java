package com.nytimes.android.api.cms;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Video {

    @SerializedName("aspect_ratio")
    private final String aspectRatio;
    private final boolean canShowAds;
    private final Channel channel;

    @SerializedName("content_series")
    private final ContentSeries contentSeries;
    private final long duration;

    @SerializedName("is_live")
    private final boolean isLive;

    @SerializedName("live_urls")
    private final List<LiveUrl> liveUrls;
    private final List<PlaylistRef> playlists;
    private final String productionType;
    private final Show show;
    private final String transcript;

    @SerializedName("video_files")
    private final List<VideoFiles> videoFiles;

    @et3(generateAdapter = true)
    public static final class Channel {

        @SerializedName("display_name")
        private final String displayName;

        /* JADX WARN: Multi-variable type inference failed */
        public Channel() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Channel copy$default(Channel channel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = channel.displayName;
            }
            return channel.copy(str);
        }

        public final String component1() {
            return this.displayName;
        }

        public final Channel copy(String str) {
            return new Channel(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Channel) && zq3.c(this.displayName, ((Channel) obj).displayName);
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public int hashCode() {
            String str = this.displayName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Channel(displayName=" + this.displayName + ")";
        }

        public Channel(String str) {
            this.displayName = str;
        }

        public /* synthetic */ Channel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @et3(generateAdapter = true)
    public static final class LiveUrl {
        private final int rank;
        private final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public LiveUrl() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LiveUrl copy$default(LiveUrl liveUrl, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = liveUrl.rank;
            }
            if ((i2 & 2) != 0) {
                str = liveUrl.url;
            }
            return liveUrl.copy(i, str);
        }

        public final int component1() {
            return this.rank;
        }

        public final String component2() {
            return this.url;
        }

        public final LiveUrl copy(int i, String str) {
            return new LiveUrl(i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveUrl)) {
                return false;
            }
            LiveUrl liveUrl = (LiveUrl) obj;
            return this.rank == liveUrl.rank && zq3.c(this.url, liveUrl.url);
        }

        public final int getRank() {
            return this.rank;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.rank) * 31;
            String str = this.url;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LiveUrl(rank=" + this.rank + ", url=" + this.url + ")";
        }

        public LiveUrl(int i, String str) {
            this.rank = i;
            this.url = str;
        }

        public /* synthetic */ LiveUrl(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
        }
    }

    @et3(generateAdapter = true)
    public static final class Show {

        @SerializedName("display_name")
        private final String displayName;

        /* JADX WARN: Multi-variable type inference failed */
        public Show() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Show copy$default(Show show, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = show.displayName;
            }
            return show.copy(str);
        }

        public final String component1() {
            return this.displayName;
        }

        public final Show copy(String str) {
            return new Show(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Show) && zq3.c(this.displayName, ((Show) obj).displayName);
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public int hashCode() {
            String str = this.displayName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Show(displayName=" + this.displayName + ")";
        }

        public Show(String str) {
            this.displayName = str;
        }

        public /* synthetic */ Show(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @et3(generateAdapter = true)
    public static final class VideoFiles {
        private final long bitrate;
        private final int duration;

        @SerializedName("file_size")
        private final int fileSize;
        private final int height;

        @SerializedName("live")
        private final boolean isLive;

        /* renamed from: type, reason: collision with root package name */
        private final String f57type;
        private final String url;

        @SerializedName("videoencoding")
        private final String videoEncoding;
        private final int width;

        public VideoFiles() {
            this(0, 0, 0, 0, false, 0L, null, null, null, 511, null);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.fileSize;
        }

        public final int component3() {
            return this.duration;
        }

        public final int component4() {
            return this.height;
        }

        public final boolean component5() {
            return this.isLive;
        }

        public final long component6() {
            return this.bitrate;
        }

        public final String component7() {
            return this.videoEncoding;
        }

        public final String component8() {
            return this.url;
        }

        public final String component9() {
            return this.f57type;
        }

        public final VideoFiles copy(int i, int i2, int i3, int i4, boolean z, long j, String str, String str2, String str3) {
            return new VideoFiles(i, i2, i3, i4, z, j, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoFiles)) {
                return false;
            }
            VideoFiles videoFiles = (VideoFiles) obj;
            return this.width == videoFiles.width && this.fileSize == videoFiles.fileSize && this.duration == videoFiles.duration && this.height == videoFiles.height && this.isLive == videoFiles.isLive && this.bitrate == videoFiles.bitrate && zq3.c(this.videoEncoding, videoFiles.videoEncoding) && zq3.c(this.url, videoFiles.url) && zq3.c(this.f57type, videoFiles.f57type);
        }

        public final long getBitrate() {
            return this.bitrate;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final int getFileSize() {
            return this.fileSize;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getType() {
            return this.f57type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getVideoEncoding() {
            return this.videoEncoding;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            int hashCode = ((((((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.fileSize)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.height)) * 31) + Boolean.hashCode(this.isLive)) * 31) + Long.hashCode(this.bitrate)) * 31;
            String str = this.videoEncoding;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.url;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f57type;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean isLive() {
            return this.isLive;
        }

        public String toString() {
            return "VideoFiles(width=" + this.width + ", fileSize=" + this.fileSize + ", duration=" + this.duration + ", height=" + this.height + ", isLive=" + this.isLive + ", bitrate=" + this.bitrate + ", videoEncoding=" + this.videoEncoding + ", url=" + this.url + ", type=" + this.f57type + ")";
        }

        public VideoFiles(int i, int i2, int i3, int i4, boolean z, long j, String str, String str2, String str3) {
            this.width = i;
            this.fileSize = i2;
            this.duration = i3;
            this.height = i4;
            this.isLive = z;
            this.bitrate = j;
            this.videoEncoding = str;
            this.url = str2;
            this.f57type = str3;
        }

        public /* synthetic */ VideoFiles(int i, int i2, int i3, int i4, boolean z, long j, String str, String str2, String str3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? 0L : j, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? null : str2, (i5 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str3);
        }
    }

    public Video() {
        this(null, false, null, null, null, null, null, null, 0L, false, null, null, 4095, null);
    }

    public final List<LiveUrl> component1() {
        return this.liveUrls;
    }

    public final boolean component10() {
        return this.canShowAds;
    }

    public final String component11() {
        return this.productionType;
    }

    public final String component12() {
        return this.transcript;
    }

    public final boolean component2() {
        return this.isLive;
    }

    public final List<PlaylistRef> component3() {
        return this.playlists;
    }

    public final Show component4() {
        return this.show;
    }

    public final ContentSeries component5() {
        return this.contentSeries;
    }

    public final String component6() {
        return this.aspectRatio;
    }

    public final Channel component7() {
        return this.channel;
    }

    public final List<VideoFiles> component8() {
        return this.videoFiles;
    }

    public final long component9() {
        return this.duration;
    }

    public final Video copy(List<LiveUrl> list, boolean z, List<PlaylistRef> list2, Show show, ContentSeries contentSeries, String str, Channel channel, List<VideoFiles> list3, long j, boolean z2, String str2, String str3) {
        return new Video(list, z, list2, show, contentSeries, str, channel, list3, j, z2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return zq3.c(this.liveUrls, video.liveUrls) && this.isLive == video.isLive && zq3.c(this.playlists, video.playlists) && zq3.c(this.show, video.show) && zq3.c(this.contentSeries, video.contentSeries) && zq3.c(this.aspectRatio, video.aspectRatio) && zq3.c(this.channel, video.channel) && zq3.c(this.videoFiles, video.videoFiles) && this.duration == video.duration && this.canShowAds == video.canShowAds && zq3.c(this.productionType, video.productionType) && zq3.c(this.transcript, video.transcript);
    }

    public final String getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getCanShowAds() {
        return this.canShowAds;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final ContentSeries getContentSeries() {
        return this.contentSeries;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<LiveUrl> getLiveUrls() {
        return this.liveUrls;
    }

    public final List<PlaylistRef> getPlaylists() {
        return this.playlists;
    }

    public final String getProductionType() {
        return this.productionType;
    }

    public final Show getShow() {
        return this.show;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public final List<VideoFiles> getVideoFiles() {
        return this.videoFiles;
    }

    public int hashCode() {
        List<LiveUrl> list = this.liveUrls;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.isLive)) * 31;
        List<PlaylistRef> list2 = this.playlists;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Show show = this.show;
        int hashCode3 = (hashCode2 + (show == null ? 0 : show.hashCode())) * 31;
        ContentSeries contentSeries = this.contentSeries;
        int hashCode4 = (hashCode3 + (contentSeries == null ? 0 : contentSeries.hashCode())) * 31;
        String str = this.aspectRatio;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.channel;
        int hashCode6 = (hashCode5 + (channel == null ? 0 : channel.hashCode())) * 31;
        List<VideoFiles> list3 = this.videoFiles;
        int hashCode7 = (((((hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31) + Long.hashCode(this.duration)) * 31) + Boolean.hashCode(this.canShowAds)) * 31;
        String str2 = this.productionType;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transcript;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        return "Video(liveUrls=" + this.liveUrls + ", isLive=" + this.isLive + ", playlists=" + this.playlists + ", show=" + this.show + ", contentSeries=" + this.contentSeries + ", aspectRatio=" + this.aspectRatio + ", channel=" + this.channel + ", videoFiles=" + this.videoFiles + ", duration=" + this.duration + ", canShowAds=" + this.canShowAds + ", productionType=" + this.productionType + ", transcript=" + this.transcript + ")";
    }

    public Video(List<LiveUrl> list, boolean z, List<PlaylistRef> list2, Show show, ContentSeries contentSeries, String str, Channel channel, List<VideoFiles> list3, long j, boolean z2, String str2, String str3) {
        this.liveUrls = list;
        this.isLive = z;
        this.playlists = list2;
        this.show = show;
        this.contentSeries = contentSeries;
        this.aspectRatio = str;
        this.channel = channel;
        this.videoFiles = list3;
        this.duration = j;
        this.canShowAds = z2;
        this.productionType = str2;
        this.transcript = str3;
    }

    public /* synthetic */ Video(List list, boolean z, List list2, Show show, ContentSeries contentSeries, String str, Channel channel, List list3, long j, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : show, (i & 16) != 0 ? null : contentSeries, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : channel, (i & 128) != 0 ? null : list3, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? 0L : j, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? null : str2, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) == 0 ? str3 : null);
    }
}
