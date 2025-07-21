package defpackage;

import com.nytimes.android.comments.comments.data.store.CommentsStore;
import com.nytimes.android.saved.SavedSectionHelper;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* loaded from: classes4.dex */
public class p97 extends vg7 {
    private final SavedSectionHelper l;

    public p97(b04 b04Var, r57 r57Var, CommentsStore commentsStore, NetworkStatus networkStatus, Scheduler scheduler, SavedSectionHelper savedSectionHelper, vb2 vb2Var) {
        super(b04Var, r57Var, commentsStore, networkStatus, scheduler, vb2Var);
        this.l = savedSectionHelper;
    }

    @Override // defpackage.vg7
    protected Observable r0() {
        return this.l.getSectionFront();
    }
}
