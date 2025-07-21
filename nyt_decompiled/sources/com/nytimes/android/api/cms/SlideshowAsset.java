package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface SlideshowAsset extends Asset {

    public static final class DefaultImpls {
        public static Image extractImage(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.extractImage(slideshowAsset);
        }

        public static String extractKicker(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.extractKicker(slideshowAsset);
        }

        public static boolean getCanBeSaved(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getCanBeSaved(slideshowAsset);
        }

        public static String getColumnDisplayName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(slideshowAsset);
        }

        public static String getColumnName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getColumnName(slideshowAsset);
        }

        public static String getDisplayTitle(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getDisplayTitle(slideshowAsset);
        }

        public static String getHtml(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getHtml(slideshowAsset);
        }

        public static Instant getLastModifiedInstant(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(slideshowAsset);
        }

        public static ImageAsset getMediaImage(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getMediaImage(slideshowAsset);
        }

        public static long getRealLastModified(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getRealLastModified(slideshowAsset);
        }

        public static String getSafeUri(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSafeUri(slideshowAsset);
        }

        public static boolean getSectionBranded(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSectionBranded(slideshowAsset);
        }

        public static String getSectionContentName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSectionContentName(slideshowAsset);
        }

        public static String getSectionDisplayName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(slideshowAsset);
        }

        public static String getSectionNameOptional(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(slideshowAsset);
        }

        public static String getSubSectionNameOptional(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(slideshowAsset);
        }

        public static String getSubsectionContentName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(slideshowAsset);
        }

        public static String getSubsectionDisplayName(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(slideshowAsset);
        }

        public static String getUrlOrEmpty(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(slideshowAsset);
        }

        public static boolean isColumn(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.isColumn(slideshowAsset);
        }

        public static boolean isDailyBriefing(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.isDailyBriefing(slideshowAsset);
        }

        public static boolean isMetered(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.isMetered(slideshowAsset);
        }

        public static boolean isShowPicture(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.isShowPicture(slideshowAsset);
        }

        public static OffsetDateTime lastUpdated(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.lastUpdated(slideshowAsset);
        }

        public static String recentlyViewedImageUrl(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(slideshowAsset);
        }

        public static String youTabImageUrl(SlideshowAsset slideshowAsset) {
            return Asset.DefaultImpls.youTabImageUrl(slideshowAsset);
        }
    }

    Slideshow getSlideshow();
}
