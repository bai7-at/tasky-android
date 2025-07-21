package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.HasHybridProperties;
import com.nytimes.android.resourcedownloader.model.HybridProperties;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public interface ArticleAsset extends Asset, HasHybridProperties {

    public static final class DefaultImpls {
        public static Image extractImage(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.extractImage(articleAsset);
        }

        public static String extractKicker(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.extractKicker(articleAsset);
        }

        public static boolean getCanBeSaved(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getCanBeSaved(articleAsset);
        }

        public static String getColumnDisplayName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getColumnDisplayName(articleAsset);
        }

        public static String getColumnName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getColumnName(articleAsset);
        }

        public static String getDisplayTitle(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getDisplayTitle(articleAsset);
        }

        public static String getHtml(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getHtml(articleAsset);
        }

        public static String getHybridBody(ArticleAsset articleAsset) {
            HybridContent hybridContent;
            Article article = articleAsset.getArticle();
            String contents = (article == null || (hybridContent = article.getHybridContent()) == null) ? null : hybridContent.getContents();
            return contents == null ? "" : contents;
        }

        public static List<HybridImage> getHybridImages(ArticleAsset articleAsset) {
            List<HybridImage> hybridImages;
            Article article = articleAsset.getArticle();
            return (article == null || (hybridImages = article.getHybridImages()) == null) ? i.l() : hybridImages;
        }

        public static List<HybridResource> getHybridResources(ArticleAsset articleAsset) {
            List<HybridResource> hybridResources;
            Article article = articleAsset.getArticle();
            return (article == null || (hybridResources = article.getHybridResources()) == null) ? i.l() : hybridResources;
        }

        public static Instant getLastModifiedInstant(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getLastModifiedInstant(articleAsset);
        }

        public static ImageAsset getMediaImage(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getMediaImage(articleAsset);
        }

        public static long getRealLastModified(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getRealLastModified(articleAsset);
        }

        public static String getSafeUri(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSafeUri(articleAsset);
        }

        public static boolean getSectionBranded(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSectionBranded(articleAsset);
        }

        public static String getSectionContentName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSectionContentName(articleAsset);
        }

        public static String getSectionDisplayName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSectionDisplayName(articleAsset);
        }

        public static String getSectionNameOptional(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSectionNameOptional(articleAsset);
        }

        public static String getSubSectionNameOptional(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSubSectionNameOptional(articleAsset);
        }

        public static String getSubsectionContentName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSubsectionContentName(articleAsset);
        }

        public static String getSubsectionDisplayName(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getSubsectionDisplayName(articleAsset);
        }

        public static String getUrlOrEmpty(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.getUrlOrEmpty(articleAsset);
        }

        public static boolean isColumn(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.isColumn(articleAsset);
        }

        public static boolean isDailyBriefing(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.isDailyBriefing(articleAsset);
        }

        public static boolean isMetered(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.isMetered(articleAsset);
        }

        public static boolean isShowPicture(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.isShowPicture(articleAsset);
        }

        public static OffsetDateTime lastUpdated(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.lastUpdated(articleAsset);
        }

        public static String recentlyViewedImageUrl(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.recentlyViewedImageUrl(articleAsset);
        }

        public static HybridProperties toHybridProperties(ArticleAsset articleAsset) {
            return HasHybridProperties.DefaultImpls.toHybridProperties(articleAsset);
        }

        public static String youTabImageUrl(ArticleAsset articleAsset) {
            return Asset.DefaultImpls.youTabImageUrl(articleAsset);
        }
    }

    Article getArticle();

    String getArticleSubHeadline();

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    String getHybridBody();

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    List<HybridImage> getHybridImages();

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    List<HybridResource> getHybridResources();
}
