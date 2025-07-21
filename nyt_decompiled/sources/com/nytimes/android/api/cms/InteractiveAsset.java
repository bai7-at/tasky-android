package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface InteractiveAsset extends Asset {

    public static final class DefaultImpls {
        public static Image extractImage(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.extractImage(interactiveAsset);
        }

        public static String extractKicker(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.extractKicker(interactiveAsset);
        }

        public static boolean getCanBeSaved(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getCanBeSaved(interactiveAsset);
        }

        public static String getColumnDisplayName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(interactiveAsset);
        }

        public static String getColumnName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getColumnName(interactiveAsset);
        }

        public static String getDisplayTitle(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getDisplayTitle(interactiveAsset);
        }

        public static String getHtml(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getHtml(interactiveAsset);
        }

        public static String getInteractiveUrl(InteractiveAsset interactiveAsset) {
            Mobile mobile;
            String url;
            Interactivegraphics interactivegraphics = interactiveAsset.getInteractivegraphics();
            if (interactivegraphics != null && (mobile = interactivegraphics.getMobile()) != null && (url = mobile.getUrl()) != null) {
                return url;
            }
            String url2 = interactiveAsset.getUrl();
            return url2 == null ? "" : url2;
        }

        public static Instant getLastModifiedInstant(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(interactiveAsset);
        }

        public static ImageAsset getMediaImage(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getMediaImage(interactiveAsset);
        }

        public static int getMinWidth(InteractiveAsset interactiveAsset) {
            Interactivegraphics interactivegraphics = interactiveAsset.getInteractivegraphics();
            if (interactivegraphics != null) {
                return interactivegraphics.getMinWidth();
            }
            return 0;
        }

        public static long getRealLastModified(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getRealLastModified(interactiveAsset);
        }

        public static String getSafeUri(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSafeUri(interactiveAsset);
        }

        public static boolean getSectionBranded(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSectionBranded(interactiveAsset);
        }

        public static String getSectionContentName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSectionContentName(interactiveAsset);
        }

        public static String getSectionDisplayName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(interactiveAsset);
        }

        public static String getSectionNameOptional(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(interactiveAsset);
        }

        public static String getSubSectionNameOptional(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(interactiveAsset);
        }

        public static String getSubsectionContentName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(interactiveAsset);
        }

        public static String getSubsectionDisplayName(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(interactiveAsset);
        }

        public static String getUrlOrEmpty(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(interactiveAsset);
        }

        public static boolean isColumn(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.isColumn(interactiveAsset);
        }

        public static boolean isDailyBriefing(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.isDailyBriefing(interactiveAsset);
        }

        public static boolean isEmbedded(InteractiveAsset interactiveAsset) {
            Mobile mobile;
            Interactivegraphics interactivegraphics = interactiveAsset.getInteractivegraphics();
            if (interactivegraphics == null || (mobile = interactivegraphics.getMobile()) == null) {
                return false;
            }
            return mobile.getEmbedded();
        }

        public static boolean isMetered(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.isMetered(interactiveAsset);
        }

        public static boolean isShowPicture(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.isShowPicture(interactiveAsset);
        }

        public static OffsetDateTime lastUpdated(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.lastUpdated(interactiveAsset);
        }

        public static String recentlyViewedImageUrl(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(interactiveAsset);
        }

        public static boolean showInteractive(InteractiveAsset interactiveAsset) {
            Mobile mobile;
            Interactivegraphics interactivegraphics = interactiveAsset.getInteractivegraphics();
            if (interactivegraphics == null || (mobile = interactivegraphics.getMobile()) == null) {
                return false;
            }
            return mobile.getIncludeInCompatibleApps();
        }

        public static String youTabImageUrl(InteractiveAsset interactiveAsset) {
            return Asset.DefaultImpls.youTabImageUrl(interactiveAsset);
        }
    }

    String getInteractiveUrl();

    Interactivegraphics getInteractivegraphics();

    int getMinWidth();

    boolean isEmbedded();

    boolean showInteractive();
}
