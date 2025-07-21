package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Video;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface VideoAsset extends Asset {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final AtomicLong nextUniqueId;
        private static final String uniqueId;

        static {
            AtomicLong atomicLong = new AtomicLong();
            nextUniqueId = atomicLong;
            uniqueId = Long.toString(atomicLong.incrementAndGet());
        }

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static ContentSeries contentSeries(VideoAsset videoAsset) {
            Video video = videoAsset.getVideo();
            if (video != null) {
                return video.getContentSeries();
            }
            return null;
        }

        public static Image extractImage(VideoAsset videoAsset) {
            return Asset.DefaultImpls.extractImage(videoAsset);
        }

        public static String extractKicker(VideoAsset videoAsset) {
            return Asset.DefaultImpls.extractKicker(videoAsset);
        }

        public static String getAspectRatio(VideoAsset videoAsset) {
            Video video = videoAsset.getVideo();
            if (video != null) {
                return video.getAspectRatio();
            }
            return null;
        }

        public static boolean getCanBeSaved(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getCanBeSaved(videoAsset);
        }

        public static String getChannel(VideoAsset videoAsset) {
            Video.Channel channel;
            Video video = videoAsset.getVideo();
            String displayName = (video == null || (channel = video.getChannel()) == null) ? null : channel.getDisplayName();
            return displayName == null ? "" : displayName;
        }

        public static String getColumnDisplayName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(videoAsset);
        }

        public static String getColumnName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getColumnName(videoAsset);
        }

        public static String getDisplayTitle(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getDisplayTitle(videoAsset);
        }

        public static String getHtml(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getHtml(videoAsset);
        }

        public static Instant getLastModifiedInstant(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(videoAsset);
        }

        public static String getLiveUrl(VideoAsset videoAsset) {
            if (!videoAsset.isLive() || videoAsset.getLiveUrls().isEmpty()) {
                return null;
            }
            return videoAsset.getLiveUrls().get(0).getUrl();
        }

        public static List<Video.LiveUrl> getLiveUrls(VideoAsset videoAsset) {
            List<Video.LiveUrl> liveUrls;
            Video video = videoAsset.getVideo();
            return (video == null || (liveUrls = video.getLiveUrls()) == null) ? i.l() : liveUrls;
        }

        public static ImageAsset getMediaImage(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getMediaImage(videoAsset);
        }

        public static long getRealLastModified(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getRealLastModified(videoAsset);
        }

        public static String getSafeUri(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSafeUri(videoAsset);
        }

        public static boolean getSectionBranded(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSectionBranded(videoAsset);
        }

        public static String getSectionContentName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSectionContentName(videoAsset);
        }

        public static String getSectionDisplayName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(videoAsset);
        }

        public static String getSectionNameOptional(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(videoAsset);
        }

        public static String getShow(VideoAsset videoAsset) {
            Video.Show show;
            Video video = videoAsset.getVideo();
            String displayName = (video == null || (show = video.getShow()) == null) ? null : show.getDisplayName();
            return displayName == null ? "" : displayName;
        }

        public static String getSubSectionNameOptional(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(videoAsset);
        }

        public static String getSubsectionContentName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(videoAsset);
        }

        public static String getSubsectionDisplayName(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(videoAsset);
        }

        public static String getUniqueId(VideoAsset videoAsset) {
            return Companion.uniqueId;
        }

        public static String getUrlOrEmpty(VideoAsset videoAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(videoAsset);
        }

        public static long getVideoDuration(VideoAsset videoAsset) {
            Video video = videoAsset.getVideo();
            if (video != null) {
                return video.getDuration();
            }
            return 0L;
        }

        public static String getVideoDurationFormatted(VideoAsset videoAsset) {
            int videoDuration = (int) (videoAsset.getVideoDuration() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            int i = videoDuration / 60;
            String valueOf = String.valueOf(videoDuration % 60);
            if (valueOf.length() == 1) {
                valueOf = "0" + valueOf;
            }
            return i + ":" + valueOf;
        }

        public static List<Video.VideoFiles> getVideoFiles(VideoAsset videoAsset) {
            List<Video.VideoFiles> videoFiles;
            Video video = videoAsset.getVideo();
            return (video == null || (videoFiles = video.getVideoFiles()) == null) ? i.l() : videoFiles;
        }

        public static String hlsUrl(VideoAsset videoAsset) {
            List<Video.VideoFiles> videoFiles;
            Object obj;
            Video video = videoAsset.getVideo();
            if (video == null || (videoFiles = video.getVideoFiles()) == null) {
                return null;
            }
            Iterator<T> it2 = videoFiles.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((Video.VideoFiles) obj).getType(), "hls")) {
                    break;
                }
            }
            Video.VideoFiles videoFiles2 = (Video.VideoFiles) obj;
            if (videoFiles2 != null) {
                return videoFiles2.getUrl();
            }
            return null;
        }

        public static boolean isColumn(VideoAsset videoAsset) {
            return Asset.DefaultImpls.isColumn(videoAsset);
        }

        public static boolean isDailyBriefing(VideoAsset videoAsset) {
            return Asset.DefaultImpls.isDailyBriefing(videoAsset);
        }

        public static boolean isLive(VideoAsset videoAsset) {
            Video video = videoAsset.getVideo();
            if (video != null) {
                return video.isLive();
            }
            return false;
        }

        public static boolean isMetered(VideoAsset videoAsset) {
            return Asset.DefaultImpls.isMetered(videoAsset);
        }

        public static boolean isShowPicture(VideoAsset videoAsset) {
            return Asset.DefaultImpls.isShowPicture(videoAsset);
        }

        public static boolean isVertical(VideoAsset videoAsset) {
            Video video = videoAsset.getVideo();
            return zq3.c(VideoAssetKt.VERTICAL_ASPECT_RATIO, video != null ? video.getAspectRatio() : null);
        }

        public static OffsetDateTime lastUpdated(VideoAsset videoAsset) {
            return Asset.DefaultImpls.lastUpdated(videoAsset);
        }

        public static PlaylistRef playlist(VideoAsset videoAsset) {
            List<PlaylistRef> playlists;
            Video video = videoAsset.getVideo();
            if (video == null || (playlists = video.getPlaylists()) == null) {
                return null;
            }
            return playlists.get(0);
        }

        public static String recentlyViewedImageUrl(VideoAsset videoAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(videoAsset);
        }

        public static String youTabImageUrl(VideoAsset videoAsset) {
            return Asset.DefaultImpls.youTabImageUrl(videoAsset);
        }
    }

    ContentSeries contentSeries();

    String getAspectRatio();

    String getChannel();

    String getLiveUrl();

    List<Video.LiveUrl> getLiveUrls();

    String getShow();

    String getUniqueId();

    Video getVideo();

    long getVideoDuration();

    String getVideoDurationFormatted();

    List<Video.VideoFiles> getVideoFiles();

    String hlsUrl();

    boolean isLive();

    boolean isVertical();

    PlaylistRef playlist();
}
