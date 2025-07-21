package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface ImageAsset extends Asset {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String JUMBO = "JUMBO";
    public static final String LARGE = "LARGE";
    public static final String SMALL = "SMALL";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String JUMBO = "JUMBO";
        public static final String LARGE = "LARGE";
        public static final String SMALL = "SMALL";

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        public static Image extractImage(ImageAsset imageAsset) {
            return Asset.DefaultImpls.extractImage(imageAsset);
        }

        public static String extractKicker(ImageAsset imageAsset) {
            return Asset.DefaultImpls.extractKicker(imageAsset);
        }

        public static boolean getCanBeSaved(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getCanBeSaved(imageAsset);
        }

        public static String getColumnDisplayName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(imageAsset);
        }

        public static String getColumnName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getColumnName(imageAsset);
        }

        public static String getDisplayTitle(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getDisplayTitle(imageAsset);
        }

        public static String getHtml(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getHtml(imageAsset);
        }

        public static Instant getLastModifiedInstant(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(imageAsset);
        }

        public static ImageAsset getMediaImage(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getMediaImage(imageAsset);
        }

        public static long getRealLastModified(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getRealLastModified(imageAsset);
        }

        public static String getSafeUri(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSafeUri(imageAsset);
        }

        public static boolean getSectionBranded(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSectionBranded(imageAsset);
        }

        public static String getSectionContentName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSectionContentName(imageAsset);
        }

        public static String getSectionDisplayName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(imageAsset);
        }

        public static String getSectionNameOptional(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(imageAsset);
        }

        public static String getSubSectionNameOptional(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(imageAsset);
        }

        public static String getSubsectionContentName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(imageAsset);
        }

        public static String getSubsectionDisplayName(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(imageAsset);
        }

        public static String getUrlOrEmpty(ImageAsset imageAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(imageAsset);
        }

        public static boolean isColumn(ImageAsset imageAsset) {
            return Asset.DefaultImpls.isColumn(imageAsset);
        }

        public static boolean isDailyBriefing(ImageAsset imageAsset) {
            return Asset.DefaultImpls.isDailyBriefing(imageAsset);
        }

        public static boolean isMetered(ImageAsset imageAsset) {
            return Asset.DefaultImpls.isMetered(imageAsset);
        }

        public static boolean isShowPicture(ImageAsset imageAsset) {
            return Asset.DefaultImpls.isShowPicture(imageAsset);
        }

        public static OffsetDateTime lastUpdated(ImageAsset imageAsset) {
            return Asset.DefaultImpls.lastUpdated(imageAsset);
        }

        public static String recentlyViewedImageUrl(ImageAsset imageAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(imageAsset);
        }

        public static String youTabImageUrl(ImageAsset imageAsset) {
            return Asset.DefaultImpls.youTabImageUrl(imageAsset);
        }
    }

    Image getImage();
}
