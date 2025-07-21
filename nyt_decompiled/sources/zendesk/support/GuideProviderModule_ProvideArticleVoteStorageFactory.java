package zendesk.support;

import defpackage.ba2;
import defpackage.g16;
import defpackage.p76;
import zendesk.core.SessionStorage;

/* loaded from: classes5.dex */
public final class GuideProviderModule_ProvideArticleVoteStorageFactory implements ba2 {
    private final p76 baseStorageProvider;

    public GuideProviderModule_ProvideArticleVoteStorageFactory(p76 p76Var) {
        this.baseStorageProvider = p76Var;
    }

    public static GuideProviderModule_ProvideArticleVoteStorageFactory create(p76 p76Var) {
        return new GuideProviderModule_ProvideArticleVoteStorageFactory(p76Var);
    }

    public static ArticleVoteStorage provideArticleVoteStorage(SessionStorage sessionStorage) {
        return (ArticleVoteStorage) g16.c(GuideProviderModule.provideArticleVoteStorage(sessionStorage), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    public ArticleVoteStorage get() {
        return provideArticleVoteStorage((SessionStorage) this.baseStorageProvider.get());
    }
}
