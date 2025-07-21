package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface PromoAsset extends Asset {

    public static final class DefaultImpls {
        public static Image extractImage(PromoAsset promoAsset) {
            return Asset.DefaultImpls.extractImage(promoAsset);
        }

        public static String extractKicker(PromoAsset promoAsset) {
            return Asset.DefaultImpls.extractKicker(promoAsset);
        }

        public static boolean getCanBeSaved(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getCanBeSaved(promoAsset);
        }

        public static String getColumnDisplayName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(promoAsset);
        }

        public static String getColumnName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getColumnName(promoAsset);
        }

        public static String getDisplayTitle(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getDisplayTitle(promoAsset);
        }

        public static String getHtml(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getHtml(promoAsset);
        }

        public static Instant getLastModifiedInstant(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(promoAsset);
        }

        public static ImageAsset getMediaImage(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getMediaImage(promoAsset);
        }

        public static long getRealLastModified(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getRealLastModified(promoAsset);
        }

        public static String getSafeUri(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSafeUri(promoAsset);
        }

        public static boolean getSectionBranded(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSectionBranded(promoAsset);
        }

        public static String getSectionContentName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSectionContentName(promoAsset);
        }

        public static String getSectionDisplayName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(promoAsset);
        }

        public static String getSectionNameOptional(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(promoAsset);
        }

        public static String getSubSectionNameOptional(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(promoAsset);
        }

        public static String getSubsectionContentName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(promoAsset);
        }

        public static String getSubsectionDisplayName(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(promoAsset);
        }

        public static String getUrlOrEmpty(PromoAsset promoAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(promoAsset);
        }

        public static boolean isColumn(PromoAsset promoAsset) {
            return Asset.DefaultImpls.isColumn(promoAsset);
        }

        public static boolean isDailyBriefing(PromoAsset promoAsset) {
            return Asset.DefaultImpls.isDailyBriefing(promoAsset);
        }

        public static boolean isMetered(PromoAsset promoAsset) {
            return Asset.DefaultImpls.isMetered(promoAsset);
        }

        public static boolean isShowPicture(PromoAsset promoAsset) {
            return Asset.DefaultImpls.isShowPicture(promoAsset);
        }

        public static OffsetDateTime lastUpdated(PromoAsset promoAsset) {
            return Asset.DefaultImpls.lastUpdated(promoAsset);
        }

        public static String recentlyViewedImageUrl(PromoAsset promoAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(promoAsset);
        }

        public static String youTabImageUrl(PromoAsset promoAsset) {
            return Asset.DefaultImpls.youTabImageUrl(promoAsset);
        }
    }

    String getPromoUrl();

    boolean isEmbedded();
}
