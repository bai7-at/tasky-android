package zendesk.support;

import defpackage.ba2;
import defpackage.g16;

/* loaded from: classes5.dex */
public final class GuideModule_ProvidesArticleVoteStorageFactory implements ba2 {
    private final GuideModule module;

    public GuideModule_ProvidesArticleVoteStorageFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesArticleVoteStorageFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesArticleVoteStorageFactory(guideModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(GuideModule guideModule) {
        return (ArticleVoteStorage) g16.c(guideModule.providesArticleVoteStorage(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
