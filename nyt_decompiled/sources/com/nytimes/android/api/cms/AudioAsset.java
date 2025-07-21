package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface AudioAsset extends Asset {

    public static final class DefaultImpls {
        public static Long durationInSeconds(AudioAsset audioAsset) {
            Audio audio = audioAsset.getAudio();
            if (audio != null) {
                return Long.valueOf(audio.getLength());
            }
            return null;
        }

        public static Image extractImage(AudioAsset audioAsset) {
            return Asset.DefaultImpls.extractImage(audioAsset);
        }

        public static String extractKicker(AudioAsset audioAsset) {
            return Asset.DefaultImpls.extractKicker(audioAsset);
        }

        public static String fileUrl(AudioAsset audioAsset) {
            Audio audio = audioAsset.getAudio();
            if (audio != null) {
                return audio.getFileUrl();
            }
            return null;
        }

        public static boolean getCanBeSaved(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getCanBeSaved(audioAsset);
        }

        public static String getColumnDisplayName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(audioAsset);
        }

        public static String getColumnName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getColumnName(audioAsset);
        }

        public static String getDisplayTitle(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getDisplayTitle(audioAsset);
        }

        public static String getHtml(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getHtml(audioAsset);
        }

        public static Instant getLastModifiedInstant(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(audioAsset);
        }

        public static ImageAsset getMediaImage(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getMediaImage(audioAsset);
        }

        public static long getRealLastModified(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getRealLastModified(audioAsset);
        }

        public static String getSafeUri(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSafeUri(audioAsset);
        }

        public static boolean getSectionBranded(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSectionBranded(audioAsset);
        }

        public static String getSectionContentName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSectionContentName(audioAsset);
        }

        public static String getSectionDisplayName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(audioAsset);
        }

        public static String getSectionNameOptional(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(audioAsset);
        }

        public static String getSubSectionNameOptional(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(audioAsset);
        }

        public static String getSubsectionContentName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(audioAsset);
        }

        public static String getSubsectionDisplayName(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(audioAsset);
        }

        public static String getUrlOrEmpty(AudioAsset audioAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(audioAsset);
        }

        public static boolean isColumn(AudioAsset audioAsset) {
            return Asset.DefaultImpls.isColumn(audioAsset);
        }

        public static boolean isDailyBriefing(AudioAsset audioAsset) {
            return Asset.DefaultImpls.isDailyBriefing(audioAsset);
        }

        public static boolean isMetered(AudioAsset audioAsset) {
            return Asset.DefaultImpls.isMetered(audioAsset);
        }

        public static boolean isPodcast(AudioAsset audioAsset) {
            Audio audio = audioAsset.getAudio();
            return (audio != null ? audio.getPodcastSeries() : null) != null;
        }

        public static boolean isShowPicture(AudioAsset audioAsset) {
            return Asset.DefaultImpls.isShowPicture(audioAsset);
        }

        public static OffsetDateTime lastUpdated(AudioAsset audioAsset) {
            return Asset.DefaultImpls.lastUpdated(audioAsset);
        }

        public static PodcastSeries podcastSeries(AudioAsset audioAsset) {
            Audio audio = audioAsset.getAudio();
            if (audio != null) {
                return audio.getPodcastSeries();
            }
            return null;
        }

        public static String recentlyViewedImageUrl(AudioAsset audioAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(audioAsset);
        }

        public static String seriesName(AudioAsset audioAsset) {
            PodcastSeries podcastSeries;
            Audio audio = audioAsset.getAudio();
            if (audio == null || (podcastSeries = audio.getPodcastSeries()) == null) {
                return null;
            }
            return podcastSeries.getName();
        }

        public static String seriesThumbUrl(AudioAsset audioAsset) {
            Image image;
            Image.ImageCrop crops;
            ImageDimension smallSquare168;
            PodcastSeries podcastSeries;
            Audio audio = audioAsset.getAudio();
            Asset image2 = (audio == null || (podcastSeries = audio.getPodcastSeries()) == null) ? null : podcastSeries.getImage();
            ImageAsset imageAsset = image2 instanceof ImageAsset ? (ImageAsset) image2 : null;
            if (imageAsset == null || (image = imageAsset.getImage()) == null || (crops = image.getCrops()) == null || (smallSquare168 = crops.getSmallSquare168()) == null) {
                return null;
            }
            return smallSquare168.getUrl();
        }

        public static List<SubscribeUrl> subscribeUrls(AudioAsset audioAsset) {
            PodcastSeries podcastSeries;
            Audio audio = audioAsset.getAudio();
            if (audio == null || (podcastSeries = audio.getPodcastSeries()) == null) {
                return null;
            }
            return podcastSeries.getSubscribeUrls();
        }

        public static String youTabImageUrl(AudioAsset audioAsset) {
            return Asset.DefaultImpls.youTabImageUrl(audioAsset);
        }
    }

    Long durationInSeconds();

    String fileUrl();

    Audio getAudio();

    boolean isPodcast();

    PodcastSeries podcastSeries();

    String seriesName();

    String seriesThumbUrl();

    List<SubscribeUrl> subscribeUrls();
}
