package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class LivePostsSeenInput {
    private final nk5 blogID;
    private final nk5 lastModified;
    private final nk5 postsSeen;

    public LivePostsSeenInput() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ LivePostsSeenInput copy$default(LivePostsSeenInput livePostsSeenInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = livePostsSeenInput.blogID;
        }
        if ((i & 2) != 0) {
            nk5Var2 = livePostsSeenInput.lastModified;
        }
        if ((i & 4) != 0) {
            nk5Var3 = livePostsSeenInput.postsSeen;
        }
        return livePostsSeenInput.copy(nk5Var, nk5Var2, nk5Var3);
    }

    public final nk5 component1() {
        return this.blogID;
    }

    public final nk5 component2() {
        return this.lastModified;
    }

    public final nk5 component3() {
        return this.postsSeen;
    }

    public final LivePostsSeenInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "blogID");
        zq3.h(nk5Var2, "lastModified");
        zq3.h(nk5Var3, "postsSeen");
        return new LivePostsSeenInput(nk5Var, nk5Var2, nk5Var3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePostsSeenInput)) {
            return false;
        }
        LivePostsSeenInput livePostsSeenInput = (LivePostsSeenInput) obj;
        return zq3.c(this.blogID, livePostsSeenInput.blogID) && zq3.c(this.lastModified, livePostsSeenInput.lastModified) && zq3.c(this.postsSeen, livePostsSeenInput.postsSeen);
    }

    public final nk5 getBlogID() {
        return this.blogID;
    }

    public final nk5 getLastModified() {
        return this.lastModified;
    }

    public final nk5 getPostsSeen() {
        return this.postsSeen;
    }

    public int hashCode() {
        return (((this.blogID.hashCode() * 31) + this.lastModified.hashCode()) * 31) + this.postsSeen.hashCode();
    }

    public String toString() {
        return "LivePostsSeenInput(blogID=" + this.blogID + ", lastModified=" + this.lastModified + ", postsSeen=" + this.postsSeen + ")";
    }

    public LivePostsSeenInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "blogID");
        zq3.h(nk5Var2, "lastModified");
        zq3.h(nk5Var3, "postsSeen");
        this.blogID = nk5Var;
        this.lastModified = nk5Var2;
        this.postsSeen = nk5Var3;
    }

    public /* synthetic */ LivePostsSeenInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3);
    }
}
