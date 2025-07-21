package com.nytimes.android.api.cms;

import com.nytimes.android.api.cms.Image;
import defpackage.ew8;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.text.h;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

/* loaded from: classes3.dex */
public interface Asset {
    public static final long ARTICLE_ID_NOT_FOUND = -1;
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long ARTICLE_ID_NOT_FOUND = -1;

        private Companion() {
        }

        public final String generateUri(long j, String str) {
            return "nyt://" + str + "/" + ew8.c(ew8.c(ew8.c(ew8.a, "scoop.nyt.net"), str), String.valueOf(j));
        }

        public final boolean isOpinion(String str) {
            if (str != null) {
                return h.w(str, "opinion", true);
            }
            return false;
        }
    }

    public static final class DefaultImpls {
        private static ZonedDateTime asInstant(Asset asset, long j) {
            return Instant.ofEpochSecond(j).atZone(ZoneId.of("America/New_York"));
        }

        public static Image extractImage(Asset asset) {
            Asset promotionalMedia;
            if (asset.getMediaImage() != null) {
                ImageAsset mediaImage = asset.getMediaImage();
                if (mediaImage != null) {
                    return mediaImage.getImage();
                }
                return null;
            }
            if (asset.getPromotionalMedia() == null || (promotionalMedia = asset.getPromotionalMedia()) == null) {
                return null;
            }
            return promotionalMedia.extractImage();
        }

        public static String extractKicker(Asset asset) {
            if (asset.isKickerHidden()) {
                return null;
            }
            return asset.getKicker();
        }

        public static /* synthetic */ void getAssetId$annotations() {
        }

        public static boolean getCanBeSaved(Asset asset) {
            return true;
        }

        public static String getColumnDisplayName(Asset asset) {
            Column column = asset.getColumn();
            String displayName = column != null ? column.getDisplayName() : null;
            return displayName == null ? "" : displayName;
        }

        public static String getColumnName(Asset asset) {
            Column column = asset.getColumn();
            String name = column != null ? column.getName() : null;
            return name == null ? "" : name;
        }

        public static String getDisplayTitle(Asset asset) {
            String str;
            String title = asset.getTitle();
            if (title != null) {
                int length = title.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = zq3.j(title.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                str = title.subSequence(i, length + 1).toString();
            } else {
                str = null;
            }
            return str == null ? "" : str;
        }

        public static String getHtml(Asset asset) {
            Map<String, Object> htmlMedia = asset.getHtmlMedia();
            Object obj = htmlMedia != null ? htmlMedia.get(AssetConstants.HTML) : null;
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }

        public static Instant getLastModifiedInstant(Asset asset) {
            Instant ofEpochSecond = Instant.ofEpochSecond(asset.getLastModified());
            zq3.g(ofEpochSecond, "ofEpochSecond(...)");
            return ofEpochSecond;
        }

        public static ImageAsset getMediaImage(Asset asset) {
            if (asset instanceof ImageAsset) {
                return (ImageAsset) asset;
            }
            if (asset.getPromotionalMedia() instanceof ImageAsset) {
                Asset promotionalMedia = asset.getPromotionalMedia();
                if (promotionalMedia instanceof ImageAsset) {
                    return (ImageAsset) promotionalMedia;
                }
            }
            return null;
        }

        public static long getRealLastModified(Asset asset) {
            return asset.getLastMajorModified() > 0 ? asset.getLastMajorModified() : asset.getLastModified();
        }

        public static String getSafeUri(Asset asset) {
            String uri = asset.getUri();
            return uri == null ? Asset.Companion.generateUri(asset.getAssetId(), asset.getAssetType()) : uri;
        }

        public static boolean getSectionBranded(Asset asset) {
            AssetSection assetSection = asset.getAssetSection();
            if (assetSection != null) {
                return assetSection.getBranded();
            }
            return false;
        }

        public static String getSectionContentName(Asset asset) {
            AssetSection assetSection = asset.getAssetSection();
            String content = assetSection != null ? assetSection.getContent() : null;
            return content == null ? "" : content;
        }

        public static String getSectionDisplayName(Asset asset) {
            AssetSection assetSection = asset.getAssetSection();
            String displayName = assetSection != null ? assetSection.getDisplayName() : null;
            return displayName == null ? "" : displayName;
        }

        public static String getSectionNameOptional(Asset asset) {
            String sectionContentName = asset.getSectionContentName();
            if (sectionContentName.length() > 0) {
                return sectionContentName;
            }
            return null;
        }

        public static String getSubSectionNameOptional(Asset asset) {
            String subsectionContentName = asset.getSubsectionContentName();
            if (subsectionContentName.length() > 0) {
                return subsectionContentName;
            }
            return null;
        }

        public static String getSubsectionContentName(Asset asset) {
            Subsection subsection = asset.getSubsection();
            String content = subsection != null ? subsection.getContent() : null;
            return content == null ? "" : content;
        }

        public static String getSubsectionDisplayName(Asset asset) {
            Subsection subsection = asset.getSubsection();
            String displayName = subsection != null ? subsection.getDisplayName() : null;
            return displayName == null ? "" : displayName;
        }

        public static String getUrlOrEmpty(Asset asset) {
            String url = asset.getUrl();
            return url == null ? "" : url;
        }

        private static long ifNonZeroElse(Asset asset, Long l, Long l2) {
            if (l != null && l.longValue() != 0) {
                return l.longValue();
            }
            if (l2 != null) {
                return l2.longValue();
            }
            return 0L;
        }

        public static boolean isColumn(Asset asset) {
            return asset.getColumn() != null;
        }

        public static boolean isDailyBriefing(Asset asset) {
            String dataName = asset.getDataName();
            if (dataName != null) {
                return h.P(dataName, AssetConstants.DAILY_BRIEFING_IDENTIFIER, false, 2, null);
            }
            return false;
        }

        public static boolean isMetered(Asset asset) {
            String meterAccessType = asset.getMeterAccessType();
            if (meterAccessType != null) {
                return meterAccessType.equals(AssetConstants.METERED);
            }
            return true;
        }

        public static boolean isShowPicture(Asset asset) {
            Column column = asset.getColumn();
            if (column != null) {
                return column.isShowPicture();
            }
            return false;
        }

        public static OffsetDateTime lastUpdated(Asset asset) {
            return toOffsetDateTime(asset, ifNonZeroElse(asset, Long.valueOf(asset.getLastMajorModified()), Long.valueOf(asset.getLastModified())));
        }

        public static String recentlyViewedImageUrl(Asset asset) {
            Image.ImageCrop crops;
            ImageDimension thumbLarge;
            Image extractImage = asset.extractImage();
            if (extractImage == null || (crops = extractImage.getCrops()) == null || (thumbLarge = crops.getThumbLarge()) == null) {
                return null;
            }
            return thumbLarge.getUrl();
        }

        private static OffsetDateTime toOffsetDateTime(Asset asset, long j) {
            OffsetDateTime from = OffsetDateTime.from(asInstant(asset, j));
            zq3.g(from, "from(...)");
            return from;
        }

        public static String youTabImageUrl(Asset asset) {
            String url;
            ImageDimension square320;
            ImageDimension smallSquare168;
            ImageDimension thumbLarge;
            Image extractImage = asset.extractImage();
            Image.ImageCrop crops = extractImage != null ? extractImage.getCrops() : null;
            if (crops == null || (thumbLarge = crops.getThumbLarge()) == null || (url = thumbLarge.getUrl()) == null) {
                url = (crops == null || (smallSquare168 = crops.getSmallSquare168()) == null) ? null : smallSquare168.getUrl();
                if (url == null) {
                    if (crops == null || (square320 = crops.getSquare320()) == null) {
                        return null;
                    }
                    return square320.getUrl();
                }
            }
            return url;
        }
    }

    Image extractImage();

    String extractKicker();

    List<Addendum> getAddendums();

    String getAdvertisingSensitivity();

    long getAssetId();

    AssetSection getAssetSection();

    String getAssetType();

    List<Author> getAuthors();

    String getByline();

    boolean getCanBeSaved();

    Column getColumn();

    String getColumnDisplayName();

    String getColumnName();

    String getDataName();

    String getDesk();

    DfpAssetMetaData getDfp();

    String getDisplaySize();

    String getDisplayTitle();

    long getFirstPublished();

    String getHtml();

    Map<String, Object> getHtmlMedia();

    String getKicker();

    long getLastMajorModified();

    long getLastModified();

    Instant getLastModifiedInstant();

    ImageAsset getMediaImage();

    String getMeterAccessType();

    ParsedHtmlText getParsedHtmlSummary();

    Asset getPromotionalMedia();

    DisplaySizeType getPromotionalMediaSize();

    long getRealLastModified();

    Map<String, Region> getRegions();

    String getSafeUri();

    boolean getSectionBranded();

    String getSectionContentName();

    String getSectionDisplayName();

    String getSectionNameOptional();

    String getSubHeadline();

    String getSubSectionNameOptional();

    Subsection getSubsection();

    String getSubsectionContentName();

    String getSubsectionDisplayName();

    String getSummary();

    String getTitle();

    String getTone();

    String getUri();

    String getUrl();

    String getUrlOrEmpty();

    boolean isColumn();

    boolean isCommentsEnabled();

    boolean isDailyBriefing();

    boolean isKickerHidden();

    boolean isMetered();

    boolean isOak();

    boolean isPromotionalMediaHidden();

    boolean isShowPicture();

    boolean isSummaryHidden();

    boolean isTitleHidden();

    OffsetDateTime lastUpdated();

    String recentlyViewedImageUrl();

    String youTabImageUrl();
}
