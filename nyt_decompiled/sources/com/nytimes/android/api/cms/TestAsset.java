package com.nytimes.android.api.cms;

import defpackage.zq3;
import java.util.List;
import java.util.Map;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes3.dex */
public final class TestAsset implements Asset {
    private final AssetData assetData;
    private String assetType;

    /* JADX WARN: Multi-variable type inference failed */
    public TestAsset() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TestAsset copy$default(TestAsset testAsset, String str, AssetData assetData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testAsset.assetType;
        }
        if ((i & 2) != 0) {
            assetData = testAsset.assetData;
        }
        return testAsset.copy(str, assetData);
    }

    public final String component1() {
        return this.assetType;
    }

    public final AssetData component2() {
        return this.assetData;
    }

    public final TestAsset copy(String str, AssetData assetData) {
        zq3.h(assetData, "assetData");
        return new TestAsset(str, assetData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestAsset)) {
            return false;
        }
        TestAsset testAsset = (TestAsset) obj;
        return zq3.c(this.assetType, testAsset.assetType) && zq3.c(this.assetData, testAsset.assetData);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Image extractImage() {
        return this.assetData.extractImage();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String extractKicker() {
        return this.assetData.extractKicker();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Addendum> getAddendums() {
        return this.assetData.getAddendums();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAdvertisingSensitivity() {
        return this.assetData.getAdvertisingSensitivity();
    }

    public final AssetData getAssetData() {
        return this.assetData;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getAssetId() {
        return this.assetData.getAssetId();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public AssetSection getAssetSection() {
        return this.assetData.getAssetSection();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAssetType() {
        return this.assetType;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Author> getAuthors() {
        return this.assetData.getAuthors();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getByline() {
        return this.assetData.getByline();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getCanBeSaved() {
        return this.assetData.getCanBeSaved();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Column getColumn() {
        return this.assetData.getColumn();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnDisplayName() {
        return this.assetData.getColumnDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnName() {
        return this.assetData.getColumnName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDataName() {
        return this.assetData.getDataName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDesk() {
        return this.assetData.getDesk();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DfpAssetMetaData getDfp() {
        return this.assetData.getDfp();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplaySize() {
        return this.assetData.getDisplaySize();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplayTitle() {
        return this.assetData.getDisplayTitle();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getFirstPublished() {
        return this.assetData.getFirstPublished();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getHtml() {
        return this.assetData.getHtml();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Object> getHtmlMedia() {
        return this.assetData.getHtmlMedia();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getKicker() {
        return this.assetData.getKicker();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastMajorModified() {
        return this.assetData.getLastMajorModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastModified() {
        return this.assetData.getLastModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Instant getLastModifiedInstant() {
        return this.assetData.getLastModifiedInstant();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ImageAsset getMediaImage() {
        return this.assetData.getMediaImage();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getMeterAccessType() {
        return this.assetData.getMeterAccessType();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ParsedHtmlText getParsedHtmlSummary() {
        return this.assetData.getParsedHtmlSummary();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Asset getPromotionalMedia() {
        return this.assetData.getPromotionalMedia();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DisplaySizeType getPromotionalMediaSize() {
        return this.assetData.getPromotionalMediaSize();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getRealLastModified() {
        return this.assetData.getRealLastModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Region> getRegions() {
        return this.assetData.getRegions();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSafeUri() {
        return this.assetData.getSafeUri();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getSectionBranded() {
        return this.assetData.getSectionBranded();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionContentName() {
        return this.assetData.getSectionContentName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionDisplayName() {
        return this.assetData.getSectionDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionNameOptional() {
        return this.assetData.getSectionNameOptional();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubHeadline() {
        return this.assetData.getSubHeadline();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubSectionNameOptional() {
        return this.assetData.getSubSectionNameOptional();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Subsection getSubsection() {
        return this.assetData.getSubsection();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionContentName() {
        return this.assetData.getSubsectionContentName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionDisplayName() {
        return this.assetData.getSubsectionDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSummary() {
        return this.assetData.getSummary();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTitle() {
        return this.assetData.getTitle();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTone() {
        return this.assetData.getTone();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUri() {
        return this.assetData.getUri();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrl() {
        return this.assetData.getUrl();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrlOrEmpty() {
        return this.assetData.getUrlOrEmpty();
    }

    public int hashCode() {
        String str = this.assetType;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.assetData.hashCode();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isColumn() {
        return this.assetData.isColumn();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isCommentsEnabled() {
        return this.assetData.isCommentsEnabled();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isDailyBriefing() {
        return this.assetData.isDailyBriefing();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isKickerHidden() {
        return this.assetData.isKickerHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isMetered() {
        return this.assetData.isMetered();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isOak() {
        return this.assetData.isOak();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isPromotionalMediaHidden() {
        return this.assetData.isPromotionalMediaHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isShowPicture() {
        return this.assetData.isShowPicture();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isSummaryHidden() {
        return this.assetData.isSummaryHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isTitleHidden() {
        return this.assetData.isTitleHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public OffsetDateTime lastUpdated() {
        return this.assetData.lastUpdated();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String recentlyViewedImageUrl() {
        return this.assetData.recentlyViewedImageUrl();
    }

    public void setAssetType(String str) {
        this.assetType = str;
    }

    public String toString() {
        return "TestAsset(assetType=" + this.assetType + ", assetData=" + this.assetData + ")";
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String youTabImageUrl() {
        return this.assetData.youTabImageUrl();
    }

    public TestAsset(String str, AssetData assetData) {
        zq3.h(assetData, "assetData");
        this.assetType = str;
        this.assetData = assetData;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TestAsset(java.lang.String r46, com.nytimes.android.api.cms.AssetData r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r45 = this;
            r0 = r48 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = "test"
            goto L9
        L7:
            r0 = r46
        L9:
            r1 = r48 & 2
            if (r1 == 0) goto L5a
            com.nytimes.android.api.cms.AssetData r44 = new com.nytimes.android.api.cms.AssetData
            r1 = r44
            r42 = 7
            r43 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = -3
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43)
            r2 = r45
            goto L5e
        L5a:
            r2 = r45
            r1 = r47
        L5e:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.api.cms.TestAsset.<init>(java.lang.String, com.nytimes.android.api.cms.AssetData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
