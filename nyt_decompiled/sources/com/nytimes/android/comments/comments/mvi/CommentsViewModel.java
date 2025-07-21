package com.nytimes.android.comments.comments.mvi;

import android.app.Application;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.comments.comments.data.remote.flagcomment.FlaggedReply;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult;
import com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendedComment;
import com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendedReply;
import com.nytimes.android.comments.comments.data.repository.CommentsRepository;
import com.nytimes.android.comments.comments.mvi.CommentsIntent;
import com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState;
import com.nytimes.android.comments.comments.mvi.view.CommentsTabsUIState;
import com.nytimes.android.comments.comments.mvi.view.CommentsUIState;
import com.nytimes.android.comments.common.CommentsAnalytics;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.cc0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public final class CommentsViewModel extends q {
    public static final int $stable = 8;
    private final Application application;
    private final MutableStateFlow<String> articleUrlMutableState;
    private final StateFlow<String> articleUrlState;
    private MutableStateFlow<Map<Long, List<Comment>>> commentReplies;
    private MutableStateFlow<CommentThreadUIState> commentThreadMutableState;
    private final StateFlow<CommentThreadUIState> commentThreadState;
    private final CommentsAnalytics commentsAnalytics;
    private final CommentsRepository commentsRepository;
    private MutableStateFlow<Set<Long>> flaggedCommentIds;
    private MutableStateFlow<List<FlaggedReply>> flaggedReplies;
    private final Flow<PagingData> getAllComments;
    private final Flow<PagingData> getNYTPicksComments;
    private final Flow<PagingData> getReadersPicksComments;
    private final Flow<PagingData> getReporterReplies;
    private MutableStateFlow<CommentsUIState> mutableState;
    private final NetworkStatus networkStatus;
    private final long permIdFlow;
    private MutableStateFlow<List<RecommendedComment>> recommendedComments;
    private MutableStateFlow<List<RecommendedReply>> recommendedReplies;
    private final n savedStateHandle;
    private final MutableStateFlow<SortingOption> selectedSortingOptionMutableState;
    private final StateFlow<SortingOption> selectedSortingOptionState;
    private final StateFlow<CommentsUIState> state;
    private MutableStateFlow<CommentsTabsUIState> tabsMutableState;
    private final StateFlow<CommentsTabsUIState> tabsState;
    private CommentsIntent tempCommentsIntent;

    @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$1", f = "CommentsViewModel.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02371 extends SuspendLambda implements it2 {
            /* synthetic */ long J$0;
            /* synthetic */ Object L$0;
            int label;

            C02371(by0<? super C02371> by0Var) {
                super(3, by0Var);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).longValue(), (by0<? super Pair<String, Long>>) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a.h();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return du8.a((String) this.L$0, cc0.d(this.J$0));
            }

            public final Object invoke(String str, long j, by0<? super Pair<String, Long>> by0Var) {
                C02371 c02371 = new C02371(by0Var);
                c02371.L$0 = str;
                c02371.J$0 = j;
                return c02371.invokeSuspend(ww8.a);
            }
        }

        AnonymousClass1(by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return CommentsViewModel.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Flow flowCombine = FlowKt.flowCombine(CommentsViewModel.this.savedStateHandle.e("com.nytimes.android.extra.ASSET_URL", ""), CommentsViewModel.this.savedStateHandle.e("com.nytimes.android.extra.COMMENT_ID", cc0.d(0L)), new C02371(null));
                final CommentsViewModel commentsViewModel = CommentsViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.nytimes.android.comments.comments.mvi.CommentsViewModel.1.2

                    @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$1$2$2", f = "CommentsViewModel.kt", l = {108, 109}, m = "invokeSuspend")
                    /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$1$2$2, reason: invalid class name and collision with other inner class name */
                    static final class C02382 extends SuspendLambda implements gt2 {
                        int label;
                        final /* synthetic */ CommentsViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02382(CommentsViewModel commentsViewModel, by0<? super C02382> by0Var) {
                            super(2, by0Var);
                            this.this$0 = commentsViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0<ww8> create(Object obj, by0<?> by0Var) {
                            return new C02382(this.this$0, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object h = a.h();
                            int i = this.label;
                            if (i == 0) {
                                f.b(obj);
                                this.this$0.commentsRepository.invalidateReporterReplies();
                                this.this$0.commentsRepository.invalidateAllComments();
                                this.this$0.commentsRepository.invalidateNYTPicksComments();
                                this.this$0.commentsRepository.invalidateReadersPicksComments();
                                CommentsViewModel commentsViewModel = this.this$0;
                                this.label = 1;
                                if (commentsViewModel.getUserDataAndCommentsSummary(this) == h) {
                                    return h;
                                }
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    f.b(obj);
                                    return ww8.a;
                                }
                                f.b(obj);
                            }
                            CommentsViewModel commentsViewModel2 = this.this$0;
                            this.label = 2;
                            if (commentsViewModel2.listenNetworkChanges(this) == h) {
                                return h;
                            }
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                            return ((C02382) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, by0 by0Var) {
                        return emit((Pair<String, Long>) obj2, (by0<? super ww8>) by0Var);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(Pair<String, Long> pair, by0<? super ww8> by0Var) {
                        Object value;
                        String str = (String) pair.c();
                        long longValue = ((Number) pair.d()).longValue();
                        if (str.length() > 0) {
                            MutableStateFlow mutableStateFlow = CommentsViewModel.this.articleUrlMutableState;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.compareAndSet(value, str));
                            CommentsViewModel.this.commentsAnalytics.sendViewCommentsEvent();
                            BuildersKt__Builders_commonKt.launch$default(r.a(CommentsViewModel.this), null, null, new C02382(CommentsViewModel.this, null), 3, null);
                        }
                        if (longValue != 0) {
                            CommentsViewModel.this.openCommentThreadFlow(longValue);
                        }
                        return ww8.a;
                    }
                };
                this.label = 1;
                if (flowCombine.collect(flowCollector, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentTab.values().length];
            try {
                iArr[CommentTab.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentTab.NYTPicks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentTab.ReaderPicks.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommentTab.NYTReplies.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommentsViewModel(CommentsRepository commentsRepository, CommentsAnalytics commentsAnalytics, NetworkStatus networkStatus, n nVar, Application application) {
        zq3.h(commentsRepository, "commentsRepository");
        zq3.h(commentsAnalytics, "commentsAnalytics");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(nVar, "savedStateHandle");
        zq3.h(application, "application");
        this.commentsRepository = commentsRepository;
        this.commentsAnalytics = commentsAnalytics;
        this.networkStatus = networkStatus;
        this.savedStateHandle = nVar;
        this.application = application;
        String str = (String) nVar.d("com.nytimes.android.extra.ASSET_URL");
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(str == null ? "" : str);
        this.articleUrlMutableState = MutableStateFlow;
        this.articleUrlState = FlowKt.asStateFlow(MutableStateFlow);
        Long l = (Long) nVar.d("com.nytimes.android.extra.COMMENT_ID");
        this.permIdFlow = l != null ? l.longValue() : 0L;
        boolean z = false;
        MutableStateFlow<CommentsUIState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new CommentsUIState(false, false, z, false, null, false, false, null, null, 511, null));
        this.mutableState = MutableStateFlow2;
        this.state = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<CommentsTabsUIState> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new CommentsTabsUIState(null, null, null, z, 15, 0 == true ? 1 : 0));
        this.tabsMutableState = MutableStateFlow3;
        this.tabsState = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<CommentThreadUIState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new CommentThreadUIState(0 == true ? 1 : 0, 0 == true ? 1 : 0, false, z, false, false, 63, null));
        this.commentThreadMutableState = MutableStateFlow4;
        this.commentThreadState = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<SortingOption> MutableStateFlow5 = StateFlowKt.MutableStateFlow(SortingOption.Newest);
        this.selectedSortingOptionMutableState = MutableStateFlow5;
        this.selectedSortingOptionState = FlowKt.asStateFlow(MutableStateFlow5);
        this.flaggedCommentIds = StateFlowKt.MutableStateFlow(b0.e());
        this.flaggedReplies = StateFlowKt.MutableStateFlow(i.l());
        this.recommendedComments = StateFlowKt.MutableStateFlow(i.l());
        this.recommendedReplies = StateFlowKt.MutableStateFlow(i.l());
        this.commentReplies = StateFlowKt.MutableStateFlow(t.i());
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new AnonymousClass1(null), 3, null);
        this.getAllComments = CachedPagingDataKt.a(FlowKt.transformLatest(FlowKt.combine(MutableStateFlow, MutableStateFlow5, new CommentsViewModel$getAllComments$1(null)), new CommentsViewModel$special$$inlined$flatMapLatest$1(null, this)), r.a(this));
        this.getReadersPicksComments = CachedPagingDataKt.a(FlowKt.transformLatest(MutableStateFlow, new CommentsViewModel$special$$inlined$flatMapLatest$2(null, this)), r.a(this));
        this.getReporterReplies = CachedPagingDataKt.a(FlowKt.transformLatest(MutableStateFlow, new CommentsViewModel$special$$inlined$flatMapLatest$3(null, this)), r.a(this));
        this.getNYTPicksComments = CachedPagingDataKt.a(FlowKt.transformLatest(MutableStateFlow, new CommentsViewModel$special$$inlined$flatMapLatest$4(null, this)), r.a(this));
    }

    private final void addFlaggedComment(long j) {
        Set<Long> value;
        CommentThreadUIState value2;
        CommentThreadUIState commentThreadUIState;
        CommentThreadUIState commentThreadUIState2;
        Comment copy;
        MutableStateFlow<Set<Long>> mutableStateFlow = this.flaggedCommentIds;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, b0.n(value, Long.valueOf(j))));
        MutableStateFlow<CommentThreadUIState> mutableStateFlow2 = this.commentThreadMutableState;
        do {
            value2 = mutableStateFlow2.getValue();
            commentThreadUIState = value2;
            Comment commentThread = commentThreadUIState.getCommentThread();
            if (commentThread != null) {
                if (commentThread.getCommentID() == j) {
                    copy = commentThread.copy((r36 & 1) != 0 ? commentThread.commentID : 0L, (r36 & 2) != 0 ? commentThread.userDisplayName : null, (r36 & 4) != 0 ? commentThread.parentUserDisplayName : null, (r36 & 8) != 0 ? commentThread.userLocation : null, (r36 & 16) != 0 ? commentThread.userTitle : null, (r36 & 32) != 0 ? commentThread.commentBody : null, (r36 & 64) != 0 ? commentThread.approveDate : null, (r36 & 128) != 0 ? commentThread.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? commentThread.editorsSelection : false, (r36 & 512) != 0 ? commentThread.recommendations : 0, (r36 & 1024) != 0 ? commentThread.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? commentThread.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? commentThread.isReporterReply : false, (r36 & 8192) != 0 ? commentThread.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commentThread.isCommentFlagged : true, (r36 & 32768) != 0 ? commentThread.isRecommended : false, (r36 & 65536) != 0 ? commentThread.focusedInThread : false);
                    commentThreadUIState2 = CommentThreadUIState.copy$default(commentThreadUIState, copy, null, false, false, false, false, 62, null);
                } else {
                    commentThreadUIState2 = null;
                }
                if (commentThreadUIState2 != null) {
                    commentThreadUIState = commentThreadUIState2;
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, commentThreadUIState));
    }

    private final void addFlaggedReply(long j, long j2) {
        List<FlaggedReply> value;
        CommentThreadUIState value2;
        CommentThreadUIState commentThreadUIState;
        CommentThreadUIState commentThreadUIState2;
        Comment copy;
        MutableStateFlow<List<FlaggedReply>> mutableStateFlow = this.flaggedReplies;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, i.G0(value, new FlaggedReply(j, j2))));
        MutableStateFlow<CommentThreadUIState> mutableStateFlow2 = this.commentThreadMutableState;
        do {
            value2 = mutableStateFlow2.getValue();
            commentThreadUIState = value2;
            Comment commentThread = commentThreadUIState.getCommentThread();
            if (commentThread != null) {
                if (commentThread.getCommentID() == j) {
                    List<Comment> replies = commentThread.getReplies();
                    ArrayList arrayList = new ArrayList(i.w(replies, 10));
                    for (Comment comment : replies) {
                        if (comment.getCommentID() == j2) {
                            comment = comment.copy((r36 & 1) != 0 ? comment.commentID : 0L, (r36 & 2) != 0 ? comment.userDisplayName : null, (r36 & 4) != 0 ? comment.parentUserDisplayName : null, (r36 & 8) != 0 ? comment.userLocation : null, (r36 & 16) != 0 ? comment.userTitle : null, (r36 & 32) != 0 ? comment.commentBody : null, (r36 & 64) != 0 ? comment.approveDate : null, (r36 & 128) != 0 ? comment.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment.editorsSelection : false, (r36 & 512) != 0 ? comment.recommendations : 0, (r36 & 1024) != 0 ? comment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment.isReporterReply : false, (r36 & 8192) != 0 ? comment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment.isCommentFlagged : true, (r36 & 32768) != 0 ? comment.isRecommended : false, (r36 & 65536) != 0 ? comment.focusedInThread : false);
                        }
                        arrayList.add(comment);
                    }
                    copy = commentThread.copy((r36 & 1) != 0 ? commentThread.commentID : 0L, (r36 & 2) != 0 ? commentThread.userDisplayName : null, (r36 & 4) != 0 ? commentThread.parentUserDisplayName : null, (r36 & 8) != 0 ? commentThread.userLocation : null, (r36 & 16) != 0 ? commentThread.userTitle : null, (r36 & 32) != 0 ? commentThread.commentBody : null, (r36 & 64) != 0 ? commentThread.approveDate : null, (r36 & 128) != 0 ? commentThread.replies : arrayList, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? commentThread.editorsSelection : false, (r36 & 512) != 0 ? commentThread.recommendations : 0, (r36 & 1024) != 0 ? commentThread.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? commentThread.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? commentThread.isReporterReply : false, (r36 & 8192) != 0 ? commentThread.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commentThread.isCommentFlagged : false, (r36 & 32768) != 0 ? commentThread.isRecommended : false, (r36 & 65536) != 0 ? commentThread.focusedInThread : false);
                    commentThreadUIState2 = CommentThreadUIState.copy$default(commentThreadUIState, copy, null, false, false, false, false, 62, null);
                } else {
                    commentThreadUIState2 = null;
                }
                if (commentThreadUIState2 != null) {
                    commentThreadUIState = commentThreadUIState2;
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, commentThreadUIState));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendedReply] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    private final void addRecommendReply(long j, long j2, boolean z, int i) {
        List<RecommendedReply> value;
        T t;
        List<RecommendedReply> G0;
        CommentThreadUIState value2;
        CommentThreadUIState commentThreadUIState;
        CommentThreadUIState commentThreadUIState2;
        Comment copy;
        MutableStateFlow<List<RecommendedReply>> mutableStateFlow = this.recommendedReplies;
        do {
            value = mutableStateFlow.getValue();
            List<RecommendedReply> list = value;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            List<RecommendedReply> list2 = list;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t = 0;
                    break;
                }
                t = it2.next();
                RecommendedReply recommendedReply = (RecommendedReply) t;
                if (recommendedReply.getCommentID() == j && recommendedReply.getReplyID() == j2) {
                    break;
                }
            }
            ref$ObjectRef.element = t;
            if (t != 0) {
                ref$ObjectRef.element = RecommendedReply.copy$default(t, 0L, 0L, z, i, 3, null);
                G0 = new ArrayList<>(i.w(list2, 10));
                for (RecommendedReply recommendedReply2 : list2) {
                    if (recommendedReply2.getCommentID() == ((RecommendedReply) ref$ObjectRef.element).getCommentID() && recommendedReply2.getReplyID() == j2) {
                        recommendedReply2 = (RecommendedReply) ref$ObjectRef.element;
                    }
                    G0.add(recommendedReply2);
                }
            } else {
                G0 = i.G0(list, new RecommendedReply(j, j2, z, i));
            }
        } while (!mutableStateFlow.compareAndSet(value, G0));
        MutableStateFlow<CommentThreadUIState> mutableStateFlow2 = this.commentThreadMutableState;
        do {
            value2 = mutableStateFlow2.getValue();
            commentThreadUIState = value2;
            Comment commentThread = commentThreadUIState.getCommentThread();
            if (commentThread != null) {
                if (commentThread.getCommentID() == j) {
                    List<Comment> replies = commentThread.getReplies();
                    ArrayList arrayList = new ArrayList(i.w(replies, 10));
                    for (Comment comment : replies) {
                        if (comment.getCommentID() == j2) {
                            comment = comment.copy((r36 & 1) != 0 ? comment.commentID : 0L, (r36 & 2) != 0 ? comment.userDisplayName : null, (r36 & 4) != 0 ? comment.parentUserDisplayName : null, (r36 & 8) != 0 ? comment.userLocation : null, (r36 & 16) != 0 ? comment.userTitle : null, (r36 & 32) != 0 ? comment.commentBody : null, (r36 & 64) != 0 ? comment.approveDate : null, (r36 & 128) != 0 ? comment.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment.editorsSelection : false, (r36 & 512) != 0 ? comment.recommendations : i, (r36 & 1024) != 0 ? comment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment.isReporterReply : false, (r36 & 8192) != 0 ? comment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment.isCommentFlagged : false, (r36 & 32768) != 0 ? comment.isRecommended : z, (r36 & 65536) != 0 ? comment.focusedInThread : false);
                        }
                        arrayList.add(comment);
                    }
                    copy = commentThread.copy((r36 & 1) != 0 ? commentThread.commentID : 0L, (r36 & 2) != 0 ? commentThread.userDisplayName : null, (r36 & 4) != 0 ? commentThread.parentUserDisplayName : null, (r36 & 8) != 0 ? commentThread.userLocation : null, (r36 & 16) != 0 ? commentThread.userTitle : null, (r36 & 32) != 0 ? commentThread.commentBody : null, (r36 & 64) != 0 ? commentThread.approveDate : null, (r36 & 128) != 0 ? commentThread.replies : arrayList, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? commentThread.editorsSelection : false, (r36 & 512) != 0 ? commentThread.recommendations : 0, (r36 & 1024) != 0 ? commentThread.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? commentThread.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? commentThread.isReporterReply : false, (r36 & 8192) != 0 ? commentThread.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commentThread.isCommentFlagged : false, (r36 & 32768) != 0 ? commentThread.isRecommended : false, (r36 & 65536) != 0 ? commentThread.focusedInThread : false);
                    commentThreadUIState2 = CommentThreadUIState.copy$default(commentThreadUIState, copy, null, false, false, false, false, 62, null);
                } else {
                    commentThreadUIState2 = null;
                }
                if (commentThreadUIState2 != null) {
                    commentThreadUIState = commentThreadUIState2;
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, commentThreadUIState));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendedComment] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    private final void addRecommendedComment(long j, boolean z, int i) {
        List<RecommendedComment> value;
        T t;
        List<RecommendedComment> G0;
        CommentThreadUIState value2;
        CommentThreadUIState commentThreadUIState;
        CommentThreadUIState commentThreadUIState2;
        Comment copy;
        MutableStateFlow<List<RecommendedComment>> mutableStateFlow = this.recommendedComments;
        do {
            value = mutableStateFlow.getValue();
            List<RecommendedComment> list = value;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            List<RecommendedComment> list2 = list;
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    t = it2.next();
                    if (((RecommendedComment) t).getCommentID() == j) {
                        break;
                    }
                } else {
                    t = 0;
                    break;
                }
            }
            ref$ObjectRef.element = t;
            if (t != 0) {
                ref$ObjectRef.element = RecommendedComment.copy$default(t, 0L, z, i, 1, null);
                G0 = new ArrayList<>(i.w(list2, 10));
                for (RecommendedComment recommendedComment : list2) {
                    if (recommendedComment.getCommentID() == ((RecommendedComment) ref$ObjectRef.element).getCommentID()) {
                        recommendedComment = (RecommendedComment) ref$ObjectRef.element;
                    }
                    G0.add(recommendedComment);
                }
            } else {
                G0 = i.G0(list, new RecommendedComment(j, z, i));
            }
        } while (!mutableStateFlow.compareAndSet(value, G0));
        MutableStateFlow<CommentThreadUIState> mutableStateFlow2 = this.commentThreadMutableState;
        do {
            value2 = mutableStateFlow2.getValue();
            commentThreadUIState = value2;
            Comment commentThread = commentThreadUIState.getCommentThread();
            if (commentThread != null) {
                if (commentThread.getCommentID() == j) {
                    copy = commentThread.copy((r36 & 1) != 0 ? commentThread.commentID : 0L, (r36 & 2) != 0 ? commentThread.userDisplayName : null, (r36 & 4) != 0 ? commentThread.parentUserDisplayName : null, (r36 & 8) != 0 ? commentThread.userLocation : null, (r36 & 16) != 0 ? commentThread.userTitle : null, (r36 & 32) != 0 ? commentThread.commentBody : null, (r36 & 64) != 0 ? commentThread.approveDate : null, (r36 & 128) != 0 ? commentThread.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? commentThread.editorsSelection : false, (r36 & 512) != 0 ? commentThread.recommendations : i, (r36 & 1024) != 0 ? commentThread.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? commentThread.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? commentThread.isReporterReply : false, (r36 & 8192) != 0 ? commentThread.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commentThread.isCommentFlagged : false, (r36 & 32768) != 0 ? commentThread.isRecommended : z, (r36 & 65536) != 0 ? commentThread.focusedInThread : false);
                    commentThreadUIState2 = CommentThreadUIState.copy$default(commentThreadUIState, copy, null, false, false, false, false, 62, null);
                } else {
                    commentThreadUIState2 = null;
                }
                if (commentThreadUIState2 != null) {
                    commentThreadUIState = commentThreadUIState2;
                }
            }
        } while (!mutableStateFlow2.compareAndSet(value2, commentThreadUIState));
    }

    private final LinkedHashMap<CommentTab, Integer> buildTabs(CommentsSummary commentsSummary) {
        LinkedHashMap<CommentTab, Integer> l = t.l(du8.a(CommentTab.All, Integer.valueOf(commentsSummary.getTotalComments())));
        if (commentsSummary.getTotalRecommendations() > 0) {
            l.put(CommentTab.ReaderPicks, Integer.valueOf(commentsSummary.getTotalRecommendations()));
        }
        if (commentsSummary.getTotalReporterReplyComments() > 0) {
            l.put(CommentTab.NYTReplies, Integer.valueOf(commentsSummary.getTotalReporterReplyComments()));
        }
        if (commentsSummary.getTotalEditorsSelection() > 0) {
            l.put(CommentTab.NYTPicks, Integer.valueOf(commentsSummary.getTotalEditorsSelection()));
        }
        return l;
    }

    private final void dismissFlagSuccessMessage() {
        CommentsUIState value;
        CommentsUIState copy;
        MutableStateFlow<CommentsUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r20 & 1) != 0 ? r1.isCommentingOpen : false, (r20 & 2) != 0 ? r1.showEmptyContent : false, (r20 & 4) != 0 ? r1.isRegisteredUser : false, (r20 & 8) != 0 ? r1.isReporter : false, (r20 & 16) != 0 ? r1.flagOptions : null, (r20 & 32) != 0 ? r1.showFlagAlertDialog : false, (r20 & 64) != 0 ? r1.showFlagSuccessMessage : false, (r20 & 128) != 0 ? r1.errorMessage : null, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.getAllRepliesState : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flagComment(long r16, java.lang.String r18, defpackage.by0<? super defpackage.ww8> r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r19
            boolean r2 = r1 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagComment$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagComment$1 r2 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagComment$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
        L15:
            r8 = r2
            goto L1d
        L17:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagComment$1 r2 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagComment$1
            r2.<init>(r15, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.h()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            long r2 = r8.J$0
            java.lang.Object r0 = r8.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r0
            kotlin.f.b(r1)
            goto L5e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.f.b(r1)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r3 = r0.commentsRepository
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r1 = r0.articleUrlMutableState
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r8.L$0 = r0
            r9 = r16
            r8.J$0 = r9
            r8.label = r4
            r4 = r16
            r7 = r18
            java.lang.Object r1 = r3.flagComment(r4, r6, r7, r8)
            if (r1 != r2) goto L5d
            return r2
        L5d:
            r2 = r9
        L5e:
            com.nytimes.android.coroutinesutils.FetchResult r1 = (com.nytimes.android.coroutinesutils.FetchResult) r1
            boolean r4 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r4 == 0) goto L87
            r0.addFlaggedComment(r2)
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentsUIState> r2 = r0.mutableState
        L69:
            java.lang.Object r0 = r2.getValue()
            r3 = r0
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r3 = (com.nytimes.android.comments.comments.mvi.view.CommentsUIState) r3
            r13 = 447(0x1bf, float:6.26E-43)
            r14 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r1 = com.nytimes.android.comments.comments.mvi.view.CommentsUIState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L69
            goto Lb1
        L87:
            boolean r2 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r2 == 0) goto La2
            com.nytimes.android.coroutinesutils.FetchResult$b$a r1 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r1
            android.app.Application r2 = r0.application
            int r3 = com.nytimes.android.comments.R.string.no_network_message
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(...)"
            defpackage.zq3.g(r2, r3)
            java.lang.String r1 = com.nytimes.android.coroutinesutils.FetchResultKt.a(r1, r2)
            r0.showErrorMessage(r1)
            goto Lb1
        La2:
            boolean r1 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r1 == 0) goto Lb1
            android.app.Application r1 = r0.application
            int r2 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r1 = r1.getString(r2)
            r0.showErrorMessage(r1)
        Lb1:
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.flagComment(long, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object flagReply(long r16, long r18, java.lang.String r20, defpackage.by0<? super defpackage.ww8> r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagReply$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagReply$1 r2 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagReply$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
        L15:
            r8 = r2
            goto L1d
        L17:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagReply$1 r2 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$flagReply$1
            r2.<init>(r15, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r8.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.h()
            int r3 = r8.label
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            long r2 = r8.J$1
            long r4 = r8.J$0
            java.lang.Object r0 = r8.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r0
            kotlin.f.b(r1)
            r11 = r2
            r9 = r4
            goto L65
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            kotlin.f.b(r1)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r3 = r0.commentsRepository
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r1 = r0.articleUrlMutableState
            java.lang.Object r1 = r1.getValue()
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r8.L$0 = r0
            r9 = r16
            r8.J$0 = r9
            r11 = r18
            r8.J$1 = r11
            r8.label = r4
            r4 = r18
            r7 = r20
            java.lang.Object r1 = r3.flagComment(r4, r6, r7, r8)
            if (r1 != r2) goto L65
            return r2
        L65:
            com.nytimes.android.coroutinesutils.FetchResult r1 = (com.nytimes.android.coroutinesutils.FetchResult) r1
            boolean r2 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r2 == 0) goto L8e
            r0.addFlaggedReply(r9, r11)
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentsUIState> r2 = r0.mutableState
        L70:
            java.lang.Object r0 = r2.getValue()
            r3 = r0
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r3 = (com.nytimes.android.comments.comments.mvi.view.CommentsUIState) r3
            r13 = 447(0x1bf, float:6.26E-43)
            r14 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r1 = com.nytimes.android.comments.comments.mvi.view.CommentsUIState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L70
            goto Lb8
        L8e:
            boolean r2 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r2 == 0) goto La9
            com.nytimes.android.coroutinesutils.FetchResult$b$a r1 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r1
            android.app.Application r2 = r0.application
            int r3 = com.nytimes.android.comments.R.string.no_network_message
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(...)"
            defpackage.zq3.g(r2, r3)
            java.lang.String r1 = com.nytimes.android.coroutinesutils.FetchResultKt.a(r1, r2)
            r0.showErrorMessage(r1)
            goto Lb8
        La9:
            boolean r1 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r1 == 0) goto Lb8
            android.app.Application r1 = r0.application
            int r2 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r1 = r1.getString(r2)
            r0.showErrorMessage(r1)
        Lb8:
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.flagReply(long, long, java.lang.String, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAllReplies(long r6, defpackage.by0<? super defpackage.ww8> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllReplies$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllReplies$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllReplies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllReplies$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$getAllReplies$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r6 = r0.J$0
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r5 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r5
            kotlin.f.b(r8)
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.f.b(r8)
            r5.getAllRepliesLoading(r3, r6)
            r0.L$0 = r5
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.getReplies(r6, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            com.nytimes.android.coroutinesutils.FetchResult r8 = (com.nytimes.android.coroutinesutils.FetchResult) r8
            boolean r0 = r8 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r0 == 0) goto L81
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.Long, java.util.List<com.nytimes.android.comments.comments.data.remote.getallcomments.Comment>>> r0 = r5.commentReplies
        L52:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Long r3 = defpackage.cc0.d(r6)
            r4 = r8
            com.nytimes.android.coroutinesutils.FetchResult$b$b r4 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r4
            java.lang.Object r4 = r4.b()
            com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult r4 = (com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult) r4
            com.nytimes.android.comments.comments.data.remote.getallcomments.Comment r4 = r4.getCommentThread()
            java.util.List r4 = r4.getReplies()
            kotlin.Pair r3 = defpackage.du8.a(r3, r4)
            java.util.Map r2 = kotlin.collections.t.q(r2, r3)
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L52
            r8 = 0
            r5.getAllRepliesLoading(r8, r6)
            goto Lab
        L81:
            boolean r6 = r8 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r6 == 0) goto L9c
            com.nytimes.android.coroutinesutils.FetchResult$b$a r8 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r8
            android.app.Application r6 = r5.application
            int r7 = com.nytimes.android.comments.R.string.no_network_message
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "getString(...)"
            defpackage.zq3.g(r6, r7)
            java.lang.String r6 = com.nytimes.android.coroutinesutils.FetchResultKt.a(r8, r6)
            r5.showErrorMessage(r6)
            goto Lab
        L9c:
            boolean r6 = r8 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r6 == 0) goto Lab
            android.app.Application r6 = r5.application
            int r7 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r6 = r6.getString(r7)
            r5.showErrorMessage(r6)
        Lab:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getAllReplies(long, by0):java.lang.Object");
    }

    private final void getAllRepliesLoading(boolean z, long j) {
        CommentsUIState value;
        CommentsUIState copy;
        MutableStateFlow<CommentsUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            CommentsUIState commentsUIState = value;
            copy = commentsUIState.copy((r20 & 1) != 0 ? commentsUIState.isCommentingOpen : false, (r20 & 2) != 0 ? commentsUIState.showEmptyContent : false, (r20 & 4) != 0 ? commentsUIState.isRegisteredUser : false, (r20 & 8) != 0 ? commentsUIState.isReporter : false, (r20 & 16) != 0 ? commentsUIState.flagOptions : null, (r20 & 32) != 0 ? commentsUIState.showFlagAlertDialog : false, (r20 & 64) != 0 ? commentsUIState.showFlagSuccessMessage : false, (r20 & 128) != 0 ? commentsUIState.errorMessage : null, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? commentsUIState.getAllRepliesState : commentsUIState.getGetAllRepliesState().copy(z, j));
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommentThread(long r10, defpackage.by0<? super defpackage.ww8> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThread$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThread$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThread$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThread$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThread$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r9 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r9
            kotlin.f.b(r12)
            goto L4d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.f.b(r12)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r12 = r9.commentsRepository
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r2 = r9.articleUrlMutableState
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r12 = r12.getCommentThread(r10, r2, r0)
            if (r12 != r1) goto L4d
            return r1
        L4d:
            com.nytimes.android.coroutinesutils.FetchResult r12 = (com.nytimes.android.coroutinesutils.FetchResult) r12
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r10 == 0) goto L7c
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState> r10 = r9.commentThreadMutableState
        L55:
            java.lang.Object r9 = r10.getValue()
            r0 = r9
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r0 = (com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState) r0
            r11 = r12
            com.nytimes.android.coroutinesutils.FetchResult$b$b r11 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r11
            java.lang.Object r11 = r11.b()
            com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult r11 = (com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult) r11
            com.nytimes.android.comments.comments.data.remote.getallcomments.Comment r1 = r11.getCommentThread()
            r7 = 58
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r11 = com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r9 = r10.compareAndSet(r9, r11)
            if (r9 == 0) goto L55
            goto Lac
        L7c:
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r10 == 0) goto L9d
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState> r10 = r9.commentThreadMutableState
        L82:
            java.lang.Object r9 = r10.getValue()
            r0 = r9
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r0 = (com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState) r0
            r7 = 59
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r11 = com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r9 = r10.compareAndSet(r9, r11)
            if (r9 == 0) goto L82
            goto Lac
        L9d:
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r10 == 0) goto Lac
            android.app.Application r10 = r9.application
            int r11 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r10 = r10.getString(r11)
            r9.showErrorMessage(r10)
        Lac:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getCommentThread(long, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommentThreadReplies(long r10, defpackage.by0<? super defpackage.ww8> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThreadReplies$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThreadReplies$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThreadReplies$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThreadReplies$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$getCommentThreadReplies$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r9 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r9
            kotlin.f.b(r12)
            goto L43
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.f.b(r12)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r12 = r9.getReplies(r10, r0)
            if (r12 != r1) goto L43
            return r1
        L43:
            com.nytimes.android.coroutinesutils.FetchResult r12 = (com.nytimes.android.coroutinesutils.FetchResult) r12
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r10 == 0) goto L72
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState> r10 = r9.commentThreadMutableState
        L4b:
            java.lang.Object r9 = r10.getValue()
            r0 = r9
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r0 = (com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState) r0
            r11 = r12
            com.nytimes.android.coroutinesutils.FetchResult$b$b r11 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r11
            java.lang.Object r11 = r11.b()
            com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult r11 = (com.nytimes.android.comments.comments.data.remote.getcommentbypermid.CommentThreadResult) r11
            com.nytimes.android.comments.comments.data.remote.getallcomments.Comment r1 = r11.getCommentThread()
            r7 = 58
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r11 = com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r9 = r10.compareAndSet(r9, r11)
            if (r9 == 0) goto L4b
            goto La2
        L72:
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r10 == 0) goto L93
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState> r10 = r9.commentThreadMutableState
        L78:
            java.lang.Object r9 = r10.getValue()
            r0 = r9
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r0 = (com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState) r0
            r7 = 59
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState r11 = com.nytimes.android.comments.comments.mvi.view.CommentThreadUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r9 = r10.compareAndSet(r9, r11)
            if (r9 == 0) goto L78
            goto La2
        L93:
            boolean r10 = r12 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r10 == 0) goto La2
            android.app.Application r10 = r9.application
            int r11 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r10 = r10.getString(r11)
            r9.showErrorMessage(r10)
        La2:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getCommentThreadReplies(long, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r6 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommentsSummary(defpackage.by0<? super defpackage.ww8> r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getCommentsSummary(by0):java.lang.Object");
    }

    public static /* synthetic */ void getGetAllComments$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getReplies(long j, by0<? super FetchResult<CommentThreadResult>> by0Var) {
        return this.commentsRepository.getCommentThread(j, this.articleUrlMutableState.getValue(), by0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserData(defpackage.by0<? super defpackage.ww8> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserData$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserData$1 r2 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserData$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserData$1 r2 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserData$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r0 = r2.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r0
            kotlin.f.b(r1)
            goto L49
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.f.b(r1)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r1 = r0.commentsRepository
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.getCurrentUser(r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            com.nytimes.android.coroutinesutils.FetchResult r1 = (com.nytimes.android.coroutinesutils.FetchResult) r1
            boolean r2 = r1 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r2 == 0) goto L83
            kotlinx.coroutines.flow.MutableStateFlow<com.nytimes.android.comments.comments.mvi.view.CommentsUIState> r0 = r0.mutableState
        L51:
            java.lang.Object r2 = r0.getValue()
            r6 = r2
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r6 = (com.nytimes.android.comments.comments.mvi.view.CommentsUIState) r6
            r3 = r1
            com.nytimes.android.coroutinesutils.FetchResult$b$b r3 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r3
            java.lang.Object r3 = r3.b()
            com.nytimes.android.comments.writenewcomment.data.remote.getuser.User r3 = (com.nytimes.android.comments.writenewcomment.data.remote.getuser.User) r3
            java.lang.Boolean r3 = r3.isReporter()
            java.lang.Boolean r4 = defpackage.cc0.a(r5)
            boolean r10 = defpackage.zq3.c(r3, r4)
            r16 = 371(0x173, float:5.2E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.nytimes.android.comments.comments.mvi.view.CommentsUIState r3 = com.nytimes.android.comments.comments.mvi.view.CommentsUIState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r2 = r0.compareAndSet(r2, r3)
            if (r2 == 0) goto L51
        L83:
            ww8 r0 = defpackage.ww8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getUserData(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserDataAndCommentsSummary(defpackage.by0<? super defpackage.ww8> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserDataAndCommentsSummary$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserDataAndCommentsSummary$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserDataAndCommentsSummary$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserDataAndCommentsSummary$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$getUserDataAndCommentsSummary$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r5 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r5
            kotlin.f.b(r6)
            goto L4a
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getUserData(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.getCommentsSummary(r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.getUserDataAndCommentsSummary(by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object listenNetworkChanges(by0<? super ww8> by0Var) {
        Object collect = RxConvertKt.asFlow(this.networkStatus.m()).collect(new FlowCollector() { // from class: com.nytimes.android.comments.comments.mvi.CommentsViewModel$listenNetworkChanges$2

            @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$listenNetworkChanges$2$1", f = "CommentsViewModel.kt", l = {579}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$listenNetworkChanges$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                int label;
                final /* synthetic */ CommentsViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CommentsViewModel commentsViewModel, by0<? super AnonymousClass1> by0Var) {
                    super(2, by0Var);
                    this.this$0 = commentsViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0<ww8> create(Object obj, by0<?> by0Var) {
                    return new AnonymousClass1(this.this$0, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        CommentsViewModel commentsViewModel = this.this$0;
                        this.label = 1;
                        if (commentsViewModel.getUserDataAndCommentsSummary(this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var2) {
                return emit((Boolean) obj, (by0<? super ww8>) by0Var2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(Boolean bool, by0<? super ww8> by0Var2) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                Object value;
                mutableStateFlow = CommentsViewModel.this.tabsMutableState;
                if (((CommentsTabsUIState) mutableStateFlow.getValue()).getShowOfflineMessage()) {
                    zq3.e(bool);
                    if (bool.booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(r.a(CommentsViewModel.this), null, null, new AnonymousClass1(CommentsViewModel.this, null), 3, null);
                    }
                }
                mutableStateFlow2 = CommentsViewModel.this.tabsMutableState;
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, CommentsTabsUIState.copy$default((CommentsTabsUIState) value, null, null, null, !bool.booleanValue(), 7, null)));
                return ww8.a;
            }
        }, by0Var);
        return collect == a.h() ? collect : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCommentThreadFlow(long j) {
        this.commentsAnalytics.sendViewThreadEvent();
        MutableStateFlow<CommentThreadUIState> mutableStateFlow = this.commentThreadMutableState;
        do {
        } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new CommentThreadUIState(null, null, false, false, false, false, 63, null)));
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$openCommentThreadFlow$2(this, j, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recommendComment(long r8, boolean r10, defpackage.by0<? super defpackage.ww8> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendComment$1
            if (r0 == 0) goto L14
            r0 = r11
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendComment$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendComment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendComment$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendComment$1
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            long r8 = r6.J$0
            java.lang.Object r7 = r6.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r7 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r7
            kotlin.f.b(r11)
            goto L56
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.f.b(r11)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r1 = r7.commentsRepository
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r11 = r7.articleUrlMutableState
            java.lang.Object r11 = r11.getValue()
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            r6.L$0 = r7
            r6.J$0 = r8
            r6.label = r2
            r2 = r8
            r5 = r10
            java.lang.Object r11 = r1.recommendComment(r2, r4, r5, r6)
            if (r11 != r0) goto L56
            return r0
        L56:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            boolean r10 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r10 == 0) goto L76
            com.nytimes.android.coroutinesutils.FetchResult$b$b r11 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r11
            java.lang.Object r10 = r11.b()
            com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult r10 = (com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult) r10
            boolean r10 = r10.getRecommended()
            java.lang.Object r11 = r11.b()
            com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult r11 = (com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult) r11
            int r11 = r11.getRecommendations()
            r7.addRecommendedComment(r8, r10, r11)
            goto La0
        L76:
            boolean r8 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r8 == 0) goto L91
            com.nytimes.android.coroutinesutils.FetchResult$b$a r11 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r11
            android.app.Application r8 = r7.application
            int r9 = com.nytimes.android.comments.R.string.no_network_message
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "getString(...)"
            defpackage.zq3.g(r8, r9)
            java.lang.String r8 = com.nytimes.android.coroutinesutils.FetchResultKt.a(r11, r8)
            r7.showErrorMessage(r8)
            goto La0
        L91:
            boolean r8 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r8 == 0) goto La0
            android.app.Application r8 = r7.application
            int r9 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r8 = r8.getString(r9)
            r7.showErrorMessage(r8)
        La0:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.recommendComment(long, boolean, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recommendReply(long r9, long r11, boolean r13, defpackage.by0<? super defpackage.ww8> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendReply$1
            if (r0 == 0) goto L14
            r0 = r14
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendReply$1 r0 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendReply$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendReply$1 r0 = new com.nytimes.android.comments.comments.mvi.CommentsViewModel$recommendReply$1
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            long r11 = r6.J$1
            long r9 = r6.J$0
            java.lang.Object r8 = r6.L$0
            com.nytimes.android.comments.comments.mvi.CommentsViewModel r8 = (com.nytimes.android.comments.comments.mvi.CommentsViewModel) r8
            kotlin.f.b(r14)
        L32:
            r1 = r8
            r2 = r9
            r4 = r11
            goto L5d
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.f.b(r14)
            com.nytimes.android.comments.comments.data.repository.CommentsRepository r1 = r8.commentsRepository
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r14 = r8.articleUrlMutableState
            java.lang.Object r14 = r14.getValue()
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            r6.L$0 = r8
            r6.J$0 = r9
            r6.J$1 = r11
            r6.label = r2
            r2 = r11
            r5 = r13
            java.lang.Object r14 = r1.recommendComment(r2, r4, r5, r6)
            if (r14 != r0) goto L32
            return r0
        L5d:
            com.nytimes.android.coroutinesutils.FetchResult r14 = (com.nytimes.android.coroutinesutils.FetchResult) r14
            boolean r8 = r14 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r8 == 0) goto L7d
            com.nytimes.android.coroutinesutils.FetchResult$b$b r14 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r14
            java.lang.Object r8 = r14.b()
            com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult r8 = (com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult) r8
            int r7 = r8.getRecommendations()
            java.lang.Object r8 = r14.b()
            com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult r8 = (com.nytimes.android.comments.comments.data.remote.recommendcomment.RecommendCommentResult) r8
            boolean r6 = r8.getRecommended()
            r1.addRecommendReply(r2, r4, r6, r7)
            goto La7
        L7d:
            boolean r8 = r14 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r8 == 0) goto L98
            com.nytimes.android.coroutinesutils.FetchResult$b$a r14 = (com.nytimes.android.coroutinesutils.FetchResult.b.a) r14
            android.app.Application r8 = r1.application
            int r9 = com.nytimes.android.comments.R.string.no_network_message
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "getString(...)"
            defpackage.zq3.g(r8, r9)
            java.lang.String r8 = com.nytimes.android.coroutinesutils.FetchResultKt.a(r14, r8)
            r1.showErrorMessage(r8)
            goto La7
        L98:
            boolean r8 = r14 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r8 == 0) goto La7
            android.app.Application r8 = r1.application
            int r9 = com.nytimes.android.comments.R.string.comments_general_error_message
            java.lang.String r8 = r8.getString(r9)
            r1.showErrorMessage(r8)
        La7:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel.recommendReply(long, long, boolean, by0):java.lang.Object");
    }

    private final void showErrorMessage(String str) {
        CommentsUIState value;
        CommentsUIState copy;
        MutableStateFlow<CommentsUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r20 & 1) != 0 ? r1.isCommentingOpen : false, (r20 & 2) != 0 ? r1.showEmptyContent : false, (r20 & 4) != 0 ? r1.isRegisteredUser : false, (r20 & 8) != 0 ? r1.isReporter : false, (r20 & 16) != 0 ? r1.flagOptions : null, (r20 & 32) != 0 ? r1.showFlagAlertDialog : false, (r20 & 64) != 0 ? r1.showFlagSuccessMessage : false, (r20 & 128) != 0 ? r1.errorMessage : str, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.getAllRepliesState : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void showFlagAlertDialog(boolean z) {
        CommentsUIState value;
        CommentsUIState copy;
        MutableStateFlow<CommentsUIState> mutableStateFlow = this.mutableState;
        do {
            value = mutableStateFlow.getValue();
            copy = r1.copy((r20 & 1) != 0 ? r1.isCommentingOpen : false, (r20 & 2) != 0 ? r1.showEmptyContent : false, (r20 & 4) != 0 ? r1.isRegisteredUser : false, (r20 & 8) != 0 ? r1.isReporter : false, (r20 & 16) != 0 ? r1.flagOptions : null, (r20 & 32) != 0 ? r1.showFlagAlertDialog : z, (r20 & 64) != 0 ? r1.showFlagSuccessMessage : false, (r20 & 128) != 0 ? r1.errorMessage : null, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? value.getAllRepliesState : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final void updateCommentTab(CommentTab commentTab) {
        CommentsTabsUIState value;
        MutableStateFlow<CommentsTabsUIState> mutableStateFlow = this.tabsMutableState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CommentsTabsUIState.copy$default(value, null, commentTab, null, false, 13, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Comment updateFlaggedComment(Comment comment, Set<Long> set) {
        Comment copy;
        if (!set.contains(Long.valueOf(comment.getCommentID()))) {
            return comment;
        }
        copy = comment.copy((r36 & 1) != 0 ? comment.commentID : 0L, (r36 & 2) != 0 ? comment.userDisplayName : null, (r36 & 4) != 0 ? comment.parentUserDisplayName : null, (r36 & 8) != 0 ? comment.userLocation : null, (r36 & 16) != 0 ? comment.userTitle : null, (r36 & 32) != 0 ? comment.commentBody : null, (r36 & 64) != 0 ? comment.approveDate : null, (r36 & 128) != 0 ? comment.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment.editorsSelection : false, (r36 & 512) != 0 ? comment.recommendations : 0, (r36 & 1024) != 0 ? comment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment.isReporterReply : false, (r36 & 8192) != 0 ? comment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment.isCommentFlagged : true, (r36 & 32768) != 0 ? comment.isRecommended : false, (r36 & 65536) != 0 ? comment.focusedInThread : false);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Comment updateFlaggedReply(Comment comment, List<FlaggedReply> list) {
        Comment comment2 = comment;
        for (FlaggedReply flaggedReply : list) {
            if (comment2.getCommentID() == flaggedReply.getCommentID()) {
                List<Comment> replies = comment2.getReplies();
                ArrayList arrayList = new ArrayList(i.w(replies, 10));
                for (Comment comment3 : replies) {
                    if (comment3.getCommentID() == flaggedReply.getReplyID()) {
                        comment3 = comment3.copy((r36 & 1) != 0 ? comment3.commentID : 0L, (r36 & 2) != 0 ? comment3.userDisplayName : null, (r36 & 4) != 0 ? comment3.parentUserDisplayName : null, (r36 & 8) != 0 ? comment3.userLocation : null, (r36 & 16) != 0 ? comment3.userTitle : null, (r36 & 32) != 0 ? comment3.commentBody : null, (r36 & 64) != 0 ? comment3.approveDate : null, (r36 & 128) != 0 ? comment3.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment3.editorsSelection : false, (r36 & 512) != 0 ? comment3.recommendations : 0, (r36 & 1024) != 0 ? comment3.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment3.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment3.isReporterReply : false, (r36 & 8192) != 0 ? comment3.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment3.isCommentFlagged : true, (r36 & 32768) != 0 ? comment3.isRecommended : false, (r36 & 65536) != 0 ? comment3.focusedInThread : false);
                    }
                    arrayList.add(comment3);
                }
                comment2 = comment2.copy((r36 & 1) != 0 ? comment2.commentID : 0L, (r36 & 2) != 0 ? comment2.userDisplayName : null, (r36 & 4) != 0 ? comment2.parentUserDisplayName : null, (r36 & 8) != 0 ? comment2.userLocation : null, (r36 & 16) != 0 ? comment2.userTitle : null, (r36 & 32) != 0 ? comment2.commentBody : null, (r36 & 64) != 0 ? comment2.approveDate : null, (r36 & 128) != 0 ? comment2.replies : arrayList, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment2.editorsSelection : false, (r36 & 512) != 0 ? comment2.recommendations : 0, (r36 & 1024) != 0 ? comment2.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment2.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment2.isReporterReply : false, (r36 & 8192) != 0 ? comment2.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment2.isCommentFlagged : false, (r36 & 32768) != 0 ? comment2.isRecommended : false, (r36 & 65536) != 0 ? comment2.focusedInThread : false);
            }
        }
        return comment2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Comment updateRecommendedComment(Comment comment, List<RecommendedComment> list) {
        Object obj;
        Comment copy;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((RecommendedComment) obj).getCommentID() == comment.getCommentID()) {
                break;
            }
        }
        RecommendedComment recommendedComment = (RecommendedComment) obj;
        if (recommendedComment == null) {
            return comment;
        }
        copy = comment.copy((r36 & 1) != 0 ? comment.commentID : 0L, (r36 & 2) != 0 ? comment.userDisplayName : null, (r36 & 4) != 0 ? comment.parentUserDisplayName : null, (r36 & 8) != 0 ? comment.userLocation : null, (r36 & 16) != 0 ? comment.userTitle : null, (r36 & 32) != 0 ? comment.commentBody : null, (r36 & 64) != 0 ? comment.approveDate : null, (r36 & 128) != 0 ? comment.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment.editorsSelection : false, (r36 & 512) != 0 ? comment.recommendations : recommendedComment.getRecommendations(), (r36 & 1024) != 0 ? comment.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment.isReporterReply : false, (r36 & 8192) != 0 ? comment.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment.isCommentFlagged : false, (r36 & 32768) != 0 ? comment.isRecommended : recommendedComment.isRecommended(), (r36 & 65536) != 0 ? comment.focusedInThread : false);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Comment updateRecommendedReply(Comment comment, List<RecommendedReply> list) {
        Comment comment2 = comment;
        for (RecommendedReply recommendedReply : list) {
            if (comment2.getCommentID() == recommendedReply.getCommentID()) {
                List<Comment> replies = comment2.getReplies();
                ArrayList arrayList = new ArrayList(i.w(replies, 10));
                for (Comment comment3 : replies) {
                    if (comment3.getCommentID() == recommendedReply.getReplyID()) {
                        comment3 = comment3.copy((r36 & 1) != 0 ? comment3.commentID : 0L, (r36 & 2) != 0 ? comment3.userDisplayName : null, (r36 & 4) != 0 ? comment3.parentUserDisplayName : null, (r36 & 8) != 0 ? comment3.userLocation : null, (r36 & 16) != 0 ? comment3.userTitle : null, (r36 & 32) != 0 ? comment3.commentBody : null, (r36 & 64) != 0 ? comment3.approveDate : null, (r36 & 128) != 0 ? comment3.replies : null, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment3.editorsSelection : false, (r36 & 512) != 0 ? comment3.recommendations : recommendedReply.getRecommendations(), (r36 & 1024) != 0 ? comment3.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment3.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment3.isReporterReply : false, (r36 & 8192) != 0 ? comment3.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment3.isCommentFlagged : false, (r36 & 32768) != 0 ? comment3.isRecommended : recommendedReply.isRecommended(), (r36 & 65536) != 0 ? comment3.focusedInThread : false);
                    }
                    arrayList.add(comment3);
                }
                comment2 = comment2.copy((r36 & 1) != 0 ? comment2.commentID : 0L, (r36 & 2) != 0 ? comment2.userDisplayName : null, (r36 & 4) != 0 ? comment2.parentUserDisplayName : null, (r36 & 8) != 0 ? comment2.userLocation : null, (r36 & 16) != 0 ? comment2.userTitle : null, (r36 & 32) != 0 ? comment2.commentBody : null, (r36 & 64) != 0 ? comment2.approveDate : null, (r36 & 128) != 0 ? comment2.replies : arrayList, (r36 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? comment2.editorsSelection : false, (r36 & 512) != 0 ? comment2.recommendations : 0, (r36 & 1024) != 0 ? comment2.replyCount : 0, (r36 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? comment2.parentID : null, (r36 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? comment2.isReporterReply : false, (r36 & 8192) != 0 ? comment2.avatarURL : null, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? comment2.isCommentFlagged : false, (r36 & 32768) != 0 ? comment2.isRecommended : false, (r36 & 65536) != 0 ? comment2.focusedInThread : false);
            }
        }
        return comment2;
    }

    private final void updateSortingOption(SortingOption sortingOption) {
        MutableStateFlow<SortingOption> mutableStateFlow = this.selectedSortingOptionMutableState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), sortingOption)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<PagingData> updateWithLocalChanges(Flow<PagingData> flow) {
        return CachedPagingDataKt.a(FlowKt.flowCombine(FlowKt.flowCombine(FlowKt.flowCombine(FlowKt.flowCombine(FlowKt.flowCombine(flow, this.commentReplies, new CommentsViewModel$updateWithLocalChanges$1(null)), this.flaggedCommentIds, new CommentsViewModel$updateWithLocalChanges$2(this, null)), this.flaggedReplies, new CommentsViewModel$updateWithLocalChanges$3(this, null)), this.recommendedComments, new CommentsViewModel$updateWithLocalChanges$4(this, null)), this.recommendedReplies, new CommentsViewModel$updateWithLocalChanges$5(this, null)), r.a(this));
    }

    public final StateFlow<String> getArticleUrlState() {
        return this.articleUrlState;
    }

    public final StateFlow<CommentThreadUIState> getCommentThreadState() {
        return this.commentThreadState;
    }

    public final Flow<PagingData> getGetAllComments() {
        return this.getAllComments;
    }

    public final Flow<PagingData> getGetNYTPicksComments() {
        return this.getNYTPicksComments;
    }

    public final Flow<PagingData> getGetReadersPicksComments() {
        return this.getReadersPicksComments;
    }

    public final Flow<PagingData> getGetReporterReplies() {
        return this.getReporterReplies;
    }

    public final long getPermIdFlow() {
        return this.permIdFlow;
    }

    public final StateFlow<SortingOption> getSelectedSortingOptionState() {
        return this.selectedSortingOptionState;
    }

    public final StateFlow<CommentsUIState> getState() {
        return this.state;
    }

    public final StateFlow<CommentsTabsUIState> getTabsState() {
        return this.tabsState;
    }

    public final void intent(CommentsIntent commentsIntent) {
        CommentThreadUIState value;
        CommentThreadUIState value2;
        CommentThreadUIState value3;
        CommentThreadUIState value4;
        zq3.h(commentsIntent, "commentsIntent");
        if (commentsIntent instanceof CommentsIntent.RecommendComment) {
            this.commentsAnalytics.sendRecommendCommentEvent();
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$intent$1(this, commentsIntent, null), 3, null);
            return;
        }
        if (commentsIntent instanceof CommentsIntent.RecommendReply) {
            this.commentsAnalytics.sendRecommendCommentEvent();
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$intent$2(this, commentsIntent, null), 3, null);
            return;
        }
        if (commentsIntent instanceof CommentsIntent.FlagComment) {
            this.tempCommentsIntent = commentsIntent;
            if (!((CommentsIntent.FlagComment) commentsIntent).isCommentThread()) {
                showFlagAlertDialog(true);
                return;
            }
            MutableStateFlow<CommentThreadUIState> mutableStateFlow = this.commentThreadMutableState;
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value4, CommentThreadUIState.copy$default(value4, null, null, false, false, true, false, 47, null)));
            return;
        }
        if (commentsIntent instanceof CommentsIntent.FlagReply) {
            this.tempCommentsIntent = commentsIntent;
            if (!((CommentsIntent.FlagReply) commentsIntent).isCommentThread()) {
                showFlagAlertDialog(true);
                return;
            }
            MutableStateFlow<CommentThreadUIState> mutableStateFlow2 = this.commentThreadMutableState;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, CommentThreadUIState.copy$default(value3, null, null, false, false, true, false, 47, null)));
            return;
        }
        if (commentsIntent instanceof CommentsIntent.DismissFlagComment) {
            if (!((CommentsIntent.DismissFlagComment) commentsIntent).isCommentThread()) {
                showFlagAlertDialog(false);
                return;
            }
            MutableStateFlow<CommentThreadUIState> mutableStateFlow3 = this.commentThreadMutableState;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, CommentThreadUIState.copy$default(value2, null, null, false, false, false, false, 47, null)));
            return;
        }
        if (commentsIntent instanceof CommentsIntent.ConfirmFlagComment) {
            if (((CommentsIntent.ConfirmFlagComment) commentsIntent).isCommentThread()) {
                MutableStateFlow<CommentThreadUIState> mutableStateFlow4 = this.commentThreadMutableState;
                do {
                    value = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value, CommentThreadUIState.copy$default(value, null, null, false, false, false, false, 47, null)));
            } else {
                showFlagAlertDialog(false);
            }
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$intent$7(this, null), 3, null);
            return;
        }
        if (commentsIntent instanceof CommentsIntent.GetAllReplies) {
            this.commentsAnalytics.sendViewAllRepliesEvent();
            BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$intent$8(this, commentsIntent, null), 3, null);
            return;
        }
        if (commentsIntent instanceof CommentsIntent.SortOptionChanged) {
            CommentsIntent.SortOptionChanged sortOptionChanged = (CommentsIntent.SortOptionChanged) commentsIntent;
            this.commentsAnalytics.sendSortCommentsEvent(sortOptionChanged.getSortingOption().getValue());
            updateSortingOption(sortOptionChanged.getSortingOption());
            this.commentsRepository.invalidateAllComments();
            return;
        }
        if (commentsIntent instanceof CommentsIntent.CommentTabChanged) {
            CommentsIntent.CommentTabChanged commentTabChanged = (CommentsIntent.CommentTabChanged) commentsIntent;
            this.commentsAnalytics.sendChangeTabsEvent(commentTabChanged.getCommentTab().name());
            updateCommentTab(commentTabChanged.getCommentTab());
            return;
        }
        if (commentsIntent instanceof CommentsIntent.Refresh) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.tabsState.getValue().getSelectedCommentTab().ordinal()];
            if (i == 1) {
                this.commentsRepository.invalidateAllComments();
                return;
            }
            if (i == 2) {
                this.commentsRepository.invalidateNYTPicksComments();
                return;
            } else if (i == 3) {
                this.commentsRepository.invalidateReadersPicksComments();
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.commentsRepository.invalidateReporterReplies();
                return;
            }
        }
        if (commentsIntent instanceof CommentsIntent.GetCommentThread) {
            openCommentThreadFlow(((CommentsIntent.GetCommentThread) commentsIntent).getCommentParentId());
            return;
        }
        if (!(commentsIntent instanceof CommentsIntent.GetCommentThreadReplies)) {
            if (zq3.c(commentsIntent, CommentsIntent.DismissFlagSuccessMessage.INSTANCE)) {
                dismissFlagSuccessMessage();
                return;
            } else {
                if (zq3.c(commentsIntent, CommentsIntent.DismissErrorMessage.INSTANCE)) {
                    showErrorMessage(null);
                    return;
                }
                return;
            }
        }
        this.commentsAnalytics.sendViewThreadEvent();
        MutableStateFlow<CommentThreadUIState> mutableStateFlow5 = this.commentThreadMutableState;
        do {
        } while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), new CommentThreadUIState(null, null, true, false, false, false, 59, null)));
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new CommentsViewModel$intent$11(this, commentsIntent, null), 3, null);
    }

    public final void updateSavedStateHandle(String str, Long l) {
        if (str != null) {
            this.savedStateHandle.i("com.nytimes.android.extra.ASSET_URL", str);
        }
        if (l != null) {
            this.savedStateHandle.i("com.nytimes.android.extra.COMMENT_ID", l);
        }
    }
}
