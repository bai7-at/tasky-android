package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface LegacyCollectionAsset extends Asset {

    public static final class DefaultImpls {
        public static Image extractImage(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.extractImage(legacyCollectionAsset);
        }

        public static String extractKicker(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.extractKicker(legacyCollectionAsset);
        }

        public static boolean getCanBeSaved(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getCanBeSaved(legacyCollectionAsset);
        }

        public static String getColumnDisplayName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(legacyCollectionAsset);
        }

        public static String getColumnName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getColumnName(legacyCollectionAsset);
        }

        public static String getDisplayTitle(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getDisplayTitle(legacyCollectionAsset);
        }

        public static String getHtml(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getHtml(legacyCollectionAsset);
        }

        public static String getInteractiveUrl(LegacyCollectionAsset legacyCollectionAsset) {
            LegacyCollectionMobile mobile;
            String url;
            LegacyCollectionGraphics interactivegraphics = legacyCollectionAsset.getInteractivegraphics();
            if (interactivegraphics != null && (mobile = interactivegraphics.getMobile()) != null && (url = mobile.getUrl()) != null) {
                return url;
            }
            String url2 = legacyCollectionAsset.getUrl();
            return url2 == null ? "" : url2;
        }

        public static Instant getLastModifiedInstant(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(legacyCollectionAsset);
        }

        public static ImageAsset getMediaImage(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getMediaImage(legacyCollectionAsset);
        }

        public static int getMinWidth(LegacyCollectionAsset legacyCollectionAsset) {
            LegacyCollectionGraphics interactivegraphics = legacyCollectionAsset.getInteractivegraphics();
            if (interactivegraphics != null) {
                return interactivegraphics.getMinWidth();
            }
            return 0;
        }

        public static long getRealLastModified(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getRealLastModified(legacyCollectionAsset);
        }

        public static String getSafeUri(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSafeUri(legacyCollectionAsset);
        }

        public static boolean getSectionBranded(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSectionBranded(legacyCollectionAsset);
        }

        public static String getSectionContentName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSectionContentName(legacyCollectionAsset);
        }

        public static String getSectionDisplayName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(legacyCollectionAsset);
        }

        public static String getSectionNameOptional(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(legacyCollectionAsset);
        }

        public static String getSubSectionNameOptional(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(legacyCollectionAsset);
        }

        public static String getSubsectionContentName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(legacyCollectionAsset);
        }

        public static String getSubsectionDisplayName(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(legacyCollectionAsset);
        }

        public static String getUrlOrEmpty(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(legacyCollectionAsset);
        }

        public static boolean isColumn(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.isColumn(legacyCollectionAsset);
        }

        public static boolean isDailyBriefing(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.isDailyBriefing(legacyCollectionAsset);
        }

        public static boolean isEmbedded(LegacyCollectionAsset legacyCollectionAsset) {
            LegacyCollectionMobile mobile;
            LegacyCollectionGraphics interactivegraphics = legacyCollectionAsset.getInteractivegraphics();
            if (interactivegraphics == null || (mobile = interactivegraphics.getMobile()) == null) {
                return false;
            }
            return mobile.getEmbedded();
        }

        public static boolean isMetered(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.isMetered(legacyCollectionAsset);
        }

        public static boolean isShowPicture(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.isShowPicture(legacyCollectionAsset);
        }

        public static OffsetDateTime lastUpdated(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.lastUpdated(legacyCollectionAsset);
        }

        public static String recentlyViewedImageUrl(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(legacyCollectionAsset);
        }

        public static boolean showInteractive(LegacyCollectionAsset legacyCollectionAsset) {
            LegacyCollectionMobile mobile;
            LegacyCollectionGraphics interactivegraphics = legacyCollectionAsset.getInteractivegraphics();
            if (interactivegraphics == null || (mobile = interactivegraphics.getMobile()) == null) {
                return false;
            }
            return mobile.getIncludeInCompatibleApps();
        }

        public static String youTabImageUrl(LegacyCollectionAsset legacyCollectionAsset) {
            return Asset.DefaultImpls.youTabImageUrl(legacyCollectionAsset);
        }
    }

    String getInteractiveUrl();

    LegacyCollectionGraphics getInteractivegraphics();

    int getMinWidth();

    boolean isEmbedded();

    boolean showInteractive();
}
