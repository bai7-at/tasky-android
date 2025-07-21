package com.nytimes.android.saved;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SavedSectionHelper;
import defpackage.d05;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;

/* loaded from: classes4.dex */
public class SavedSectionHelper {
    private static final int ASSET_BATCH = 30;
    private final CompositeDisposable disposables;
    private final com.nytimes.android.entitlements.a eCommClient;
    private boolean loading;
    private final SavedManager savedManager;
    private final BehaviorSubject<SectionFront> savedSectionUpdater = BehaviorSubject.create();
    private final SectionFront sectionFront;

    class a extends d05 {
        a(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(List list) {
            for (int i = 0; i < list.size(); i++) {
                if (!SavedSectionHelper.this.sectionFront.getAssets().contains(list.get(i))) {
                    SavedSectionHelper.this.sectionFront.getAssets().add(i, (Asset) list.get(i));
                }
            }
            SavedSectionHelper.this.savedSectionUpdater.onNext(SavedSectionHelper.this.sectionFront);
            SavedSectionHelper.this.loading = false;
        }

        @Override // defpackage.d05, io.reactivex.Observer
        public void onError(Throwable th) {
            NYTLogger.i(th, "Failed to get more assets", new Object[0]);
            SavedSectionHelper.this.loading = false;
        }
    }

    public SavedSectionHelper(SavedManager savedManager, final com.nytimes.android.entitlements.a aVar) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.disposables = compositeDisposable;
        this.savedManager = savedManager;
        this.eCommClient = aVar;
        this.sectionFront = SectionFront.from(getTitle(), getName(), getSectionName(), getSubsectionName());
        compositeDisposable.add(savedManager.getPctSyncComplete().subscribe(new Consumer() { // from class: r97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionHelper.this.lambda$new$0((Float) obj);
            }
        }, new Consumer() { // from class: s97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionHelper.lambda$new$1((Throwable) obj);
            }
        }));
        compositeDisposable.add(aVar.r().subscribe(new Consumer() { // from class: t97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionHelper.this.lambda$new$2(aVar, (Boolean) obj);
            }
        }, new Consumer() { // from class: u97
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SavedSectionHelper.lambda$new$3((Throwable) obj);
            }
        }));
    }

    private void assetListToSectionFront(int i) {
        if (this.loading) {
            return;
        }
        this.loading = true;
        this.disposables.add((Disposable) this.savedManager.getAssetsAsSingle(i, 30).toObservable().subscribeWith(new a(SavedSectionHelper.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Float f) throws Exception {
        if (f.floatValue() == 1.0f) {
            assetListToSectionFront(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(Throwable th) throws Exception {
        NYTLogger.i(th, "fail to handle saved sync progress", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(com.nytimes.android.entitlements.a aVar, Boolean bool) throws Exception {
        if (aVar.q()) {
            return;
        }
        this.sectionFront.getAssets().clear();
        this.savedSectionUpdater.onNext(this.sectionFront);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$3(Throwable th) throws Exception {
        NYTLogger.i(th, "Problem handling login change in saved section", new Object[0]);
    }

    public boolean addGetMoreButton() {
        return this.sectionFront.getAssets().size() < this.savedManager.size();
    }

    public final String getName() {
        return "saved";
    }

    public Observable<SectionFront> getSectionFront() {
        if (this.eCommClient.q()) {
            assetListToSectionFront(this.sectionFront.getAssets().size());
        } else {
            this.sectionFront.getAssets().clear();
            this.savedSectionUpdater.onNext(this.sectionFront);
        }
        return this.savedSectionUpdater.hide();
    }

    public final String getSectionName() {
        return "saved";
    }

    public final String getSubsectionName() {
        return "saved";
    }

    public final String getTitle() {
        return "Saved for Later";
    }

    public boolean isLoading() {
        return this.loading || this.savedManager.size() <= this.sectionFront.getAssets().size();
    }

    public void loadMore() {
        assetListToSectionFront(this.sectionFront.getAssets().size());
    }

    public void onDestroy() {
        this.disposables.clear();
    }
}
